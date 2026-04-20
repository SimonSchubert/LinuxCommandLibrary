# TAGLINE

displays paper size information

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

**-p** _PAPER_
> Select the paper name to query (a4, letter, legal, …). Without this, the system default is used.

**-d**
> Use libpaper's built-in default instead of the system setting.

**-a**
> Iterate over every known paper.

**-n**
> Print the paper name.

**-N**
> Print the paper name with the first letter capitalized.

**-s**
> Print size as width followed by height.

**-w**
> Print width.

**-h**
> Print height.

**-c**
> Express dimensions in centimetres.

**-m**
> Express dimensions in millimetres.

**-i**
> Express dimensions in inches (default is PostScript points).

**-z**
> Return an error when an unknown paper is given instead of falling back.

# DESCRIPTION

**paperconf** displays paper size information. Queries system paper settings.

The tool shows dimensions and names. Part of libpaper.

# CAVEATS

Part of libpaper. System paper configuration. Regional defaults.

# HISTORY

paperconf is part of **libpaper** for querying paper size configuration.

# SEE ALSO

[paperconfig](/man/paperconfig)(8), [lp](/man/lp)(1)

