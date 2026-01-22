# TLDR

**Calculate** expression

```calc ["2 + 2"]```

**Interactive** mode

```calc```

**Define** variables

```calc ["x = 5; y = 3; x * y"]```

**Use** functions

```calc ["sqrt(16)"]```

# SYNOPSIS

**calc** [_options_] [_expression_]

# DESCRIPTION

**calc** is an arbitrary precision calculator. It provides interactive calculation and scripting with support for complex arithmetic, trigonometry, statistics, and user-defined functions.

The tool offers more features than bc while maintaining ease of use.

# PARAMETERS

**-c**
> Continue after errors

**-d**
> Disable readline editing

**-p**
> Pipe mode (no prompts)

**-q**
> Quiet mode (no startup message)

**-s**
> Enforce strict mode

# FEATURES

- Arbitrary precision arithmetic
- Complex numbers
- Trigonometric functions
- Statistical functions
- User-defined functions
- Variable assignment
- Matrix operations
- Fractions and rationals

# FUNCTIONS

**Arithmetic:**
- **sqrt(x)** - Square root
- **abs(x)** - Absolute value
- **gcd(a,b)** - Greatest common divisor

**Trigonometry:**
- **sin(x), cos(x), tan(x)**
- **asin(x), acos(x), atan(x)**

**Other:**
- **ln(x)** - Natural log
- **exp(x)** - Exponential
- **rand()** - Random number

# WORKFLOW

```bash
# Simple calculation
calc "2^100"

# Interactive mode
calc
> x = 5
> y = 10
> x * y + 3

# Script file
calc -f script.cal

# One-liner with precision
calc "pi(100)"  # Pi with 100 digits
```

# VARIABLES

```
> epsilon(1e-10)  # Set precision
> x = 5
> y = x^2 + 3*x + 1
```

# CAVEATS

Different syntax than bc. Less commonly installed. Some functions require understanding of calc's type system. Error messages can be cryptic. Large computations use memory.

# HISTORY

**calc** was originally developed around **1984** and has been maintained as a feature-rich alternative to bc.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [qalc](/man/qalc)(1)
