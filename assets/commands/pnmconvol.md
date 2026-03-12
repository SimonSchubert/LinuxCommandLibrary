# TAGLINE

Apply convolution filters to PNM images

# TLDR

**Apply convolution matrix**

```pnmconvol [matrix.pgm] [input.pnm] > [output.pnm]```

**Create blur effect**

```pnmconvol -matrix=[1,1,1;1,1,1;1,1,1] [input.pnm] > [output.pnm]```

**Edge detection**

```pnmconvol -matrix=[-1,-1,-1;-1,8,-1;-1,-1,-1] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmconvol** [_options_] _convolution_ _input_

# PARAMETERS

_CONVOLUTION_
> Convolution matrix as a PGM file.

_INPUT_
> Input PNM image file.

**-matrix** _SPEC_
> Specify convolution matrix inline (e.g., "1,1,1;1,1,1;1,1,1").

**-matrixfile** _FILE_
> Read convolution matrix from a file.

**-normalize**
> Scale weights to sum to one, preserving overall image brightness.

**-bias** _n_
> Amount to add to each convolved sample value, useful for handling negative results.

**-nooffset**
> Normalize matrix values by dividing by maxval instead of using offset calculations.

# DESCRIPTION

**pnmconvol** applies convolution matrix filters to PNM images for effects like blurring, sharpening, and edge detection. The convolution kernel can be specified as a PGM file or inline with the **-matrix** option.

Each output pixel is computed as the weighted sum of surrounding input pixels according to the kernel values. Part of the Netpbm toolkit for image processing.

# CAVEATS

Part of Netpbm. Matrix defines effect. Slow for large kernels.

# HISTORY

pnmconvol is part of **Netpbm** for convolution operations.

# SEE ALSO

[pamedge](/man/pamedge)(1), [pnmsmooth](/man/pnmsmooth)(1), [netpbm](/man/netpbm)(1)

