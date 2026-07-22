# TAGLINE

Show the repository root directory path

# TLDR

**Show repository root**

```git root```

**Change to root directory**

```cd $(git root)```

# SYNOPSIS

**git root**

# DESCRIPTION

**git root** displays the absolute path to the repository's top-level directory. Part of git-extras, it provides a concise alternative to `git rev-parse --show-toplevel`.

The command is useful in scripts that need consistent paths or for quick navigation to the repository root regardless of the current working directory.

# CAVEATS

Part of git-extras package. Alternative: git rev-parse --show-toplevel. Fails outside git repo.

# HISTORY

git root is part of **git-extras**, providing a convenient shorthand for the common operation of finding the repository root.

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

[git-extras](/man/git-extras)(1), [git-rev-parse](/man/git-rev-parse)(1)
