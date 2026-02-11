# TAGLINE

Calculate peak signal-to-noise ratio between images

# TLDR

**Compare two images (PSNR)**

```pnmpsnr [image1.pnm] [image2.pnm]```

**Calculate peak signal-to-noise ratio**

```pnmpsnr [original.pnm] [compressed.pnm]```

# SYNOPSIS

**pnmpsnr** [_file1_] [_file2_]

# PARAMETERS

_FILE1_
> First input image (reference).

_FILE2_
> Second input image (comparison).

# DESCRIPTION

**pnmpsnr** calculates the Peak Signal-to-Noise Ratio (PSNR) between two PNM images. PSNR is a standard metric for measuring image quality, commonly used to evaluate the fidelity of compressed or processed images against the original.

Higher PSNR values (measured in decibels) indicate greater similarity between the images. Typical values range from 30-50 dB for acceptable quality. Both images must have the same dimensions. Part of the Netpbm toolkit.

# CAVEATS

Images must be same dimensions. Part of Netpbm suite.

# HISTORY

pnmpsnr was created as part of **Netpbm** for image quality comparison.

# SEE ALSO

[pnmarith](/man/pnmarith)(1), [pamfile](/man/pamfile)(1)

