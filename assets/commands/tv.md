# TAGLINE

Terminal viewer for tabular data

# TLDR

**View a CSV file**

```tv [data.csv]```

**View a TSV file**

```tv -t [data.tsv]```

**View with a custom delimiter**

```tv -d ";" [data.txt]```

**Show only the first N rows**

```tv -n [10] [data.csv]```

**View without a header row**

```tv --no-header [data.csv]```

**Use a specific color palette**

```tv -c [1] [data.csv]```

**Pipe data from another command**

```cat [data.csv] | tv```

# SYNOPSIS

**tv** [_-t_] [_-d delim_] [_--no-header_] [_options_] _file_

# PARAMETERS

**-t**
> Tab-separated.

**-d** _DELIM_
> Custom delimiter.

**--no-header**
> No header row.

**-n** _NUM_
> Number of rows to output. Default: 25.

**-c** _N_
> Color palette: 1 (nord), 2 (one_dark), 3 (gruvbox), 4 (dracula), 5 (uncolor).

**-u** _WIDTH_
> Upper (maximum) column width. Default: 20.

**-l** _WIDTH_
> Lower (minimum) column width. Must be 2 or larger. Default: 2.

**-h**, **--help**
> Show help.

# DESCRIPTION

**tv** (tidy-viewer) is a terminal viewer for tabular data that displays CSV, TSV, and other delimited files as formatted, column-aligned tables. It reads from files or stdin and renders data with proper alignment for easy reading in the terminal.

Custom delimiters can be specified for non-standard formats, and the **--no-header** flag handles files without a header row. The tool supports limiting output to a specified number of rows (default 25) for previewing large datasets. Missing values (NA, NULL, empty) are detected and highlighted.

Output is optimized for terminal display, with configurable column widths and 5 built-in color palettes. A dotfile (**~/.tv.toml**) can be used for persistent configuration.

# CAVEATS

Multiple tools share the name "tv". This refers to the Rust-based tidy-viewer/tv tool. Large files may be truncated to fit terminal dimensions.

# HISTORY

**tv** (tidy-viewer) is a Rust-based CLI tool for rendering tabular data in the terminal.

# SEE ALSO

[column](/man/column)(1), [csvlook](/man/csvlook)(1), [miller](/man/miller)(1)
