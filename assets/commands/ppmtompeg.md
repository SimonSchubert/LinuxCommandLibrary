# TAGLINE

Encode PPM image sequences to MPEG video

# TLDR

**Encode PPM frames to MPEG using a parameter file**

```ppmtompeg [path/to/param_file]```

**Encode with statistics output**

```ppmtompeg -stat [path/to/stats.txt] [path/to/param_file]```

**Encode silently** showing only errors

```ppmtompeg -realquiet [path/to/param_file]```

**Encode a specific frame range**

```ppmtompeg -frames [0] [99] [path/to/param_file]```

# SYNOPSIS

**ppmtompeg** [_options_] _parameter_file_

# PARAMETERS

_parameter_file_
> File with encoding parameters.

**-stat** _file_
> Append encoding statistics to a file.

**-realquiet**
> Suppress all output except errors.

**-quiet** _n_
> Limit time-remaining reports to every n seconds.

**-no_frame_summary**
> Suppress per-frame summary lines.

**-float_dct**
> Use more accurate but slower floating-point DCT.

**-gop** _num_
> Encode only a specific numbered GOP.

**-combine_gops**
> Merge separate GOP files into a single MPEG stream.

**-frames** _first_ _last_
> Encode only the specified frame range.

**-combine_frames**
> Merge individual MPEG frames into one stream.

**-nice**
> Run remote processes at low priority.

**-snr**
> Include signal-to-noise ratio in statistics.

# DESCRIPTION

**ppmtompeg** encodes PPM image sequences to MPEG-1 video bitstreams. All encoding settings (input files, output file, frame pattern, GOP size, quality) are specified in a parameter file rather than on the command line. The parameter file format is case-sensitive and uses keywords like INPUT_DIR, PATTERN, GOP_SIZE, and BASE_FILE_FORMAT. Part of the Netpbm toolkit. The -gop, -combine_gops, -frames, and -combine_frames options are mutually exclusive.

# CAVEATS

Legacy encoder. Consider ffmpeg for modern video encoding.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1)

