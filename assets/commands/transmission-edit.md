# TAGLINE

Modify torrent file metadata

# TLDR

**Add tracker to torrent**

```transmission-edit -a [http://tracker.example.com/announce] [file.torrent]```

**Delete tracker**

```transmission-edit -d [http://tracker.example.com/announce] [file.torrent]```

**Replace tracker**

```transmission-edit -r [old_tracker] [new_tracker] [file.torrent]```

# SYNOPSIS

**transmission-edit** [_options_] _torrent_file_

# PARAMETERS

**-a** _url_
> Add tracker URL.

**-d** _url_
> Delete tracker URL.

**-r** _old_ _new_
> Replace tracker URL.

**-s**
> Show current trackers.

# DESCRIPTION

**transmission-edit** modifies torrent file metadata. Add, remove, or replace tracker URLs in existing torrent files. Part of Transmission BitTorrent client suite.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [transmission-create](/man/transmission-create)(1)

