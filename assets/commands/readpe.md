# TLDR

Display **all information** about a PE file

```readpe path/to/executable```

Display **all headers** in a PE file

```readpe --all-headers path/to/executable```

Display **all sections** in a PE file

```readpe --all-sections path/to/executable```

Display a **specific header** (dos, coff, optional)

```readpe --header dos path/to/executable```

List all **imported functions**

```readpe --imports path/to/executable```

List all **exported functions**

```readpe --exports path/to/executable```

# SYNOPSIS

**readpe** [_options_] _file_

# PARAMETERS

**--all-headers**
> Display all headers present in the PE file

**--all-sections**
> Display all sections in the PE file

**--header** _type_
> Display specific header (dos, coff, optional)

**--imports**
> List imported functions

**--exports**
> List exported functions

# DESCRIPTION

**readpe** displays information about PE (Portable Executable) files, the executable format used by Windows. It can analyze headers, sections, imports, and exports from EXE, DLL, and other PE files.

This tool is useful for binary analysis, reverse engineering, and understanding executable structure.

# CAVEATS

Only works with valid PE format files. Malformed or corrupted PE files may not parse correctly.

# HISTORY

Part of **pev**, the PE file analysis toolkit for Unix-like systems.

# SEE ALSO

[objdump](/man/objdump)(1), [readelf](/man/readelf)(1), [file](/man/file)(1)
