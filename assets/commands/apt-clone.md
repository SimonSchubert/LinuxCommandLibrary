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

**Simulate** a restore without changing the system

```sudo apt-clone restore --simulate [path/to/clone.tar.gz]```

Show **differences** between a clone file and the system

```sudo apt-clone show-diff [path/to/clone.tar.gz]```

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

**show-diff** _source_ [**--destination** _path_]
> Show the difference between a clone file and the system.

**info** _source_
> Display information about a clone file.

# PARAMETERS

**--source** _path_
> Source directory of the system or chroot for **clone** (default is /).

**--destination** _path_
> Destination directory for **restore**, **restore-new-distro** and **show-diff** (default is /).

**--with-dpkg-repack**
> Add packages that can no longer be downloaded to the state bundle, using dpkg-repack. This can make the bundle rather big.

**--with-dpkg-status**
> Include a full copy of the dpkg status file, mostly useful for debugging.

**--extra-files** _glob_...
> Include extra files in the clone.

**--simulate**
> Only simulate **restore** or **restore-new-distro**.

**--exclude** _package_...
> Exclude the listed packages from **restore**.

**--rewrite-server** _url_
> Rewrite all URIs in sources.list to the given URL during **restore**.

**-h**, **--help**
> Show help message and exit.

**--debug**
> Enable debug output.

# CAVEATS

Restoring a clone on a different release version may fail due to package incompatibilities; use **restore-new-distro** for cross-release restores. The clone and restore operations require root privileges. An active internet connection is needed to download packages during restore. Packages not available in configured repositories will be skipped unless **--with-dpkg-repack** was used during cloning.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [apt-get](/man/apt-get)(8), [apt-mark](/man/apt-mark)(8)

# RESOURCES

```[Source code](https://github.com/mvo5/apt-clone)```

<!-- verified: 2026-11-09 -->
