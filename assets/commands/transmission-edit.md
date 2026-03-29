# TAGLINE

Modify torrent file metadata

# TLDR

**Add tracker to torrent**

```transmission-edit -a [http://tracker.example.com/announce] [file.torrent]```

**Delete tracker**

```transmission-edit -d [http://tracker.example.com/announce] [file.torrent]```

**Replace tracker** URL substring

```transmission-edit -r [old_tracker] [new_tracker] [file.torrent]```

**Show current trackers** in a torrent file

```transmission-edit -s [file.torrent]```

# SYNOPSIS

**transmission-edit** [_options_] _torrent_file_

# PARAMETERS

**-a**, **--add** _url_
> Add a tracker announce URL if not already present.

**-d**, **--delete** _url_
> Remove a tracker announce URL.

**-r**, **--replace** _old_ _new_
> Substring search-and-replace within announce URLs.

**-s**, **--list**
> Show current trackers.

**-h**, **--help**
> Show help and exit.

# DESCRIPTION

**transmission-edit** is a command-line utility to modify .torrent files' announce URLs. It can add, remove, or replace tracker URLs in existing torrent files. The **-r** option performs substring matching, which is useful when a tracker changes its domain or your passcode changes. Part of the Transmission BitTorrent client suite.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [transmission-create](/man/transmission-create)(1), [transmission-show](/man/transmission-show)(1), [transmission-daemon](/man/transmission-daemon)(1), [transmission-remote](/man/transmission-remote)(1)

