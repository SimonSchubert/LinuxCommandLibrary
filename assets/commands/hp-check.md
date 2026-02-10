# TAGLINE

verifies HPLIP installation and dependencies

# TLDR

**Check HPLIP status**

```hp-check```

**Auto-install missing**

```hp-check -a```

**Fix runtime issues**

```hp-check -r```

**Check specific dependency**

```hp-check -t```

# SYNOPSIS

**hp-check** [_options_]

# PARAMETERS

**-a**, **--auto**
> Automatic install mode.

**-r**, **--runtime**
> Check runtime only.

**-t**
> Check dependencies.

**-f**
> Force all checks.

**--help**
> Display help information.

# DESCRIPTION

**hp-check** verifies HPLIP installation and dependencies. It checks for missing packages, configuration issues, and printer connectivity.

The tool can automatically install missing components on supported distributions. It helps diagnose and fix printing problems.

# CAVEATS

Part of HPLIP package. May need root for fixes. Distribution-specific behavior.

# HISTORY

hp-check is part of **HPLIP** (HP Linux Imaging and Printing), providing diagnostic capabilities for HP printer setups.

# SEE ALSO

[hp-setup](/man/hp-setup)(1), [hp-info](/man/hp-info)(1), [hplip](/man/hplip)(1)
