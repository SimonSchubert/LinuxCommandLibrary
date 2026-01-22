# TLDR

**Start Deluge daemon**

```deluged```

**Start daemon on specific** port

```deluged -p [58846]```

**Start in foreground**

```deluged -d```

**Use specific config** directory

```deluged -c [~/.config/deluge]```

**Start with logging** to file

```deluged -l [/var/log/deluged.log]```

**Enable debug logging**

```deluged -L debug```

# SYNOPSIS

**deluged** [_options_]

# PARAMETERS

**-p**, **--port** _PORT_
> Daemon listen port (default: 58846).

**-i**, **--interface** _IP_
> Interface to listen on.

**-d**, **--do-not-daemonize**
> Run in foreground.

**-c**, **--config** _DIR_
> Configuration directory.

**-l**, **--logfile** _FILE_
> Log to specified file.

**-L**, **--loglevel** _LEVEL_
> Log level: none, error, warning, info, debug.

**-P**, **--pidfile** _FILE_
> PID file location.

**--help**
> Display help information.

# DESCRIPTION

**deluged** is the daemon component of the Deluge BitTorrent client. It handles all BitTorrent protocol operations and runs in the background, allowing clients to connect for management.

The daemon architecture allows Deluge to run on headless servers with clients connecting remotely. Multiple clients (GTK, web, console) can connect to the same daemon simultaneously. Downloads continue even when clients disconnect.

deluged listens on a configurable port for client connections and handles authentication, ensuring secure access to the torrent management functions.

# CAVEATS

Requires proper port configuration for remote access. Firewall rules may need adjustment. Authentication must be configured for secure remote access. Resource usage depends on active torrent count.

# HISTORY

deluged is the core component of the Deluge BitTorrent client, developed since **2006**. The daemon/client separation was a key design decision enabling flexible deployment scenarios from desktop use to dedicated seedboxes.

# SEE ALSO

[deluge](/man/deluge)(1), [deluge-console](/man/deluge-console)(1), [deluge-web](/man/deluge-web)(1)
