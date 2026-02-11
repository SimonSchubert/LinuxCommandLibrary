# TAGLINE

Interactive timezone name selector

# TLDR

**Select** timezone interactively

```tzselect```

Find timezone by **coordinates**

```tzselect -c [coordinates]```

# SYNOPSIS

**tzselect** [_OPTIONS_]

# PARAMETERS

**-c** _COORDINATES_
> Ask for nearest timezone to ISO 6709 coordinates

**-n** _LIMIT_
> Display at most this many choices

# DESCRIPTION

**tzselect** provides an interactive menu for selecting a timezone. It walks through geographic regions to help identify the correct timezone. The selected timezone name is printed to stdout.

Note: This program does not actually set the system timezone. It only helps identify the correct timezone name that can then be used with other tools to configure the system.

# CAVEATS

Does not modify system configuration. Output must be used with other tools to set timezone. Interactive mode requires terminal input.

# SEE ALSO

[timedatectl](/man/timedatectl)(1), [date](/man/date)(1)
