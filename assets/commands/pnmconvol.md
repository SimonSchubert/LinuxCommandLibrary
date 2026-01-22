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
> Matrix file or specification.

_INPUT_
> Input PNM file.

**-matrix** _SPEC_
> Inline matrix.

**-normalize**
> Normalize output.

**--help**
> Display help.

# DESCRIPTION

**pnmconvol** applies convolution filters. Image processing kernels.

The tool performs matrix convolution. Blur, sharpen, edge detect.

pnmconvol filters images.

# CAVEATS

Part of Netpbm. Matrix defines effect. Slow for large kernels.

# HISTORY

pnmconvol is part of **Netpbm** for convolution operations.

# SEE ALSO

[pamedge](/man/pamedge)(1), [pnmsmooth](/man/pnmsmooth)(1), [netpbm](/man/netpbm)(1)

