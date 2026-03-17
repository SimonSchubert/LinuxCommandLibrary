# TAGLINE

streams torrents directly

# TLDR

**Stream a torrent to the default player**

```peerflix "[magnet_link]"```

**Stream to VLC**

```peerflix "[torrent_file]" --vlc```

**Stream to mpv**

```peerflix "[magnet_link]" --mpv```

**Select a specific file by index**

```peerflix "[magnet_link]" -i [1]```

**List files in the torrent**

```peerflix "[magnet_link]" -l```

**Stream with subtitles**

```peerflix "[magnet_link]" --vlc -t [subtitles.srt]```

# SYNOPSIS

**peerflix** [_options_] _torrent_

# PARAMETERS

_TORRENT_
> Torrent file or magnet link.

**--vlc**
> Open stream in VLC.

**--mplayer**
> Open stream in MPlayer.

**--mpv**
> Open stream in mpv.

**-i** _INDEX_, **--index** _INDEX_
> File index to stream.

**-l**, **--list**
> List available files in the torrent.

**-t** _FILE_, **--subtitles** _FILE_
> Load subtitles file.

**-a**
> Play all files in the torrent.

**-c** _NUM_, **--connections** _NUM_
> Maximum connected peers (default: 100).

**-p** _PORT_, **--port** _PORT_
> HTTP streaming port (default: 8888).

**--remove**
> Delete files after streaming.

**--help**
> Display help information.

# DESCRIPTION

**peerflix** is a streaming torrent client for Node.js that enables instant playback without waiting for the full download. It prioritizes downloading the initial parts of the file first to allow immediate streaming.

The tool starts a local HTTP server and can pipe the stream to media players like VLC, mpv, or MPlayer. It supports multi-file torrents with file selection and subtitle loading.

# CAVEATS

Requires Node.js. Install via `npm install -g peerflix`. A media player (VLC, mpv, or MPlayer) is needed for playback.

# HISTORY

peerflix was created for **streaming torrent content** without full download.

# SEE ALSO

[webtorrent](/man/webtorrent)(1), [vlc](/man/vlc)(1), [mpv](/man/mpv)(1), [mplayer](/man/mplayer)(1)

