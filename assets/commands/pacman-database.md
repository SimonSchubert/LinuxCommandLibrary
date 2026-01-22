# TLDR

Mark as **dependency**

```sudo pacman -D --asdeps package```

Mark as **explicitly** installed

```sudo pacman -D --asexplicit package```

**Check** dependencies

```pacman -Dk```

Check **sync** database

```pacman -Dkk```

Check in **quiet** mode

```pacman -Dkq```

# SYNOPSIS

**pacman -D** [_OPTIONS_] [_PACKAGE_...]

# DESCRIPTION

**pacman -D** (database) operates directly on the package database, allowing modification of package attributes without reinstalling. It can change installation reason and verify database integrity.

# PARAMETERS

**-D, --database**
> Operate on the package database

**--asdeps**
> Mark packages as installed as dependencies

**--asexplicit**
> Mark packages as explicitly installed

**-k, --check**
> Check local database for consistency

**-kk**
> Also check sync databases

**-q, --quiet**
> Suppress normal output, show only errors

# CAVEATS

Marking packages incorrectly can affect orphan detection. Use **--asdeps** carefully as those packages may be removed when cleaning orphans. Double **-k** performs a more thorough check including sync databases.

# HISTORY

**pacman** is the package manager for **Arch Linux** and its derivatives.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-query](/man/pacman-query)(8)
