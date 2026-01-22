# TLDR

**Generate numbers from 1 to 10**

```seq 10```

**Generate numbers from 5 to 10**

```seq 5 10```

**Generate numbers with a step** (increment by 2)

```seq 0 2 10```

**Generate numbers in reverse** (decrement)

```seq 10 -1 1```

**Generate with leading zeros** (equal width)

```seq -w 1 100```

**Generate with custom separator**

```seq -s ", " 1 5```

**Generate with printf-style format**

```seq -f "file%03g.txt" 1 10```

# SYNOPSIS

**seq** [_options_] [_first_ [_increment_]] _last_

# PARAMETERS

_last_
> Generate from 1 to last

_first_ _last_
> Generate from first to last

_first_ _increment_ _last_
> Generate from first to last with specified increment

**-f**, **--format**=_format_
> Use printf-style format for output (e.g., %g, %f, %e)

**-s**, **--separator**=_string_
> Use string as separator (default: newline)

**-w**, **--equal-width**
> Pad with leading zeros for equal width

**--help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**seq** prints a sequence of numbers, one per line by default. It's useful for generating numbered lists, loop counters, and formatted sequences in shell scripts.

Without a starting number, seq begins at 1. The increment defaults to 1 (or -1 if first > last). Floating-point numbers are supported for all arguments.

The **-f** option accepts printf-style format specifiers: **%g** for general number, **%f** for fixed-point, **%e** for exponential notation. Width and precision modifiers work as in printf.

Commonly used in bash loops: **for i in $(seq 1 10); do echo $i; done** or with brace expansion alternative: **for i in {1..10}; do echo $i; done**.

# CAVEATS

For large sequences, seq is more memory-efficient than brace expansion as it generates numbers on demand rather than expanding all at once.

Floating-point increments may accumulate rounding errors. For precise decimal sequences, consider using other tools or languages.

Bash brace expansion **{1..10}** is often faster for simple integer sequences when the shell supports it.

# SEE ALSO

[jot](/man/jot)(1), [yes](/man/yes)(1), [printf](/man/printf)(1), [bash](/man/bash)(1)
