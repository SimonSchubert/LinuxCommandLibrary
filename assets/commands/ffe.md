# TLDR

**Extract fields from** flat file

```ffe -c [config.ffe] [data.txt]```

**Output as CSV**

```ffe -c [config.ffe] -o csv [data.txt]```

**Process binary file**

```ffe -c [config.ffe] -b [data.bin]```

**Show structure info**

```ffe -c [config.ffe] -s [data.txt]```

# SYNOPSIS

**ffe** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files to process.

**-c** _FILE_
> Configuration file defining record structure.

**-o** _FORMAT_
> Output format: csv, xml, html, etc.

**-b**
> Binary input mode.

**-s**
> Show structure information.

**-e** _EXPR_
> Expression to filter records.

**--help**
> Display help information.

# DESCRIPTION

**ffe** (Flat File Extractor) parses fixed-width and delimited files according to a structure definition. It extracts fields from legacy flat files and converts them to modern formats.

Configuration files define record layouts with field names, widths, and types. The tool handles multiple record types in a single file, common in mainframe data formats.

ffe is useful for processing legacy data exports, EDI files, and other structured text formats.

# CAVEATS

Requires configuration file. Complex record structures need careful setup. Large files may be slow to process.

# HISTORY

ffe was created for processing legacy flat file formats common in mainframe and batch processing systems. It bridges older data formats with modern text processing tools.

# SEE ALSO

[awk](/man/awk)(1), [cut](/man/cut)(1), [csvtool](/man/csvtool)(1)
