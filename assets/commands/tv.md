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

**tv** views tabular data. It's a table viewer.

CSV/TSV support. Common formats.

Terminal display. Formatted tables.

Column alignment. Readable output.

JSON support. Structured data.

# CAVEATS

Various tools named tv. Check which installed. Rust implementation.

# HISTORY

**tv** is a terminal viewer for tabular data formats like CSV, TSV, and JSON.

# SEE ALSO

[column](/man/column)(1), [csvlook](/man/csvlook)(1), [miller](/man/miller)(1)
