# TAGLINE

Bundle Python applications into stand-alone executables

# TLDR

**Build a one-folder bundle** from a script (creates **dist/myscript/**)

```pyinstaller [path/to/myscript.py]```

**Build a single-file executable** with no external dependencies

```pyinstaller --onefile [path/to/myscript.py]```

**Build a GUI app** without a console window (Windows/macOS)

```pyinstaller --windowed --onefile [path/to/app.py]```

**Set a custom name and icon** for the bundled executable

```pyinstaller --name [MyApp] --icon [path/to/icon.ico] [path/to/app.py]```

**Include extra data files** alongside the script (use **;** on Windows)

```pyinstaller --add-data "[path/to/data.json]:[data]" [path/to/app.py]```

**Force-include a module** that the static analyzer misses

```pyinstaller --hidden-import [package.module] [path/to/app.py]```

**Rebuild from a saved spec file** (preferred for repeatable builds)

```pyinstaller [path/to/myscript.spec]```

**Clean caches** and overwrite the previous output without prompting

```pyinstaller --clean --noconfirm --onefile [path/to/app.py]```

# SYNOPSIS

**pyinstaller** [_options_] _script_ [_script_ ...] | _specfile_

# DESCRIPTION

**pyinstaller** packages a Python program together with its interpreter and every imported module into a self-contained bundle that runs on machines without Python installed. It works by tracing imports starting from the entry script, copying the resulting set of modules, shared libraries, and data files into a build directory, and producing either a one-folder layout (**--onedir**, default) or a single executable file (**--onefile**) extracted to a temporary location at runtime.

The build runs in two phases. First, PyInstaller writes a **_script_.spec** file that captures the script paths, options, and analyzer hints for the project. Second, it processes that spec file to assemble the actual bundle in **dist/**. Editing the spec file directly is the recommended way to handle non-trivial projects, since spec files are plain Python and let you control hooks, binaries, data trees, and runtime options that the CLI flags cannot fully express.

PyInstaller is cross-platform but not cross-compiling: a bundle built on Linux runs on Linux, a Windows bundle must be built on Windows, and a macOS bundle on macOS. It supports CPython 3.8 and later, and integrates hooks for hundreds of popular packages (NumPy, PyQt, Django, TensorFlow) so they bundle correctly out of the box.

# PARAMETERS

**-F**, **--onefile**

> Produce a single executable file. At launch the binary self-extracts into a temporary directory and runs from there.

**-D**, **--onedir**

> Produce a folder containing the executable and its dependencies. This is the default and the fastest to start.

**-n** _NAME_, **--name** _NAME_

> Assign a name to the bundled app and to the generated **.spec** file. Defaults to the script's base name.

**-w**, **--windowed**, **--noconsole**

> On Windows and macOS, do not attach a console window. Use for GUI applications.

**-c**, **--console**, **--nowindowed**

> Force a console window (the default on most platforms).

**--icon** _FILE_

> Apply a custom icon: **.ico** on Windows, **.icns** on macOS. Use **NONE** to suppress the default.

**--add-data** _SOURCE_**:**_DEST_

> Bundle additional data files or directories under _DEST_ inside the bundle. Use **;** instead of **:** as the separator on Windows.

**--add-binary** _SOURCE_**:**_DEST_

> Same as **--add-data** but for shared libraries that need binary handling.

**--hidden-import** _MODULE_

> Force a module to be included even when the static analyzer cannot see the import (typical for plugin systems or dynamic imports).

**-p** _DIR_, **--paths** _DIR_

> Prepend _DIR_ to the module search path, like adding to **PYTHONPATH** for analysis only.

**--clean**

> Wipe PyInstaller's cache and temporary build artifacts before starting.

**-y**, **--noconfirm**

> Replace the output directory without asking for confirmation.

**--log-level** _LEVEL_

> Set verbosity: **TRACE**, **DEBUG**, **INFO** (default), **WARN**, **ERROR**, **FATAL**.

**--specpath** _DIR_

> Place the generated **.spec** file in _DIR_ instead of the current directory.

**--distpath** _DIR_, **--workpath** _DIR_

> Override the **dist/** and **build/** output directories.

**--upx-dir** _DIR_

> Use the UPX executable packer from _DIR_ to compress the bundled binaries.

# SPEC FILE WORKFLOW

The first invocation generates **myscript.spec**, a Python file describing the **Analysis**, **PYZ**, **EXE**, and **COLLECT** steps. For anything beyond a trivial script, edit the spec to add data files, runtime hooks, version info, or splash screens, then rebuild with:

```
pyinstaller myscript.spec
```

When PyInstaller is invoked with a spec file, most CLI options have no effect: the spec is authoritative.

# CAVEATS

**Cross-compilation is not supported.** Build on the target operating system (and ideally the oldest supported version) to maximize compatibility.

**Antivirus false positives** are common with **--onefile** binaries on Windows, because the self-extracting stub pattern resembles malware packers. Code-signing the executable usually resolves this.

**Dynamic imports break analysis.** Plugins loaded via **importlib**, **\_\_import\_\_**, or string-based discovery must be declared with **--hidden-import** or a custom hook, or they will be missing at runtime.

**Startup is slower** with **--onefile** because the runtime self-extracts to a temporary directory on every launch. Prefer **--onedir** for latency-sensitive applications.

**Bundles are large.** A minimal "hello world" produces a tens-of-megabytes binary because the entire CPython runtime is embedded. Use **--exclude-module** to drop unused stdlib modules.

# HISTORY

**PyInstaller** began life in 2005 as a fork of Gordon McMillan's **Installer** project, with the goal of producing portable Python executables on Linux, Windows, and macOS from a single codebase. The 2.x and 3.x series consolidated platform support and added the spec-file workflow; **PyInstaller 4** (2020) dropped Python 2; **PyInstaller 5** (2022) reworked bootloader handling; **PyInstaller 6** (2023) introduced the **SOURCE:DEST** syntax for **--add-data** that replaced the older platform-specific separators.

# SEE ALSO

[python](/man/python)(1), [py2exe](/man/py2exe)(1), [cx_freeze](/man/cx_freeze)(1), [nuitka](/man/nuitka)(1), [shiv](/man/shiv)(1)
