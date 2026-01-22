# TLDR

**Start streaming server**

```ffserver -f [ffserver.conf]```

**Run in background**

```ffserver -f [ffserver.conf] &```

**Specify log level**

```ffserver -f [ffserver.conf] -loglevel [verbose]```

# SYNOPSIS

**ffserver** [_options_]

# PARAMETERS

**-f** _FILE_
> Configuration file.

**-n**
> No launch (parse config only).

**-d**
> Debug mode.

**-loglevel** _LEVEL_
> Log verbosity: quiet, error, warning, info, verbose.

**--help**
> Display help information.

# DESCRIPTION

**ffserver** was an HTTP/RTSP streaming server included with ffmpeg. It received feeds from ffmpeg encoders and served them to clients, enabling live video streaming setups.

The server supported multiple streams and on-demand reencoding. Configuration defined input feeds from ffmpeg and output streams for clients with different formats and bitrates.

ffserver provided a complete streaming solution for webcams, screen capture, and video files.

# CAVEATS

**Deprecated and removed** from ffmpeg in version 4.0. Use alternatives like nginx-rtmp or GStreamer. Configuration was complex.

# HISTORY

ffserver was part of ffmpeg from early versions until its **removal in 2018** (ffmpeg 4.0). It was deprecated due to maintenance burden, with recommendations to use dedicated streaming servers instead.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [nginx](/man/nginx)(1), [vlc](/man/vlc)(1)
