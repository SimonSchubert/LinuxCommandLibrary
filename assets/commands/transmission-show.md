# TAGLINE

Display torrent file metadata

# TLDR

**Show torrent information**

```transmission-show [file.torrent]```

**Display magnet URI**

```transmission-show -m [file.torrent]```

**Show file list**

```transmission-show -f [file.torrent]```

**Show info hash only**

```transmission-show -i [file.torrent]```

**Show total size**

```transmission-show -s [file.torrent]```

**Query tracker for peer count**

```transmission-show --scrape [file.torrent]```

# SYNOPSIS

**transmission-show** [_options_] _torrent-file_

# PARAMETERS

**-m**, **--magnet**
> Print the magnet URI for the torrent.

**-i**, **--info**
> Print only the info hash.

**-s**, **--size**
> Print total size of all files.

**-f**, **--files**
> Print detailed list of files with paths and sizes.

**-c**, **--comment**
> Print the comment field from metadata.

**-t**, **--tracker**
> Print list of tracker URLs.

**--scrape**
> Query trackers for peer and seeder counts.

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Display version and exit.

# DESCRIPTION

**transmission-show** displays metadata from .torrent files without downloading or seeding. It parses torrent files and presents information including file lists, trackers, piece counts, creation date, and info hashes.

The tool is useful for inspecting torrents before adding them to a client, verifying torrent contents, extracting magnet links, or scripting torrent management tasks. The scrape option queries trackers for current swarm statistics.

Output is formatted for both human readability and script parsing depending on the options used.

# CAVEATS

Scrape queries require network access and functional trackers. Some trackers may not support or respond to scrape requests. Private trackers may require authentication for scrape data.

# HISTORY

**transmission-show** is part of the Transmission BitTorrent client suite, providing command-line inspection of torrent files. Transmission was created in 2005 and the CLI tools enable automation and headless server operation.

# SEE ALSO

[transmission-create](/man/transmission-create)(1), [transmission-daemon](/man/transmission-daemon)(1), [transmission-remote](/man/transmission-remote)(1)
