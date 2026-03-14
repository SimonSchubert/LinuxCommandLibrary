# TAGLINE

Mix adjacent lines to reduce interlacing artifacts in video frames

# TLDR

**Blend interlaced video fields using default FIR filter**

```pammixinterlace [input.pam] > [output.pam]```

**Use linear blend filter**

```pammixinterlace -filter=linear [input.pam] > [output.pam]```

**Use adaptive filtering to modify only comb-pattern pixels**

```pammixinterlace -adaptive [input.pam] > [output.pam]```

**Combine adaptive mode with a specific filter**

```pammixinterlace -adaptive -filter=ffmpeg [input.pam] > [output.pam]```

# SYNOPSIS

**pammixinterlace** [**-filter=**{**linear**|**fir**|**ffmpeg**}] [**-adaptive**] [_file_]

# PARAMETERS

**-filter=**{**linear**|**fir**|**ffmpeg**}
> Choose the filtering mechanism. **linear** uses a linear-blend formula. **fir** uses a size-5 FIR low-pass filter. **ffmpeg** uses a formula from the ffmpeg documentation. Default is **fir**.

**-adaptive**
> Enable adaptive filtering mode. Only modifies pixels that are obviously part of a "comb" pattern, leaving other pixels unchanged.

# DESCRIPTION

**pammixinterlace** makes each row of the output a mixture of the corresponding row of the input and its two neighbors, using half of the main row and a quarter each of the two neighbor rows. This blending reduces interlacing artifacts (combing) in video frames captured from interlaced sources.

The tool is useful for deinterlacing video captures for still image use. Part of the Netpbm toolkit.

# SEE ALSO

[pamdeinterlace](/man/pamdeinterlace)(1), [pamscale](/man/pamscale)(1), [netpbm](/man/netpbm)(1)
