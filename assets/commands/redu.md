# TAGLINE

TUI for analyzing restic backup repository disk usage

# TLDR

**Analyze a restic repository**

```redu [path/to/restic/repo]```

# SYNOPSIS

**redu** [_options_] _repository_

# DESCRIPTION

**redu** is a terminal user interface for analyzing restic backup repositories. It aggregates data from all snapshots to identify space-consuming files, folders, and items across backups. Features include a file-tree browsing interface, size comparisons across snapshots, marking files for exclusion, and a caching system for faster subsequent runs.

# CAVEATS

Requires **restic** to be installed. Only works with restic backup repositories.

# HISTORY

**redu** was created by **drdo** and is written in **Rust**.

# SEE ALSO

[restic](/man/restic)(1), [ncdu](/man/ncdu)(1), [du](/man/du)(1)
