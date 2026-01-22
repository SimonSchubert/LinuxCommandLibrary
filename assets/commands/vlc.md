# TLDR

**Play a media file**

```vlc [file]```

**Play multiple files**

```vlc [file1] [file2] [file3]```

**Play a URL/stream**

```vlc [https://example.com/stream.m3u8]```

**Play in fullscreen**

```vlc --fullscreen [file]```

**Play without GUI** (command line)

```cvlc [file]```

**Loop playback**

```vlc --loop [file]```

**Play at specific volume** (0-512, 256 = 100%)

```vlc --volume=[200] [file]```

**Stream to HTTP**

```vlc [file] --sout '#standard{access=http,mux=ts,dst=:8080}'```

# SYNOPSIS

**vlc** [_options_] [_file_|_url_...]

# PARAMETERS

**--fullscreen**, **-f**
> Start in fullscreen mode

**--loop**, **-L**
> Loop playlist

**--repeat**, **-R**
> Repeat current item

**--random**, **-Z**
> Random playback

**--volume** _N_
> Set volume (0-512, 256 = 100%)

**--play-and-exit**
> Exit after playing

**--start-time** _N_
> Start at N seconds

**--stop-time** _N_
> Stop at N seconds

**--rate** _N_
> Playback speed (1.0 = normal)

**--no-video**
> Audio only

**--no-audio**
> Video only

**--sout** _chain_
> Stream output chain

**--intf** _interface_
> Interface module (qt, ncurses, dummy)

**-I dummy**, **--intf=dummy**
> No interface (background)

# VARIANTS

**vlc**: Full GUI version
**cvlc**: Command-line only (no GUI)
**nvlc**: NCurses text interface
**rvlc**: Remote control interface
**svlc**: Skinnable interface

# DESCRIPTION

**VLC** is a free, open-source multimedia player supporting virtually all audio and video formats without external codecs. It can play local files, discs, streams, and capture devices.

Beyond playback, VLC includes powerful streaming and transcoding capabilities. It can serve as a streaming server, convert between formats, and apply various filters and effects.

The command-line interface provides full access to VLC's features for scripting and automation. Use **cvlc** for headless operation without starting the GUI.

VLC's media library and playlist features help organize large collections, while its network streaming supports protocols like HTTP, RTSP, and HLS.

# CAVEATS

The **--sout** streaming syntax is complex. Consult VLC documentation for stream output chain construction.

Hardware acceleration options vary by platform. Use **--avcodec-hw** to control hardware decoding.

Some proprietary formats may have playback issues due to licensing. VLC uses open-source implementations that may not match commercial decoders exactly.

# HISTORY

VLC was created as a student project at **École Centrale Paris** in **1996** under the name VideoLAN Client. It became open source in **2001** and grew into one of the most popular media players, known for playing "anything" without codec packs.

# SEE ALSO

[mpv](/man/mpv)(1), [ffmpeg](/man/ffmpeg)(1), [mplayer](/man/mplayer)(1), [ffplay](/man/ffplay)(1)
