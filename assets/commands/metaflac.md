# TAGLINE

command-line FLAC metadata editor

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
> Export the embedded picture (cover art) to file.

**--import-picture-from** _file_
> Import a picture into the file (PNG/JPEG; specification syntax allows _TYPE\|MIME\|DESC\|WIDTHxHEIGHTxDEPTH/COLORS\|FILE_).

**--show-md5sum**
> Print the unencoded MD5 sum of the audio data.

**--show-min-blocksize** / **--show-max-blocksize** / **--show-sample-rate** / **--show-channels** / **--show-bps** / **--show-total-samples**
> Print individual STREAMINFO fields useful for scripting.

**--add-replay-gain**
> Compute and add ReplayGain tags for one or more files (treated as one album when multiple files are passed).

**--remove-replay-gain**
> Remove ReplayGain tags.

**--block-type** / **--except-block-type** _types_
> Restrict subsequent operations to specific metadata block types (e.g. _VORBIS\_COMMENT_, _PICTURE_, _SEEKTABLE_).

# DESCRIPTION

**metaflac** is the command-line FLAC metadata editor. It can list, add, remove, and modify metadata in FLAC files including Vorbis comments and embedded pictures.

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

# INSTALL

```apt: sudo apt install flac```

```dnf: sudo dnf install flac```

```pacman: sudo pacman -S flac```

```apk: sudo apk add flac```

```zypper: sudo zypper install flac```

```brew: brew install flac```

```nix: nix profile install nixpkgs#flac```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[flac](/man/flac)(1), [ffmpeg](/man/ffmpeg)(1), [mid3v2](/man/mid3v2)(1)
