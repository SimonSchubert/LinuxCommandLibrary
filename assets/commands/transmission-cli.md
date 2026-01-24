# TLDR

**Download a torrent**

```transmission-cli [path/to/file.torrent]```

**Download a magnet link**

```transmission-cli "[magnet:?xt=urn:btih:...]"```

**Download to a specific directory**

```transmission-cli -w [path/to/download/dir] [file.torrent]```

**Download with speed limits** (KB/s)

```transmission-cli -d [500] -u [100] [file.torrent]```

**Download and exit immediately** when complete (don't seed)

```transmission-cli -m [file.torrent]```

**Download with peer blocklist enabled**

```transmission-cli -b [file.torrent]```

**Run in quiet mode**

```transmission-cli -q [file.torrent]```

# SYNOPSIS

**transmission-cli** [**-b**] [**-d** _limit_] [**-u** _limit_] [**-g** _dir_] [**-m**] [**-w** _dir_] [**-q**] _torrent-file_|_magnet-uri_

# PARAMETERS

**-b**, **--blocklist**
> Enable peer blocklists. Transmission understands the bluetack blocklist format.

**-d** _limit_
> Set maximum download speed in KB/s. 0 means unlimited.

**-u** _limit_
> Set maximum upload speed in KB/s. 0 means unlimited.

**-g**, **--config-dir** _dir_
> Directory for configuration files. Allows sharing config between different Transmission clients.

**-m**
> Do not seed after download completes; exit immediately.

**-w** _dir_
> Directory to save downloaded files. Defaults to current directory.

**-q**
> Quiet mode. Suppress most output, show only critical messages.

**-h**, **--help**
> Display help message and exit.

**-v**, **--version**
> Display version number and exit.

# DESCRIPTION

**transmission-cli** is a lightweight, command-line BitTorrent client for downloading and uploading torrents. It supports both .torrent files and magnet URIs, making it suitable for servers, headless systems, and scripted torrent operations.

The client handles a single torrent per invocation, downloading the content and optionally seeding upon completion. Progress is displayed in the terminal showing download/upload speeds, peer connections, and completion percentage.

Configuration is stored in ~/.config/transmission by default, allowing resume functionality if a download is interrupted. The client respects the TRANSMISSION_HOME environment variable for custom config locations and http_proxy for tracker announces.

Sending SIGHUP to a running transmission-cli process contacts the tracker for additional peers.

# CAVEATS

transmission-cli handles only one torrent at a time and is not designed for continuous operation. For managing multiple torrents or running as a service, use **transmission-daemon** with **transmission-remote** instead. The client must remain running for the entire download; closing it will interrupt the transfer.

# HISTORY

**Transmission** was originally created by **Eric Petit** and **Josh Elsasser** in **2005** for macOS, with Linux support following shortly after. The command-line interface was added to provide headless operation capabilities. Transmission became known for its lightweight design and cross-platform support, becoming one of the default BitTorrent clients on many Linux distributions.

# SEE ALSO

[transmission-daemon](/man/transmission-daemon)(1), [transmission-remote](/man/transmission-remote)(1), [transmission-gtk](/man/transmission-gtk)(1)
