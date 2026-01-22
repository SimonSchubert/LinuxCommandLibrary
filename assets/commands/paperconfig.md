# TLDR

**Set default paper size**

```paperconfig -p [a4]```

**Set to letter size**

```paperconfig -p letter```

**Interactive selection**

```paperconfig```

# SYNOPSIS

**paperconfig** [_options_]

# PARAMETERS

**-p** _PAPER_
> Set paper size.

**-h**, **--help**
> Display help.

# DESCRIPTION

**paperconfig** sets system paper size. Configures default paper format.

The tool modifies /etc/papersize. Part of libpaper.

paperconfig configures paper.

# CAVEATS

Root required. Part of libpaper. Affects printing defaults.

# HISTORY

paperconfig is part of **libpaper** for setting system paper size.

# SEE ALSO

[paperconf](/man/paperconf)(1), [lp](/man/lp)(1)

