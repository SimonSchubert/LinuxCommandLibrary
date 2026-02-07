# TAGLINE

Groff Canon LBP printer driver

# TLDR

**Generate Canon LBP output**

```groff -Tlbp [file.roff] | lpr -P[printer]```

**Direct grolbp usage**

```grolbp [file] > output.lbp```

**Specify font**

```grolbp -F [fontdir] [file]```

# SYNOPSIS

**grolbp** [_options_] [_file_]

# PARAMETERS

_FILE_
> Groff intermediate output.

**-c** _N_
> Number of copies.

**-F** _DIR_
> Font directory.

**-l**
> Landscape orientation.

**-o** _PAGES_
> Page selection.

**-p** _SIZE_
> Paper size.

**-w** _WIDTH_
> Line width.

**--help**
> Display help information.

# DESCRIPTION

**grolbp** is a groff output driver for Canon CAPSL laser beam printers. It generates output compatible with Canon LBP printer series, supporting various paper sizes, orientations, and copy counts.

The driver produces printer-specific commands for direct printing to Canon LBP hardware.

# CAVEATS

Part of groff package. Specific to Canon LBP printers. May require printer-specific configuration.

# HISTORY

grolbp was developed as part of **GNU groff** to support Canon laser beam printers.

# SEE ALSO

[groff](/man/groff)(1), [grops](/man/grops)(1), [grolj4](/man/grolj4)(1)
