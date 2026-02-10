# TAGLINE

creates Arch Linux packages from PKGBUILD files

# TLDR

**Build** package

```makepkg```

Build and **install dependencies**

```makepkg --syncdeps```

Build, install deps, and **install package**

```makepkg -si```

Build **skipping checksums**

```makepkg --skipchecksums```

**Clean** after build

```makepkg --clean```

**Verify** source checksums

```makepkg --verifysource```

Generate **.SRCINFO**

```makepkg --printsrcinfo > .SRCINFO```

Download source and **deps only**

```makepkg -so```

# SYNOPSIS

**makepkg** [_options_]

# DESCRIPTION

**makepkg** creates Arch Linux packages from PKGBUILD files. It downloads sources, verifies checksums, compiles the software, and creates an installable package for pacman.

# PARAMETERS

**-s, --syncdeps**
> Install missing dependencies with pacman

**-i, --install**
> Install package after building

**-c, --clean**
> Clean up work files after build

**-f, --force**
> Overwrite existing package

**--skipchecksums**
> Skip source checksum verification

**--verifysource**
> Verify source file checksums

**--printsrcinfo**
> Print .SRCINFO to stdout

**--nobuild**
> Download sources but don't build

**--noextract**
> Don't extract sources

# CAVEATS

Must be run from directory containing PKGBUILD. Never run as root. Dependencies require pacman access.

# SEE ALSO

[pacman](/man/pacman)(8), [yay](/man/yay)(1), [paru](/man/paru)(1)
