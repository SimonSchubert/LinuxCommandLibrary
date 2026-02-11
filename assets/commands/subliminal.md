# TAGLINE

Automatic subtitle downloader for videos

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

**subliminal** automatically downloads subtitles for video files by searching multiple online providers simultaneously. It uses video file hashing to accurately identify content, matching the exact release version for well-synchronized subtitles rather than relying solely on filename matching.

The tool queries multiple subtitle providers including OpenSubtitles, Addic7ed, Podnapisi, and others, increasing the likelihood of finding subtitles. If one provider fails, it falls back to others automatically. Languages are specified using ISO 639-1 codes, and multiple languages can be requested in a single command.

Subliminal can recursively scan entire directories to process media libraries in batch. It skips videos that already have subtitles unless forced to re-download. Provider authentication can be configured for access to premium subtitle sources with higher download limits.

# CAVEATS

Some providers need accounts. Rate limits apply. Not all videos have subtitles.

# HISTORY

**Subliminal** is a Python library and CLI for subtitle downloading. It simplifies finding and downloading subtitles for video files.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [vlc](/man/vlc)(1)
