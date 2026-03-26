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

**--no-splash**
> Disable splash screen on startup (GUI only).

**--webui-port=**_port_
> Set Web UI port (default: 8080).

**-d**, **--daemon**
> Run as daemon in the background (nox only).

**--version**
> Show version number.

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
- Password: adminadmin (should be changed on first login)

# CONFIGURATION

**~/.config/qBittorrent/**
> Main configuration directory containing settings, RSS feeds, and web UI preferences.

**~/.local/share/qBittorrent/**
> Data directory storing download history, torrent resume data, and logs.

# CAVEATS

Web UI ships with default credentials (admin/adminadmin); change the password immediately. Port forwarding may be needed for best download/upload speeds.

# HISTORY

qBittorrent was started by **Christophe Dumez** in 2006 as a Qt-based alternative to uTorrent.

# SEE ALSO

[transmission](/man/transmission)(1), [deluge](/man/deluge)(1), [aria2c](/man/aria2c)(1), [rtorrent](/man/rtorrent)(1)
