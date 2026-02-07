# TAGLINE

multimedia stream analyzer

# TLDR

**Display information** about a media file

```ffprobe [path/to/file.mp4]```

**Show information in JSON format**

```ffprobe -v quiet -print_format json -show_format -show_streams [file.mp4]```

**Get video duration** in seconds

```ffprobe -v error -show_entries format=duration -of default=noprint_wrappers=1:nokey=1 [file.mp4]```

**Get video resolution**

```ffprobe -v error -select_streams v:0 -show_entries stream=width,height -of csv=s=x:p=0 [file.mp4]```

**Get codec information**

```ffprobe -v error -select_streams v:0 -show_entries stream=codec_name -of default=noprint_wrappers=1:nokey=1 [file.mp4]```

**Get audio sample rate**

```ffprobe -v error -select_streams a:0 -show_entries stream=sample_rate -of default=noprint_wrappers=1:nokey=1 [file.mp4]```

**Show all stream information**

```ffprobe -v error -show_streams [file.mp4]```

**Analyze a network stream**

```ffprobe [https://example.com/stream.m3u8]```

# SYNOPSIS

**ffprobe** [_options_] [_input_file_]

# PARAMETERS

**-v** _level_
> Set logging verbosity (quiet, panic, fatal, error, warning, info, verbose, debug).

**-show_format**
> Show container format information.

**-show_streams**
> Show stream information (video, audio, subtitle tracks).

**-show_entries** _section_
> Show only specified entries (e.g., stream=codec_name,bit_rate).

**-select_streams** _specifier_
> Select specific streams (v:0 for first video, a:0 for first audio).

**-print_format**, **-of** _format_
> Output format: default, json, xml, csv, flat, ini.

**-count_frames**
> Count and report total frames (slow for large files).

**-count_packets**
> Count packets in each stream.

**-show_chapters**
> Show chapter information.

**-show_programs**
> Show program information.

**-show_error**
> Show information about any errors.

**-i** _input_
> Input file (optional, can specify file directly).

**-hide_banner**
> Suppress printing banner/configuration info.

# DESCRIPTION

**ffprobe** is a multimedia stream analyzer from the FFmpeg project. It examines media files and streams, reporting detailed technical information about container formats, codecs, bitrates, resolution, duration, metadata, and more.

The tool reads media files without decoding them, making analysis fast. It supports virtually all audio and video formats that FFmpeg handles, including local files, network streams, and devices.

Output can be formatted as human-readable text, JSON, XML, CSV, or other formats for scripting integration. The **-show_entries** option enables extracting specific values without parsing verbose output.

Common uses include: verifying transcoding results, extracting metadata for media libraries, debugging playback issues, analyzing stream characteristics before processing, and building media management scripts.

For network streams (HLS, DASH, RTSP, etc.), ffprobe can analyze remote content, useful for monitoring streaming infrastructure. Combined with FFmpeg's other tools, it enables complete media inspection and manipulation.

# CAVEATS

Frame counting (-count_frames) requires decoding and is slow. Some formats may not report duration accurately. Protected/DRM content may not be analyzable. Network stream analysis requires stable connectivity.

# HISTORY

**ffprobe** is part of the **FFmpeg** project, which began in **2000**. The project provides a complete suite for multimedia handling. ffprobe emerged as the dedicated analysis tool, separating inspection functionality from ffmpeg's conversion capabilities. FFmpeg is one of the most widely used open-source multimedia frameworks.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffplay](/man/ffplay)(1), [mediainfo](/man/mediainfo)(1), [exiftool](/man/exiftool)(1)
