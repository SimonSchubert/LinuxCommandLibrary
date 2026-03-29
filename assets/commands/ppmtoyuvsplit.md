# TAGLINE

Split PPM into YUV component files for MPEG encoding

# TLDR

**Split PPM into YUV component files**

```ppmtoyuvsplit [base] [input.ppm]```

**Read from stdin**

```cat [input.ppm] | ppmtoyuvsplit [base]```

# SYNOPSIS

**ppmtoyuvsplit** _basename_ [_ppmfile_]

# PARAMETERS

_basename_
> Base name for output files. Produces _basename_.Y, _basename_.U, and _basename_.V.

_ppmfile_
> Input PPM image file. Reads from stdin if omitted.

# DESCRIPTION

**ppmtoyuvsplit** reads a PPM image and produces three separate raw output files: _basename_.Y (luminance), _basename_.U, and _basename_.V (chrominance). The output is subsampled YUV as required by the Stanford MPEG codec, with YUV values scaled according to CCIR.601.

The Y file contains one byte per pixel. The U and V files use 4:1 downsampling — each byte represents a 2x2 block of pixels (the arithmetic mean of those 4 pixels). As a result, the Y file is four times the size of the U or V file.

Part of the **Netpbm** toolkit.

# SEE ALSO

[yuvsplittoppm](/man/yuvsplittoppm)(1), [ppmtoyuv](/man/ppmtoyuv)(1), [ppmtoeyuv](/man/ppmtoeyuv)(1), [ppmtompeg](/man/ppmtompeg)(1)

