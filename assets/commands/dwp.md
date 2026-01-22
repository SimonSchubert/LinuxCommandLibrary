# TLDR

**Process DWP files**

```dwp [options] [file.dwp]```

# SYNOPSIS

**dwp** [_options_] _files_

# DESCRIPTION

**dwp** (DWARF packaging utility) combines DWARF debugging information from multiple object files into a single package file (.dwp). This reduces disk space and improves debugger performance for large projects.

The tool is used with split DWARF (-gsplit-dwarf) compilation, where debug info is separated from object files. dwp merges the resulting .dwo files into one efficient package.

Split DWARF with dwp significantly reduces link times and executable sizes while maintaining full debugging capability.

# CAVEATS

Requires split DWARF compilation. Debugger must support .dwp files. Large packages may still be slow to process.

# HISTORY

dwp is part of GNU binutils, supporting the DWARF debugging format. Split DWARF was introduced to address compile and link time issues in large C++ projects.

# SEE ALSO

[gdb](/man/gdb)(1), [objcopy](/man/objcopy)(1), [readelf](/man/readelf)(1)
