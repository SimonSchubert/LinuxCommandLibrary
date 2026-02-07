# TAGLINE

CSV format and delimiter converter

# TLDR

**Convert CSV to tab-delimited**

```csvformat -T [input.csv]```

**Change delimiter**

```csvformat -D "[;]" [input.csv]```

**Convert to specific quoting**

```csvformat -U [0|1|2|3] [input.csv]```

**Remove header**

```csvformat -K [1] [input.csv]```

# SYNOPSIS

**csvformat** [_options_] [_file_]

# PARAMETERS

**-T**
> Output tab-delimited.

**-D** _delimiter_
> Set output delimiter.

**-U** _style_
> Quoting style: 0=minimal, 1=all, 2=non-numeric, 3=none.

**-K** _n_
> Skip first n rows.

**-M** _char_
> Set output line terminator.

**-d** _CHAR_, **--delimiter** _CHAR_
> Input field delimiter (default: comma).

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

# DESCRIPTION

**csvformat** is part of csvkit that converts CSV files between different delimited formats. It allows changing field delimiters, quote characters, quoting styles, and line terminators while maintaining proper CSV structure.

The tool is useful for converting CSV files to tab-delimited format for Unix tools, standardizing quote handling across files, or reformatting data for systems with specific delimiter requirements. It properly handles CSV quoting rules during conversion.

Quoting styles include minimal (quote only when necessary), all fields, non-numeric fields only, and none. The tool can also skip header rows and adjust line endings for cross-platform compatibility.

# CAVEATS

Part of csvkit, requires Python. Type inference determines quoting behavior in minimal mode. Some combinations of options may produce invalid CSV for certain parsers.

# HISTORY

csvformat is part of **csvkit**, created by Christopher Groskopf in **2011**. It addresses the common need to convert between CSV dialects and delimited formats while preserving data integrity.

# SEE ALSO

[csvkit](/man/csvkit)(1), [csv-diff](/man/csv-diff)(1), [csvlook](/man/csvlook)(1)
