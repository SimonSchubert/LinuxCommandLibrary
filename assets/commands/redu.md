# TAGLINE

TUI for analyzing restic backup repository disk usage

# TLDR

**Analyze a restic repository** (uses RESTIC_REPOSITORY env var)

```redu```

**Analyze a specific** repository

```redu -r [path/to/restic/repo]```

**Use a password file**

```redu -r [path/to/repo] --password-file [path/to/pwfile]```

**Disable caching** for this run

```redu --no-cache```

# SYNOPSIS

**redu** [_options_]

# PARAMETERS

**-r, --repo** _path_
> Path or URL to the restic repository. Defaults to **RESTIC_REPOSITORY**.

**--password-file** _file_
> Read repository password from file. Defaults to **RESTIC_PASSWORD_FILE**.

**--password-command** _cmd_
> Command whose output is used as the repository password.

**--no-cache**
> Do not use or write to the redu cache.

**-h, --help**
> Display help information.

**-V, --version**
> Show version information.

# DESCRIPTION

**redu** is a terminal user interface for analyzing restic backup repositories. It aggregates data from all snapshots to identify space-consuming files, folders, and items across backups. Features include a file-tree browsing interface, size comparisons across snapshots, marking files for exclusion, and a caching system for faster subsequent runs.

# CAVEATS

Requires a readable restic repository. Initial scan can be slow on large repositories; subsequent runs benefit from redu's on-disk cache.

# HISTORY

**redu** was created by **drdo** and is written in **Rust**.

# SEE ALSO

[restic](/man/restic)(1), [ncdu](/man/ncdu)(1), [du](/man/du)(1)
