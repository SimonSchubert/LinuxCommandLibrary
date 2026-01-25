# TLDR

**Start ncmpc**

```ncmpc```

**Connect to specific host**

```ncmpc -h [hostname]```

**Connect on specific port**

```ncmpc -p [6600]```

**Use password**

```ncmpc --password=[password]```

# SYNOPSIS

**ncmpc** [_options_]

# PARAMETERS

**-h**, **--host** _host_
> MPD server host.

**-p**, **--port** _port_
> MPD server port.

**--password** _pass_
> MPD password.

**-c**, **--colors**
> Enable colors.

**-C**, **--no-colors**
> Disable colors.

# DESCRIPTION

**ncmpc** is a curses-based client for MPD (Music Player Daemon). It provides a text-based interface for browsing music, managing playlists, and controlling playback.

ncmpc is lightweight and keyboard-driven, ideal for terminal music control.

# KEY BINDINGS

```
Space/p  - Play/pause
s        - Stop
>/<      - Next/previous
+/-      - Volume up/down
1-5      - Switch screens
q        - Quit
```

# SCREENS

```
1 - Playlist
2 - Browse
3 - Search
4 - Library
5 - Outputs
```

# CAVEATS

Requires running MPD server. Connect via ~/.ncmpc/config for defaults. Limited to MPD features.

# HISTORY

ncmpc was created by **Kalle Wallin** as one of the first curses clients for MPD, providing a vim-like interface for music control.

# SEE ALSO

[mpd](/man/mpd)(1), [mpc](/man/mpc)(1), [ncmpcpp](/man/ncmpcpp)(1), [vimpc](/man/vimpc)(1)
