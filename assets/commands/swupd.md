# TAGLINE

Clear Linux software update and bundle manager

# TLDR

Show the installed version and whether a **newer one exists**

```swupd check-update```

**Update** the OS to the newest version

```sudo swupd update```

List **every bundle available**, not just the installed ones

```swupd bundle-list --all```

Show what a bundle **contains** before installing it

```swupd bundle-info [bundle]```

**Install** one or more bundles

```sudo swupd bundle-add [bundle1] [bundle2]```

**Remove** bundles

```sudo swupd bundle-remove [bundle1] [bundle2]```

**Repair** files that are damaged or missing

```sudo swupd repair```

Turn **automatic updates off**

```sudo swupd autoupdate --disable```

Free the space used by **cached update data**

```sudo swupd clean```

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
