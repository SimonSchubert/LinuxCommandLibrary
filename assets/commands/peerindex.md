# TAGLINE

extracts and analyzes peer information from BitTorrent files

# TLDR

**Analyze torrent peer data**

```peerindex [file.torrent]```

**Show verbose output**

```peerindex -v [file.torrent]```

**Export peer list**

```peerindex -o [peers.txt] [file.torrent]```

**Analyze multiple torrents**

```peerindex [file1.torrent] [file2.torrent]```

# SYNOPSIS

**peerindex** [_-v_] [_-o file_] [_options_] _torrent-files_

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**-o**, **--output** _FILE_
> Output file.

**-q**, **--quiet**
> Minimal output.

**-h**, **--help**
> Show help.

# DESCRIPTION

**peerindex** extracts and analyzes peer information from BitTorrent files. It shows tracker URLs and embedded peer data.

Torrent files may contain cached peer addresses. This reveals swarm participants without connecting to trackers.

Tracker analysis shows all announce URLs. Multi-tracker setups display tier information.

The tool aids in understanding torrent structure. Useful for network forensics and research.

# CAVEATS

Peer data may be outdated. Not all torrents contain peer caches. Analysis is passive and doesn't contact network.

# HISTORY

**peerindex** is part of BitTorrent analysis toolsets used for network research and forensics.

# SEE ALSO

[transmission-show](/man/transmission-show)(1), [aria2c](/man/aria2c)(1), [btshowmetainfo](/man/btshowmetainfo)(1)
