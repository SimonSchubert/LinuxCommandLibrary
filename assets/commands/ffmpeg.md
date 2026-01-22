# TLDR

**Convert video format**

```ffmpeg -i [input.mp4] [output.avi]```

**Extract audio from** video

```ffmpeg -i [video.mp4] -vn [audio.mp3]```

**Resize video**

```ffmpeg -i [input.mp4] -vf scale=[1280]:[720] [output.mp4]```

**Compress video**

```ffmpeg -i [input.mp4] -crf [23] [output.mp4]```

**Create GIF from** video

```ffmpeg -i [input.mp4] -vf "fps=10,scale=320:-1" [output.gif]```

# SYNOPSIS

**ffmpeg** [_global-options_] [_input-options_] **-i** _input_ [_output-options_] _output_

# PARAMETERS

**-i** _FILE_
> Input file.

**-c:v** _CODEC_
> Video codec (libx264, libx265, copy).

**-c:a** _CODEC_
> Audio codec (aac, mp3, copy).

**-crf** _N_
> Quality (0-51, lower is better).

**-vf** _FILTER_
> Video filter (scale, crop, fps).

**-af** _FILTER_
> Audio filter.

**-ss** _TIME_
> Start time.

**-t** _DURATION_
> Duration.

**-y**
> Overwrite output without asking.

**--help**
> Display help information.

# DESCRIPTION

**ffmpeg** is the swiss army knife of multimedia processing. It converts, records, streams, and processes audio and video in virtually any format through an extensive codec library.

The tool uses a powerful filter system for transformations like scaling, cropping, color correction, and effects. It handles everything from simple format conversion to complex streaming setups.

ffmpeg forms the foundation of many video applications and is the de facto standard for command-line multimedia processing.

# CAVEATS

Complex syntax requires learning. Quality vs size tradeoffs vary by content. Some codecs have licensing considerations. Processing is CPU-intensive.

# HISTORY

ffmpeg was started by **Fabrice Bellard** in 2000 and has become the most widely-used multimedia framework. It powers countless applications from VLC to YouTube's video processing pipeline.

# SEE ALSO

[ffprobe](/man/ffprobe)(1), [ffplay](/man/ffplay)(1), [avconv](/man/avconv)(1)
