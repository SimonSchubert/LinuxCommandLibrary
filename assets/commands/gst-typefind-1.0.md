# TAGLINE

Print media type of file

# TLDR

**Determine the media type** of a file

```gst-typefind-1.0 [path/to/file]```

**Detect media types** of multiple files

```gst-typefind-1.0 [path/to/file1] [path/to/file2]```

**Use a custom plugin path** for type detection

```gst-typefind-1.0 --gst-plugin-path=[path/to/plugins] [path/to/file]```

# SYNOPSIS

**gst-typefind-1.0** [_options_] _files_

# PARAMETERS

**--gst-plugin-path=**_PATH_
> Add colon-separated directories to the GStreamer plugin search path.

**--gst-plugin-spew**
> Enable printout of errors while loading GStreamer plugins.

**--gst-debug-level=**_LEVEL_
> Set the debugging output threshold (0-9, default 0).

**--gst-info-mask=**_FLAGS_
> Set GStreamer info flags.

**--gst-debug-mask=**_FLAGS_
> Set GStreamer debugging flags.

**--gst-mask=**_FLAGS_
> Set both GStreamer info and debugging flags simultaneously.

**--help**
> Display help information.

# DESCRIPTION

**gst-typefind-1.0** is a command-line tool from the GStreamer multimedia framework that identifies the media type (MIME type) of files. It uses GStreamer's typefind subsystem, which examines file headers and content patterns through installed plugins to determine what kind of media a file contains.

The tool applies a probability-based detection system where plugins report confidence levels for their media type matches. It is specifically designed for multimedia files that GStreamer can handle, rather than being a general-purpose file type detector.

# CAVEATS

Detection accuracy depends entirely on which GStreamer plugins are installed. If the plugin for a particular media format is missing, the file may not be identified correctly or at all. This tool is not a replacement for the general-purpose **file** command, as it only recognizes media types supported by the installed GStreamer plugin ecosystem.

# HISTORY

**gst-typefind-1.0** is part of the **GStreamer** multimedia framework, originally created for the GNOME project. The **1.0** suffix was introduced with the GStreamer 1.0 release in **September 2012**, allowing parallel installation with the older 0.10 series. The typefind subsystem is a core part of GStreamer's architecture, enabling automatic media format detection across the framework.

# SEE ALSO

[gst-inspect-1.0](/man/gst-inspect-1.0)(1), [gst-launch-1.0](/man/gst-launch-1.0)(1), [file](/man/file)(1)
