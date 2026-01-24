# TLDR

**Transcode video**

```transcode -i [input.avi] -o [output.avi] -y [codec]```

**Specify video codec**

```transcode -i [input] -y [xvid] -o [output.avi]```

**Extract audio**

```transcode -i [video.avi] -y null,tcaud -m [audio.mp3]```

**Resize video**

```transcode -i [input] -Z [640x480] -o [output]```

**Batch process**

```transcode -i [input] --multi_input -o [output]```

# SYNOPSIS

**transcode** [_-i input_] [_-o output_] [_-y codec_] [_options_]

# PARAMETERS

**-i** _FILE_
> Input file.

**-o** _FILE_
> Output file.

**-y** _CODEC_
> Video codec.

**-Z** _SIZE_
> Resize dimensions.

**-m** _FILE_
> Audio output.

**-w** _BITRATE_
> Video bitrate.

# DESCRIPTION

**transcode** converts video formats. It's a transcoding framework.

Multiple codecs. Various formats.

Filtering included. Resize, crop.

Audio extraction. Separate tracks.

Batch capable. Process multiple.

# CAVEATS

Legacy tool. FFmpeg preferred now. Complex options.

# HISTORY

**transcode** was a Linux video transcoding framework, now largely superseded by FFmpeg.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mencoder](/man/mencoder)(1), [handbrake](/man/handbrake)(1)
