# TAGLINE

minecraft server management CLI

# TLDR

**List configured** servers

```mcli server list```

**Show server info**

```mcli server info [server]```

**Start a server**

```mcli server start [server]```

**Stop a server**

```mcli server stop [server]```

**Attach to the server** console

```mcli server attach [server]```

**Create a backup**

```mcli backup create [server]```

**Tail server** logs

```mcli log [server]```

# SYNOPSIS

**mcli** _command_ [_subcommand_] [_options_]

# PARAMETERS

**server**
> Manage server lifecycle: list, info, start, stop, restart, attach.

**backup**
> Create, list, or restore server backups.

**log**
> Show or tail server logs.

**config**
> Read or modify mcli/server configuration.

**--help**
> Display help information.

# DESCRIPTION

**mcli** is a command-line interface for managing one or more Minecraft server instances on a Linux host. It wraps the server JAR lifecycle, console attachment, world backups, and per-instance configuration behind a single CLI.

Servers are typically defined in a configuration file or directory; `mcli server list` enumerates them, and the `start`/`stop`/`attach` subcommands act on a named instance. Backups are produced from the world directory while the server is running or stopped, depending on configuration.

# CAVEATS

Requires a working Java runtime to launch the underlying server JAR. The user running mcli needs read/write access to the server directories. Console attachment usually depends on **screen** or **tmux** being installed.

# HISTORY

**mcli** is a community-built tool that grew out of the practical need to script Minecraft server admin tasks on Linux machines, replacing ad-hoc shell wrappers around `screen` and the server JAR.

# INSTALL

```pacman: sudo pacman -S minio-client```

```apk: sudo apk add minio-client```

```zypper: sudo zypper install minio-client```

```nix: nix profile install nixpkgs#minio-client```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[java](/man/java)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)
