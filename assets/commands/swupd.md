# TAGLINE

Clear Linux software update and bundle manager

# TLDR

**Update** to latest version

```sudo swupd update```

Check for **available updates**

```swupd check-update```

**List** installed bundles

```swupd bundle-list```

**Search** for a package

```swupd search -b [package]```

**Install** a bundle

```sudo swupd bundle-add [bundle]```

**Remove** a bundle

```sudo swupd bundle-remove [bundle]```

**Verify** and repair system files

```sudo swupd verify```

Show **system info**

```swupd info```

# SYNOPSIS

**swupd** _command_ [_OPTIONS_]

# COMMANDS

**update** [_version_]
> Update to latest or specified version

**check-update**
> Check for available updates

**bundle-list** [**--all**]
> List installed (or all available) bundles

**bundle-add** _bundle_
> Install a bundle

**bundle-remove** _bundle_
> Remove a bundle

**search** _term_
> Find bundles containing search term

**info**
> Display version and update server info

**diagnose**
> Verify system files against manifest

**repair**
> Fix detected file mismatches

**autoupdate**
> Enable/disable automatic updates

**clean**
> Remove cached files

# PARAMETERS

**-b**
> Search for bundles (with search)

**--all**
> Show all available bundles (with bundle-list)

**--force**
> Force operation

**--no-scripts**
> Skip post-update scripts

**-h, --help**
> Display help

# DESCRIPTION

**swupd** is the software update and bundle management tool for Clear Linux. Unlike traditional package managers, swupd manages bundles (collections of related packages) and uses file-level versioning similar to git, where each OS version represents a complete, consistent snapshot.

Updates are highly efficient, downloading only changed files using binary deltas. The tool can verify system integrity, repair corrupted files, and manage automatic updates.

# CAVEATS

Requires network connectivity to update servers. Bundles include all dependencies; you cannot install individual packages. OS version numbers are not semantic; each represents a complete system state. Some bundles are large.

# HISTORY

**swupd** was developed by **Intel** for **Clear Linux**, a performance-optimized Linux distribution first released in **2015**. Clear Linux pioneered stateless computing and efficient update mechanisms. The swupd tool exemplifies Clear Linux's approach to software management with atomic updates and file-level verification.

# SEE ALSO

[flatpak](/man/flatpak)(1), [dnf](/man/dnf)(8), [apt](/man/apt)(8)
