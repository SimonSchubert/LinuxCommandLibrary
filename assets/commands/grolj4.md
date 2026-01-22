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
> Line width.

**--help**
> Display help information.

# DESCRIPTION

**grolj4** is a groff output driver for HP LaserJet 4-series and compatible printers. It produces PCL 5 output.

The driver generates printer commands for direct printing to HP laser printers. It supports duplex printing, various paper sizes, and orientations.

grolj4 outputs to HP LaserJet printers.

# CAVEATS

Part of groff package. Specific to HP PCL5 compatible printers. Some features require printer support.

# HISTORY

grolj4 was developed as part of **GNU groff** to support HP LaserJet series printers.

# SEE ALSO

[groff](/man/groff)(1), [grops](/man/grops)(1), [grolbp](/man/grolbp)(1)
