# TAGLINE

queries the files database to find which packages own specific files

# TLDR

**Update** files database

```sudo pacman -Fy```

**Find** package owning file

```pacman -F filename```

Find using **regex**

```pacman -Fx 'regex'```

List package **names** only

```pacman -Fq filename```

**List** files in package

```pacman -Fl package```

# SYNOPSIS

**pacman -F** [_OPTIONS_] [_FILE_...]

# DESCRIPTION

**pacman -F** (files) queries the files database to find which packages own specific files or to list files contained in packages. This works even for packages that are not installed.

# PARAMETERS

**-F, --files**
> Query the files database

**-y, --refresh**
> Download fresh files database from the server

**-l, --list**
> List files owned by the specified package

**-x, --regex**
> Interpret the search pattern as a regular expression

**-q, --quiet**
> Show only package names without repository

# CAVEATS

The files database must be updated separately from the sync database using **-Fy**. This database can be large and updates may take time. For finding files from installed packages, use **pacman -Qo** instead.

# HISTORY

**pacman** is the package manager for **Arch Linux** and its derivatives. The files database feature allows searching for files across all available packages.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-query](/man/pacman-query)(8), [pkgfile](/man/pkgfile)(1)
