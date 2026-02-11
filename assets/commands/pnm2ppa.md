# TAGLINE

Convert PNM images to HP PPA printer format

# TLDR

**Convert PNM to PPA**

```pnm2ppa [options] [input.pnm] > [output.ppa]```

**Print directly**

```cat [image.pnm] | pnm2ppa | lpr```

**Specify paper size**

```pnm2ppa --paper [a4] [input.pnm] > [output.ppa]```

# SYNOPSIS

**pnm2ppa** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PNM file.

**--paper** _SIZE_
> Paper size.

**--dpi** _DPI_
> Resolution.

**--gamma** _VALUE_
> Gamma correction.

**--help**
> Display help.

# DESCRIPTION

**pnm2ppa** converts PNM images to HP PPA (Printer Performance Architecture) format used by certain HP DeskJet inkjet printers (700/800 series). These printers lack standard PCL or PostScript support and require a host-based driver to render pages.

The tool generates the raw printer data stream, which can be sent directly to the printer device or piped through the print spooler. Paper size and resolution options control the output formatting.

# CAVEATS

HP DeskJet specific. Legacy printer support.

# HISTORY

pnm2ppa was created for **HP PPA printers** lacking standard driver support.

# SEE ALSO

[pnm](/man/pnm)(5), [lpr](/man/lpr)(1)

