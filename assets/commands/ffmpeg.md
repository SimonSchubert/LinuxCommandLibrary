# TAGLINE

multimedia conversion and processing tool

# TLDR

**Convert video format (auto-detected from extension)**

```ffmpeg -i [input.mp4] [output.avi]```

**Extract audio without re-encoding**

```ffmpeg -i [video.mp4] -vn -c:a copy [audio.m4a]```

**Resize video to 1280x720**

```ffmpeg -i [input.mp4] -vf scale=[1280]:[720] [output.mp4]```

**Compress video with x264 CRF (lower = better)**

```ffmpeg -i [input.mp4] -c:v libx264 -crf [23] -c:a copy [output.mp4]```

**Trim from 00:01:00 for 30 seconds**

```ffmpeg -ss [00:01:00] -i [input.mp4] -t [30] -c copy [output.mp4]```

**Create GIF from video**

```ffmpeg -i [input.mp4] -vf "fps=10,scale=320:-1" [output.gif]```

**Concatenate files listed in files.txt**

```ffmpeg -f concat -safe 0 -i [files.txt] -c copy [output.mp4]```

# SYNOPSIS

**ffmpeg** [_global-options_] [_input-options_] **-i** _input_ [_output-options_] _output_

# PARAMETERS

**-i** _FILE_
> Input file (may be specified multiple times).

**-c:v** _CODEC_
> Video codec (e.g. libx264, libx265, libvpx-vp9, copy).

**-c:a** _CODEC_
> Audio codec (e.g. aac, libmp3lame, libopus, copy).

**-c** _CODEC_
> Shorthand for setting the codec of all streams (often used as `-c copy`).

**-crf** _N_
> Constant Rate Factor for x264/x265 (0-51, lower is better quality, 23 is the default).

**-b:v** _BITRATE_
> Target video bitrate (e.g. 2M).

**-b:a** _BITRATE_
> Target audio bitrate (e.g. 128k).

**-r** _FPS_
> Output frame rate.

**-s** _WxH_
> Set output frame size (e.g. 1280x720).

**-vf** _FILTER_
> Video filter graph (scale, crop, fps, etc.).

**-af** _FILTER_
> Audio filter graph.

**-ss** _TIME_
> Seek to start position. Used before `-i` for a fast seek, after `-i` for accurate seek.

**-to** _TIME_
> Stop writing at the given absolute time.

**-t** _DURATION_
> Limit output to the given duration.

**-vn**
> Disable video output.

**-an**
> Disable audio output.

**-map** _SPEC_
> Explicit stream mapping from inputs to outputs.

**-f** _FORMAT_
> Force container format.

**-y**
> Overwrite output files without asking.

**-n**
> Never overwrite output files.

**-loglevel** _LEVEL_
> Logging verbosity (quiet, panic, fatal, error, warning, info, verbose, debug, trace).

**-h** [_topic_]
> Display help; use `-h long` or `-h full` for more options.

# DESCRIPTION

**ffmpeg** is the swiss army knife of multimedia processing. It converts, records, streams, and processes audio and video in virtually any format through an extensive codec library.

The tool uses a powerful filter system for transformations like scaling, cropping, color correction, and effects. It handles everything from simple format conversion to complex streaming setups.

ffmpeg forms the foundation of many video applications and is the de facto standard for command-line multimedia processing.

# CAVEATS

Complex syntax requires learning. Quality vs size tradeoffs vary by content. Some codecs have licensing considerations. Processing is CPU-intensive.

# HISTORY

ffmpeg was started by **Fabrice Bellard** in 2000 and has become the most widely-used multimedia framework. It powers countless applications from VLC to YouTube's video processing pipeline.

# SEE ALSO

[ffprobe](/man/ffprobe)(1), [ffplay](/man/ffplay)(1), [sox](/man/sox)(1), [handbrake](/man/handbrake)(1), [mencoder](/man/mencoder)(1)
