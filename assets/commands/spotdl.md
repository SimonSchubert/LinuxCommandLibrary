# TAGLINE

Download Spotify tracks via YouTube

# TLDR

**Download track**

```spotdl "[song name]"```

**Download from URL**

```spotdl [https://open.spotify.com/track/...]```

**Download playlist**

```spotdl [https://open.spotify.com/playlist/...]```

**Download album**

```spotdl [https://open.spotify.com/album/...]```

**Specify output format**

```spotdl --output "[{artist} - {title}]" [url]```

**Download as MP3**

```spotdl --format mp3 [url]```

# SYNOPSIS

**spotdl** [_options_] _query_or_url_

# DESCRIPTION

**spotdl** downloads songs from Spotify by finding and downloading matching tracks from YouTube Music. It uses Spotify's metadata for tagging.

The tool downloads audio, adds metadata and cover art, creating properly tagged music files from Spotify links.

# PARAMETERS

**--output** _template_
> Output filename template.

**--format** _fmt_
> Audio format (mp3, flac, ogg, m4a).

**--bitrate** _rate_
> Audio bitrate.

**-o** _dir_, **--output-dir** _dir_
> Output directory.

**--threads** _n_
> Download threads.

**--no-cache**
> Don't use cache.

**--sponsor-block**
> Remove sponsor segments.

**--sync** _file_
> Sync with saved file.

**--cookie-file** _file_
> YouTube cookies file.

# CAVEATS

Depends on YouTube Music availability. Quality varies. Rate limiting may occur. Respect copyright laws.

# HISTORY

**spotdl** was created to bridge Spotify's catalog with downloadable audio. It evolved from earlier tools and uses yt-dlp for downloading, adding Spotify integration for metadata.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [youtube-dl](/man/youtube-dl)(1), [ffmpeg](/man/ffmpeg)(1)
