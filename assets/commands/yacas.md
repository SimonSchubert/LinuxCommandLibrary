# TAGLINE

Free computer algebra system

# TLDR

**Start calculator**

```yacas```

**Evaluate expression**

```yacas -c "[Solve(x^2-4==0,x)]"```

**Run script**

```yacas [script.ys]```

**Quiet mode**

```yacas -p```

# SYNOPSIS

**yacas** [_-c expr_] [_-p_] [_options_] [_file_]

# PARAMETERS

**-c** _EXPR_
> Evaluate expression.

**-p**
> Plain output.

**-d** _DIR_
> Scripts directory.

**--help**
> Show help.

# DESCRIPTION

**yacas** (Yet Another Computer Algebra System) is a free symbolic mathematics program that provides an interactive environment for algebraic computation. It supports symbolic manipulation of expressions, equation solving, calculus operations including derivatives and integrals, and linear algebra.

The system includes its own scripting language for defining custom functions and mathematical procedures. It can be used interactively at the command line or by running script files, and supports both exact symbolic computation and numerical evaluation.

# CAVEATS

Learning curve. Own syntax. Not as full as Mathematica.

# HISTORY

**Yacas** (Yet Another Computer Algebra System) was created as a free computer algebra system.

# SEE ALSO

[maxima](/man/maxima)(1), [octave](/man/octave)(1), [bc](/man/bc)(1)
