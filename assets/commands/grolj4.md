# TAGLINE

Groff HP LaserJet 4 printer driver

# TLDR

**Generate HP LaserJet output**

```groff -Tlj4 [file.roff] | lpr -P[printer]```

**Direct grolj4 usage**

```grolj4 [file] > output.lj4```

**Specify copies**

```grolj4 -c [3] [file]```

# SYNOPSIS

**grolj4** [_options_] [_file_]

# PARAMETERS

_FILE_
> Groff intermediate output.

**-c** _N_
> Number of copies.

**-d** _DUPLEX_
> Duplex mode (1=long, 2=short).

**-F** _DIR_
> Font directory.

**-l**
> Landscape orientation.

**-p** _SIZE_
> Paper size.

**-w** _WIDTH_
> Line thickness in thousandths of an em (default 40).

**-v**, **--version**
> Show version information and exit.

**--help**
> Display help information.

# DESCRIPTION

**grolj4** is a groff output driver for HP LaserJet 4-series and compatible printers. It produces PCL 5 output and supports duplex printing, various paper sizes, and orientations.

Normally **grolj4** is invoked indirectly by **groff -Tlj4**, not run directly; it reads groff's intermediate output format and translates it into PCL5 printer commands.

# CAVEATS

Part of groff package. Specific to HP PCL5 compatible printers. Default paper format is "letter" if none is specified; default duplex mode is long-side binding. Some features require printer support.

# HISTORY

grolj4 was developed as part of **GNU groff** to support HP LaserJet series printers.

# SEE ALSO

[groff](/man/groff)(1), [grops](/man/grops)(1), [grolbp](/man/grolbp)(1)

# RESOURCES

```[Source code](https://git.savannah.gnu.org/cgit/groff.git)```

```[Homepage](https://www.gnu.org/software/groff/)```

```[Documentation](https://www.gnu.org/software/groff/groff.html)```

<!-- verified: 2026-07-17 -->
