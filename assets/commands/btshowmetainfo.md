# TLDR

**Display torrent file information**

```btshowmetainfo [file.torrent]```

**Show detailed information about multiple torrents**

```btshowmetainfo [file1.torrent] [file2.torrent]```

# SYNOPSIS

**btshowmetainfo** _torrent_file_...

# DESCRIPTION

**btshowmetainfo** displays metadata from BitTorrent .torrent files. It shows essential information about the torrent including the announce URL (tracker), file names, sizes, piece length, and info hash.

The tool parses the bencoded torrent file and presents information in a human-readable format. For multi-file torrents, it lists all contained files with their individual sizes. The info hash uniquely identifies the torrent across the BitTorrent network.

Information displayed includes:
- **Announce URL**: Tracker server address
- **Name**: Torrent name (directory name for multi-file)
- **Files**: List of files with sizes
- **Piece length**: Size of each piece for integrity checking
- **Info hash**: Unique torrent identifier

# CAVEATS

This tool is part of the original BitTorrent client package, which may not be installed by default on modern systems. Alternatives like **transmission-show** or **aria2c --show-files** provide similar functionality. Only shows static metadata; cannot determine seeder/leecher counts or download status.

# HISTORY

btshowmetainfo was included with the original **BitTorrent** client written by **Bram Cohen**, who invented the BitTorrent protocol in **2001**. The tool was part of the reference implementation used to demonstrate and debug the protocol. While the original client has been superseded by more feature-rich alternatives, these utilities remain useful for examining torrent files.

# SEE ALSO

[transmission-show](/man/transmission-show)(1), [aria2c](/man/aria2c)(1), [qbittorrent](/man/qbittorrent)(1)
