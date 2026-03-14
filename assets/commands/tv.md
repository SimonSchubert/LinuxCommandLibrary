# TAGLINE

Terminal viewer for tabular data

# TLDR

**View CSV**

```tv [data.csv]```

**View TSV**

```tv -t [data.tsv]```

**View JSON**

```tv [data.json]```

**Custom delimiter**

```tv -d ";" [data.txt]```

**No header**

```tv --no-header [data.csv]```

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
> Show first N rows.

**--help**
> Show help.

# DESCRIPTION

**tv** is a terminal viewer for tabular data that displays CSV, TSV, and JSON files as formatted, column-aligned tables. It automatically detects the input format and renders the data with proper alignment for easy reading in the terminal.

Custom delimiters can be specified for non-standard formats, and the **--no-header** flag handles files without a header row. The tool supports limiting output to a specified number of rows for previewing large datasets.

Output is optimized for terminal display, adjusting column widths based on content and available terminal space.

# CAVEATS

Multiple tools share the name "tv". This refers to the Rust-based tidy-viewer/tv tool. Large files may be truncated to fit terminal dimensions.

# HISTORY

**tv** (tidy-viewer) is a Rust-based CLI tool for rendering tabular data in the terminal.

# SEE ALSO

[column](/man/column)(1), [csvlook](/man/csvlook)(1), [miller](/man/miller)(1)
