# TLDR

Display **all** information from ELF file

```eu-readelf [-a|--all] [path/to/file]```

Display **NOTE** segments/sections

```eu-readelf [-n|--notes] [.note.ABI-tag] [path/to/file]```

# SYNOPSIS

**eu-readelf** [_options_] _files_

# DESCRIPTION

**eu-readelf** displays information about ELF (Executable and Linkable Format) files. Part of the elfutils package, it shows headers, sections, symbols, and other ELF metadata.

Alternative to GNU readelf with additional features for debugging and analysis.

# PARAMETERS

**-a, --all**
> Display all extractable information

**-n, --notes** [_section_]
> Display NOTE segments/sections

**-h, --file-header**
> Display file header

**-S, --sections**
> Display section headers

**-s, --symbols**
> Display symbol table

**-d, --dynamic**
> Display dynamic section

# CAVEATS

Part of elfutils package. Output format differs slightly from GNU readelf. Used for analyzing compiled binaries and shared libraries.

# SEE ALSO

[readelf](/man/readelf)(1), [objdump](/man/objdump)(1), [nm](/man/nm)(1)
