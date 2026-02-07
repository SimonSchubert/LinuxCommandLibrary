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

**Interactive** calculator

```bc```

# SYNOPSIS

**bc** [_options_] [_file_...]

# DESCRIPTION

**bc** is an arbitrary precision calculator language. It supports interactive calculation, scripting, and mathematical operations with user-definable precision for decimal calculations.

The tool has been a Unix standard for decades and is widely used in shell scripts for arithmetic.

# PARAMETERS

**-l**, **--mathlib**
> Load math library (includes functions like sin, cos, sqrt)

**-s**, **--standard**
> POSIX standard mode

**-q**, **--quiet**
> Don't print welcome banner

**-i**, **--interactive**
> Force interactive mode

**-w**, **--warn**
> Warn about POSIX non-compliance

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

With -l flag:
- **s(x)** - Sine
- **c(x)** - Cosine
- **a(x)** - Arctangent
- **l(x)** - Natural log
- **e(x)** - Exponential
- **sqrt(x)** - Square root

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

**bc** was developed at Bell Labs for Unix in **1975** by Robert Morris and Lorinda Cherry, based on the earlier dc calculator.

# SEE ALSO

[dc](/man/dc)(1), [calc](/man/calc)(1), [awk](/man/awk)(1)
