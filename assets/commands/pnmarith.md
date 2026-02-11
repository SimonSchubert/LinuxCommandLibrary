# TAGLINE

Perform pixel arithmetic on PNM images

# TLDR

**Add two images**

```pnmarith -add [image1.pnm] [image2.pnm] > [result.pnm]```

**Subtract images**

```pnmarith -subtract [image1.pnm] [image2.pnm] > [result.pnm]```

**Multiply images**

```pnmarith -multiply [image1.pnm] [image2.pnm] > [result.pnm]```

**Take minimum values**

```pnmarith -minimum [image1.pnm] [image2.pnm] > [result.pnm]```

# SYNOPSIS

**pnmarith** _operation_ _pnmfile1_ _pnmfile2_

# PARAMETERS

**-add**
> Add pixel values.

**-subtract**
> Subtract pixel values.

**-multiply**
> Multiply pixel values.

**-difference**
> Absolute difference.

**-minimum**
> Minimum of pixels.

**-maximum**
> Maximum of pixels.

**-mean**
> Average of pixels.

# DESCRIPTION

**pnmarith** performs arithmetic operations on two PNM images pixel by pixel. Images must have same dimensions. Useful for compositing, masking, and image comparison.

Superseded by pamarith in modern Netpbm.

# EXAMPLES

```bash
# Add two images (blend)
pnmarith -add image1.ppm image2.ppm > blended.ppm

# Create difference image
pnmarith -difference frame1.ppm frame2.ppm > diff.ppm

# Multiply (darken with mask)
pnmarith -multiply image.ppm mask.pgm > masked.ppm

# Find minimum
pnmarith -minimum img1.ppm img2.ppm > min.ppm
```

# CAVEATS

Images must be same dimensions. Results clamped to valid range. Use pamarith for more options.

# HISTORY

pnmarith is part of **Netpbm** by **Jef Poskanzer**, providing basic image arithmetic operations.

# SEE ALSO

[pamarith](/man/pamarith)(1), [pnmcat](/man/pnmcat)(1), [pnmcomp](/man/pnmcomp)(1), [netpbm](/man/netpbm)(1)
