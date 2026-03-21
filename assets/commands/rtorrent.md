# TAGLINE

Terminal-based BitTorrent client

# TLDR

**Start rtorrent** and load a torrent file or magnet link

```rtorrent [path/to/file.torrent]```

**Start a download** (within rtorrent)

```Ctrl+s```

**Stop a download** (within rtorrent)

```Ctrl+d```

**View details** about a selected torrent

```Right Arrow```

**Close** rtorrent safely

```Ctrl+q```

**Set a download directory** on startup

```rtorrent -d [path/to/download/directory]```

# SYNOPSIS

**rtorrent** [_options_] [_torrent_|_magnet_]

# PARAMETERS

**-d** _directory_
> Set the default download directory.

**-n**
> Do not load the ~/.rtorrent.rc configuration file on startup.

**-o** _key=value_
> Set a configuration option directly from the command line.

**-s** _directory_
> Session directory for saving torrent state between restarts.

# DESCRIPTION

**rtorrent** is a text-based BitTorrent client that runs in the terminal. It provides torrent downloading with a curses-based interface for monitoring and managing downloads.

Use keyboard shortcuts to control downloads: Ctrl+s to start, Ctrl+d to stop or remove (press twice to delete with data), and Ctrl+q to quit safely. Press the right arrow key to view detailed information about a selected torrent, and left arrow to return to the main view.

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

[transmission-cli](/man/transmission-cli)(1), [aria2c](/man/aria2c)(1), [deluge](/man/deluge)(1)
