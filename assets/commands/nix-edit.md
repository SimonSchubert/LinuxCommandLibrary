# TAGLINE

opens the Nix expression for a package in your editor

# TLDR

**Edit package definition**

```nix edit nixpkgs#[package]```

**Edit with specific editor**

```EDITOR=vim nix edit nixpkgs#[package]```

# SYNOPSIS

**nix edit** _installable_ [_options_]

# PARAMETERS

_installable_
> Package to edit (e.g., nixpkgs#hello).

# DESCRIPTION

**nix edit** opens the Nix expression for a package in your editor. Useful for inspecting or modifying package definitions. Uses $EDITOR environment variable.

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-search](/man/nix-search)(1)

