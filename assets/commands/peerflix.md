# TAGLINE

streams torrents directly

# TLDR

**Stream torrent**

```peerflix "[magnet_link]"```

**Stream to VLC**

```peerflix "[torrent_file]" --vlc```

**Stream to mpv**

```peerflix "[magnet_link]" --mpv```

**Select file index**

```peerflix "[magnet_link]" -i [1]```

**List files**

```peerflix "[magnet_link]" -l```

# SYNOPSIS

**peerflix** [_options_] _torrent_

# PARAMETERS

_TORRENT_
> Torrent file or magnet link.

**--vlc**
> Open in VLC.

**--mpv**
> Open in mpv.

**-i** _INDEX_
> File index to stream.

**-l**
> List files.

**-p** _PORT_
> HTTP port.

# DESCRIPTION

**peerflix** streams torrents directly. No download wait required.

The tool provides streaming torrent playback. Node.js based.

# CAVEATS

Requires Node.js. Media player needed. Torrent protocol used.

# HISTORY

peerflix was created for **streaming torrent content** without full download.

# SEE ALSO

[webtorrent](/man/webtorrent)(1), [vlc](/man/vlc)(1), [mpv](/man/mpv)(1)

