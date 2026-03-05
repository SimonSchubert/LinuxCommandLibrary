# TAGLINE

Command-line BitTorrent metainfo utility

# TLDR

**Create a torrent file**

```imdl torrent create --input [path/to/content]```

**View torrent file info**

```imdl torrent show [path/to/file.torrent]```

**Verify torrent content**

```imdl torrent verify --input [path/to/content] [path/to/file.torrent]```

**Create with a specific tracker**

```imdl torrent create --input [path/to/content] --announce [udp://tracker.example.com:6969]```

# SYNOPSIS

**imdl** _command_ [_options_]

# DESCRIPTION

**intermodal** (binary name **imdl**) is a user-friendly and featureful command-line BitTorrent metainfo utility. It supports creation, viewing, and verification of **.torrent** files. The tool handles single-file and multi-file torrents, supports multiple trackers, and can create both v1 and v2 torrent files.

imdl provides detailed output including file listings, piece information, tracker URLs, and content hashes, making it useful for torrent creation, inspection, and debugging.

# CAVEATS

Only handles torrent metainfo files; does not download or seed torrents. Creating torrents for large files may take time due to piece hashing.

# HISTORY

**intermodal** was created by **Casey Rodarmor** (creator of **just** and **ord**) and is written in **Rust**. It is released under the **Creative Commons Zero** public domain dedication.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [aria2c](/man/aria2c)(1)
