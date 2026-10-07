# TAGLINE

Convert a PS5 ELF into a native Linux or Windows executable

# TLDR

Convert a **Linux ELF** (default output format)

```relinker [source/input.elf] [app.elf]```

Convert a **Windows PE** executable

```relinker --windows [source/input.elf] [app.exe]```

Rewrite **AMD-only instructions** for Intel hosts

```relinker --to-intel [source/input.elf] [app.elf]```

Set the **system-library search path** (quote `$ORIGIN` so the shell leaves it alone)

```relinker --rpath '$ORIGIN/libs' [source/input.elf] [app.elf]```

Write a **call registry** beside the output

```relinker --registry [source/input.elf] [app.elf]```

Convert and **run** the result, then wait for Enter

```relinker --autorun [source/input.elf] [app.elf]```

Filter unused **non-PLT imports** (`unused-filter` is not a `--` flag)

```relinker unused-filter=1 [source/input.elf] [app.elf]```

Build a **Windows GUI** binary instead of a console one

```relinker --windows --windows-gui [source/input.elf] [app.exe]```

# SYNOPSIS

**relinker** [**--windows**] [**--windows-diagnostics**] [**--windows-gui**] [**--to-intel**] [**unused-filter=**_0|1|2_] [**--registry**] [**--rpath** _path_] [**--autorun**] [**--skip-sce-module**] [**--exclude-sce-module** _file_]... [**--skip-syscall-check**] [**--lazy-binding**] _input.elf_ _output_

# PARAMETERS

**--windows**

> Produce a Windows PE executable. The output format is Linux ELF unless this flag is set. A `.exe` suffix does not select Windows.

**--windows-diagnostics**

> Include startup dependency diagnostics. Requires **--windows**.

**--windows-gui**

> Select the Windows GUI subsystem instead of the console subsystem. Requires **--windows**.

**--to-intel**

> Convert supported AMD-only instructions in the executable and bundled modules. Unsupported instructions or unreachable conversion stubs cause an error.

**unused-filter=**_0|1|2_

> Import filtering, specified at most once and without a leading `--`. **0** (default) keeps all imported NID references. **1** filters unused non-PLT imports using control-flow and GOT access analysis and preserves PLT imports. **2** applies strict unused-import analysis and compacts the PLT; unsupported analysis cases cause an error.

**--registry**

> Write `_output-stem_.registry.json` beside the output executable.

**--rpath** _path_

> System library search path. Default `$ORIGIN/libs`. Quote `$ORIGIN` so the shell does not expand it. Linux guest modules need an absolute path or a path that begins with `$ORIGIN`. Windows requires a nonempty ASCII path and treats `$ORIGIN` as the executable directory.

**--autorun**

> Run the output after conversion, print its exit code, and wait for Enter. Adds execute permission on Linux output. Requires the target OS and a prepared runtime layout.

**--skip-sce-module**

> Deprecated. Skip all bundled module processing.

**--exclude-sce-module** _file_

> Deprecated. Exclude a bundled module by exact filename, not path. Repeatable. A missing filename is an error. Conflicts with **--skip-sce-module**.

**--skip-syscall-check**

> Deprecated. Disable syscall scanning in the executable and bundled modules.

**--lazy-binding**

> Deprecated. Enable lazy symbol binding instead of eager binding. Incompatible with bundled ELF modules.

# DESCRIPTION

**relinker** is the command-line converter from the **AnyPS5** project. It rewrites a PlayStation 5 ELF into a native Linux ELF or Windows PE so the title links against AnyPS5's reimplemented system PRX libraries. There is no emulator process: the output runs on the host.

The input must be a clean ELF. Place its bundled ELF modules in `sce_module/`, `sce_modules/`, or `prx/` beside that file. `prx/` may sit next to either `sce_module/` or `sce_modules/`. Having both `sce_module/` and `sce_modules/`, or none of the three directories, is an error.

There is no **--help**. Invoking **relinker** without both positional arguments prints the usage syntax and exits with an error. Unknown options and extra positional arguments are errors. All switches default to off.

After conversion, the runtime layout is relative to the output executable: `libs/` holds the built system libraries (`*.prx` from `build/core/libs/libs/`, matching the target OS), and `app0/` holds app resources plus converted guest modules under the same directory name the input used. Relinker prints each converted module path. A custom **--rpath** moves the system library location.

Copy the built PRX libraries into `libs/` before running the output. On Linux:

```chmod +x [app.elf]```

```./[app.elf]```

Build **relinker** and the libraries from the AnyPS5 tree with CMake 3.22.1 or newer, Ninja, and a C++20 toolchain (x86-64):

```git submodule update --init --recursive```

```cmake -S . -B build -G Ninja -DCMAKE_BUILD_TYPE=Release -DCMAKE_C_COMPILER=gcc -DCMAKE_CXX_COMPILER=g++```

```cmake --build build --parallel```

```cmake --build build --target libs --parallel```

The CMake target name is **relinker**. Optional CMake flags include **BUILD_TESTING**, **ANYPS5_ENABLE_SPIRV_TOOLS**, **APS5_ENABLE_TIMING_LOG**, and **AGC_BUILD_VISUAL_TEST**.

Exit status **0** means conversion succeeded. **1** is invalid arguments. **2** is a conversion failure printed to stderr. With **--autorun**, a successful conversion returns the launched application's exit code.

# CONFIGURATION

Keyboard and mouse bindings for a converted title live in `anyps5-input.ini` beside the generated executable. Set **ANYPS5_INPUT_CONFIG** to use another path. SDL-mapped game controllers are enabled automatically and are not changed by this file. With neither the file nor the environment variable, the built-in mapping is used.

Each non-empty line is `Action = Type:Value`. Action names are case-insensitive. `#` or `;` starts a comment. The first line for an action replaces its built-in bindings; later lines add alternates. Omitted actions keep the defaults. An invalid line reports the file and line number and stops input initialization.

Sources are `KEY:` plus an SDL key name, `MOUSE:Left|Middle|Right|X1|X2`, and `WHEEL:Up|Down`. Actions include `Cross`, `Circle`, `Triangle`, `Square`, `L1`, `R1`, `L2`, `R2`, `L3`, `R3`, `Options`, the D-pad, stick directions, `TouchLeft`, `TouchRight`, `ToggleMouse`, and `ToggleFullscreen`.

Games that open console system font sets (`sceFontOpenFontSet`) look in `anyps5-fonts/` beside the output, or in **ANYPS5_SYSTEM_FONTS**. Console font dumps keep their original names. Without those, openly licensed Noto Sans substitutes are used when present. Without either, opening a system font set fails.

Set **APS5_PIPELINE_STATS=1** to print driver statistics for each newly created graphics or compute pipeline. That requires `VK_KHR_pipeline_executable_properties` and `pipelineExecutableInfo`.

# CAVEATS

**--skip-sce-module**, **--exclude-sce-module**, **--skip-syscall-check**, and **--lazy-binding** are deprecated debug flags. Titles converted with them enabled are unstable.

The project does not ship copyrighted firmware, keys, or game binaries. Supply your own legally obtained input ELF and modules.

Converted titles need a prepared `libs/` and `app0/` layout, Vulkan (SDL), and on Intel hosts often **--to-intel**. Unsupported or unexpected states throw `std::runtime_error`; `what()` is printed to stderr and the process exits.

On Windows, direct memory (`sceKernelAllocateDirectMemory`, up to 13824 MiB per title) is committed in full when allocated. The system commit limit must cover it.

x86-64 only. Linux builds use GCC; Windows builds currently require a specific MinGW-w64 GCC 15.2.0 toolchain.

# HISTORY

**relinker** is the CLI of **AnyPS5**, a C++20 CMake project licensed under GPL-2.0-only. The public repository's first commit is dated **August 2026**. Tagged releases **v0.1.0** and **v0.1.1** followed in **September 2026**.

# SEE ALSO

[wine](/man/wine)(1), [objcopy](/man/objcopy)(1), [readelf](/man/readelf)(1), [ld](/man/ld)(1), [ldd](/man/ldd)(1)

# RESOURCES

```[Documentation](https://github.com/boykopovar/AnyPS5/blob/main/docs/user/USAGE.md)```

```[Source code](https://github.com/boykopovar/AnyPS5)```

<!-- verified: 2026-10-07 -->
