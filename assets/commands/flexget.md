# TAGLINE

multipurpose media automation tool

# TLDR

**Run all tasks**

```flexget execute```

**Run specific task**

```flexget execute --task [task_name]```

**Test configuration**

```flexget check```

**Start daemon**

```flexget daemon start```

**Stop daemon**

```flexget daemon stop```

**Show task status**

```flexget status```

**List series**

```flexget series list```

# SYNOPSIS

**flexget** [_options_] _command_ [_args_]

# SUBCOMMANDS

**execute**
> Run tasks.

**check**
> Validate config.

**daemon**
> Manage daemon.

**status**
> Show status.

**series**
> Manage series.

**movie-list**
> Manage movie lists.

**entry-list**
> Manage entry lists.

**seen**
> Manage seen entries.

# PARAMETERS

**--task** _name_
> Run specific task.

**-c**, **--config** _file_
> Config file.

**--test**
> Test mode (no actions).

**--no-cache**
> Disable caching.

# CONFIGURATION

**~/.flexget/config.yml**
> Main configuration file defining tasks, feeds, and filters for automation workflows.

# DESCRIPTION

**FlexGet** is a powerful automation tool for managing media content through customizable tasks and plugins. It monitors RSS feeds, torrent sites, and other sources to automatically download and organize TV shows, movies, podcasts, and other media based on user-defined rules and filters.

The tool operates on a task-based system defined in YAML configuration files. Tasks can filter content by quality, series tracking, release groups, or custom patterns. FlexGet integrates with download clients like Transmission, Deluge, and qBittorrent, as well as media management tools like Plex and Kodi.

FlexGet can run as a daemon for continuous monitoring or execute tasks on-demand. It maintains a database of seen entries to prevent duplicate downloads and supports series tracking with automatic episode progression. The plugin architecture enables extensive customization for specific workflows.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1)

