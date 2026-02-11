# TAGLINE

Lightweight BitTorrent client suite

# TLDR

**Start GTK client**

```transmission-gtk```

**Start Qt client**

```transmission-qt```

**Start daemon**

```transmission-daemon```

**Control daemon**

```transmission-remote```

**Download torrent**

```transmission-cli [file.torrent]```

**Add torrent to daemon**

```transmission-remote -a [file.torrent]```

**List torrents**

```transmission-remote -l```

# SYNOPSIS

**transmission-gtk** | **transmission-qt** | **transmission-daemon** | **transmission-remote** | **transmission-cli**

# COMMANDS

**transmission-gtk**
> GTK GUI client.

**transmission-qt**
> Qt GUI client.

**transmission-daemon**
> Background daemon.

**transmission-remote**
> Remote control.

**transmission-cli**
> CLI client.

**transmission-create**
> Create torrents.

**transmission-show**
> Show torrent info.

# DESCRIPTION

**Transmission** is a lightweight, cross-platform BitTorrent client known for its simplicity and low resource usage. All of its interface variants — GTK, Qt, web, CLI, and daemon — share the same core backend engine, providing consistent behavior regardless of how the client is accessed.

The desktop GUI clients (transmission-gtk and transmission-qt) offer a graphical interface for managing torrents. For headless servers, transmission-daemon runs in the background and can be controlled through a built-in web interface or the transmission-remote command-line tool. The standalone transmission-cli provides simple single-torrent downloading without requiring a daemon.

Additional utilities include transmission-create for building new torrent files, transmission-show for inspecting torrent metadata, and transmission-edit for modifying existing torrent files. The suite supports features like peer exchange, DHT, magnet links, encryption, and bandwidth scheduling.

# CAVEATS

Different packages for each interface. Daemon needs configuration. Port forwarding may be needed.

# HISTORY

**Transmission** was created in **2005** focusing on simplicity and low resource usage. It became popular for its clean design and cross-platform support.

# SEE ALSO

[transmission-remote](/man/transmission-remote)(1), [aria2c](/man/aria2c)(1), [qbittorrent](/man/qbittorrent)(1)
