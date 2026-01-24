# TLDR

**Download torrent**

```webtorrent download "[magnet:?xt=...]"```

**Download to directory**

```webtorrent download [file.torrent] -o [./downloads]```

**Stream to player**

```webtorrent download [magnet] --vlc```

**Stream to Chromecast**

```webtorrent download [magnet] --chromecast```

**Seed file**

```webtorrent seed [file.mp4]```

**Show torrent info**

```webtorrent info [file.torrent]```

**Create torrent**

```webtorrent create [file.mp4]```

# SYNOPSIS

**webtorrent** _command_ [_--vlc_|_--mpv_] [_-o dir_] [_options_] _torrent_

# PARAMETERS

**download** _TORRENT_
> Download torrent.

**seed** _FILE_
> Seed file.

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

**-s**, **--select** _N_
> Select file index.

# DESCRIPTION

**webtorrent** downloads and streams torrents. It works in browsers and Node.js.

Download mode saves to disk. Standard torrent behavior.

Streaming plays while downloading. VLC, mpv, or cast devices.

Seeding shares files via torrent. Creates swarm for distribution.

WebRTC support enables browser peers. Works alongside BitTorrent.

# CAVEATS

Some trackers not supported. Streaming needs sufficient bandwidth. Browser version is different.

# HISTORY

**WebTorrent** was created by **Feross Aboukhadijeh** to bring torrents to browsers. The CLI extends functionality to Node.js.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [aria2c](/man/aria2c)(1), [vlc](/man/vlc)(1)
