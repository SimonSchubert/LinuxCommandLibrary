# TAGLINE

Paginate and format text for printing

# TLDR

**Format file for printing**

```pr [file]```

**Add page header**

```pr -h "[Header Text]" [file]```

**Multi-column output**

```pr -[3] [file]```

**Double space output**

```pr -d [file]```

**Number lines**

```pr -n [file]```

# SYNOPSIS

**pr** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files.

**-h** _HEADER_
> Page header text.

**-NUM**
> Number of columns.

**-d**
> Double space.

**-n**
> Number lines.

**-l** _LINES_
> Page length.

**-w** _WIDTH_
> Page width.

# DESCRIPTION

**pr** formats text files for printing by adding page headers (with filename and date), footers, page breaks, and line numbers. It can arrange text into multiple columns and control page dimensions including length, width, and margins.

This traditional Unix utility is useful for preparing plain text documents for printing or for creating formatted multi-column layouts from single-column input. It reads from files or stdin and writes to stdout.

# CAVEATS

Standard Unix utility. Part of coreutils.

# HISTORY

pr is a **traditional Unix** text formatting utility.

# SEE ALSO

[fmt](/man/fmt)(1), [fold](/man/fold)(1), [column](/man/column)(1)

