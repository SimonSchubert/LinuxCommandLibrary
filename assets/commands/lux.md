# TAGLINE

Fast multi-site video and media downloader

# TLDR

**Download** a video from a URL

```lux "[url]"```

**List available streams** without downloading

```lux -i "[url]"```

**Download a specific stream** by format id

```lux -f [stream_id] "[url]"```

**Download an entire playlist**

```lux -p "[playlist_url]"```

**Set output directory and filename**

```lux -o [path/to/dir] -O [name] "[url]"```

**Download with cookies** (e.g. authenticated sites)

```lux -c "[cookie_string]" "[url]"```

# SYNOPSIS

**lux** [*OPTIONS*] *URL*...

# DESCRIPTION

**lux** is a fast video and media downloader written in Go. It extracts playable streams from many popular sites (YouTube, Bilibili, Douyin, and others) and downloads them, optionally merging audio/video with FFmpeg. When given a direct resource URL that is not a known site, it falls back to a plain download.

Use **-i** to inspect available qualities and stream ids, then **-f** to pick one. Playlist mode (**-p**), multi-threaded multi-part downloads, proxies, cookies, and aria2 RPC are supported for larger or authenticated jobs.

# PARAMETERS

**-i**

> Information only: list available streams and metadata without downloading.

**-f** *stream*

> Select a specific stream id (from **-i** output) to download.

**-p**

> Download a playlist instead of a single item.

**-n** *int*

> Number of download threads for multi-part videos (default: 10).

**-c** *cookie*

> Cookie string for authenticated or region-locked content.

**-r** *referrer*

> HTTP Referer header to send.

**-o** *path*

> Output directory.

**-O** *name*

> Output file name.

**-C**

> Download subtitles (YouTube and supported sites). Combine with **-items** for language codes.

**-retry** *int*

> Retry count on download failure (default: 10).

**-start** *n*, **-end** *n*, **-items** *list*

> Playlist range or item selection (e.g. **1,5,8-10**).

**-aria2**

> Offload download to an aria2 RPC endpoint (**-aria2addr**, **-aria2token**, etc.).

**-d**

> Debug mode.

**-j**

> Print extracted data as JSON.

**-v**

> Show version.

# CAVEATS

FFmpeg is required for merging separate audio/video streams into a final file; downloads still work without it. Site support and stream ids change as upstream sites change their APIs. Prefer official packages or release binaries over outdated distro builds when a site stops working.

# INSTALL

```zypper: sudo zypper install lux```

```brew: brew install lux```

```nix: nix profile install nixpkgs#lux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [youtube-dl](/man/youtube-dl)(1), [ffmpeg](/man/ffmpeg)(1), [aria2c](/man/aria2c)(1)

# RESOURCES

```[Source code](https://github.com/iawia002/lux)```

<!-- verified: 2026-07-19 -->
