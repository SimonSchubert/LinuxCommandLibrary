# TLDR

**Start MPD**

```mpd```

**Start with config file**

```mpd [~/.config/mpd/mpd.conf]```

**Kill running MPD**

```mpd --kill```

**Run in foreground**

```mpd --no-daemon```

**Show version**

```mpd --version```

**Verbose output**

```mpd --verbose```

# SYNOPSIS

**mpd** [_options_] [_config_file_]

# PARAMETERS

_CONFIG_FILE_
> Path to configuration file.

**--kill**
> Kill running MPD instance.

**--no-daemon**
> Run in foreground.

**--verbose**
> Enable verbose output.

**--version**
> Show version information.

**--help**
> Display help information.

# DESCRIPTION

**mpd** (Music Player Daemon) is a server-side music player. It plays audio and manages playlists.

The tool runs as a daemon. Clients like mpc or ncmpcpp connect to control playback.

mpd is music server daemon.

# CAVEATS

Server-side only. Requires client to control. Configuration needed for audio output.

# HISTORY

MPD was created as a **flexible music server** allowing multiple client interfaces and remote control.

# SEE ALSO

[mpc](/man/mpc)(1), [ncmpcpp](/man/ncmpcpp)(1), [pulseaudio](/man/pulseaudio)(1)

