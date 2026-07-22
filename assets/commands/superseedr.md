# TAGLINE

Modern BitTorrent client for the terminal

# TLDR

**Launch the TUI client**

```superseedr```

**Add a magnet link**

```superseedr add "[magnet:?xt=urn:btih:...]"```

**Add a torrent file**

```superseedr add [/path/to/file.torrent]```

**List configured torrents**

```superseedr torrents```

**List the files of a torrent** by info hash

```superseedr files [info_hash]```

**Gracefully stop the running client**

```superseedr stop-client```

# SYNOPSIS

**superseedr** [_command_] [_options_]

# DESCRIPTION

**superseedr** is a modern BitTorrent client featuring a high-performance 60 FPS terminal UI, real-time swarm observability with bandwidth graphs and peer analytics, and Docker with Gluetun VPN integration. It supports BitTorrent v2, RSS feed tracking, and 40+ built-in themes.

Run without arguments, **superseedr** opens the interactive terminal UI. While it is running you can add content by pasting a magnet link or torrent path, or by running the `add` subcommand from another terminal, which hands the input to the live instance. The remaining subcommands provide a scriptable interface for managing torrents and the shared/standalone configuration. Add **--json** to any subcommand to get structured output.

# COMMANDS

**add** [**--path** _PATH_] [**--validated**] _input_...
> Add one or more torrent file paths or magnet links. **--path** persists an existing download path for the inputs; **--validated** treats data as already verified when rebuilding a catalog.

**torrents**
> List configured torrents.

**info** _info_hash_|_path_
> Show a single torrent by info hash or unique file path.

**files** _info_hash_|_path_
> List the files for a torrent, including relative and resolved full paths.

**stop-client**
> Request a graceful shutdown of the running client.

**to-shared** _PATH_ / **to-standalone**
> Convert between layered shared config (rooted at _PATH_) and local standalone config.

# HISTORY

**superseedr** was created by **Jagalite** and is written in **Rust**. It is distributed via `cargo install superseedr`, Homebrew, the AUR, and platform installers.

# INSTALL

```brew: brew install superseedr```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1), [transmission-remote](/man/transmission-remote)(1), [rtorrent](/man/rtorrent)(1), [aria2](/man/aria2)(1), [deluge](/man/deluge)(1)
