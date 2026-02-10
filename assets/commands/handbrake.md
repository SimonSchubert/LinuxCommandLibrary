# TAGLINE

open-source video transcoder

# TLDR

**Convert video to MP4**

```HandBrakeCLI -i [input.mkv] -o [output.mp4]```

**Use preset**

```HandBrakeCLI -i [input.mkv] -o [output.mp4] --preset="Fast 1080p30"```

**Specify quality**

```HandBrakeCLI -i [input.mkv] -o [output.mp4] -q [20]```

**Convert DVD**

```HandBrakeCLI -i [/dev/dvd] -o [output.mp4]```

**List presets**

```HandBrakeCLI --preset-list```

**Extract specific title**

```HandBrakeCLI -i [input.mkv] -o [output.mp4] -t [2]```

# SYNOPSIS

**HandBrakeCLI** [_options_] **-i** _source_ **-o** _output_

# PARAMETERS

**-i** _source_
> Input file or device.

**-o** _file_
> Output file.

**-t** _title_
> Title number to encode.

**--preset** _name_
> Use preset configuration.

**-q** _quality_
> Quality (0-51, lower is better).

**-e** _encoder_
> Video encoder (x264, x265, nvenc).

**-E** _encoder_
> Audio encoder (aac, mp3, flac).

**-B** _bitrate_
> Audio bitrate.

**-r** _fps_
> Framerate.

**--width** _pixels_
> Output width.

**--height** _pixels_
> Output height.

# DESCRIPTION

**HandBrake** is an open-source video transcoder. HandBrakeCLI is the command-line interface for batch processing, scripting, and headless operation.

It supports various input formats including DVDs, Blu-rays, and common video files, outputting to MP4, MKV, and WebM containers.

# CAVEATS

DVD decryption requires libdvdcss. Hardware encoding needs compatible GPU. High-quality encoding is slow. Preset names are case-sensitive.

# HISTORY

HandBrake was created by **Eric Petit** in **2003** as a tool for ripping DVDs on BeOS. It evolved into a general-purpose video transcoder and is now maintained by a community of developers.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [vlc](/man/vlc)(1), [mencoder](/man/mencoder)(1)
