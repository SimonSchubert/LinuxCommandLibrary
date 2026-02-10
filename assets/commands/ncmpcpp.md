# TAGLINE

ncurses-based MPD client

# TLDR

**Start ncmpcpp**

```ncmpcpp```

**Connect to specific host**

```ncmpcpp -h [localhost] -p [6600]```

**Start with specific screen**

```ncmpcpp -s [playlist]```

**Show current song**

```ncmpcpp --current-song```

# SYNOPSIS

**ncmpcpp** [_options_]

# DESCRIPTION

**ncmpcpp** is an ncurses-based MPD (Music Player Daemon) client. It provides a feature-rich interface for controlling MPD, browsing music, managing playlists, and visualizing audio.

The tool offers vim-like keybindings, a spectrum visualizer, and extensive customization options.

# PARAMETERS

**-h** _host_
> MPD server host.

**-p** _port_
> MPD server port.

**-c** _file_
> Configuration file.

**-s** _screen_
> Starting screen.

**--current-song**
> Print current song info.

**-q**, **--quiet**
> Suppress messages.

# KEY BINDINGS

**1-8**: Switch screens
**Enter**: Play/select
**p**: Pause
**s**: Stop
**>/<**: Next/Previous
**f/b**: Seek forward/back
**+/-**: Volume
**/**: Search
**u**: Update database

# SCREENS

Playlist, Browser, Search, Media library, Lyrics, Visualizer, Clock

# CAVEATS

Requires running MPD instance. Configuration can be complex. Some features need additional setup. Visualizer needs FIFO output.

# HISTORY

**ncmpcpp** stands for "NCurses Music Player Client (Plus Plus)", created as an enhanced version of ncmpc. Written in C++ by **Andrzej Rybczak**, it adds features like lyrics fetching and visualization.

# SEE ALSO

[mpd](/man/mpd)(1), [mpc](/man/mpc)(1), [ncmpc](/man/ncmpc)(1), [cmus](/man/cmus)(1)
