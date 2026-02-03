# TLDR

**Create MPEG from PPM frames**

```ppmtompeg [param_file]```

# SYNOPSIS

**ppmtompeg** [_options_] _parameter_file_

# PARAMETERS

_parameter_file_
> File with encoding parameters.

**-stat** _file_
> Output statistics file.

**-realquiet**
> No output messages.

**-quiet** _n_
> Quiet level.

# DESCRIPTION

**ppmtompeg** encodes PPM image sequences to MPEG-1 video. Uses parameter file for input/output settings and encoding options. Part of Netpbm toolkit.

# CAVEATS

Legacy encoder. Consider ffmpeg for modern video encoding.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mpeg2enc](/man/mpeg2enc)(1)

