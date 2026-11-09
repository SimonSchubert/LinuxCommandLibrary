# TAGLINE

CSV format and delimiter converter

# TLDR

**Convert CSV to tab-delimited**

```csvformat -T [input.csv]```

**Change delimiter**

```csvformat -D "[;]" [input.csv]```

**Quote all fields**

```csvformat -U 1 [input.csv]```

**Skip first N rows**

```csvformat -K [1] [input.csv]```

**Change line terminator**

```csvformat -M $'\r\n' [input.csv]```

**Omit the header row** from the output

```csvformat -E [input.csv]```

# SYNOPSIS

**csvformat** [_options_] [_file_]

# PARAMETERS

**-T**, **--out-tabs**
> Output tab-delimited. Overrides **-D**.

**-A**, **--out-asv**
> Output with the ASCII unit and record separators. Overrides **-T**, **-D** and **-M**.

**-D** _delimiter_, **--out-delimiter** _delimiter_
> Set output delimiter.

**-Q** _char_, **--out-quotechar** _char_
> Set output quote character.

**-U** _style_, **--out-quoting** _style_
> Quoting style: 0=minimal, 1=all, 2=non-numeric, 3=none.

**-B**, **--out-no-doublequote**
> Do not double quote characters in the output.

**-P** _char_, **--out-escapechar** _char_
> Output escape character, used with **-U 3** or **-B**.

**-M** _char_, **--out-lineterminator** _char_
> Set output line terminator.

**-E**, **--skip-header**
> Do not output a header row.

**-K** _n_, **--skip-lines** _n_
> Skip first n lines of the input.

**-d** _CHAR_, **--delimiter** _CHAR_
> Input field delimiter (default: comma).

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

# DESCRIPTION

**csvformat** is part of csvkit that converts CSV files between different delimited formats. It allows changing field delimiters, quote characters, quoting styles, and line terminators while maintaining proper CSV structure.

The tool is useful for converting CSV files to tab-delimited format for Unix tools, standardizing quote handling across files, or reformatting data for systems with specific delimiter requirements. It properly handles CSV quoting rules during conversion.

Quoting styles include minimal (quote only when necessary), all fields, non-numeric fields only, and none. The tool can also skip header rows and adjust line endings for cross-platform compatibility.

# CAVEATS

Part of csvkit, requires Python. Type inference determines which fields count as numeric with **-U 2**. Some combinations of options may produce invalid CSV for certain parsers.

# HISTORY

csvformat is part of **csvkit**, created by Christopher Groskopf in **2011**. It addresses the common need to convert between CSV dialects and delimited formats while preserving data integrity.

# SEE ALSO

[csvkit](/man/csvkit)(1), [csvlook](/man/csvlook)(1), [csvcut](/man/csvcut)(1), [csvgrep](/man/csvgrep)(1)

# RESOURCES

```[Source code](https://github.com/wireservice/csvkit)```

```[Documentation](https://csvkit.readthedocs.io/en/latest/scripts/csvformat.html)```

<!-- verified: 2026-11-09 -->
