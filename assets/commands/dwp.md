# TAGLINE

package DWARF debugging information

# TLDR

**Package** several .dwo files into a single .dwp

```dwp -o [out.dwp] [a.dwo] [b.dwo]```

**Package all .dwo files** referenced from an executable

```dwp -e [program] -o [program.dwp]```

**List .dwo files** to package from a response file

```dwp @[dwo_list.txt] -o [out.dwp]```

**Show help** and exit

```dwp -h```

# SYNOPSIS

**dwp** [**-e** _executable_] [**-o** _output.dwp_] [_dwo-file_...]

# PARAMETERS

**-e** _executable_, **--exec** _executable_
> Read the list of .dwo files from the **DW_AT_GNU_dwo_name** attributes inside the given executable or shared library.

**-o** _file_, **--output** _file_
> Write the packaged DWARF to _file_. Defaults to **a.dwp** if omitted.

**-v**, **--verbose**
> Print the name of each .dwo file as it is added.

**@**_file_
> Read additional command-line arguments (typically .dwo file names) from _file_, one per line.

**-h**, **--help**
> Display usage information.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**dwp** (DWARF packaging utility) combines DWARF debugging information from multiple split-DWARF object files (.dwo) into a single package file (.dwp). This is part of the split-DWARF workflow enabled by **gcc -gsplit-dwarf** or **clang -gsplit-dwarf**, where the compiler writes most debug data into per-translation-unit .dwo files rather than embedding it in the linked binary.

Packaging the .dwo files with **dwp** keeps debug info distributable as a single file and lets debuggers locate symbols by following the **DW_AT_GNU_dwo_name** / **DW_AT_GNU_dwo_id** references stored in the executable.

Split DWARF significantly reduces link times and executable sizes while preserving full source-level debugging, which is especially valuable for large C++ codebases.

# CAVEATS

Requires split-DWARF compilation (**-gsplit-dwarf**). The debugger must support the .dwp format (recent GDB and LLDB do). With **-e**, **dwp** locates .dwo files using their on-disk paths recorded by the compiler; if the build tree has moved, the .dwo files may not be found unless they sit alongside the executable.

# HISTORY

**dwp** is part of GNU **binutils** and parallels **llvm-dwp** in the LLVM project. The split-DWARF format and packaging tool were introduced to address compile/link time and binary size in large C++ projects.

# INSTALL

```apt: sudo apt install binutils-gold```

```dnf: sudo dnf install binutils-gold```

```pacman: sudo pacman -S binutils```

```apk: sudo apk add binutils```

```zypper: sudo zypper install binutils```

```brew: brew install binutils```

```nix: nix profile install nixpkgs#binutils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gdb](/man/gdb)(1), [objcopy](/man/objcopy)(1), [readelf](/man/readelf)(1)
