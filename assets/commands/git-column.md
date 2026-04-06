# TAGLINE

Display data in columns

# TLDR

**Format input into columns (column-first layout)**

```seq 1 24 | git column --mode=column --padding=[5]```

**Format input into columns (row-first layout)**

```seq 1 21 | git column --mode=row --padding=[5]```

**Format input with a specific terminal width**

```echo "[one two three four five six]" | git column --mode=column --width=[40]```

**Add indentation to each line**

```seq 1 12 | git column --mode=column --indent="[  ]"```

# SYNOPSIS

**git** **column** [_options_]

# PARAMETERS

**--command** _name_
> Look up layout mode using configuration variable column._name_ and column.ui.

**--mode** _mode_
> Specify layout mode. Supported values include column (fill columns top to bottom), row (fill rows left to right), and plain (no formatting).

**--raw-mode** _n_
> Same as **--mode** but takes mode encoded as a number. Mainly used by other commands that have already parsed layout mode.

**--width** _width_
> Specify the terminal width. By default **git column** detects the terminal width, or falls back to 80 if unable to do so.

**--indent** _string_
> String to be printed at the beginning of each line.

**--nl** _string_
> String to be printed at the end of each line, including newline character.

**--padding** _N_
> The number of spaces between columns. One space by default.

# DESCRIPTION

**git column** is a utility command that formats its standard input into a table with multiple columns, where each input line occupies one cell. While primarily used internally by Git to display lists (such as branch names, tag lists, or file listings) in a space-efficient columnar format, it is also available as a standalone formatting tool.

The command reads input from stdin and arranges it into columns based on terminal width or specified constraints. It supports different layout modes: column-first (fill columns top to bottom), row-first (fill rows left to right), or plain (no formatting).

# SEE ALSO

[column](/man/column)(1), [git-branch](/man/git-branch)(1), [git-tag](/man/git-tag)(1)

