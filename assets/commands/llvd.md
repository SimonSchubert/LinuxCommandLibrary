# TLDR

**Download LinkedIn video**

```llvd [video_url]```

**Specify output file**

```llvd -o [output.mp4] [video_url]```

**Download with quality**

```llvd -q [720] [video_url]```

**List available formats**

```llvd -F [video_url]```

**Download subtitles**

```llvd --write-subs [video_url]```

# SYNOPSIS

**llvd** [_options_] _url_

# PARAMETERS

_URL_
> LinkedIn Learning video URL.

**-o** _FILE_
> Output filename.

**-q** _QUALITY_
> Video quality (360, 480, 720, 1080).

**-F**
> List available formats.

**--write-subs**
> Download subtitles.

**--help**
> Display help information.

# DESCRIPTION

**llvd** downloads videos from LinkedIn Learning. It supports various quality levels and subtitle extraction.

The tool requires LinkedIn credentials for authenticated access to learning content.

llvd downloads LinkedIn videos.

# CAVEATS

Requires LinkedIn account. Terms of service considerations. Authentication needed.

# HISTORY

llvd was created to enable offline access to LinkedIn Learning video content for authorized users.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [yt-dlp](/man/yt-dlp)(1)

