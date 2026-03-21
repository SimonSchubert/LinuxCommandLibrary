# TAGLINE

Convert PNM images to HP PPA printer format

# TLDR

**Convert a color PNM to PPA format**

```pnm2ppa --eco -i [input.pnm] -o [output.ppa]```

**Print a PNM file directly to the printer**

```pnm2ppa -i [image.pnm] -o - | lpr```

**Convert with a specific paper size**

```pnm2ppa --paper [a4] -i [input.pnm] -o [output.ppa]```

**Convert a black-and-white PNM**

```pbm2ppa -i [input.pbm] -o [output.ppa]```

# SYNOPSIS

**pnm2ppa** [_options_] [**-i** _infile_] [**-o** _outfile_]

# PARAMETERS

**-i** _FILE_
> Input PNM file (use - for stdin).

**-o** _FILE_
> Output PPA file (use - for stdout).

**--paper** _SIZE_
> Paper size (letter, a4, legal).

**--dpi** _DPI_
> Resolution (300 or 600).

**--eco**
> Economode: use less ink.

**--bw**
> Print in black and white only.

**-v** _PRINTER_
> Printer model (710, 720, 820, 1000).

**--gamma** _VALUE_
> Gamma correction value for color adjustment.

**-f** _FILE_
> Read configuration from file.

**--help**
> Display help.

# DESCRIPTION

**pnm2ppa** converts PNM (Portable Any Map) images to HP PPA (Printer Performance Architecture) format used by certain HP DeskJet inkjet printers (710, 720, 820, 1000 series). These printers lack standard PCL or PostScript support and require a host-based driver to render pages.

The tool generates the raw printer data stream, which can be sent directly to the printer device or piped through the print spooler. It is typically used in a GhostScript pipeline: a PostScript or PDF file is first rendered to PNM format by GhostScript, then converted to PPA by pnm2ppa. A companion utility **pbm2ppa** handles black-and-white PBM images. Paper size, resolution, and economy mode options control the output formatting.

# CAVEATS

Only works with specific HP DeskJet PPA printers. Considered legacy; most modern printers use standard drivers. Supports only 300 and 600 DPI resolutions.

# HISTORY

pnm2ppa was created for **HP PPA printers** lacking standard driver support.

# SEE ALSO

[pnm](/man/pnm)(5), [pbmtoppa](/man/pbmtoppa)(1), [gs](/man/gs)(1), [lpr](/man/lpr)(1), [lpstat](/man/lpstat)(1)

