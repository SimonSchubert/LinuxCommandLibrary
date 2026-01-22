# TLDR

**Merge files**

```mkvmerge -o [output.mkv] [input1.mp4] [input2.mp4]```

**Add subtitles**

```mkvmerge -o [output.mkv] [video.mkv] [subtitles.srt]```

**Extract tracks**

```mkvmerge -o [output.mkv] --audio-tracks [1] [input.mkv]```

**Set default track**

```mkvmerge -o [output.mkv] --default-track [0:1] [input.mkv]```

**Split by size**

```mkvmerge -o [output.mkv] --split [700M] [input.mkv]```

**Add title**

```mkvmerge -o [output.mkv] --title "[Movie Title]" [input.mkv]```

# SYNOPSIS

**mkvmerge** [_options_] -o _output_ _inputs_

# PARAMETERS

**-o** _FILE_
> Output file.

_INPUTS_
> Input files.

**--audio-tracks** _IDS_
> Select audio tracks.

**--subtitle-tracks** _IDS_
> Select subtitle tracks.

**--split** _SIZE_
> Split output.

**--title** _TEXT_
> Set title.

**--help**
> Display help information.

# DESCRIPTION

**mkvmerge** creates Matroska (MKV) files. It combines video, audio, and subtitles.

The tool is part of MKVToolNix. Supports many input formats and track manipulation.

mkvmerge creates MKV files.

# CAVEATS

No transcoding. Part of MKVToolNix. Complex track selection.

# HISTORY

mkvmerge is part of **MKVToolNix**, providing Matroska container manipulation tools.

# SEE ALSO

[mkvextract](/man/mkvextract)(1), [mkvinfo](/man/mkvinfo)(1), [ffmpeg](/man/ffmpeg)(1)

