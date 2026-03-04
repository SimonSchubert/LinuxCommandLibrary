# TAGLINE

TUI for searching, adding, and installing cargo crates

# TLDR

**Launch the TUI**

```cargo seek```

**Start with a search term**

```cargo seek -s [query]```

**Search within a specific project directory**

```cargo seek [path/to/project]```

# SYNOPSIS

**cargo seek** [_options_] [_project_dir_]

# PARAMETERS

**-s**, **--search** _term_
> Begin a search automatically on startup

**-f**, **--fps** _float_
> Set frame rate in frames per second (default: 30)

**-t**, **--tps** _float_
> Set tick rate in ticks per second (default: 4)

# DESCRIPTION

**cargo-seek** is a Cargo subcommand that provides a terminal user interface for searching, adding, and installing crates from the crates.io registry. It supports searching in Online, Project, Installed, or All scopes, visually labels project dependencies and installed binaries, and allows adding/removing crates, installing/uninstalling binaries, and opening documentation. Results can be sorted by relevance, name, downloads, or recency.

# SEE ALSO

[cargo](/man/cargo)(1), [cargo-search](/man/cargo-search)(1)
