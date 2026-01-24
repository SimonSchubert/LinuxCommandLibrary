# TLDR

**Download video**

```you-get [https://example.com/video]```

**Show video info**

```you-get -i [https://example.com/video]```

**Download specific format**

```you-get --format [dash-flv720] [url]```

**Download to directory**

```you-get -o [/output/dir] [url]```

**Download playlist**

```you-get --playlist [url]```

**Set output filename**

```you-get -O [filename] [url]```

**Use proxy**

```you-get -x [127.0.0.1:1080] [url]```

**Download with cookies**

```you-get -c [cookies.txt] [url]```

# SYNOPSIS

**you-get** [_-i_] [_-o dir_] [_-O name_] [_--format fmt_] [_options_] _url_

# PARAMETERS

**-i**, **--info**
> Show video info only.

**-o** _DIR_
> Output directory.

**-O** _NAME_
> Output filename.

**--format** _FMT_
> Specific format.

**--playlist**
> Download playlist.

**-c** _FILE_
> Cookie file.

**-x** _PROXY_
> HTTP proxy.

**-s** _PROXY_
> SOCKS5 proxy.

**-u**
> Auto retry on error.

**-n**
> No merge (keep parts).

**-F**
> Force download.

**--json**
> JSON output.

# DESCRIPTION

**you-get** downloads videos from websites. It supports YouTube, Bilibili, Vimeo, and many other video platforms.

Info mode (-i) shows available formats without downloading. This helps choose the best quality or format.

Format selection downloads specific quality levels. Available formats are shown with -i and selected with --format.

Playlist support downloads entire playlists or channels. Individual videos are numbered in output.

Cookie support accesses private or age-restricted content. Cookies can be exported from browsers.

Proxy support enables access through firewalls. HTTP and SOCKS5 proxies are supported.

# CAVEATS

Site support may break with website changes. Some sites require login. Download speeds vary by site. Terms of service considerations.

# HISTORY

**you-get** was created by **Mort Yao** around **2012**. Written in Python, it focuses on supporting Chinese video sites alongside international platforms.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [yt-dlp](/man/yt-dlp)(1), [streamlink](/man/streamlink)(1), [ffmpeg](/man/ffmpeg)(1)
