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

**Seek within current song**

```mpc seek [+10]```

**Toggle repeat mode**

```mpc repeat```

# SYNOPSIS

**mpc** [_options_] [_command_] [_arguments_]

# PARAMETERS

**-f**, **--format** _FORMAT_
> Configure song display format using metadata delimiters like %artist%, %album%, %title%, %track%, %time%, %file%.

**-h**, **--host** _HOST_
> Host to connect to. Use password@host for authentication. An absolute path connects via Unix Domain Socket.

**-p**, **--port** _PORT_
> Port to connect to (default: MPD_PORT env or 6600).

**-q**, **--quiet**, **--no-status**
> Suppress current song status after commands.

**-v**, **--verbose**
> Verbose output.

**--wait**
> Wait for operation to finish (e.g., database update).

# COMMANDS

**play** [_position_]
> Start playback, optionally at a playlist position.

**pause**
> Pause playback.

**toggle**
> Toggle play/pause.

**stop**
> Stop playback.

**next**
> Skip to next track.

**prev**
> Go to previous track.

**seek** _value_
> Seek within current song (e.g., +10, -5, 50%).

**volume** _LEVEL_
> Set volume percentage (0-100), or relative (+5, -5).

**repeat** [_on|off_]
> Toggle or set repeat mode.

**random** [_on|off_]
> Toggle or set random mode.

**shuffle**
> Shuffle the current playlist.

**crossfade** [_seconds_]
> Get or set crossfade between songs (0 disables).

**add** _URI_
> Add a song to the playlist.

**clear**
> Clear the playlist.

**playlist**
> Print the current playlist.

**search** _type_ _query_
> Search for songs in the database.

**update** [_path_]
> Scan for updated files in the music directory.

**status**
> Display current playback status.

# DESCRIPTION

**mpc** is a command-line client for MPD (Music Player Daemon). It connects to a running MPD instance and controls playback, playlists, volume, and playback state according to commands and arguments passed to it.

If no command is given, the current status is printed (same as **mpc status**).

# CAVEATS

Requires a running MPD instance. The client does not play audio itself. Connection parameters default to localhost:6600 or can be set via MPD_HOST and MPD_PORT environment variables.

# HISTORY

mpc was created as the reference **command-line client** for the Music Player Daemon project.

# SEE ALSO

[mpd](/man/mpd)(1), [ncmpcpp](/man/ncmpcpp)(1), [mpv](/man/mpv)(1)

