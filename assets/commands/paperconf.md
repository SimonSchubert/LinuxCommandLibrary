# TLDR

**Show default paper size**

```paperconf```

**Show paper width**

```paperconf -w```

**Show paper height**

```paperconf -h```

**Show specific paper**

```paperconf -p [a4]```

**Show in millimeters**

```paperconf -m```

# SYNOPSIS

**paperconf** [_options_] [_paper_]

# PARAMETERS

_PAPER_
> Paper name (a4, letter, etc.).

**-w**
> Show width.

**-h**
> Show height.

**-m**
> Output in millimeters.

**-p** _PAPER_
> Specify paper type.

# DESCRIPTION

**paperconf** displays paper size information. Queries system paper settings.

The tool shows dimensions and names. Part of libpaper.

paperconf shows paper sizes.

# CAVEATS

Part of libpaper. System paper configuration. Regional defaults.

# HISTORY

paperconf is part of **libpaper** for querying paper size configuration.

# SEE ALSO

[paperconfig](/man/paperconfig)(8), [lp](/man/lp)(1)

