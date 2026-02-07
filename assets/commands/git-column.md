# TAGLINE

Format text into columns

# TLDR

**Format input as columns**

```echo "[a b c]" | git column```

**Specify column mode**

```git column --mode=[column]```

**Set column width**

```git column --width=[80]```

**Set padding**

```git column --padding=[2]```

# SYNOPSIS

**git** **column** [_options_]

# PARAMETERS

**--mode** _mode_
> Column mode (column, row, plain).

**--width** _width_
> Maximum width.

**--padding** _num_
> Space between columns.

**--raw-mode** _mode_
> Raw column mode bits.

# DESCRIPTION

**git column** is a utility command that formats text input into multiple columns. While primarily used internally by Git to display lists (such as branch names, tag lists, or file listings) in a space-efficient columnar format, it's also available as a standalone formatting tool.

The command reads input from stdin and arranges it into columns based on terminal width or specified constraints. It supports different layout modes: column-first (fill columns top to bottom), row-first (fill rows left to right), or plain (no formatting). This matches Git's standard output behavior when listing items.

Advanced options allow controlling padding between columns, maximum width, and raw mode bits for fine-grained control over the layout algorithm. Git column can be useful in shell scripts or pipelines where columnar output improves readability of list data.

# SEE ALSO

[column](/man/column)(1)

