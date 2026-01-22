# TLDR

**Open** video file

```avidemux [video.mp4]```

**Convert** to different format

```avidemux --load [input.avi] --save [output.mp4] --quit```

**Cut** video segment

```avidemux --load [video.mp4] --video-codec copy --audio-codec copy --save [clip.mp4]```

Run in **CLI mode**

```avidemux3_cli --load [input.mp4] --run [script.py] --save [output.mp4] --quit```

# SYNOPSIS

**avidemux** [_options_] [_file_]

# DESCRIPTION

**avidemux** is a free video editor for cutting, filtering, and encoding tasks. It supports many file formats and provides both GUI and command-line interfaces for video processing.

The tool excels at simple editing tasks like cutting commercials, applying filters, and converting between formats without complex timeline editing.

# PARAMETERS

**--load** _file_
> Load video file

**--save** _file_
> Save output file

**--video-codec** _codec_
> Set video codec (copy, x264, xvid, etc.)

**--audio-codec** _codec_
> Set audio codec (copy, aac, mp3, etc.)

**--run** _script_
> Execute Python script

**--quit**
> Quit after operations

**--output-format** _format_
> Set container format (MP4, MKV, AVI)

# FEATURES

- Cut and join videos without re-encoding
- Apply video filters (resize, denoise, sharpen)
- Audio processing and synchronization
- Batch processing with scripting
- Multiple audio tracks
- Subtitle support

# CAVEATS

GUI can be unintuitive. Some codecs require additional libraries. Complex edits better suited for professional NLEs. Scripting uses custom Python bindings.

# HISTORY

**Avidemux** was created by Mean (pseudonym) and first released in **2001** as a simple tool for basic video editing tasks without the complexity of professional editors.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [handbrake](/man/handbrake)(1), [kdenlive](/man/kdenlive)(1)
