# TAGLINE

Free video editor for cutting, filtering, and encoding

# TLDR

**Open** video file

```avidemux [video.mp4]```

**Convert** to different format

```avidemux --load [input.avi] --save [output.mp4] --quit```

**Cut** a segment without re-encoding (copy streams)

```avidemux --load [video.mp4] --output-format MKV --video-codec copy --audio-codec copy --begin [100] --end [500] --save [clip.mkv] --quit```

Run in **headless CLI mode** with a script

```avidemux3_cli --load [input.mp4] --run [project.py] --save [output.mp4] --quit```

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

**--begin** _frame_
> Set the start marker to a frame number for cutting.

**--end** _frame_
> Set the end marker to a frame number for cutting.

**--run** _script_
> Load and run an Avidemux project or Python (Tinypy/JS) script.

**--quit**
> Quit after operations complete (required for unattended runs).

**--output-format** _format_
> Set container format (MKV, MP4, AVI, TS, PS, OGM).

**--rebuild-index**
> Rebuild the index with correct frame types.

**--autoindex**
> Generate required index files as necessary.

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

# RESOURCES

```[Source code](https://github.com/mean00/avidemux2)```

```[Homepage](https://avidemux.sourceforge.net/)```

```[Documentation](https://www.avidemux.org/admWiki/doku.php?id=using:command_line_usage)```

<!-- verified: 2026-06-17 -->
