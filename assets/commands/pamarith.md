# TLDR

**Add two images**

```pamarith -add [image1.pam] [image2.pam] > [result.pam]```

**Subtract images**

```pamarith -subtract [image1.pam] [image2.pam] > [result.pam]```

**Multiply images**

```pamarith -multiply [image1.pam] [image2.pam] > [result.pam]```

**Find difference**

```pamarith -difference [image1.pam] [image2.pam] > [result.pam]```

**Minimum of images**

```pamarith -minimum [image1.pam] [image2.pam] > [result.pam]```

# SYNOPSIS

**pamarith** _-function_ _pamfile1_ _pamfile2_

# PARAMETERS

**-add**
> Add pixel values.

**-subtract**
> Subtract pixel values.

**-multiply**
> Multiply pixel values.

**-divide**
> Divide pixel values.

**-difference**
> Absolute difference.

**-minimum**
> Minimum of each pixel.

**-maximum**
> Maximum of each pixel.

**-mean**
> Average of pixels.

**-and**, **-or**, **-xor**
> Bitwise operations.

# DESCRIPTION

**pamarith** performs arithmetic operations on two PAM/PNM images. Images must have the same dimensions. Used for compositing, masking, and image comparison.

Part of the Netpbm toolkit.

# EXAMPLE

```bash
# Find difference between images
pamarith -difference old.ppm new.ppm > diff.ppm

# Blend two images
pamarith -mean image1.ppm image2.ppm > blended.ppm
```

# CAVEATS

Images must be same size. PAM format preferred. Output may need scaling for display.

# HISTORY

pamarith is part of **Netpbm**, a toolkit for image manipulation dating back to the late 1980s.

# SEE ALSO

[pnmarith](/man/pnmarith)(1), [pamcomp](/man/pamcomp)(1), [netpbm](/man/netpbm)(1)
