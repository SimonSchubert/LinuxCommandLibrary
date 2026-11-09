# TAGLINE

Streaming torrent client for the terminal

# TLDR

**Download torrent**

```webtorrent download "[magnet:?xt=...]"```

**Download to directory**

```webtorrent download [file.torrent] -o [./downloads]```

**Stream to player**

```webtorrent download [magnet] --vlc```

**Stream to Chromecast**

```webtorrent download [magnet] --chromecast```

**List files** in a torrent

```webtorrent download [magnet] -s```

**Download one file** by index

```webtorrent download [magnet] -s [0]```

**Limit bandwidth** and keep seeding (kB/s)

```webtorrent download [magnet] -d [500] -u [100] --keep-seeding```

**Seed file**

```webtorrent seed [file.mp4]```

**Show torrent info**

```webtorrent info [file.torrent]```

**Create torrent**

```webtorrent create [file.mp4]```

# SYNOPSIS

**webtorrent** [_command_] _torrent-id_ [_options_]

# PARAMETERS

**download** _TORRENT_
> Download torrent.

**downloadmeta** _TORRENT_
> Download torrent metadata only.

**seed** _FILE_
> Seed a file or folder.

**info** _TORRENT_
> Show info.

**create** _FILE_
> Create torrent.

**-o**, **--out** _DIR_
> Output directory.

**--vlc**
> Open in VLC.

**--mpv**
> Open in mpv.

**--chromecast**
> Cast to Chromecast.

**--airplay**
> Cast to AirPlay.

**--dlna**, **--mplayer**, **--iina**, **--smplayer**, **--omx**, **--xbmc**
> Stream to the named device or player.

**--stdout**
> Stream to standard output (implies --quiet).

**-s**, **--select** [_N_]
> Select file index; without a value, list files.

**-i**, **--interactive-select**
> Select a file interactively.

**-t**, **--subtitles** _FILE_
> Load a subtitles file.

**-p**, **--port** _PORT_
> HTTP server port. Default 8000.

**-a**, **--announce** _URL_
> Tracker URL to announce to.

**-b**, **--blocklist** _FILE_
> Load a blocklist file or URL.

**-d**, **--download-limit** _KBPS_
> Maximum download speed in kB/s.

**-u**, **--upload-limit** _KBPS_
> Maximum upload speed in kB/s.

**-q**, **--quiet**
> Do not show the UI on stdout.

**--keep-seeding**
> Do not quit when the download is done.

**--on-done** _SCRIPT_
> Run a script after the download is done.

**--player-args** _ARGS_
> Add player-specific arguments.

# DESCRIPTION

**webtorrent** is a torrent client that can download files to disk or stream them directly to media players like VLC and mpv while the download is still in progress. It supports both traditional BitTorrent peers and WebRTC-based browser peers.

The download command saves torrent contents to a specified directory, while streaming options like --vlc or --mpv open the media in the corresponding player as data arrives. Casting to Chromecast and AirPlay devices is also supported for streaming to TV screens.

The seed command shares local files over the BitTorrent network, and the create command generates new .torrent files. The tool accepts magnet links, torrent files, and info hashes as input.

# CAVEATS

Streaming needs sufficient bandwidth. The default output location is the current directory when downloading and a temporary folder when streaming. **download** is the default command, so it can be omitted.

# HISTORY

**WebTorrent** was created by **Feross Aboukhadijeh** to bring torrents to browsers. The CLI extends functionality to Node.js.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [aria2c](/man/aria2c)(1), [vlc](/man/vlc)(1)

# RESOURCES

```[Homepage](https://webtorrent.io/)```

```[Source code](https://github.com/webtorrent/webtorrent-cli)```

<!-- verified: 2026-11-09 -->
