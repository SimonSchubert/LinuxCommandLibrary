# TLDR

**Smooth/blur image**

```pnmsmooth [input.pnm] > [output.pnm]```

**Smooth with custom size**

```pnmsmooth -size [5] [input.pnm] > [output.pnm]```

**Multiple passes**

```pnmsmooth [input.pnm] | pnmsmooth > [output.pnm]```

# SYNOPSIS

**pnmsmooth** [_options_] [_pnmfile_]

# PARAMETERS

**-size** _n_
> Convolution size (default 3).

**-dump** _file_
> Dump convolution matrix.

# DESCRIPTION

**pnmsmooth** applies a smoothing (blur) filter to a PNM image using convolution. It averages neighboring pixels to reduce noise and sharp edges.

Wrapper around pnmconvol with a smoothing kernel.

# EXAMPLES

```bash
# Basic smoothing
pnmsmooth noisy.ppm > smooth.ppm

# Stronger smoothing with larger kernel
pnmsmooth -size 5 image.ppm > blurred.ppm

# Multiple smoothing passes
pnmsmooth image.ppm | pnmsmooth | pnmsmooth > very_smooth.ppm

# Reduce noise then enhance
pnmsmooth noisy.pgm | pgmenhance > cleaned.pgm
```

# CONVOLUTION

Default 3x3 averaging kernel:
```
1 1 1
1 1 1
1 1 1
```

Larger sizes create stronger blur effect.

# CAVEATS

Reduces image sharpness. Use pnmconvol for custom kernels. Part of Netpbm.

# HISTORY

pnmsmooth is part of **Netpbm** by **Jef Poskanzer**, providing simple image smoothing via convolution.

# SEE ALSO

[pnmconvol](/man/pnmconvol)(1), [pgmenhance](/man/pgmenhance)(1), [pnmsharpen](/man/pnmsharpen)(1), [netpbm](/man/netpbm)(1)
