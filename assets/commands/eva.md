# TAGLINE

calculator REPL with arbitrary precision

# TLDR

**Calculate expression**

```eva "[2 + 3 * 4]"```

**Calculate with functions**

```eva "[sin(pi/2)]"```

**Use radian mode for trigonometric functions**

```eva --radian "[sin(pi/2)]"```

**Interactive REPL mode**

```eva```

**Set decimal precision** (number of fixed decimal places, 1-64)

```eva --fix [20] "[pi]"```

**Change output radix/base** (1-36)

```eva --base [16] "[255]"```

# SYNOPSIS

**eva** [_options_] [_expression_]

# PARAMETERS

_INPUT_
> Mathematical expression string to evaluate (non-interactive).

**-f**, **--fix** _N_
> Number of decimal places in output (1-64, default 10).

**-b**, **--base** _N_
> Radix of calculation output (1-36, default 10).

**-r**, **--radian**
> Use radians for trigonometric functions.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Show version information.

# DESCRIPTION

**eva** is a calculator REPL and CLI written in Rust for evaluating mathematical expressions. It supports standard arithmetic, trigonometric functions, logarithms, and constants like **pi** and **e**.

In interactive REPL mode, previous results are available as **_** and history can be recalled. Pass an expression directly on the command line for one-off evaluation.

eva provides a quick command-line calculator with more intuitive syntax than **bc**.

# CAVEATS

Complex expressions may need quoting to avoid shell interpretation. Variables do not persist in one-shot command mode; use the interactive REPL for multi-step calculations.

# HISTORY

eva was created as a modern command-line calculator, providing an alternative to bc and similar tools with a more intuitive syntax and additional features.

# SEE ALSO

[bc](/man/bc)(1), [calc](/man/calc)(1), [qalc](/man/qalc)(1)
