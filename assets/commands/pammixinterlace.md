# TLDR

**Blend interlaced video fields**

```pammixinterlace [input.pam] > [output.pam]```

# SYNOPSIS

**pammixinterlace** [_options_] [_file_]

# PARAMETERS

**-filter** _type_
> Interpolation filter (linear, ffmpeg).

# DESCRIPTION

**pammixinterlace** blends adjacent lines to reduce interlacing artifacts in video frames. Useful for deinterlacing video captures for still image use. Part of Netpbm toolkit.

# SEE ALSO

[pamdeinterlace](/man/pamdeinterlace)(1), [pamscale](/man/pamscale)(1)

