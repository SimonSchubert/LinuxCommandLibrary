# TAGLINE

modern package management utility for Debian-based systems, serving

# TLDR

**Install** a package

```sudo nala install [package]```

**Remove** a package

```sudo nala remove [package]```

**Purge** a package (remove with config files)

```sudo nala purge [package]```

**Search** for packages

```nala search "[pattern]"```

**Update and upgrade** the system

```sudo nala upgrade```

**Remove unused packages**

```sudo nala autoremove```

**Fetch fast mirrors**

```sudo nala fetch```

Display **transaction history**

```nala history```

# SYNOPSIS

**nala** _command_ [_options_] [_packages_]

# COMMANDS

**install _packages_**
> Install packages or update to latest version

**remove _packages_**
> Remove packages

**purge _packages_**
> Remove packages and their configuration files

**update**
> Update package list from repositories

**upgrade**
> Update package list and upgrade installed packages

**search _pattern_**
> Search package names and descriptions using regex or glob

**show _packages_**
> Display package information

**autoremove**
> Remove unused packages and dependencies

**autopurge**
> Autoremove with purge (removes config files)

**fetch**
> Fetch and select fast mirrors

**history**
> Display transaction history

**clean**
> Clear package cache

# PARAMETERS

**--assume-yes, -y**
> Assume yes to all prompts

**--download-only, -d**
> Download packages without installing

**--no-install-recommends**
> Do not install recommended packages

**--install-suggests**
> Also install suggested packages

**--verbose, -v**
> Enable verbose output

**--debug**
> Enable debug output

# DESCRIPTION

**nala** is a modern package management utility for Debian-based systems, serving as a front-end for apt and the python-apt API. It provides improved formatting, parallel downloads, and a cleaner interface compared to traditional apt.

Features include transaction history for reviewing and undoing changes, parallel downloads for faster operations, and the fetch command for automatically selecting fast mirrors based on latency and throughput testing.

# CAVEATS

Nala wraps apt and requires the same privileges. Not all apt features are exposed through nala. The fetch command modifies /etc/apt/sources.list. Transaction history is stored locally and can be used to undo/redo operations.

# HISTORY

**nala** was developed by the **Volian Linux** project, first released in **December 2021**. It was created to provide a more user-friendly interface to apt with better visual output, inspired by the dnf package manager's formatting.

# SEE ALSO

[apt](/man/apt)(8), [apt-get](/man/apt-get)(8), [dpkg](/man/dpkg)(1)
