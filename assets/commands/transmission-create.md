# TLDR

**Create a torrent with a tracker**

```transmission-create -o [output.torrent] -t [http://tracker.example.com/announce] [file_or_directory]```

**Create with multiple trackers**

```transmission-create -o [output.torrent] -t [tracker1] -t [tracker2] [file_or_directory]```

**Create a private torrent**

```transmission-create -p -o [output.torrent] -t [tracker] [file_or_directory]```

**Create with comment**

```transmission-create -c "[My torrent description]" -o [output.torrent] -t [tracker] [file]```

**Create with custom piece size**

```transmission-create -s [2048] -o [output.torrent] -t [tracker] [file]```

**Create with custom name**

```transmission-create -n "[Custom Name]" -o [output.torrent] -t [tracker] [file]```

# SYNOPSIS

**transmission-create** [_options_] _file_|_directory_

# PARAMETERS

**-o**, **--outfile** _file_
> Save the generated .torrent to this filename.

**-t**, **--tracker** _url_
> Add tracker announce URL. Can be used multiple times.

**-p**, **--private**
> Mark torrent as private (for private trackers).

**-c**, **--comment** _text_
> Add a comment to the torrent metadata.

**-s**, **--piecesize** _KiB_
> Set piece size in KiB (default auto-calculated).

**-n**, **--name** _name_
> Override default torrent name derived from source.

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Display version and exit.

# DESCRIPTION

**transmission-create** generates .torrent files from files or directories. It's part of the Transmission BitTorrent client suite and provides command-line torrent creation without needing the GUI.

The tool calculates SHA1 checksums for all pieces in the source content and bundles them with tracker information into the torrent file. Piece size is automatically selected based on content size but can be overridden.

Multiple trackers can be added for redundancy. Private torrents disable DHT and peer exchange, requiring users to obtain peers only from the specified trackers.

# CAVEATS

Large files take time to hash. At least one tracker is required for most use cases. Private flag cannot be changed after creation. Piece size affects torrent file size and download granularity.

# HISTORY

**transmission-create** is part of the Transmission project, an open-source BitTorrent client started in 2005. The CLI tools were developed to allow automation and server-side torrent management without requiring a graphical interface.

# SEE ALSO

[transmission-show](/man/transmission-show)(1), [transmission-daemon](/man/transmission-daemon)(1), [transmission-remote](/man/transmission-remote)(1), [mktorrent](/man/mktorrent)(1)
