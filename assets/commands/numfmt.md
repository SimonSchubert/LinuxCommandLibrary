# TLDR

**Convert bytes to human-readable**

```numfmt --to=iec [1048576]```

**Convert with IEC units** (Ki, Mi, Gi)

```echo [1073741824] | numfmt --to=iec```

**Convert with SI units** (K, M, G)

```numfmt --to=si [1000000]```

**Parse human-readable to number**

```numfmt --from=iec [10M]```

**Format specific field** in input

```df -B1 | numfmt --header --field 2-4 --to=iec```

**Add suffix**

```numfmt --to=si --suffix=B [1000000]```

**Set output padding**

```numfmt --to=iec --padding=10 [1048576]```

# SYNOPSIS

**numfmt** [_--from=UNIT_] [_--to=UNIT_] [_--field=N_] [_options_] [_numbers_]

# PARAMETERS

**--from=** _UNIT_
> Parse input units (auto, si, iec, iec-i).

**--to=** _UNIT_
> Convert to units (si, iec, iec-i).

**--field=** _N_
> Convert field N (default: 1).

**--header**[=_N_]
> Skip N header lines (default: 1).

**--padding=** _N_
> Pad output to N characters.

**--suffix=** _STR_
> Append suffix to output.

**--format=** _FMT_
> Printf-style format.

**--round=** _METHOD_
> Rounding: up, down, from-zero, towards-zero, nearest.

**--grouping**
> Use locale digit grouping (e.g., 1,000).

**--delimiter=** _D_
> Use D as field delimiter.

**--invalid=** _MODE_
> Handle invalid input: abort, fail, warn, ignore.

**-d** _D_
> Short for --delimiter.

**--debug**
> Print conversion warnings.

# DESCRIPTION

**numfmt** converts numbers to and from human-readable representations. It handles both SI units (powers of 1000: K, M, G) and IEC units (powers of 1024: Ki, Mi, Gi).

Input parsing (--from) interprets suffixed numbers: 10K becomes 10000 (SI) or 10240 (IEC). Output conversion (--to) formats numbers with appropriate suffixes for readability.

For processing command output, --field selects which column to convert, and --header preserves header rows. This enables piping output from commands like df or ls through numfmt for human-readable conversion.

The --format option provides printf-style control: `%10.2f` for fixed-width decimal output. Combined with --grouping, numbers display with locale-appropriate thousands separators.

Rounding modes control how fractional values are handled. The default rounds to nearest, but ceiling (up) or floor (down) may be preferred for storage calculations.

# CAVEATS

SI and IEC units differ significantly at large values. The 'iec-i' format uses explicit "Ki" suffix while 'iec' uses just "K". Floating-point precision may affect very large numbers. Not all locales support grouping.

# HISTORY

**numfmt** is part of **GNU coreutils**, added to provide standardized number formatting across utilities. It addresses the inconsistency of human-readable output between different commands, providing a single tool for number conversion that respects both SI and IEC standards.

# SEE ALSO

[printf](/man/printf)(1), [bc](/man/bc)(1), [units](/man/units)(1), [factor](/man/factor)(1)
