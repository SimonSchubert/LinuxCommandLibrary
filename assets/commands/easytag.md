# TAGLINE

graphical audio file metadata editor

# TLDR

**Launch EasyTAG**

```easytag```

**Open with specific directory**

```easytag [/path/to/music]```

# SYNOPSIS

**easytag** [_options_] [_directory_]

# PARAMETERS

_directory_
> Music directory to open.

**--help**
> Display help information.

**--version**
> Show version.

# CONFIGURATION

**~/.config/easytag/easytag.conf**
> Application settings including default directory, tag format preferences, and UI options.

# DESCRIPTION

**EasyTAG** is a graphical application for viewing and editing audio file metadata (tags). It supports MP3, FLAC, Ogg Vorbis, MP4/AAC, and other common audio formats.

The application provides batch tagging, filename to tag conversion, tag to filename renaming, and CDDB lookup for automatic metadata retrieval. It's useful for organizing music libraries and fixing incorrect or missing tags.

# FEATURES

- Edit ID3v1, ID3v2, Vorbis, APE, and other tag formats
- Batch tagging of multiple files
- Auto-fill from filename patterns
- Rename files based on tags
- CDDB/freedb lookup
- Cover art embedding

# CAVEATS

GUI application; no command-line tag editing. Some tag formats may have limited support. Large collections may take time to scan. Character encoding issues possible with older tags.

# HISTORY

EasyTAG was started by **Jérôme Couderc** in **2000** and has been maintained by the GNOME community. It evolved from earlier command-line tag editors to provide a user-friendly graphical interface for music metadata management.

# SEE ALSO

[id3v2](/man/id3v2)(1), [eyeD3](/man/eyeD3)(1), [kid3](/man/kid3)(1), [picard](/man/picard)(1)
