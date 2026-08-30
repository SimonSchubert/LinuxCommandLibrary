# TAGLINE

modern package management utility for Debian-based systems, serving

# TLDR

**Refresh** the package lists

```sudo nala update```

**Install** packages, with a readable summary of what will change

```sudo nala install [package1] [package2]```

Install **without prompting**

```sudo nala install -y [package]```

**Preview** an operation without carrying it out

```sudo nala install --simulate [package]```

**Upgrade** the whole system

```sudo nala upgrade```

**Search** names and descriptions

```nala search [pattern]```

Show a package's **details**

```nala show [package]```

List the packages that are **currently installed**

```nala list --installed```

**Remove** a package together with its configuration

```sudo nala purge [package]```

Remove **everything no longer needed**, configuration included

```sudo nala autopurge```

Rank the mirrors and keep the **fastest ones**

```sudo nala fetch```

Inspect one **past transaction**

```nala history info [3]```

**Undo** a past transaction

```sudo nala history undo [3]```

Delete the **downloaded archives**

```sudo nala clean```

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
