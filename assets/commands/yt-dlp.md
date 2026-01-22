# TLDR

**Download a video**

```yt-dlp [https://youtube.com/watch?v=VIDEO_ID]```

**Download audio only** (best quality)

```yt-dlp -x [url]```

**Download audio as MP3**

```yt-dlp -x --audio-format mp3 [url]```

**List available formats**

```yt-dlp -F [url]```

**Download specific format**

```yt-dlp -f [format_code] [url]```

**Download best video + audio**

```yt-dlp -f "bestvideo+bestaudio" [url]```

**Download entire playlist**

```yt-dlp [playlist_url]```

**Download with subtitles**

```yt-dlp --write-subs --sub-lang en [url]```

**Download with custom filename**

```yt-dlp -o "%(title)s.%(ext)s" [url]```

# SYNOPSIS

**yt-dlp** [_options_] _URL_...

# PARAMETERS

**-F**, **--list-formats**
> List available formats

**-f** _FORMAT_
> Select format by code or quality selector

**-x**, **--extract-audio**
> Extract audio only

**--audio-format** _FORMAT_
> Convert audio to format (mp3, aac, wav, etc.)

**--audio-quality** _QUALITY_
> Audio quality (0=best, 9=worst)

**-o** _TEMPLATE_
> Output filename template

**--write-subs**
> Download subtitles

**--sub-lang** _LANGS_
> Subtitle languages (comma-separated)

**--embed-subs**
> Embed subtitles in video

**--embed-thumbnail**
> Embed thumbnail in audio

**-P** _PATH_
> Download to specified directory

**--no-playlist**
> Download only the video if URL refers to playlist

**--playlist-items** _ITEMS_
> Playlist items to download (e.g., 1,3,5-10)

**-U**, **--update**
> Update yt-dlp

# FILENAME TEMPLATE

**%(title)s**: Video title
**%(id)s**: Video ID
**%(ext)s**: File extension
**%(uploader)s**: Channel name
**%(upload_date)s**: Upload date (YYYYMMDD)
**%(playlist_index)s**: Playlist position

# DESCRIPTION

**yt-dlp** is a feature-rich command-line program to download videos from YouTube and many other sites. It's a fork of youtube-dl with additional features and active maintenance.

The tool supports thousands of sites, not just YouTube. Use **--list-extractors** to see all supported sites.

Format selection is powerful: **bestvideo+bestaudio** merges separate streams, **best[height<=720]** limits quality, and specific format codes from **-F** select exact streams.

Configuration can be stored in **~/.config/yt-dlp/config** for default options.

# CAVEATS

Site support depends on extractor updates. When sites change, extractors may break until updated. Run **yt-dlp -U** regularly.

Some sites require authentication. Use **--cookies-from-browser** or **--cookies** to provide login cookies.

Downloaded content may be subject to copyright. Respect content creators' rights and terms of service.

Merging formats requires **ffmpeg** to be installed for proper video/audio combination.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [youtube-dl](/man/youtube-dl)(1), [aria2c](/man/aria2c)(1), [wget](/man/wget)(1)
