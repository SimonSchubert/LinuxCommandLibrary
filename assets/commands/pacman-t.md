# TAGLINE

short form of **pacman --deptest**, which checks if specified dependencies are

# TLDR

This command is an alias of **pacman --deptest**

View documentation for the original command

```tldr pacman deptest```

# SYNOPSIS

**pacman -T** [_options_] [_package(s)_]

# DESCRIPTION

**pacman -T** is the short form of **pacman --deptest**, which checks if specified dependencies are satisfied on the system. It returns the names of packages that are not installed or don't meet version requirements.

# INSTALL

```apt: sudo apt install pacman-package-manager```

```dnf: sudo dnf install pacman```

```pacman: sudo pacman -S pacman```

```apk: sudo apk add pacman```

```nix: nix profile install nixpkgs#pacman```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pacman](/man/pacman)(8), [pacman-deptest](/man/pacman-deptest)(8)
