# TAGLINE

Terminal-based BitTorrent client

# TLDR

Add a **torrent or magnet** link

```rtorrent torrent_or_magnet```

**Start** the download

```Ctrl+s```

**View details** about downloading torrent

```Right Arrow```

**Close** rtorrent safely

```Ctrl+q```

# SYNOPSIS

**rtorrent** [_options_] [_torrent_|_magnet_]

# DESCRIPTION

**rtorrent** is a text-based BitTorrent client that runs in the terminal. It provides torrent downloading with a curses-based interface for monitoring and managing downloads.

Use keyboard shortcuts to control downloads: Ctrl+s to start, Ctrl+d to stop, Ctrl+q to quit safely.

# CONFIGURATION

**~/.rtorrent.rc**
> Main configuration file controlling download directories, connection limits, port ranges, DHT settings, and throttle rates.

**/etc/rtorrent/rtorrent.rc**
> System-wide configuration file used as fallback when no user config exists.

# CAVEATS

Configuration via ~/.rtorrent.rc file. Requires proper port forwarding for optimal speeds. Support for magnet links requires DHT enabled.

# HISTORY

Written in C++ as a high-performance console BitTorrent client. Popular for headless servers and scripted environments.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [aria2c](/man/aria2c)(1)
