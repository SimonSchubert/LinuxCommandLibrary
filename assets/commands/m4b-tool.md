# TAGLINE

creates and manipulates M4B audiobooks

# TLDR

**Merge audiobooks**

```m4b-tool merge [folder/] -o [audiobook.m4b]```

**Split audiobook**

```m4b-tool split [audiobook.m4b]```

**Add chapters**

```m4b-tool chapters [audiobook.m4b]```

**Merge with metadata**

```m4b-tool merge [folder/] -o [book.m4b] --name "[Book Title]" --artist "[Author]"```

**Convert to M4B**

```m4b-tool merge [file.mp3] -o [file.m4b]```

# SYNOPSIS

**m4b-tool** _command_ [_options_] _input_

# PARAMETERS

_COMMAND_
> Operation (merge, split, chapters).

_INPUT_
> Input files or directory.

**-o** _FILE_
> Output file.

**--name** _TITLE_
> Book title.

**--artist** _NAME_
> Author name.

**--cover** _FILE_
> Cover image.

**--help**
> Display help information.

# DESCRIPTION

**m4b-tool** creates and manipulates M4B audiobooks. It merges, splits, and adds chapters.

The tool converts audio files to M4B format with metadata and chapter markers.

# CAVEATS

Requires PHP. FFmpeg needed. M4B is AAC in MP4 container.

# HISTORY

m4b-tool was created to provide an easy way to create **M4B audiobook** files from various audio sources.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mp4box](/man/mp4box)(1)

