# TAGLINE

displays technical information about media files

# TLDR

**Show media info**

```mediainfo [video.mp4]```

**Full information**

```mediainfo -f [video.mp4]```

**Output as JSON**

```mediainfo --Output=JSON [video.mp4]```

**Output as XML**

```mediainfo --Output=XML [video.mp4]```

**Show specific parameter**

```mediainfo --Inform="Video;%Width%x%Height%" [video.mp4]```

**Compare files**

```mediainfo [file1.mp4] [file2.mp4]```

# SYNOPSIS

**mediainfo** [_options_] _file_

# PARAMETERS

_FILE_
> Media file to analyze.

**-f**
> Full information.

**--Output** _FORMAT_
> Output format (XML, JSON, CSV).

**--Inform** _TEMPLATE_
> Custom output template.

**--Version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**mediainfo** displays technical information about media files. It shows codec, bitrate, resolution, and metadata.

The tool supports video, audio, and image formats. Essential for media file analysis.

# CAVEATS

Read-only. Large file support varies. Some formats need extra libraries.

# HISTORY

MediaInfo was created by **Jerome Martinez** to provide detailed technical information about audio/video files.

# SEE ALSO

[ffprobe](/man/ffprobe)(1), [file](/man/file)(1), [exiftool](/man/exiftool)(1)

