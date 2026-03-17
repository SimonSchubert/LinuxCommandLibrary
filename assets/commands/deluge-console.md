# TAGLINE

Text-based console interface for the Deluge BitTorrent client

# TLDR

**Start interactive** console

```deluge-console```

**Connect to daemon** and list torrents

```deluge-console "connect; info"```

**Add a torrent** file or magnet link

```deluge-console "add [file.torrent]"```

**Pause a torrent**

```deluge-console "pause [torrent_id]"```

**Resume a torrent**

```deluge-console "resume [torrent_id]"```

**Remove a torrent**

```deluge-console "rm [torrent_id]"```

**Show torrent details**

```deluge-console "info -v [torrent_id]"```

**Run multiple commands** with semicolon separator

```deluge-console "connect [host:port]; add [file.torrent]; info"```

# SYNOPSIS

**deluge-console** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Console command to execute. If omitted, starts interactive curses mode. Multiple commands can be separated with semicolons.

**connect** [_HOST_:_PORT_]
> Connect to a Deluge daemon.

**info** [**-v**]
> Show torrent information. Use **-v** for verbose details.

**add** _TORRENT_
> Add a torrent file or magnet link.

**pause** _ID_
> Pause a torrent.

**resume** _ID_
> Resume a paused torrent.

**rm** _ID_
> Remove a torrent.

**del** _ID_
> Delete a torrent (alias for rm).

**move** _ID_ _PATH_
> Move a torrent's download location.

**recheck** _ID_
> Force a recheck of torrent data.

**reannounce** _ID_
> Force a reannounce to trackers.

**config**
> Show or set daemon configuration.

**status**
> Show session status and transfer rates.

**halt**
> Shut down the connected daemon.

**--help**
> Display help information.

# DESCRIPTION

**deluge-console** is the text-based console interface for the Deluge BitTorrent client. Deluge uses a client/server model, with **deluged** as the daemon process and **deluge-console** as the terminal front-end.

In interactive mode, it presents a curses-based navigable interface for managing torrents with keyboard shortcuts. In command mode, it accepts commands as arguments for non-interactive operation, useful for scripts and automation. Commands can be passed directly on the command line and chained with semicolons.

The console connects to the Deluge daemon either locally or remotely, providing the same functionality as the GTK client through a terminal interface.

# CAVEATS

Requires the **deluged** daemon to be running. Interactive mode needs a terminal with curses support. Remote connections require proper authentication configuration. Command syntax differs from the GTK interface.

# HISTORY

**deluge-console** was developed as part of the Deluge project to provide terminal access to the BitTorrent client. It addresses the need for headless server management and scripted torrent operations.

# SEE ALSO

[deluge](/man/deluge)(1), [deluged](/man/deluged)(1), [transmission-remote](/man/transmission-remote)(1)
