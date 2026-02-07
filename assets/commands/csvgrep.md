# TAGLINE

CSV row filter by column values

# TLDR

**Filter rows by column** matching a value

```csvgrep -c [column] -m "[value]" [data.csv]```

**Filter using regular expression**

```csvgrep -c [column] -r "[pattern]" [data.csv]```

**Filter by column number** instead of name

```csvgrep -c [1] -m "[value]" [data.csv]```

**Invert match** (exclude matching rows)

```csvgrep -c [column] -m "[value]" -i [data.csv]```

**Match against multiple columns**

```csvgrep -c "[col1,col2]" -m "[value]" [data.csv]```

**Case-insensitive matching**

```csvgrep -c [column] -r "(?i)[pattern]" [data.csv]```

# SYNOPSIS

**csvgrep** [_options_] _file_

# PARAMETERS

**-c** _COLUMN_, **--columns** _COLUMN_
> Column name(s) or index to search (comma-separated for multiple).

**-m** _STRING_, **--match** _STRING_
> Exact string to search for.

**-r** _REGEX_, **--regex** _REGEX_
> Regular expression pattern to match.

**-f** _FILE_, **--file** _FILE_
> File containing values to match (one per line).

**-i**, **--invert-match**
> Select non-matching rows.

**-a**, **--any-match**
> Match if any column matches (with multiple columns).

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter (default: comma).

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

# DESCRIPTION

**csvgrep** is part of csvkit that filters CSV rows based on column values. Unlike standard grep, it understands CSV structure and can match against specific columns while preserving proper CSV output.

The tool supports both exact string matching and regular expressions. Multiple columns can be searched, and the match sense can be inverted to exclude rows. This makes it ideal for extracting subsets of data based on criteria.

csvgrep handles quoted fields correctly, ensuring that commas within fields don't break the search. Results include the header row, maintaining valid CSV structure.

# CAVEATS

Regular expressions use Python syntax. Column names are case-sensitive. Large files may be slow as the entire file is processed. Memory usage scales with file size for some operations.

# HISTORY

csvgrep is part of **csvkit**, created by Christopher Groskopf in **2011**. It provides grep-like functionality aware of CSV structure, solving the common problem of searching tabular data without breaking on embedded delimiters.

# SEE ALSO

[csvcut](/man/csvcut)(1), [csvsort](/man/csvsort)(1), [grep](/man/grep)(1), [csvkit](/man/csvkit)(1)
