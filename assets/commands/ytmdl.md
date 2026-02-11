# TAGLINE

Download music with automatic metadata tagging

# TLDR

**Download song with metadata**

```ytmdl [song name]```

**Download from YouTube URL**

```ytmdl [https://youtube.com/watch?v=VIDEO_ID]```

**Specify output directory**

```ytmdl -o [~/Music] [song name]```

**Skip confirmation prompts**

```ytmdl --skip-meta [song name]```

**Download as MP3**

```ytmdl --format mp3 [song name]```

# SYNOPSIS

**ytmdl** [_options_] [_song_|_URL_]

# PARAMETERS

**-o**, **--output-dir** _DIR_
> Set output directory for downloads

**--format** _FORMAT_
> Audio format (mp3, m4a, opus, etc.)

**--skip-meta**
> Skip quering metadata and downloading default one

**-q**, **--quiet**
> Suppress output

**--proxy** _URL_
> Use proxy for downloads

**--level** _LEVEL_
> Log level (DEBUG, INFO, WARNING, ERROR)

**--disable-metaadd**
> Disable adding metadata to the song

**--trim**, **-t**
> Trim silence from start and end

# DESCRIPTION

**ytmdl** is a tool to download music from YouTube and automatically add metadata (artist, album, cover art, lyrics) from sources like iTunes, Spotify, Deezer, and Gaana. It searches for songs, downloads them as audio, and enriches them with proper tags.

The tool can accept either a song name (which it searches on YouTube) or a direct YouTube URL. It presents metadata options from various sources and lets you choose the best match.

Configuration is stored in **~/.config/ytmdl/config** for setting default behaviors, output directories, and preferred metadata sources.

# CAVEATS

Metadata accuracy depends on search results. Obscure or misspelled songs may get incorrect metadata.

Requires **ffmpeg** for audio conversion and format handling.

Some metadata sources may have regional restrictions or rate limits.

Downloaded content may be subject to copyright. Respect content creators' rights.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [ffmpeg](/man/ffmpeg)(1), [youtube-dl](/man/youtube-dl)(1), [spotdl](/man/spotdl)(1)
