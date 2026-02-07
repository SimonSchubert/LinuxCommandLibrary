# TAGLINE

text-based console interface for Deluge

# TLDR

**Start interactive** console

```deluge-console```

**Connect to daemon** and list torrents

```deluge-console "connect; info"```

**Add a torrent**

```deluge-console "add [file.torrent]"```

**Pause a torrent**

```deluge-console "pause [torrent_id]"```

**Resume a torrent**

```deluge-console "resume [torrent_id]"```

**Remove a torrent**

```deluge-console "rm [torrent_id]"```

**Show torrent details**

```deluge-console "info -v [torrent_id]"```

# SYNOPSIS

**deluge-console** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command to execute (run interactively if omitted).

**connect** [_HOST_:_PORT_]
> Connect to deluge daemon.

**info** [_-v_]
> Show torrent information.

**add** _TORRENT_
> Add torrent file or magnet link.

**pause** _ID_
> Pause torrent.

**resume** _ID_
> Resume paused torrent.

**rm** _ID_
> Remove torrent.

**config**
> Show/set configuration.

**--help**
> Display help information.

# DESCRIPTION

**deluge-console** is the text-based console interface for the Deluge BitTorrent client. It provides a curses-based interactive mode and supports command execution for scripting.

In interactive mode, it presents a navigable interface for managing torrents with keyboard shortcuts. In command mode, it accepts commands as arguments for non-interactive operation, useful for scripts and automation.

The console connects to the Deluge daemon (deluged) either locally or remotely, providing the same functionality as the GTK client through a terminal interface.

# CONFIGURATION

**~/.config/deluge/**
> Configuration files including console.conf for console-specific settings.

# CAVEATS

Requires deluged daemon running. Interactive mode needs terminal with curses support. Remote connections require proper authentication. Command syntax differs from GTK interface.

# HISTORY

deluge-console was developed as part of the Deluge project to provide terminal access to the BitTorrent client. It addresses the need for headless server management and scripted torrent operations.

# SEE ALSO

[deluge](/man/deluge)(1), [deluged](/man/deluged)(1), [transmission-remote](/man/transmission-remote)(1)
