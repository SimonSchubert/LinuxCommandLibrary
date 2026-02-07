# TAGLINE

format text into aligned columns

# TLDR

Format output for **specific width**

```printf "header1 header2\nbar foo\n" | column -c 30```

**Auto-align** columns in tabular format

```printf "header1 header2\nbar foo\n" | column -t```

Specify column **delimiter** for table mode

```printf "header1,header2\nbar,foo\n" | column -t -s ,```

Fill **rows before columns**

```printf "header1\nbar\nfoobar\n" | column -c 30 -x```

# SYNOPSIS

**column** [_options_] [_file_...]

# DESCRIPTION

**column** formats text from stdin or a file into multiple columns. By default, columns are filled before rows using whitespace as separator.

The table mode (-t) is particularly useful for aligning structured data into readable tables.

# PARAMETERS

**-c, --output-width** _width_
> Output width in characters

**-t, --table**
> Create a table with aligned columns

**-s, --separator** _chars_
> Column delimiters for table mode (default: whitespace)

**-x, --fillrows**
> Fill rows before filling columns

**-o, --output-separator** _string_
> Table output column separator

# CAVEATS

Part of util-linux. The table mode requires consistent delimiter usage. Very long lines may cause formatting issues.

# SEE ALSO

[colrm](/man/colrm)(1), [cut](/man/cut)(1), [paste](/man/paste)(1)
