# TAGLINE

Epson ESC/P2 to PBM format converter

# TLDR

**Convert ESCP2 to PBM**

```escp2topbm < [input.escp2] > [output.pbm]```

# SYNOPSIS

**escp2topbm** [_escp2file_]

# DESCRIPTION

**escp2topbm** reads an Epson ESC/P2 printer data stream and writes the graphics it contains as a PBM (Portable Bitmap) image on standard output. If no file is given it reads from standard input. It is part of the Netpbm image processing toolkit.

ESC/P2 is Epson's enhanced printer control language, widely used in dot-matrix and inkjet printers. escp2topbm extracts the bitmap raster embedded in such a stream, which lets you recover or inspect the image that would have been printed. It is essentially the inverse of pbmtoepson.

# PARAMETERS

escp2topbm defines no options of its own; it accepts the options common to all Netpbm programs, such as **-plain** and **-quiet** (the common **-plain** option had no effect before Netpbm 10.72).

# SEE ALSO

[pbmtoescp2](/man/pbmtoescp2)(1), [pbmtoepson](/man/pbmtoepson)(1), [pnmtopng](/man/pnmtopng)(1)

# RESOURCES

```[Source code](https://sourceforge.net/p/netpbm/code/HEAD/tree/)```

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/escp2topbm.html)```

<!-- verified: 2026-07-14 -->

