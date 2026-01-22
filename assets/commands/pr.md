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

**pr** formats text for printing. Paginates and columnates.

The tool adds headers and footers. Prepares files for output.

pr formats for printing.

# CAVEATS

Standard Unix utility. Part of coreutils.

# HISTORY

pr is a **traditional Unix** text formatting utility.

# SEE ALSO

[fmt](/man/fmt)(1), [fold](/man/fold)(1), [column](/man/column)(1)

