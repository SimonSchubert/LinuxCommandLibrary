# TAGLINE

Download RTMP streaming media

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

**rtmpdump** downloads media streams using the Real-Time Messaging Protocol (RTMP), which was originally developed by Adobe for Flash-based streaming. It connects to RTMP servers and saves the stream data to a local file, supporting both live broadcasts and on-demand video content.

The tool handles the full RTMP handshake and protocol negotiation, including SWF (Shockwave Flash) verification when servers require it. RTMP URLs consist of a server address, application path, and playpath, which may need to be specified separately. For live streams, the **-v** flag enables live mode where recording continues until the stream ends or the user interrupts.

Interrupted downloads can be resumed with the **--resume** flag, which is particularly useful for long recordings over unreliable connections. The tool outputs FLV (Flash Video) format by default, which can be converted to other formats using tools like ffmpeg.

# CAVEATS

RTMP is declining in use. Some servers require authentication. May violate terms of service.

# HISTORY

**rtmpdump** was created as open-source RTMP client. It enabled downloading Adobe Flash video streams before modern protocols became common.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [streamlink](/man/streamlink)(1), [youtube-dl](/man/youtube-dl)(1)
