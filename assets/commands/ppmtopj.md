# TAGLINE

Convert PPM to HP PaintJet format

# TLDR

**Convert PPM to HP PaintJet format**

```ppmtopj [input.ppm] > [output.pj]```

**Specify gamma correction**

```ppmtopj -gamma [1.0] [input.ppm] > [output.pj]```

**Center the image on an 8.5 by 11 page**

```ppmtopj -center [input.ppm] > [output.pj]```

**Use run-length encoding**

```ppmtopj -rle [input.ppm] > [output.pj]```

**Apply dithering render mode**

```ppmtopj -render dither [input.ppm] > [output.pj]```

# SYNOPSIS

**ppmtopj** [**-gamma** _val_] [**-xpos** _val_] [**-ypos** _val_] [**-back** dark|lite] [**-rle**] [**-center**] [**-render** _mode_] [_ppmfile_]

# PARAMETERS

**-gamma** _val_
> Gamma correction value (default 0).

**-xpos** _val_
> Move by val pixels in the x direction.

**-ypos** _val_
> Move by val pixels in the y direction.

**-back** dark|lite
> Enhance foreground by indicating if background is light or dark.

**-rle**
> Run-length encode the image (may result in larger images).

**-center**
> Center the image on an 8.5 by 11 page.

**-render** _mode_
> Internal rendering algorithm: none, snap, bw, dither (default), diffuse, monodither, monodiffuse, clusterdither, monoclusterdither.

# DESCRIPTION

**ppmtopj** reads a PPM image and converts it to HP PaintJet printer format for direct printing. For best results, the input should be in 8-color RGB form (binary combinations of full-on and full-off primaries). Part of the Netpbm toolkit.

# SEE ALSO

[pjtoppm](/man/pjtoppm)(1), [ppmtopjxl](/man/ppmtopjxl)(1)

