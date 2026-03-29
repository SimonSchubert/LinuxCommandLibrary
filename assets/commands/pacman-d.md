# TAGLINE

short form of **pacman --database**, which operates on the package database

# TLDR

**Mark a package as installed as a dependency**

```sudo pacman -D --asdeps [package]```

**Mark a package as explicitly installed**

```sudo pacman -D --asexplicit [package]```

**Check the local database for consistency**

```pacman -Dk```

**Check local and sync databases for consistency**

```pacman -Dkk```

**Check in quiet mode**

```pacman -Dkq```

# SYNOPSIS

**pacman -D** [_options_] _package(s)_

# PARAMETERS

**--asdeps**
> Mark packages as installed as dependencies. Affects orphan detection.

**--asexplicit**
> Mark packages as explicitly installed. Prevents removal when cleaning orphans.

**-k**, **--check**
> Check the local package database for internal consistency. Use twice (`-kk`) to also check sync databases.

**-q**, **--quiet**
> Suppress messages on successful completion; only show errors.

# DESCRIPTION

**pacman -D** is the short form of **pacman --database**, which operates on the package database. It allows modifying package attributes stored in the local database without reinstalling packages.

The most common use is changing a package's install reason between dependency and explicit. Packages marked as dependencies may be removed by `pacman -Rs` when no other packages depend on them, while explicitly installed packages are kept.

# CAVEATS

Marking packages incorrectly can affect orphan detection with `pacman -Qdtq`. Packages marked `--asdeps` may be removed when running `pacman -Rs`.

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-database](/man/pacman-database)(8), [pacman-query](/man/pacman-query)(8)
