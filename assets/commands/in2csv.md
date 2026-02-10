# TAGLINE

converts tabular data from various formats to CSV

# TLDR

**Convert Excel to CSV**

```in2csv [data.xlsx] > [output.csv]```

**Convert specific sheet**

```in2csv --sheet [Sheet1] [data.xlsx]```

**Convert JSON to CSV**

```in2csv [data.json] > [output.csv]```

**Specify input format**

```in2csv -f [xlsx|json|ndjson] [input]```

**Convert fixed-width file**

```in2csv -f fixed -s [schema.csv] [data.txt]```

# SYNOPSIS

**in2csv** [_options_] _file_

# PARAMETERS

**-f** _FORMAT_
> Input format (csv, xlsx, xls, json, ndjson, fixed).

**--sheet** _NAME_
> Sheet name for Excel files.

**-s** _SCHEMA_
> Schema file for fixed-width input.

**-H**, **--no-header-row**
> Input has no header row.

**-K** _N_
> Skip N lines at start.

**--help**
> Display help information.

# DESCRIPTION

**in2csv** converts tabular data from various formats to CSV. It's part of the csvkit toolkit for working with CSV files.

The tool handles Excel, JSON, fixed-width, and other formats. It enables piping data to other csvkit tools for analysis.

# CAVEATS

Part of csvkit. Python-based. Large files may be slow.

# HISTORY

in2csv is part of **csvkit**, created by **Christopher Groskopf** for journalists and data analysts.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvlook](/man/csvlook)(1), [csvstat](/man/csvstat)(1), [csvsql](/man/csvsql)(1)
