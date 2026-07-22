# TAGLINE

Reset and clean working directory

# TLDR

**Clear working directory**

```git clear```

**Clear with force**

```git clear -f```

# SYNOPSIS

**git** **clear** [_options_]

# PARAMETERS

**-f**, **--force**
> Force without confirmation.

# DESCRIPTION

**git clear** is a **git-extras** command that combines **git clean -d -f -x** and **git reset --hard** into a single convenience command. It removes all uncommitted changes, tracked and untracked, including files matched by **.gitignore**, returning the repository to a pristine state matching **HEAD**.

This is the most aggressive of the git-extras clearing commands: **git reset --hard** alone only touches tracked files, and **git-clear-soft** spares ignored files, but **git clear** wipes everything not committed. By default it asks **"Sure? - This command may delete files that cannot be recovered, including those in .gitignore [y/N]:"** before proceeding.

The operation is destructive and cannot be undone, as it permanently deletes uncommitted work. The **-f** flag bypasses the confirmation prompt, allowing automated scripts to clean repositories without user interaction. Use with caution in repositories containing valuable uncommitted work or ignored build artifacts you meant to keep.

# CAVEATS

Irreversibly deletes untracked and ignored files alongside the hard reset; there is no undo. Requires **git-extras** to be installed.

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

[git-clear-soft](/man/git-clear-soft)(1), [git-reset](/man/git-reset)(1), [git-clean](/man/git-clean)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-clear)```

<!-- verified: 2026-07-17 -->

