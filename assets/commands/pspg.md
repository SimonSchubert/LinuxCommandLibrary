# TAGLINE

Unix pager designed for tables and PostgreSQL output

# TLDR

**Use as the pager for psql**

```export PAGER=pspg```

**View a CSV file**

```pspg --csv < [file.csv]```

**View a TSV file**

```pspg --tsv < [file.tsv]```

# SYNOPSIS

**pspg** [_options_]

# PARAMETERS

**--csv**
> Read input as CSV format.

**--tsv**
> Read input as TSV format.

**--stream**
> Use streaming mode for psql watch output.

# DESCRIPTION

**pspg** is a Unix pager with rich functionality designed for working with tables. Originally created for PostgreSQL's psql, it also supports MySQL and works as a general CSV/TSV viewer. It features frozen column headers, searching, row/column/block selection, clipboard export, and mouse support.

# HISTORY

**pspg** was created by **Pavel Stehule** (okbob) and is written in **C**.

# SEE ALSO

[less](/man/less)(1), [psql](/man/psql)(1), [ov](/man/ov)(1)
