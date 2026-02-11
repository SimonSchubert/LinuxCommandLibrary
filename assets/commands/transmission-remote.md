# TAGLINE

Control Transmission daemon remotely

# TLDR

**List all torrents**

```transmission-remote -l```

**Add a torrent**

```transmission-remote -a [path/to/file.torrent]```

**Add a magnet link**

```transmission-remote -a "[magnet:?xt=urn:btih:...]"```

**Start a specific torrent** by ID

```transmission-remote -t [id] -s```

**Pause a torrent**

```transmission-remote -t [id] -S```

**Remove a torrent** (keep downloaded files)

```transmission-remote -t [id] -r```

**Remove a torrent and delete files**

```transmission-remote -t [id] -rad```

**Connect to remote daemon** with authentication

```transmission-remote [host:port] --auth [user:password] -l```

# SYNOPSIS

**transmission-remote** [_host:port_] [**--auth** _user:pass_] [**-t** _id_] [_options_]

# PARAMETERS

**-l**, **--list**
> List all torrents with status, progress, and speeds.

**-a** _file_, **--add** _file_
> Add a torrent file or magnet URI.

**-t** _id_
> Select torrent(s) by ID. Can be single ID, range (1-5), comma list (1,3,5), or 'all'.

**-s**, **--start**
> Start the selected torrent(s).

**-S**, **--stop**
> Stop (pause) the selected torrent(s).

**-r**, **--remove**
> Remove the selected torrent(s) but keep downloaded files.

**-rad**, **--remove-and-delete**
> Remove the selected torrent(s) and delete downloaded files.

**-d** _limit_, **--downlimit** _limit_
> Set global download speed limit in KB/s.

**-u** _limit_, **--uplimit** _limit_
> Set global upload speed limit in KB/s.

**--auth** _user:pass_
> Provide authentication credentials for the daemon.

**--port** _port_
> Connect to specified RPC port (default: 9091).

**--ssl**
> Use SSL/TLS for the RPC connection.

**-i**, **--info**
> Show detailed information about the selected torrent.

**-if**, **--info-files**
> List files in the selected torrent.

**-ip**, **--info-peers**
> List connected peers for the selected torrent.

# DESCRIPTION

**transmission-remote** is a command-line utility for controlling the Transmission BitTorrent daemon remotely. It connects to transmission-daemon (default: localhost:9091) to manage torrents, configure settings, and monitor transfer status.

The tool provides full control over the daemon including adding and removing torrents, starting and stopping transfers, setting speed limits, viewing detailed torrent information, and managing individual files within torrents. Multiple torrents can be selected using the **-t** option with IDs, ranges, or 'all'.

Authentication can be provided via the **--auth** option, the TR_AUTH environment variable, or a .netrc file. For remote daemons, specify the host and port as the first argument.

# CAVEATS

Requires transmission-daemon to be running. Default connection is localhost:9091; remote connections may require firewall configuration. Authentication credentials in command-line arguments may be visible to other users via process listings; prefer environment variables or .netrc for sensitive environments.

# HISTORY

**transmission-remote** was developed as part of the **Transmission** project, which began in **2005**. The remote control utility was created to enable headless operation of the BitTorrent client, allowing system administrators to manage torrent downloads on servers without graphical interfaces. It has become a standard tool for automated torrent management in scripts and server environments.

# SEE ALSO

[transmission-daemon](/man/transmission-daemon)(1), [transmission-cli](/man/transmission-cli)(1), [transmission-create](/man/transmission-create)(1), [transmission-show](/man/transmission-show)(1)
