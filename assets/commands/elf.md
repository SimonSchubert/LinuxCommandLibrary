# TAGLINE

Executable and Linkable Format for Unix binaries

# TLDR

**View ELF header**

```readelf -h [binary]```

**List sections**

```readelf -S [binary]```

**List program headers**

```readelf -l [binary]```

**Show symbols**

```readelf -s [binary]```

**Display dynamic section**

```readelf -d [binary]```

**Show all information**

```readelf -a [binary]```

# SYNOPSIS

**readelf** [_options_] _elf-file_

# DESCRIPTION

**ELF** (Executable and Linkable Format) is the standard binary format for executables, object files, shared libraries, and core dumps on Unix-like systems. Tools like **readelf** and **objdump** inspect ELF files.

ELF files contain headers describing the binary structure, sections with code and data, and segment information for the runtime loader. Understanding ELF is essential for debugging, reverse engineering, and systems programming.

# ELF STRUCTURE

```
ELF Header        - Magic number, architecture, entry point
Program Headers   - Segments for runtime loading
Section Headers   - Sections for linking (.text, .data, etc.)
.text             - Executable code
.data             - Initialized data
.bss              - Uninitialized data
.rodata           - Read-only data
.symtab           - Symbol table
.strtab           - String table
.dynamic          - Dynamic linking info
```

# RELATED TOOLS

```
readelf     - Display ELF information
objdump     - Disassemble and display
nm          - List symbols
ldd         - Show shared library dependencies
file        - Identify file type
```

# SEE ALSO

[readelf](/man/readelf)(1), [objdump](/man/objdump)(1), [nm](/man/nm)(1), [ldd](/man/ldd)(1)
