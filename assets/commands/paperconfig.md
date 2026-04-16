# TAGLINE

sets system paper size

# TLDR

**Set default paper size**

```paperconfig -p [a4]```

**Set to letter size**

```paperconfig -p letter```

**Reconfigure interactively** (Debian/Ubuntu)

```dpkg-reconfigure libpaper1```

# SYNOPSIS

**paperconfig** [_options_]

# PARAMETERS

**-p** _PAPER_
> Set paper size.

**-h**, **--help**
> Display help.

# DESCRIPTION

**paperconfig** sets the system-wide default paper size used by the libpaper library (e.g., a4, letter, legal). Applications that query libpaper (such as many printing and TeX tools) use this value as their default.

The tool rewrites **/etc/papersize** to hold the chosen paper name. Available paper names can be listed with **paperconf -a**.

# CAVEATS

Root required. Part of libpaper. Affects printing defaults.

# HISTORY

paperconfig is part of **libpaper** for setting system paper size.

# SEE ALSO

[paperconf](/man/paperconf)(1), [lp](/man/lp)(1)

