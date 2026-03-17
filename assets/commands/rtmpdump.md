# TAGLINE

Download RTMP streaming media

# TLDR

**Download RTMP stream** to a file

```rtmpdump -r "[rtmp://server/path]" -o [output.flv]```

**Download with separate playpath**

```rtmpdump -r "[rtmp://server/app]" -y "[playpath]" -o [output.flv]```

**Record a live stream**

```rtmpdump -r "[rtmp://server/live]" -v -o [output.flv]```

**Download with SWF verification**

```rtmpdump -r "[rtmp://server/path]" -W "[http://example.com/player.swf]" -o [output.flv]```

**Resume an interrupted download**

```rtmpdump -r "[rtmp://server/path]" -o [output.flv] --resume```

**Download with progress indicators**

```rtmpdump -r "[rtmp://server/path]" -o [output.flv] --hashes```

# SYNOPSIS

**rtmpdump** **-r** _url_ [**-o** _file_] [_options_]

# PARAMETERS

**-r** _URL_, **--rtmp** _URL_
> RTMP URL of the stream to download.

**-o** _FILE_, **--flv** _FILE_
> Output file name. If not specified, streams to stdout.

**-y** _PATH_, **--playpath** _PATH_
> Override the playpath parsed from the RTMP URL.

**-a** _APP_, **--app** _APP_
> Name of application to connect to on the RTMP server.

**-v**, **--live**
> Specify that the media is a live stream. No resuming or seeking is possible.

**-W** _URL_, **--swfVfy** _URL_
> URL of the SWF player. Hash and size are computed automatically.

**-s** _URL_, **--swfUrl** _URL_
> URL of the SWF player for the media. Required by some servers for verification.

**--resume**
> Resume an incomplete download.

**-T** _TOKEN_, **--token** _TOKEN_
> Key for SecureToken response.

**--timeout** _SECS_
> Timeout the session after SECS seconds without receiving data.

**-n** _HOST_, **--host** _HOST_
> Override the hostname in the RTMP URL.

**-c** _PORT_, **--port** _PORT_
> Override the port number in the RTMP URL.

**--hashes**
> Display a hash mark for each 1% of progress.

**-q**, **--quiet**
> Suppress all command output.

**-V**, **--verbose**
> Verbose output.

**-z**, **--debug**
> Debug level output with hex dumps of all packet data.

# DESCRIPTION

**rtmpdump** downloads media streams using the Real-Time Messaging Protocol (RTMP), which was originally developed by Adobe for Flash-based streaming. It connects to RTMP servers and saves the stream data to a local file, supporting both live broadcasts and on-demand video content.

The tool handles the full RTMP handshake and protocol negotiation, including SWF (Shockwave Flash) verification when servers require it. RTMP URLs consist of a server address, application path, and playpath, which may need to be specified separately. For live streams, the **-v** flag enables live mode where recording continues until the stream ends or the user interrupts.

Interrupted downloads can be resumed with the **--resume** flag, which is particularly useful for long recordings over unreliable connections. The tool outputs FLV (Flash Video) format by default, which can be converted to other formats using tools like ffmpeg.

# CAVEATS

RTMP is declining in use as modern streaming protocols like HLS and DASH have replaced it. Some servers require SWF verification or token authentication. Output is always in FLV format.

# HISTORY

**rtmpdump** was created as an open-source RTMP client. It enabled downloading Adobe Flash video streams before modern streaming protocols became common.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [streamlink](/man/streamlink)(1), [youtube-dl](/man/youtube-dl)(1), [curl](/man/curl)(1)
