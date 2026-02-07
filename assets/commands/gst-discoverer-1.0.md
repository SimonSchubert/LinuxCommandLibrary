# TAGLINE

GStreamer media file metadata analyzer

# TLDR

**Show media file information**

```gst-discoverer-1.0 [video.mp4]```

**Show verbose information**

```gst-discoverer-1.0 -v [video.mp4]```

**Analyze entire directory**

```gst-discoverer-1.0 [/path/to/directory]```

**Analyze from URL**

```gst-discoverer-1.0 [https://example.com/video.webm]```

**Show table of contents**

```gst-discoverer-1.0 -c [video.mp4]```

**Set timeout**

```gst-discoverer-1.0 -t [30] [video.mp4]```

# SYNOPSIS

**gst-discoverer-1.0** [_options_] _file_|_directory_|_uri_ ...

# PARAMETERS

**-v**, **--verbose**
> Output all available information.

**-a**, **--async**
> Use asynchronous code path.

**-t**, **--timeout** _seconds_
> Timeout in seconds (default 10).

**-c**, **--toc**
> Output TOC (chapters and editions).

**--help**
> Print help and exit.

# DESCRIPTION

**gst-discoverer-1.0** displays metadata and stream information about media files. It analyzes containers, codecs, duration, resolution, sample rates, bitrates, and other properties without playing the file.

The tool is useful for debugging multimedia issues and understanding media structure. It recurses into subdirectories when given a directory path.

# SEE ALSO

[gst-launch-1.0](/man/gst-launch-1.0)(1), [gst-inspect-1.0](/man/gst-inspect-1.0)(1), [mediainfo](/man/mediainfo)(1)
