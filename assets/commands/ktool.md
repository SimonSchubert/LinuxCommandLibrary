# TAGLINE

Mach-O and Objective-C analysis toolkit for the terminal

# TLDR

**Dump Mach-O header information**

```ktool dump [path/to/binary]```

**List segments and sections**

```ktool list [path/to/binary]```

**Show symbols** from a binary

```ktool symbols [path/to/binary]```

**Output analysis as JSON**

```ktool json [path/to/binary]```

**Show file type information**

```ktool file [path/to/binary]```

# SYNOPSIS

**ktool** _command_ [_options_] [_file_]

# DESCRIPTION

**ktool** is a CLI and TUI toolkit for inspecting and editing Mach-O binaries and Objective-C metadata. It provides commands for MachO analysis (dump, json, list, symbols, info), MachO editing (insert, edit, lipo), and miscellaneous utilities (file, img4).

The tool works without external compiled dependencies and runs anywhere with a Python interpreter. It can analyze Apple mach-o and dyld_shared_cache files.

# CAVEATS

Designed specifically for Apple Mach-O binary format. Not applicable to ELF or PE binaries.

# HISTORY

**ktool** was created by **0cyn** and is written in **Python**. It can be installed via pip with `pip install k2l`.

# SEE ALSO

[otool](/man/otool)(1), [nm](/man/nm)(1), [lipo](/man/lipo)(1)
