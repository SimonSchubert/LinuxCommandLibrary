# TAGLINE

Open-source BitTorrent client with web interface

# TLDR

**Launch qBittorrent GUI**

```qbittorrent```

**Open torrent file**

```qbittorrent [file.torrent]```

**Run headless daemon**

```qbittorrent-nox```

**Web UI mode**

```qbittorrent-nox --webui-port=[8080]```

# SYNOPSIS

**qbittorrent** [_options_] [_torrent_files_|_urls_]

**qbittorrent-nox** [_options_]

# PARAMETERS

**--portable**
> Portable mode.

**--no-splash**
> Disable splash screen.

**--webui-port** _port_
> Web UI port (nox only).

**-d**, **--daemon**
> Daemonize (nox only).

**--help**
> Show help.

# DESCRIPTION

**qBittorrent** is a free, open-source BitTorrent client. It provides a Qt-based GUI and a headless version (qbittorrent-nox) with web interface for servers.

# EXAMPLES

```bash
# Launch GUI
qbittorrent

# Open specific torrent
qbittorrent file.torrent

# Start headless daemon
qbittorrent-nox -d

# Web UI on custom port
qbittorrent-nox --webui-port=8090

# Add magnet link
qbittorrent "magnet:?xt=urn:btih:..."
```

# WEB UI

Default: http://localhost:8080
- Username: admin
- Password: (set on first run)

# CONFIGURATION

**~/.config/qBittorrent/**
> Main configuration directory containing settings, RSS feeds, and web UI preferences.

**~/.local/share/qBittorrent/**
> Data directory storing download history, torrent resume data, and logs.

# CAVEATS

Web UI has default credentials. Port forwarding may be needed for best speeds.

# HISTORY

qBittorrent was started by **Christophe Dumez** in 2006 as a Qt-based alternative to uTorrent.

# SEE ALSO

[transmission](/man/transmission)(1), [deluge](/man/deluge)(1), [aria2](/man/aria2)(1)
