# TAGLINE

Epson ESC/P2 to PBM format converter

# TLDR

**Convert ESCP2 to PBM**

```escp2topbm < [input.escp2] > [output.pbm]```

# SYNOPSIS

**escp2topbm** [_options_] [_input_]

# DESCRIPTION

**escp2topbm** converts Epson ESC/P2 printer control language output to PBM (Portable Bitmap) format. This tool is part of the Netpbm image processing toolkit and is useful for converting printer-ready documents to portable bitmap images.

ESC/P2 is Epson's enhanced printer control language that was widely used in dot-matrix and inkjet printers. The tool reads the binary ESC/P2 data stream and extracts the raster graphics into a standard PBM format that can be further processed or converted to other image formats.

# SEE ALSO

[pbmtoescp2](/man/pbmtoescp2)(1), [pbmtoepson](/man/pbmtoepson)(1)

