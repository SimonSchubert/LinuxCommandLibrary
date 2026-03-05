# TAGLINE

Terminal user interface for viewing and controlling Docker containers

# TLDR

**Launch the Docker container viewer**

```oxker```

**Set the update interval** to 500 milliseconds

```oxker -d 500```

**Show raw logs** without ANSI formatting

```oxker -r```

**Connect to a custom Docker socket**

```oxker --host [/path/to/docker.sock]```

# SYNOPSIS

**oxker** [_options_]

# PARAMETERS

**-d** _MILLISECONDS_
> Set the update interval in milliseconds. Default: 1000.

**-r**
> Show raw logs without ANSI formatting.

**-c**
> Attempt to colorize logs.

**-t**
> Remove timestamps from log entries.

**--host** _STRING_
> Custom Docker socket connection path.

**--timezone** _STRING_
> Display logs in the specified timezone.

# DESCRIPTION

**oxker** is a terminal user interface for viewing and controlling Docker containers. It displays a container list, logs, and resource stats in a single screen. You can pause, start, stop, restart, and delete containers directly from the TUI.

# CAVEATS

Requires access to the Docker socket. Running inside Docker itself requires mounting the host's Docker socket as a volume.

# HISTORY

**oxker** was created by **mrjackwills** and is written in **Rust**.

# SEE ALSO

[docker](/man/docker)(1), [lazydocker](/man/lazydocker)(1), [ctop](/man/ctop)(1)
