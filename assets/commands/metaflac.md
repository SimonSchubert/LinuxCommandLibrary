# TLDR

**List all metadata**

```metaflac --list [file.flac]```

**Show all tags**

```metaflac --export-tags-to=- [file.flac]```

**Set tag value**

```metaflac --set-tag="[ARTIST=Name]" [file.flac]```

**Remove tag**

```metaflac --remove-tag="[COMMENT]" [file.flac]```

**Import tags from file**

```metaflac --import-tags-from=[tags.txt] [file.flac]```

**Export cover art**

```metaflac --export-picture-to=[cover.jpg] [file.flac]```

**Import cover art**

```metaflac --import-picture-from=[cover.jpg] [file.flac]```

# SYNOPSIS

**metaflac** [_options_] _files_...

# PARAMETERS

**--list**
> List metadata blocks.

**--export-tags-to** _file_
> Export tags.

**--import-tags-from** _file_
> Import tags.

**--set-tag** _tag=value_
> Set tag.

**--remove-tag** _tag_
> Remove tag.

**--remove-all-tags**
> Remove all tags.

**--export-picture-to** _file_
> Export artwork.

**--import-picture-from** _file_
> Import artwork.

# DESCRIPTION

**metaflac** is the command-line FLAC metadata editor. It can list, add, remove, and modify metadata in FLAC files including Vorbis comments and embedded pictures.

metaflac operates without re-encoding the audio data.

# TAG FORMAT

```
# tags.txt
ARTIST=Artist Name
ALBUM=Album Name
TITLE=Track Title
TRACKNUMBER=01
```

# CAVEATS

Only works with FLAC files. Changes are immediate (no undo). Case-insensitive tag names. Picture imports need proper MIME type.

# HISTORY

metaflac is part of the **FLAC** project created by **Josh Coalson** in **2000** as a free lossless audio codec.

# SEE ALSO

[flac](/man/flac)(1), [ffmpeg](/man/ffmpeg)(1), [mid3v2](/man/mid3v2)(1), [eyeD3](/man/eyeD3)(1)
