# TAGLINE

Search and download torrents from your terminal

# TLDR

**Start the TUI** with the configured default indexer

```torrra```

**Search for torrents**

```torrra search "[arch linux iso]"```

**Download from a magnet URI**

```torrra download "[magnet:?xt=...]"```

**Download a torrent file** to a chosen directory

```torrra download "[path/to/file.torrent]" --save-path [path/to/directory]```

**Open the downloads view**

```torrra downloads```

**Start with Jackett** as the indexer

```torrra jackett --url [http://localhost:9117] --api-key [api_key]```

**Set the default indexer**

```torrra config set indexers.default [jackett]```

**Open the config file** in an editor

```torrra config edit```

# SYNOPSIS

**torrra** [**--no-cache**] [_command_] [_options_]

# PARAMETERS

**search** _query_
> Search for torrents directly from the command line.

**download** _magnet-uri-or-file_
> Download from a magnet URI, URL, or local .torrent file. **--save-path** _DIR_ sets the destination directory.

**downloads**
> Open the Downloads view directly.

**jackett**, **prowlarr**
> Start with that indexer. **--url** and **--api-key** set the server details.

**config** **get** _key_, **set** _key_ _value_, **list**, **edit**
> Read, change, list, or open the settings in **config.toml**.

**--no-cache**
> Disable the search cache.

**--version**
> Show the version and exit.

**--help**
> Show the help message.

# DESCRIPTION

**torrra** is a TUI tool for searching and downloading torrents directly from the terminal, powered by Jackett/Prowlarr and Libtorrent. It features a Textual-based interface with pause/resume support, configurable indexers and themes, and per-torrent download directories.

# CAVEATS

The command and package are spelled with three r's: **torrra**. An unrelated torrent client named **torra** exists on PyPI. A running Jackett or Prowlarr instance is required for search, and Python 3.10 to 3.13 is required because libtorrent has no wheels for 3.14 yet.

# HISTORY

**torrra** was created by **stabldev** and is written in **Python**.

# SEE ALSO

[rtorrent](/man/rtorrent)(1), [transmission-cli](/man/transmission-cli)(1), [aria2](/man/aria2)(1)

# RESOURCES

```[Source code](https://github.com/stabldev/torrra)```

```[Documentation](https://torrra.readthedocs.io/en/latest/)```

<!-- verified: 2026-11-09 -->
