# TLDR

**Record terminal session** to default file (ttyrecord)

```ttyrec```

**Record to a specific file**

```ttyrec [path/to/recording.tty]```

**Append to existing recording**

```ttyrec -a [path/to/recording.tty]```

**Record while running a specific command**

```ttyrec -e "[command]" [path/to/recording.tty]```

**Record with automatic uudecode** extraction

```ttyrec -u [path/to/recording.tty]```

# SYNOPSIS

**ttyrec** [**-a**] [**-u**] [**-e** _command_] [_file_]

# PARAMETERS

**-a**
> Append output to the file rather than overwriting it.

**-u**
> Automatically call uudecode and save output when uuencoded data appears in the session. Useful for transferring files from remote hosts.

**-e** _command_
> Execute the specified command instead of the default shell when ttyrec starts.

# DESCRIPTION

**ttyrec** is a terminal session recorder that captures all terminal activity with microsecond timing accuracy. It is derived from the script(1) command but adds precise timing information essential for accurate playback.

When invoked, ttyrec spawns a new shell (or specified command) and records all output until the shell exits. The recording includes timing data that allows ttyplay to reproduce the session at the original speed, making it ideal for creating tutorials, demonstrations, or documenting terminal procedures.

The default output file is "ttyrecord" in the current directory. The shell used is determined by the SHELL environment variable, falling back to /bin/sh if not set. Recordings can be played back with **ttyplay** and analyzed with **ttytime**.

# CAVEATS

Recordings may contain sensitive information like passwords if not careful. The recording format is not human-readable and requires ttyplay for playback. Large recordings can consume significant disk space depending on session activity. Terminal dimensions at playback should match recording for proper display.

# HISTORY

**ttyrec** was originally developed by **Satoru Takabayashi** in the early **2000s** in Japan. It became popular in the Unix community for creating terminal demonstrations and tutorials. An enhanced version (ovh-ttyrec) was later developed by OVH with additional features like locking and real-time streaming support.

# SEE ALSO

[ttyplay](/man/ttyplay)(1), [ttytime](/man/ttytime)(1), [script](/man/script)(1), [asciinema](/man/asciinema)(1)
