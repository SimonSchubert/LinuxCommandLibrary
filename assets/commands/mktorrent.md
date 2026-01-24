# TLDR

**Create torrent from file**

```mktorrent -a [http://tracker.example.com/announce] [file]```

**Create torrent from directory**

```mktorrent -a [http://tracker.example.com/announce] [directory/]```

**Create with multiple trackers**

```mktorrent -a [tracker1] -a [tracker2] [file]```

**Create private torrent**

```mktorrent -p -a [http://tracker.example.com/announce] [file]```

**Specify piece length**

```mktorrent -l [20] [file]```

**Add web seed**

```mktorrent -w [http://example.com/file] -a [tracker] [file]```

**Create with comment**

```mktorrent -c "[My torrent]" -a [tracker] [file]```

**Verbose output**

```mktorrent -v -a [tracker] [file]```

# SYNOPSIS

**mktorrent** [_-a tracker_] [_-p_] [_-l piece_length_] [_-o output.torrent_] [_options_] _path_

# PARAMETERS

**-a** _URL_
> Tracker announce URL.

**-o** _FILE_
> Output torrent file.

**-p**
> Private torrent (no DHT/PEX).

**-l** _N_
> Piece length as power of 2 (default auto).

**-c** _TEXT_
> Comment.

**-n** _NAME_
> Name in torrent (default: path basename).

**-w** _URL_
> Web seed URL.

**-s** _TEXT_
> Source tag for private trackers.

**-v**
> Verbose output.

**-t** _THREADS_
> Number of threads for hashing.

**-d**
> Don't write creation date.

# DESCRIPTION

**mktorrent** creates BitTorrent metainfo (.torrent) files. It hashes the content and packages file information with tracker details.

The tool calculates piece hashes for file verification. Piece length affects swarm efficiency - larger pieces reduce overhead but delay initial sharing. Auto-selection usually works well.

Multiple trackers provide redundancy. When one tracker is down, clients try others. Private torrents disable DHT and peer exchange, requiring tracker-only operation.

Web seeds provide HTTP fallback when peers are unavailable. They're useful for initial seeding or low-popularity torrents.

The source tag helps private trackers identify torrents from their site. It's embedded in the info dictionary, becoming part of the info hash.

Creation is fast for small files but may take time for large datasets due to hashing requirements.

# CAVEATS

Changing any content after creation invalidates the torrent. Private tracker torrents not interoperable with public. Large piece sizes delay initial piece completion.

# HISTORY

**mktorrent** was written as a lightweight, fast torrent creator. It provides command-line access to torrent creation without requiring a full BitTorrent client.

# SEE ALSO

[transmission-create](/man/transmission-create)(1), [rtorrent](/man/rtorrent)(1), [aria2c](/man/aria2c)(1)
