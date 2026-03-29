# TAGLINE

Backup and restore installed package states

# TLDR

**Clone** the package state of the current system into a directory

```sudo apt-clone clone [path/to/directory]```

Clone with packages not available in **repositories**

```sudo apt-clone clone --with-dpkg-repack [path/to/directory]```

**Restore** the package state from a clone file

```sudo apt-clone restore [path/to/apt-clone-state-hostname.tar.gz]```

Restore into a **specific directory** (debootstrap)

```sudo apt-clone restore [path/to/clone.tar.gz] --destination [path/to/directory]```

Show **information** about a clone file

```apt-clone info [path/to/apt-clone-state-hostname.tar.gz]```

Restore and **upgrade** to a new distribution release

```sudo apt-clone restore-new-distro [path/to/clone.tar.gz] [new_distro_codename]```

# SYNOPSIS

**apt-clone** _command_ [_options_]

# DESCRIPTION

**apt-clone** creates and restores backups of the installed package state on Debian-based systems. It captures information about installed packages, their versions, and repository sources, enabling system migration or recovery.

Clone files are compressed tar archives containing package lists and APT source configurations. This allows replicating a system's software configuration on another machine or after a fresh installation.

# SUBCOMMANDS

**clone** _destination_
> Create a clone file of the current package state into the specified destination directory.

**restore** _source_ [**--destination** _path_]
> Restore packages from a clone file. Optionally debootstrap into a specific directory.

**restore-new-distro** _source_ _new_distro_codename_
> Restore a clone file while attempting to upgrade packages to a new distribution release.

**info** _source_
> Display information about a clone file.

# PARAMETERS

**--source** _path_
> Specify an alternative source directory for cloning (default is /).

**--destination** _path_
> Specify the destination directory for restore (debootstraps the clone into this directory).

**--with-dpkg-repack**
> Include package files for packages no longer available in repositories.

**--with-dpkg-status**
> Include the full dpkg status file.

**-h**, **--help**
> Show help message and exit.

**--debug**
> Enable debug output.

# CAVEATS

Restoring a clone on a different release version may fail due to package incompatibilities; use **restore-new-distro** for cross-release restores. The clone and restore operations require root privileges. An active internet connection is needed to download packages during restore. Packages not available in configured repositories will be skipped unless **--with-dpkg-repack** was used during cloning.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [apt-get](/man/apt-get)(8), [apt-mark](/man/apt-mark)(8)
