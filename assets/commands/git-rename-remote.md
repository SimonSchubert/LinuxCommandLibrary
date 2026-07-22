# TAGLINE

Rename a Git remote

# TLDR

**Rename remote**

```git rename-remote [old_name] [new_name]```

# SYNOPSIS

**git** **rename-remote** _old_name_ _new_name_

# DESCRIPTION

**git rename-remote** renames a Git remote. Part of git-extras, it is a convenience wrapper around `git remote rename`.

# CAVEATS

Requires git-extras to be installed. The standard `git remote rename` command provides equivalent functionality and is available in all Git installations.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-remote](/man/git-remote)(1), [git-extras](/man/git-extras)(1)
