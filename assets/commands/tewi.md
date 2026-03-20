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

**tewi** [**--host** _host_] [**--port** _port_] [**--client-type** _type_] [**--profile** _name_] [**--help**]

# PARAMETERS

**--host** _host_
> Daemon host address (default: localhost)

**--port** _port_
> Daemon port (default: 9091 for Transmission)

**--client-type** _type_
> Client type: transmission, qbittorrent, or deluge

**--profile** _name_
> Load a named configuration profile

**--profiles**
> List available configuration profiles

**--badge-max-count** _N_
> Maximum badge count displayed in torrent cards

**--badge-max-length** _N_
> Maximum badge length in torrent cards

**--search-providers** _providers_
> Specify enabled search providers/indexers

**--list-search-providers**
> Display available search providers

**--help**
> Display all available options

# DESCRIPTION

**tewi** is a terminal UI for managing BitTorrent daemons including Transmission, qBittorrent, and Deluge from a single interface. It supports multiple view modes (card, compact, oneline), torrent management operations, category and tag management, alternative speed limit switching, and search integration with Jackett, Prowlarr, and bitmagnet. Configuration profiles allow managing multiple daemon connections.

# HISTORY

**tewi** was created by **Anton Larionov** (anlar) and is written in **Python** (requires Python 3.10+). Install via `pipx install tewi-torrent`. Version 2.0 added Deluge support, configuration profiles, and search provider integration.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [superseedr](/man/superseedr)(1), [rtorrent](/man/rtorrent)(1)
