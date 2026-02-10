# TAGLINE

command-line client for MPD

# TLDR

**Show current song**

```mpc```

**Play/pause toggle**

```mpc toggle```

**Next track**

```mpc next```

**Previous track**

```mpc prev```

**Add file to playlist**

```mpc add [path/to/song.mp3]```

**Clear playlist**

```mpc clear```

**Set volume**

```mpc volume [80]```

**Update database**

```mpc update```

# SYNOPSIS

**mpc** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> Action to perform.

**play**
> Start playback.

**pause**
> Pause playback.

**toggle**
> Toggle play/pause.

**next**
> Skip to next track.

**prev**
> Go to previous track.

**volume** _LEVEL_
> Set volume percentage.

**--help**
> Display help information.

# DESCRIPTION

**mpc** is a command-line client for MPD (Music Player Daemon). It controls music playback.

The tool communicates with mpd daemon. Manages playlists, volume, and playback state.

# CAVEATS

Requires running mpd. Client only, no audio playback. Text-based interface.

# HISTORY

mpc was created as the reference **command-line client** for the Music Player Daemon project.

# SEE ALSO

[mpd](/man/mpd)(1), [ncmpcpp](/man/ncmpcpp)(1), [mpv](/man/mpv)(1)

