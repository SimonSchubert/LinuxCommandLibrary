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

**pnm2ppa** converts PNM to HP PPA format. Printer protocol for HP inkjets.

The tool generates printer data. For HP DeskJet 700/800 series.

pnm2ppa converts to PPA.

# CAVEATS

HP DeskJet specific. Legacy printer support.

# HISTORY

pnm2ppa was created for **HP PPA printers** lacking standard driver support.

# SEE ALSO

[pnm](/man/pnm)(5), [lpr](/man/lpr)(1)

