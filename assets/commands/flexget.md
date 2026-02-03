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

# DESCRIPTION

**flexget** is a multipurpose automation tool for downloading, organizing, and managing media content. Supports torrents, podcasts, series tracking, and more.

# SEE ALSO

[transmission-cli](/man/transmission-cli)(1)

