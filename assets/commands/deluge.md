# TAGLINE

lightweight BitTorrent client with plugin architecture

# TLDR

**Launch Deluge** GTK client

```deluge```

**Add a torrent file**

```deluge [file.torrent]```

**Add torrent** via magnet link

```deluge "[magnet:?xt=urn:btih:...]"```

**Start in specific** UI mode

```deluge -u [gtk]```

**Connect to remote** daemon

```deluge -a -c [~/.config/deluge]```

# SYNOPSIS

**deluge** [_options_] [_torrent_...]

# PARAMETERS

_TORRENT_
> Torrent file or magnet link to add.

**-u**, **--ui** _UI_
> User interface: gtk, web, console.

**-c**, **--config** _DIR_
> Configuration directory.

**-l**, **--logfile** _FILE_
> Output log to file.

**-L**, **--loglevel** _LEVEL_
> Logging level: none, error, warning, info, debug.

**-a**, **--auto-add**
> Auto-add torrents from watch directory.

**--help**
> Display help information.

# DESCRIPTION

**deluge** is a lightweight, cross-platform BitTorrent client known for its plugin architecture and multiple interface options. This command launches the GTK graphical interface for managing torrent downloads.

Deluge operates with a daemon/client architecture, allowing the download daemon (deluged) to run independently while clients connect locally or remotely. The GTK client provides a full-featured interface for adding torrents, managing downloads, and configuring settings.

The client supports features like bandwidth scheduling, per-torrent settings, peer exchange, magnet URIs, and encryption. Its plugin system extends functionality with features like labels, notifications, and web seeds.

# CONFIGURATION

**~/.config/deluge/**
> Configuration files including core.conf, gtk-ui.conf, and plugins.

# CAVEATS

Requires deluged daemon running for full functionality. GTK interface requires graphical environment. Some features depend on optional plugins. Remote connections need proper authentication setup.

# HISTORY

Deluge was created in **2006** using Python and GTK. It was designed as a full-featured yet lightweight alternative to other BitTorrent clients, with emphasis on plugin extensibility and cross-platform support.

# SEE ALSO

[deluged](/man/deluged)(1), [deluge-console](/man/deluge-console)(1), [transmission-cli](/man/transmission-cli)(1)
