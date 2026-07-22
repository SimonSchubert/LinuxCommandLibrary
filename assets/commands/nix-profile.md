# TAGLINE

manages user package profiles in Nix

# TLDR

**List installed packages**

```nix profile list```

**Install package**

```nix profile install [nixpkgs#hello]```

**Remove package**

```nix profile remove [hello]```

**Upgrade packages**

```nix profile upgrade '.*'```

**Rollback profile**

```nix profile rollback```

# SYNOPSIS

**nix profile** _command_ [_options_]

# PARAMETERS

**list**
> List installed packages.

**install** _package_
> Install package.

**remove** _package_
> Remove package.

**upgrade** _regex_
> Upgrade matching packages.

**rollback**
> Rollback to previous generation.

**history**
> Show profile history.

**diff-closures**
> Show changes between generations.

# DESCRIPTION

**nix profile** manages user package profiles in Nix. Modern replacement for nix-env. Installs, removes, and upgrades packages with atomic operations and rollback support.

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-env](/man/nix-env)(1)

