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

**pnmpsnr** calculates PSNR between two PNM images. Quality metric.

The tool measures image similarity. Higher values indicate closer match.

pnmpsnr compares images.

# CAVEATS

Images must be same dimensions. Part of Netpbm suite.

# HISTORY

pnmpsnr was created as part of **Netpbm** for image quality comparison.

# SEE ALSO

[pnmarith](/man/pnmarith)(1), [pamfile](/man/pamfile)(1)

