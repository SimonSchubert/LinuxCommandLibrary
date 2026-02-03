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

**git column** formats input into multiple columns. Used internally by Git for columnar output. Can be used as a general-purpose column formatter.

# SEE ALSO

[column](/man/column)(1)

