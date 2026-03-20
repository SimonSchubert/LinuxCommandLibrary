# TAGLINE

creates Matroska files

# TLDR

**Merge files**

```mkvmerge -o [output.mkv] [input1.mp4] [input2.mp4]```

**Add subtitles**

```mkvmerge -o [output.mkv] [video.mkv] [subtitles.srt]```

**Extract tracks**

```mkvmerge -o [output.mkv] --audio-tracks [1] [input.mkv]```

**Set default track flag**

```mkvmerge -o [output.mkv] --default-track-flag [0:1] [input.mkv]```

**Split by size**

```mkvmerge -o [output.mkv] --split [700M] [input.mkv]```

**Set track language**

```mkvmerge -o [output.mkv] --language [0:eng] [input.mkv]```

**Add title**

```mkvmerge -o [output.mkv] --title "[Movie Title]" [input.mkv]```

**Identify tracks** in a file

```mkvmerge -i [input.mkv]```

# SYNOPSIS

**mkvmerge** [_options_] -o _output_ _inputs_

# PARAMETERS

**-o** _FILE_
> Output file.

_INPUTS_
> Input files.

**-i** _FILE_
> Identify tracks, codecs, and properties of input file.

**--audio-tracks** _IDS_
> Select audio tracks to include.

**--video-tracks** _IDS_
> Select video tracks to include.

**--subtitle-tracks** _IDS_
> Select subtitle tracks to include.

**--no-audio**
> Exclude all audio tracks.

**--no-subtitles**
> Exclude all subtitle tracks.

**--language** _TID:LANG_
> Set language for a track (ISO 639-2 code).

**--default-track-flag** _TID:BOOL_
> Set or clear the default track flag.

**--split** _SIZE_|_duration:TIME_|_chapters:all_
> Split output by size, duration, or chapters.

**--title** _TEXT_
> Set segment title.

**--append-to** _SPEC_
> Append tracks from one file after another.

**-l, --list-types**
> List supported source file formats.

# DESCRIPTION

**mkvmerge** creates Matroska (MKV/MKA/MKS) container files by merging video, audio, and subtitle streams from various source formats. It does not transcode; it only remuxes streams into the Matroska container.

The tool is part of MKVToolNix. Track IDs can be found with **mkvmerge -i** or **mkvinfo**. Option order matters: global options first, then per-file options before the input file they apply to.

# CAVEATS

Does not transcode (remux only). Part of MKVToolNix. Option order matters: per-file options must precede the input file they apply to. Track IDs are zero-indexed.

# HISTORY

mkvmerge is part of **MKVToolNix**, providing Matroska container manipulation tools.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [mkvpropedit](/man/mkvpropedit)(1)

