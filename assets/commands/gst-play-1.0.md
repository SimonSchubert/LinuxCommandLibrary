# TAGLINE

Simple command line media playback tool using GStreamer

# TLDR

**Play a media file**

```gst-play-1.0 [path/to/file.mp4]```

**Play multiple files**

```gst-play-1.0 [file1.mp3] [file2.mp3] [file3.mp3]```

**Play all media files in a directory** recursively

```gst-play-1.0 [path/to/directory]```

**Play a file with a specific video sink**

```gst-play-1.0 --videosink=ximagesink [path/to/file.mp4]```

**Play files in shuffle order**

```gst-play-1.0 --shuffle [file1.mp3] [file2.mp3] [file3.mp3]```

**Play a file with gapless playback enabled**

```gst-play-1.0 --gapless [file1.mp3] [file2.mp3]```

**Play a stream from a URI**

```gst-play-1.0 [https://example.com/stream.mp3]```

**Play a file at half volume**

```gst-play-1.0 --volume=0.5 [path/to/file.mp3]```

# SYNOPSIS

**gst-play-1.0** [_options_] _FILE_|_DIRECTORY_|_URI_ [_FILE2_|_DIRECTORY2_|_URI2_ ...]

# PARAMETERS

**--audiosink=**_SINK_
> Use the specified audio sink instead of **autoaudiosink**.

**--videosink=**_SINK_
> Use the specified video sink instead of **autovideosink**.

**--volume=**_VOLUME_
> Set initial playback volume. **0.0** is silent, **1.0** is unchanged (default).

**--shuffle**
> Play files in random order.

**--no-interactive**
> Disable interactive keyboard control.

**--gapless**
> Enable gapless (seamless) playback between tracks.

**-v**, **--verbose**
> Output status information and property notifications.

**-q**, **--quiet**
> Suppress all output except errors.

**--use-playbin3**
> Use the playbin3 pipeline instead of the default playbin.

**--wait-on-eos**
> Keep the last video frame displayed after playback ends instead of closing.

**--flags**
> Control playback behavior via the playbin **flags** property.

**--version**
> Print version information and exit.

**--help**
> Show available options and exit.

# DESCRIPTION

**gst-play-1.0** is a command line playback testing tool that uses GStreamer's **playbin** element to play audio and video files. It accepts individual files, directories (which are traversed recursively), and URIs as input.

The tool provides interactive keyboard controls during playback for pausing, seeking, adjusting volume, changing playback speed, and switching between audio, video, and subtitle tracks. It supports gapless playback for seamless transitions between tracks and can play media from local files or network streams.

# INTERACTIVE CONTROLS

```
SPACE     Pause / Resume
Arrow Up/Down    Volume up / down
Arrow Left/Right Seek backward / forward 10 seconds
+/-       Increase / decrease playback rate
d         Reverse playback direction
t         Cycle trick modes
a         Cycle audio tracks
s         Cycle subtitle tracks
v         Cycle video tracks
> or n    Next track in playlist
< or b    Previous track in playlist
0         Seek back to beginning
Q or ESC  Quit
```

# CAVEATS

**gst-play-1.0** is intended as a testing and debugging tool rather than a full-featured media player. Playback capabilities depend entirely on which GStreamer plugins are installed on the system. Missing codecs will result in playback errors. Interactive keyboard controls require a terminal and are disabled when stdin is not a TTY.

# HISTORY

**gst-play-1.0** was introduced as part of the **GStreamer** multimedia framework's base plugins. GStreamer itself was created by **Erik Walthinsen** in **1999** and has grown into the standard multimedia framework on Linux. The play tool provides a simple way to test playback pipelines without constructing them manually via **gst-launch-1.0**. It replaced the older **gst-play-0.10** tool when GStreamer transitioned to the 1.x series in **2012**.

# SEE ALSO

[gst-launch-1.0](/man/gst-launch-1.0)(1), [gst-inspect-1.0](/man/gst-inspect-1.0)(1), [gst-discoverer-1.0](/man/gst-discoverer-1.0)(1), [ffplay](/man/ffplay)(1), [mpv](/man/mpv)(1)
