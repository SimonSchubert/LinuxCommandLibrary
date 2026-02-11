# TAGLINE

Headless BitTorrent client daemon

# TLDR

**Start the daemon**

```transmission-daemon```

**Start with authentication**

```transmission-daemon --auth --username [user] --password [pass]```

**Start with web interface port**

```transmission-daemon --port [9091]```

**Specify download directory**

```transmission-daemon --download-dir [/path/to/downloads]```

**Allow specific IP addresses**

```transmission-daemon --allowed "[127.0.0.1,192.168.*.*]"```

**Watch directory for torrents**

```transmission-daemon --watch-dir [/path/to/watch]```

**Run in foreground**

```transmission-daemon -f```

**Require encryption**

```transmission-daemon --encryption-required```

# SYNOPSIS

**transmission-daemon** [_options_]

# PARAMETERS

**-g**, **--config-dir** _dir_
> Configuration directory location.

**-a**, **--allowed** _list_
> Comma-separated whitelist of allowed IPs (supports wildcards).

**-b**, **--blocklist**
> Enable peer blocklists.

**-t**, **--auth**
> Require authentication.

**-u**, **--username** _name_
> Authentication username.

**-v**, **--password** _pass_
> Authentication password.

**-p**, **--port** _port_
> RPC/web interface port (default: 9091).

**-w**, **--download-dir** _dir_
> Default download directory.

**--incomplete-dir** _dir_
> Directory for incomplete downloads.

**--watch-dir** _dir_
> Watch directory for new .torrent files.

**-er**, **--encryption-required**
> Require encrypted connections.

**-ep**, **--encryption-preferred**
> Prefer encrypted connections.

**-f**, **--foreground**
> Run in foreground.

**--dump-settings**
> Dump current settings to stderr.

**-h**, **--help**
> Display help.

# DESCRIPTION

**transmission-daemon** is a headless BitTorrent client that runs as a background daemon. It provides full BitTorrent functionality controlled via RPC interface, accessible through the web interface or transmission-remote command.

The daemon supports magnet links, DHT, peer exchange, encryption, and bandwidth scheduling. Configuration is stored in settings.json in the config directory.

The web interface (default: http://localhost:9091) provides a graphical way to manage torrents. For command-line control, use transmission-remote to add, remove, and manage torrents.

Stop the daemon before editing settings.json manually, as changes are overwritten on exit.

# CONFIGURATION

**~/.config/transmission-daemon/settings.json**
> Main configuration file in JSON format containing all daemon settings including download paths, speed limits, peer options, and RPC authentication.

**-g**, **--config-dir** _dir_
> Override the default configuration directory location.

**TRANSMISSION_HOME**
> Environment variable to override the default config directory path.

# CAVEATS

Settings file is overwritten when daemon exits. Web interface requires authentication in production. Default port 9091 should be firewalled from public access. Blocklist updates require daemon restart.

# HISTORY

**Transmission** was created in 2005 and is one of the oldest actively maintained BitTorrent clients. The daemon mode enables headless operation for servers and NAS devices. It is known for its lightweight resource usage and cross-platform support.

# SEE ALSO

[transmission-remote](/man/transmission-remote)(1), [transmission-cli](/man/transmission-cli)(1), [rtorrent](/man/rtorrent)(1)
