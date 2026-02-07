# TAGLINE

remove columns from text input

# TLDR

Remove **first column** from stdin

```colrm 1 1```

Remove from **column 3 to end** of each line

```colrm 3```

Remove **columns 3 to 5**

```colrm 3 5```

# SYNOPSIS

**colrm** [_first_] [_last_]

# DESCRIPTION

**colrm** removes selected columns from text read from standard input. Columns are counted from 1. If only one argument is given, columns from that number to the end of line are removed.

The tool is useful for text processing pipelines where specific column ranges need to be stripped.

# PARAMETERS

_first_
> First column to remove (1-indexed)

_last_
> Last column to remove (optional, defaults to end of line)

# CAVEATS

Column counting starts at 1, not 0. Tabs are treated as advancing to the next multiple of 8 columns. Part of the util-linux package.

# SEE ALSO

[cut](/man/cut)(1), [column](/man/column)(1), [awk](/man/awk)(1)
