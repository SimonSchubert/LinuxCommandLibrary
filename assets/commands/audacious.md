# TAGLINE

Lightweight audio player with plugin support

# TLDR

**Start** Audacious

```audacious```

Play **specific files**

```audacious [file1.mp3] [file2.mp3]```

**Enqueue** files

```audacious -e [file.mp3]```

Start **headless** (without GUI)

```audacious -H```

**Show** current song

```audacious -t```

# SYNOPSIS

**audacious** [_-e_] [_-H_] [_options_] [_files_]

# DESCRIPTION

**audacious** is a lightweight, GTK-based audio player focusing on low resource usage and high audio quality. It supports numerous formats through plugins and features a Winamp-classic interface mode.

The player emphasizes customization through skins and plugins while maintaining simplicity.

# PARAMETERS

**-e**, **--enqueue**
> Add files to playlist without playing

**-H**, **--headless**
> Run without GUI

**-t**, **--show-main-window**
> Show main window

**-p**, **--play**
> Start playback

**-u**, **--pause**
> Pause playback

**-s**, **--stop**
> Stop playback

**-f**, **--fwd**
> Skip forward

**-r**, **--rew**
> Skip backward

**--shuffle**
> Toggle shuffle

**--repeat**
> Toggle repeat

**-m**, **--show-jump-box**
> Show jump to file dialog

# CONFIGURATION

**~/.config/audacious/config**
> Main configuration file for player settings and preferences.

**~/.config/audacious/plugin-registry**
> Registry of installed plugins and their enabled state.

# CAVEATS

Plugin availability varies by distribution. Some formats require additional codecs. GTK2 version (legacy) differs from GTK3/Qt versions.

# HISTORY

**Audacious** was forked from Beep Media Player (itself a fork of XMMS) in **2005**. It continues the Winamp-like interface tradition on Linux.

# SEE ALSO

[mpv](/man/mpv)(1), [vlc](/man/vlc)(1), [rhythmbox](/man/rhythmbox)(1)
