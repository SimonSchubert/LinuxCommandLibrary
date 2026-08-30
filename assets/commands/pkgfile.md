# TAGLINE

Search Arch repositories for file ownership

# TLDR

**Refresh** the file database, which is required before the first search

```sudo pkgfile --update```

Find which package **provides a file**

```pkgfile [/usr/bin/ss]```

Search only the **executables** in `bin` and `sbin`

```pkgfile --binaries [ss]```

Match with a **glob** pattern

```pkgfile --glob [*/libssl.so*]```

Match with a **regular expression**

```pkgfile --regex [libc.*\.so]```

Ignore **case** while searching

```pkgfile --ignorecase [readme]```

List **everything a package installs**

```pkgfile --list [openssh]```

List only the **executables a package installs**

```pkgfile --list --binaries [openssh]```

Restrict the search to **one repository**

```pkgfile --repo [extra] [filename]```

Show the **package version** alongside each match

```pkgfile --verbose [/usr/bin/ss]```

Print **unformatted output** for scripts

```pkgfile --raw [/usr/bin/ss]```

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

# INSTALL

```pacman: sudo pacman -S pkgfile```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(1), [makepkg](/man/makepkg)(8)
