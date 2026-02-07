# TAGLINE

remote control interface for cmus music player

# TLDR

**Toggle play/pause**

```cmus-remote -u```

**Play**

```cmus-remote -p```

**Pause**

```cmus-remote -U```

**Stop playback**

```cmus-remote -s```

**Next track**

```cmus-remote -n```

**Previous track**

```cmus-remote -r```

**Seek forward** 10 seconds

```cmus-remote -k +10```

**Set volume**

```cmus-remote -v [50]%```

**Add file to queue**

```cmus-remote -q [file.mp3]```

# SYNOPSIS

**cmus-remote** [_options_] [_file_|_dir_|_playlist_]

# DESCRIPTION

**cmus-remote** is a remote control interface for cmus, the ncurses-based music player. It sends commands to a running cmus instance via socket connection.

The tool allows controlling playback, managing playlists, and querying player status from scripts or other applications. It's commonly used for media key bindings and status bar integrations.

# PARAMETERS

**-p**, **--play**
> Start playback.

**-u**, **--pause**
> Toggle pause.

**-U**, **--pause-playback**
> Pause without toggle.

**-s**, **--stop**
> Stop playback.

**-n**, **--next**
> Play next track.

**-r**, **--prev**
> Play previous track.

**-k** _seconds_
> Seek relative (+/-seconds).

**-v** _volume_
> Set volume (absolute or +/-).

**-q** _file_
> Add file to queue.

**-c** _file_
> Add file to library.

**-l** _file_
> Load playlist.

**-S** _name_
> Toggle setting.

**-Q**
> Query and print status.

**-C** _command_
> Send raw cmus command.

# CAVEATS

Requires running cmus instance. Socket permissions must allow connection. Some commands may not work if cmus is not playing.

# HISTORY

**cmus-remote** is part of the **cmus** project, created by **Timo Hirvonen** in **2005**. It provides scriptable control for the terminal-based music player, enabling integration with window managers, status bars, and multimedia keyboards.

# SEE ALSO

[cmus](/man/cmus)(1), [mpd](/man/mpd)(1), [mpc](/man/mpc)(1), [playerctl](/man/playerctl)(1)
