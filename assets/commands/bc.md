# TAGLINE

Arbitrary precision calculator language

# TLDR

**Calculate** expression

```echo ["2+2"] | bc```

**Division** with decimals

```echo ["scale=2; 10/3"] | bc```

**Run** bc script

```bc [script.bc]```

**Math library**

```bc -l```

**Evaluate an expression** directly

```bc -e "[scale=2; 100/3]"```

**Interactive** calculator

```bc```

# SYNOPSIS

**bc** [_options_] [_file_...]

# DESCRIPTION

**bc** is an arbitrary precision calculator language. It supports interactive calculation, scripting, and mathematical operations with user-definable precision for decimal calculations.

The tool has been a Unix standard for decades and is widely used in shell scripts for arithmetic.

# PARAMETERS

**-l**, **--mathlib**
> Load math library (includes functions like s, c, a, l, e, and sets scale to 20)

**-s**, **--standard**
> POSIX standard mode; error on any non-POSIX extensions

**-q**, **--quiet**
> Don't print the normal GNU bc welcome banner

**-i**, **--interactive**
> Force interactive mode

**-w**, **--warn**
> Warn about POSIX non-compliance

**-e** _expression_, **--expression** _expression_
> Evaluate expression; multiple -e options are processed in order

**-v**, **--version**
> Print version number and exit

# SPECIAL VARIABLES

**scale**
> Number of decimal places (default: 0)

**ibase**
> Input base (default: 10)

**obase**
> Output base (default: 10)

# OPERATORS

- **+, -, *, /** - Basic arithmetic
- **%** - Modulo
- **^** - Exponentiation
- **++, --** - Increment/decrement
- **==, !=, <, >** - Comparisons

# FUNCTIONS

With -l flag (also sets scale to 20):
- **s(x)** - Sine (x in radians)
- **c(x)** - Cosine (x in radians)
- **a(x)** - Arctangent (returns radians)
- **l(x)** - Natural logarithm
- **e(x)** - Exponential (e raised to x)
- **sqrt(x)** - Square root (available without -l)

# WORKFLOW

```bash
# Simple math
echo "2+2" | bc

# Floating point
echo "scale=4; 22/7" | bc

# Hex to decimal
echo "ibase=16; FF" | bc

# Square root
echo "sqrt(2)" | bc -l

# Multiple operations
bc <<< "
scale=2
x = 5
y = 3
x / y
"
```

# CAVEATS

Unusual syntax for programmers. Default integer division (set scale). Variables persist in interactive mode. Limited string handling. For modern scripts, consider awk or programming languages.

# HISTORY

**bc** was developed at Bell Labs for Unix in **1975** by Robert Morris and Lorinda Cherry, based on the earlier **dc** calculator. The GNU version, which is the most widely used today, was written by Philip A. Nelson.

# SEE ALSO

[dc](/man/dc)(1), [calc](/man/calc)(1), [awk](/man/awk)(1)
