# TAGLINE

Manage CRUX Linux ports collection

# TLDR

**Update** ports tree

```ports -u```

**List** ports in current tree

```ports -l```

**Check which collection** contains a package

```ports -l | grep [package]```

Show **differences** between installed and ports

```ports -d```

# SYNOPSIS

**ports** [**-u**|**-l**|**-d**]

# PARAMETERS

**-u**
> Update the ports tree in /usr/ports from configured sources. Must be run as root.

**-l**
> List all ports in the current tree

**-d**
> Show differences between installed packages and ports

# DESCRIPTION

**ports** manages the ports collection on CRUX Linux. The ports tree contains build recipes (Pkgfiles) for software packages. This tool synchronizes the local ports tree in `/usr/ports/` with remote repositories, using the rsync, httpup or git driver chosen by the extension of each file in `/etc/ports/`.

Collections are enabled by renaming their file, for example `contrib.rsync.inactive` to `contrib.rsync`.

The differences option helps identify packages that need updating or are installed from outside the ports system.

# CAVEATS

CRUX-specific tool. Requires network access for updates. Driver scripts are in `/etc/ports/drivers/`. **prt-get sync** is an alternative to **ports -u**. Does not build or install packages directly; use **prt-get** or **pkgmk** for that.

# HISTORY

**ports** is part of the CRUX Linux package management system. CRUX uses a ports-based system inspired by BSD, where package recipes are downloaded and built locally.

# SEE ALSO

[pkgmk](/man/pkgmk)(8), [pkgadd](/man/pkgadd)(8), [prt-get](/man/prt-get)(8)

# RESOURCES

```[Homepage](https://crux.nu/)```

```[Documentation](https://crux.nu/Main/Documentation)```

<!-- verified: 2026-11-09 -->
