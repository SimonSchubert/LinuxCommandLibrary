# TAGLINE

Search Arch repositories for file ownership

# TLDR

**Synchronize** pkgfile database

```sudo pkgfile --update```

Search for package **owning a file**

```pkgfile [filename]```

**List files** provided by a package

```pkgfile --list [package]```

List **executables** in a package

```pkgfile --list --binaries [package]```

**Case-insensitive** search

```pkgfile --ignorecase [filename]```

Search in **bin/sbin** directories only

```pkgfile --binaries [filename]```

Search with **version** display

```pkgfile --verbose [filename]```

Search in a **specific repository**

```pkgfile --repo [core] [filename]```

# SYNOPSIS

**pkgfile** [**--update**] [**--list**] [**--binaries**] [**--verbose**] [**--repo** _repo_] _target_

# PARAMETERS

**-u, --update**
> Synchronize pkgfile database

**-l, --list**
> List files in package

**-b, --binaries**
> Only search/list executables

**-i, --ignorecase**
> Case-insensitive matching

**-v, --verbose**
> Show package version

**-R, --repo** _repo_
> Search specific repository

**-g, --glob**
> Enable shell-style glob pattern matching

**-r, --regex**
> Enable regular expression matching

**-d, --directories**
> Include directories in search results

**-q, --quiet**
> Suppress error messages

**-0, --null**
> Delimit output with null bytes

# DESCRIPTION

**pkgfile** searches for packages in the official Arch Linux repositories that contain a specific file. It maintains its own database of file-to-package mappings for fast lookups.

The tool is commonly used to find which package provides a missing command or file. It can also list all files a package contains, useful for understanding package contents before installation.

# CAVEATS

Database must be synchronized before use. Only searches official repositories, not AUR. Database updates require root privileges. Large database may take time to download initially.

# HISTORY

**pkgfile** was created for Arch Linux to provide fast file-to-package lookups. It offers similar functionality to `pacman -F` but with a dedicated database optimized for this purpose.

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(1), [makepkg](/man/makepkg)(8)
