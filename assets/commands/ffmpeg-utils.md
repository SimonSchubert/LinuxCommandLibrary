# TAGLINE

utility functions for ffmpeg processing

# TLDR

**Get media information**

```ffprobe [input.mp4]```

**Show stream details**

```ffprobe -show_streams [input.mp4]```

**Output as JSON**

```ffprobe -print_format json -show_format [input.mp4]```

**Analyze frames**

```ffprobe -show_frames [input.mp4]```

**Get duration only**

```ffprobe -show_entries format=duration -of csv=p=0 [input.mp4]```

# SYNOPSIS

**ffprobe** [_options_] _input_

# PARAMETERS

_INPUT_
> Media file to analyze.

**-show_format**
> Display container format info.

**-show_streams**
> Display stream information.

**-show_frames**
> Display frame information.

**-print_format** _FORMAT_
> Output format: json, xml, csv, flat.

**-show_entries** _ENTRIES_
> Select specific entries to show.

**-of** _FORMAT_
> Output format (alias for print_format).

**--help**
> Display help information.

# DESCRIPTION

**ffprobe** (part of ffmpeg utils) gathers information from multimedia streams and prints it in human or machine-readable formats. It reveals codec details, duration, bitrate, resolution, and metadata.

The tool is essential for scripting video workflows, checking file properties before processing, and debugging encoding issues. Structured output formats enable parsing by other tools.

ffprobe provides detailed stream analysis without modifying files, making it safe for inspection tasks.

# CAVEATS

Full frame analysis can be slow. Some formats have incomplete metadata. Output format varies by file type.

# HISTORY

ffprobe was added to ffmpeg to provide dedicated media analysis functionality, separating inspection from processing. It's become the standard tool for programmatic media file analysis.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mediainfo](/man/mediainfo)(1), [exiftool](/man/exiftool)(1)
