# TAGLINE

Backup and restore installed package states

# TLDR

**Clone** the package state of the current system into a directory

```apt-clone clone [path/to/directory]```

Create a **clone file** (.tar.gz) for backup purposes

```apt-clone clone --destination [path/to/backup.tar.gz]```

**Restore** the package state from a clone file

```apt-clone restore [path/to/backup.tar.gz]```

Show **information** about a clone file

```apt-clone info [path/to/backup.tar.gz]```

Restore to a **specific directory** (for testing)

```apt-clone restore [path/to/backup.tar.gz] --destination [path/to/restore]```

# SYNOPSIS

**apt-clone** _command_ [_options_]

# DESCRIPTION

**apt-clone** creates and restores backups of the installed package state on Debian-based systems. It captures information about installed packages, their versions, and repository sources, enabling system migration or recovery.

Clone files are compressed tar archives containing package lists and APT source configurations. This allows replicating a system's software configuration on another machine or after a fresh installation.

# SUBCOMMANDS

**clone**
> Create a backup of the current package state

**restore**
> Restore packages from a clone file

**info**
> Display information about a clone file

# PARAMETERS

**--destination** _path_
> Specify the output location for clone or restore operations

**--with-dpkg-repack**
> Include package files for packages not available in repositories

**--with-dpkg-status**
> Include the full dpkg status file

# CAVEATS

Restoring a clone on a different release version may fail due to package incompatibilities. The restore process requires root privileges and an active internet connection to download packages. Packages not available in configured repositories will be skipped unless **--with-dpkg-repack** was used during cloning.

# SEE ALSO

[apt](/man/apt)(8), [dpkg](/man/dpkg)(1), [apt-get](/man/apt-get)(8)
