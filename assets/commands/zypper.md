# TLDR

**Synchronize** list of packages and versions available

```sudo zypper refresh```

**Install** a new package

```sudo zypper install [package]```

**Remove** a package

```sudo zypper remove [package]```

**Upgrade** installed packages to newest available versions

```sudo zypper update```

**Search** for a package via keyword

```zypper search [keyword]```

**Show** information about configured repositories

```zypper repos --sort-by-priority```

# SYNOPSIS

**zypper** [_global-options_] _command_ [_command-options_] [_arguments_]

# PARAMETERS

**ref, refresh**
> Refresh all repositories

**in, install _package_**
> Install packages

**rm, remove _package_**
> Remove packages

**up, update**
> Update installed packages

**se, search _pattern_**
> Search for packages

**lr, repos**
> List all configured repositories

**dup, dist-upgrade**
> Perform distribution upgrade

**--no-confirm**
> Don't ask for confirmation

**--sort-by-priority**
> Sort repository list by priority

# DESCRIPTION

**zypper** is the command-line package management utility for SUSE and openSUSE Linux. It provides complete package management including installation, removal, updates, and repository management.

Zypper supports dependency resolution, patch management, and can handle distribution upgrades. It uses the libzypp library and is the CLI frontend for YaST software management.

# CAVEATS

Requires root privileges for package operations. Repository refresh (**zypper ref**) should be run before updates. Distribution upgrades (**zypper dup**) should be done carefully.

# SEE ALSO

[rpm](/man/rpm)(8), [yast2](/man/yast2)(8)
