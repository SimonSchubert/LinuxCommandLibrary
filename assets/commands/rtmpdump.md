# TLDR

**Download RTMP stream**

```rtmpdump -r "[rtmp://server/path]" -o [output.flv]```

**With playpath**

```rtmpdump -r "[rtmp://server/app]" -y "[playpath]" -o [output.flv]```

**Live stream**

```rtmpdump -r "[rtmp://server/live]" -v -o [output.flv]```

**With SWF verification**

```rtmpdump -r "[rtmp://server/path]" -W "[http://example.com/player.swf]" -o [output.flv]```

**Resume download**

```rtmpdump -r "[rtmp://server/path]" -o [output.flv] --resume```

**Set timeout**

```rtmpdump -r "[rtmp://server/path]" -o [output.flv] --timeout [30]```

# SYNOPSIS

**rtmpdump** [_-r url_] [_-o file_] [_-y playpath_] [_options_]

# PARAMETERS

**-r** _URL_
> RTMP URL.

**-o** _FILE_
> Output file.

**-y** _PATH_
> Playpath.

**-v**, **--live**
> Live stream.

**-W** _URL_
> SWF player URL.

**--resume**
> Resume download.

**-T** _TOKEN_
> Secure token.

**-s** _URL_
> SWF hash.

**--timeout** _SECS_
> Timeout.

**-V**, **--verbose**
> Verbose.

# DESCRIPTION

**rtmpdump** downloads RTMP (Real-Time Messaging Protocol) streams. It captures live and on-demand video.

RTMP URLs specify server and stream. Playpath may be separate from base URL.

Live mode handles streaming content. Recording continues until stream ends or stopped.

SWF verification bypasses some protections. Player URL may be required for verification.

Resume continues interrupted downloads. Useful for long streams on unstable connections.

# CAVEATS

RTMP is declining in use. Some servers require authentication. May violate terms of service.

# HISTORY

**rtmpdump** was created as open-source RTMP client. It enabled downloading Adobe Flash video streams before modern protocols became common.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [streamlink](/man/streamlink)(1), [youtube-dl](/man/youtube-dl)(1)
