# TAGLINE

Sort package index files

# TLDR

**Sort** a Packages file

```apt-sortpkgs [Packages] > [Packages.sorted]```

Sort **Sources** file

```apt-sortpkgs -s [Sources] > [Sources.sorted]```

# SYNOPSIS

**apt-sortpkgs** [_-s_] _file_

# DESCRIPTION

**apt-sortpkgs** sorts Debian package index files (Packages or Sources files) into a consistent order. This is useful for comparing files or ensuring reproducible output.

The tool reads the index file, sorts packages alphabetically by name, and outputs the sorted version.

# PARAMETERS

**-s**, **--source**
> Treat input as Sources file instead of Packages

**-o** _option_
> Set configuration option

**-c** _file_
> Read additional configuration

# CAVEATS

Primarily used for repository maintenance and comparison. Not needed for normal APT operation. Large files may consume significant memory.

# HISTORY

**apt-sortpkgs** is part of the APT suite, useful for repository maintainers who need deterministic index file ordering.

# INSTALL

```apt: sudo apt install apt-utils```

```dnf: sudo dnf install apt-utils```

```pacman: sudo pacman -S apt```

```apk: sudo apk add apt```

```brew: brew install apt```

```nix: nix profile install nixpkgs#apt```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apt-ftparchive](/man/apt-ftparchive)(1)
