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

**Transmission** is a lightweight BitTorrent client. Multiple interfaces share the same backend.

GUI clients provide visual interface. GTK and Qt versions available.

Daemon mode runs headlessly. Control via web interface or CLI.

Remote commands manage the daemon. Add torrents, check status.

CLI mode downloads directly. Simple single-torrent usage.

# CAVEATS

Different packages for each interface. Daemon needs configuration. Port forwarding may be needed.

# HISTORY

**Transmission** was created in **2005** focusing on simplicity and low resource usage. It became popular for its clean design and cross-platform support.

# SEE ALSO

[transmission-remote](/man/transmission-remote)(1), [aria2c](/man/aria2c)(1), [qbittorrent](/man/qbittorrent)(1)
