# TAGLINE

calculator REPL with arbitrary precision

# TLDR

**Calculate expression**

```eva "[2 + 3 * 4]"```

**Use variables**

```eva "[x = 5]" "[x * 2]"```

**Calculate with** functions

```eva "[sin(pi/2)]"```

**Convert units**

```eva "[100km to miles]"```

**Interactive mode**

```eva```

**High precision**

```eva --precision [50] "[pi]"```

# SYNOPSIS

**eva** [_options_] [_expressions_...]

# PARAMETERS

_EXPRESSIONS_
> Mathematical expressions to evaluate.

**--precision** _N_
> Decimal precision.

**--base** _N_
> Number base for output.

**--deg**
> Use degrees for trig functions.

**--help**
> Display help information.

# DESCRIPTION

**eva** is a calculator REPL and CLI for evaluating mathematical expressions. It supports variables, functions, unit conversions, and arbitrary precision arithmetic.

The tool handles standard arithmetic, trigonometric functions, logarithms, and constants like pi and e. Variables persist across expressions in interactive mode.

eva provides a quick command-line calculator with more features than basic shell arithmetic.

# CAVEATS

Complex expressions may need quoting. Unit conversion support varies. Interactive mode needed for variables to persist.

# HISTORY

eva was created as a modern command-line calculator, providing an alternative to bc and similar tools with a more intuitive syntax and additional features.

# SEE ALSO

[bc](/man/bc)(1), [calc](/man/calc)(1), [qalc](/man/qalc)(1)
