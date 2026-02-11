# TAGLINE

Remove packages on Mageia Linux

# TLDR

**Uninstall** package

```sudo urpme [package]```

Remove **orphan** packages

```sudo urpme --auto-orphans```

Remove package and **dependencies**

```sudo urpme --auto-orphans [package]```

# SYNOPSIS

**urpme** [_OPTIONS_] _PACKAGE_...

# PARAMETERS

**--auto-orphans**
> Remove orphaned packages (no longer needed)

**--auto**
> Automatically confirm removal

**-v, --verbose**
> Verbose output

# DESCRIPTION

**urpme** uninstalls packages in Mageia Linux. It handles package removal including dependency checking and can automatically remove orphaned packages that are no longer needed.

Part of the urpmi package management suite for Mageia.

# CAVEATS

Mageia specific. Use --auto-orphans carefully as it may remove important packages. Requires root privileges.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmq](/man/urpmq)(8), [urpmi.update](/man/urpmi.update)(8)
