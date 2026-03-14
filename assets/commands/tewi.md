# TAGLINE

Text-based interface for BitTorrent clients

# TLDR

**Connect to the default Transmission daemon**

```tewi```

**Connect to a qBittorrent instance**

```tewi --client-type qbittorrent --port [8080]```

**Connect to a Deluge instance via Web API**

```tewi --client-type deluge --port [8112]```

**Connect to a remote host**

```tewi --host [192.168.1.10] --port [9091]```

**Use a specific configuration profile**

```tewi --profile [myprofile]```

# SYNOPSIS

**tewi** [**--host** _host_] [**--port** _port_] [**--client-type** _type_] [**--profile** _name_]

# DESCRIPTION

**tewi** is a terminal UI for managing BitTorrent daemons including Transmission, qBittorrent, and Deluge from a single interface. It supports multiple view modes (card, compact, oneline), torrent management operations, category and tag management, alternative speed limit switching, and search integration with Jackett, Prowlarr, and bitmagnet. Configuration profiles allow managing multiple daemon connections.

# HISTORY

**tewi** was created by **Anton Larionov** (anlar) and is written in **Python**. Version 2.0 added Deluge support and configuration profiles.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [superseedr](/man/superseedr)(1), [rtorrent](/man/rtorrent)(1)
