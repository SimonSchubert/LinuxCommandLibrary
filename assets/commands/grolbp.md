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
> Groff intermediate output file.

**-c** _N_, **--copies** _N_
> Print N copies of each page.

**-F** _DIR_, **--fontdir** _DIR_
> Prepend directory to the font search path.

**-l**, **--landscape**
> Format the document in landscape orientation.

**-o** _ORIENTATION_, **--orientation** _ORIENTATION_
> Set orientation to portrait or landscape.

**-p** _SIZE_, **--papersize** _SIZE_
> Set paper size (A4, letter, legal, executive).

**-w** _WIDTH_, **--linewidth** _WIDTH_
> Set default line thickness in thousandths of an em (default: 40).

**-v**, **--version**
> Display version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**grolbp** is a groff output driver that produces output in CAPSL and VDM format suitable for Canon LBP-4 and LBP-8 series laser printers. It supports various paper sizes, orientations, and copy counts.

The driver processes groff intermediate output and produces printer-specific commands for direct printing to Canon LBP hardware.

# CAVEATS

Part of groff package. Specific to Canon LBP printers. May require printer-specific configuration.

# HISTORY

grolbp was developed as part of **GNU groff** to support Canon laser beam printers.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [grops](/man/grops)(1), [grolj4](/man/grolj4)(1), [lpr](/man/lpr)(1)
