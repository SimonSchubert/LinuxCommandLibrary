# TAGLINE

attempts to determine whether the system is a laptop or desktop computer

# TLDR

**Detect** if running on a laptop (exit code 0) or desktop (exit code 1)

```laptop-detect```

Print detected **device type**

```laptop-detect --verbose```

Display **version**

```laptop-detect --version```

# SYNOPSIS

**laptop-detect** [_options_]

# PARAMETERS

**--verbose**
> Print the detected device type

**--version**
> Display version information

**-h**, **--help**
> Display help message

# DESCRIPTION

**laptop-detect** attempts to determine whether the system is a laptop or desktop computer. It examines system characteristics like battery presence, chassis type, and hardware identifiers.

The command returns exit code 0 if the system is detected as a laptop, or 1 if it appears to be a desktop or the detection fails. This is useful in scripts that need to behave differently based on system type.

# CAVEATS

Detection is heuristic and may not be accurate for all systems. Some virtual machines or unusual hardware configurations may be misdetected.

# HISTORY

laptop-detect was developed for Debian-based systems to allow software configuration to adapt automatically based on whether the system is mobile or stationary.

# SEE ALSO

[dmidecode](/man/dmidecode)(8), [upower](/man/upower)(1), [hostnamectl](/man/hostnamectl)(1)
