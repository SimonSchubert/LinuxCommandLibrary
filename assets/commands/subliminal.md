# TLDR

**Download subtitles for video**

```subliminal download -l [en] [video.mkv]```

**Download for directory**

```subliminal download -l [en] [videos/]```

**Multiple languages**

```subliminal download -l [en] -l [es] [video.mkv]```

**Specific provider**

```subliminal download -l [en] -p [opensubtitles] [video.mkv]```

**Force download**

```subliminal download -l [en] -f [video.mkv]```

**With authentication**

```subliminal --opensubtitles [user] [pass] download -l [en] [video.mkv]```

# SYNOPSIS

**subliminal** [_--provider auth_] **download** [_-l lang_] [_-p provider_] [_options_] _paths_

# PARAMETERS

**download**
> Download subtitles.

**-l**, **--language** _LANG_
> Language code.

**-p**, **--provider** _NAME_
> Subtitle provider.

**-f**, **--force**
> Force re-download.

**-a**, **--age** _AGE_
> File age filter.

**-d**, **--directory** _DIR_
> Output directory.

**-e**, **--encoding** _ENC_
> Subtitle encoding.

# PROVIDERS

**opensubtitles** - OpenSubtitles.org
**addic7ed** - Addic7ed
**podnapisi** - Podnapisi
**thesubdb** - TheSubDB
**tvsubtitles** - TVSubtitles

# DESCRIPTION

**subliminal** downloads subtitles for video files. It searches multiple providers automatically.

Video hashing identifies content accurately. Matches exact releases.

Multiple providers increase success rate. Falls back if one fails.

Language codes are ISO 639-1. Common: en, es, fr, de.

Recursive scanning handles directories. Processes entire media libraries.

# CAVEATS

Some providers need accounts. Rate limits apply. Not all videos have subtitles.

# HISTORY

**Subliminal** is a Python library and CLI for subtitle downloading. It simplifies finding and downloading subtitles for video files.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [vlc](/man/vlc)(1)
