# TAGLINE

Convert between measurement units

# TLDR

**Start interactive mode** for unit conversions

```units```

**Convert between units** directly

```units "[from_unit]" "[to_unit]"```

**Convert specific quantity**

```units "[100 kilometers]" "[miles]"```

**Show definition** of a unit

```units "[parsec]"```

**Use terse output** (for scripts)

```units --terse "[from_unit]" "[to_unit]"```

**Check units database** for errors

```units --check```

**Use a custom units file**

```units -f [custom_units.dat]```

**Display version and data file location**

```units -V```

# SYNOPSIS

**units** [_options_] [_from-unit_] [_to-unit_]

# PARAMETERS

**-f**, **--file** _filename_
> Use specified units database file.

**-c**, **--check**
> Check that all units reduce to primitive units.

**-o**, **--output-format** _format_
> Specify numeric output format.

**--terse**
> Print only the conversion factor (for parsing).

**--compact**
> Give compact output without operators.

**--quiet**, **-q**
> Suppress statistics and prompts.

**--verbose**, **-v**
> Show more detailed output.

**--locale** _locale_
> Force a specific locale.

**--minus**
> Interpret **-** as subtraction (default).

**--product**
> Interpret **-** as multiplication.

**--oldstar**
> Use old precedence for **\*** (higher than division).

**--newstar**
> Use new precedence for **\*** (default).

**-V**, **--version**
> Print version and data file location.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**GNU Units** converts between different systems of measurement and performs unit arithmetic. It includes a comprehensive database of over 3000 units, including historical and esoteric measurements.

In interactive mode, enter the source unit at the "You have:" prompt and the target unit at "You want:". Units checks dimensional compatibility and reports conformability errors for incompatible conversions.

The program also functions as a scientific calculator with built-in functions (sin, cos, ln, exp, etc.). Complex expressions with units are supported.

# CAVEATS

Attempting to convert between dimensionally incompatible units (e.g., meters to seconds) produces a conformability error. The units database location varies by installation; use **-V** to find it. Custom unit definitions can be added to personal unit files.

# HISTORY

The original Unix units program was included in early versions of Unix. **GNU Units** was written by **Adrian Mariano** as a free implementation with an expanded unit database. It was first released in **1996** and is maintained as part of the GNU Project. The program includes units from ancient civilizations, historical measurements, and modern scientific standards.

# SEE ALSO

[bc](/man/bc)(1), [dc](/man/dc)(1), [calc](/man/calc)(1)
