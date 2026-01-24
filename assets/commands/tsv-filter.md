# TLDR

**Filter by column value**

```tsv-filter --eq [1]:[value] [file.tsv]```

**Greater than**

```tsv-filter --gt [2]:[100] [file.tsv]```

**String contains**

```tsv-filter --str-in-fld [1]:[pattern] [file.tsv]```

**Multiple conditions**

```tsv-filter --ge [2]:[10] --le [2]:[100] [file.tsv]```

**Invert filter**

```tsv-filter --invert --eq [1]:[value] [file.tsv]```

# SYNOPSIS

**tsv-filter** [_--eq col:val_] [_--gt col:val_] [_options_] [_file_]

# PARAMETERS

**--eq** _COL:VAL_
> Equal to value.

**--gt** _COL:VAL_
> Greater than.

**--lt** _COL:VAL_
> Less than.

**--str-in-fld** _COL:PAT_
> String contains.

**--invert**
> Invert match.

**-H**
> Has header.

# DESCRIPTION

**tsv-filter** filters TSV files. It selects rows.

Column-based filtering. Numeric and string.

Multiple conditions. AND logic.

Fast processing. D language speed.

Part of tsv-utils. Data processing suite.

# CAVEATS

TSV format. Column numbers start at 1. Part of tsv-utils.

# HISTORY

**tsv-filter** is part of **tsv-utils**, a collection of high-performance command-line tools for TSV files.

# SEE ALSO

[awk](/man/awk)(1), [cut](/man/cut)(1), [miller](/man/miller)(1)
