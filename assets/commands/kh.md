# TAGLINE

Run macOS ARM64 binaries on Linux aarch64 (userspace translation layer)

# TLDR

**Install** the CLI and **ensure** a guest bottle

```cargo install kakehashi```

```kh bottle ensure```

**Install** Darwin guest tools into the bottle

```kh install 7zip```

```kh install curl```

**Run** a Darwin binary (guest args after **--**)

```kh run 7zz -- --help```

```kh run 7zz -- a demo.7z README.md```

**Inspect** a Mach-O binary without executing it

```kh inspect [path/to/binary] --sections --imports```

**Trace** syscalls for a guest binary

```kh trace [path/to/binary] -- [args]```

# SYNOPSIS

**kh** [**-v**...] [**--json**] _subcommand_ [_options_] [_args_]

# DESCRIPTION

**kh** is the command-line front end for **Kakehashi**, a userspace translation layer that loads Darwin **Mach-O** binaries (macOS ARM64) on **Linux aarch64**, maps a freestanding **libSystem**, and translates BSD syscalls so real guest tools can run without a JIT.

Live execution requires **Linux aarch64** (bare metal, VM, or Docker/Colima). Dry-load and inspect work on any host, including macOS. Guest tools are installed into a single **bottle** (default under the XDG data home, typically **~/.local/share/kakehashi/bottle/**), which provides a macOS-like filesystem layout; **/Volumes/linux/…** bridges to the host root.

Verified guest tools include Darwin **7zz** (7-Zip) and **curl**. Full Apple frameworks, GUI apps, codesign, and complete curl feature parity are not claimed. Install with **cargo install kakehashi** (Rust 1.88+).

# PARAMETERS

**-v**, **--verbose**
> Increase log verbosity (repeatable). Overrides **KAKEHASHI_LOG** when set.

**--json**
> Emit JSON where a subcommand supports it.

**inspect** [_path_] [**--sections**] [**--imports**] [**--find** _substr_] [**--load-commands**] [**--image**] [**--page-size** _bytes_] [**--host-page-size**]
> Static Mach-O inspection without execution.

**run** _path_ [**--root** _dir_] [**--max-syscalls** _n_] [**--expect-code** _code_] [**--guest-page-size** _bytes_] [**--dry-load**] [**--**] [_guest_args_…]
> Run a Mach-O binary under the translation layer. Guest argv follows the program name (often after **--** when using installed bottle names like **7zz**).

**trace** _path_ [**--root** _dir_] [**--max-events** _n_] [**--**] [_guest_args_…]
> Capture syscall/trap events for a guest binary.

**bottle create|ensure|destroy|path|status**
> Manage the registered bottle (**ensure** creates if missing and refreshes libSystem).

**install** _package_
> Install a guest tool into the bottle. Packages include **7zip**, **curl**, **xcode-tools** (aliases **clt**, **git**), or **list**.

# CONFIGURATION

**KAKEHASHI_ROOT** / **--root**
> Bottle root path.

**KAKEHASHI_DATA_DIR**, **KAKEHASHI_CONFIG_DIR**, **KAKEHASHI_CACHE_DIR**
> Override XDG-style data, config, and cache locations.

**KAKEHASHI_LIBSYSTEM**
> Path to guest **libSystem.B.dylib** (or freestanding equivalent) when not using the embedded copy.

**KAKEHASHI_LOG**
> Tracing filter when **-v** is not set (default **warn**).

**KAKEHASHI_HYPERCALL**
> Hypercall path is on by default for guest threads; set **0** only for debug.

**KAKEHASHI_FORCE_DOWNLOAD**, **KAKEHASHI_7ZZ**, **KAKEHASHI_CURL**, **KAKEHASHI_XCODE_TOOLS_VERSION**
> Control optional guest-tool downloads and versions for **kh install**.

# CAVEATS

Live **run**/**trace** need **Linux aarch64** (4 KiB or 16 KiB pages). Not related to Darling; do not expect GUI, codesign, or full Apple Security.framework. Syscall-heavy multi-file workloads can be several times slower than native Linux tools. Experimental — guest support is expanding.

# HISTORY

**Kakehashi** is an open-source CLI-first userspace Darwin→Linux aarch64 translation layer (Apache-2.0). The shipped binary name is **kh**.

# SEE ALSO

[darling](/man/darling)(1), [wine](/man/wine)(1), [cargo](/man/cargo)(1), [7z](/man/7z)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/wie-project/kakehashi)```

```[Documentation](https://github.com/wie-project/kakehashi/tree/main/docs)```

<!-- verified: 2026-08-02 -->
