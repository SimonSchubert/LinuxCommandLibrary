# TAGLINE

Calculate peak signal-to-noise ratio between images

# TLDR

**Compare two PNM images and display PSNR**

```pnmpsnr [original.pnm] [compressed.pnm]```

**Compare a JPEG conversion against the original** (using Netpbm conversion)

```pnmpsnr [original.ppm] [converted.ppm]```

**Compare images from a pipeline** (second image from stdin)

```pnmpsnr [reference.pnm] < [comparison.pnm]```

# SYNOPSIS

**pnmpsnr** [_file1_] [_file2_]

# PARAMETERS

_file1_
> First input image (reference/original).

_file2_
> Second input image (comparison/distorted). Reads from standard input if omitted.

# DESCRIPTION

**pnmpsnr** calculates the Peak Signal-to-Noise Ratio (PSNR) between two PNM images. PSNR is a standard metric for measuring image quality, commonly used to evaluate the fidelity of compressed or processed images against the original.

Higher PSNR values (measured in decibels) indicate greater similarity between the images. Typical values range from 30-50 dB for acceptable quality, while identical images produce an infinite PSNR. For color images, the tool reports PSNR for each channel (red, green, blue) as well as an overall luminance value.

Both images must have the same dimensions and depth. Part of the Netpbm toolkit.

# CAVEATS

Images must have the same dimensions. Only supports PNM/PAM formats; convert other formats first using Netpbm tools. PSNR is not always a reliable indicator of perceptual quality.

# SEE ALSO

[pnmarith](/man/pnmarith)(1), [pamarith](/man/pamarith)(1), [pamfile](/man/pamfile)(1), [pnmcat](/man/pnmcat)(1)

