# TAGLINE

Reset current HEAD to a specified state

# TLDR

**Unstage files**

```git reset [file]```

**Soft reset (keep changes staged)**

```git reset --soft [commit]```

**Mixed reset (unstage changes)**

```git reset [commit]```

**Hard reset (discard changes)**

```git reset --hard [commit]```

**Reset to upstream**

```git reset --hard @{u}```

**Unstage all files**

```git reset HEAD```

**Reset single file to commit**

```git reset [commit] -- [file]```

# SYNOPSIS

**git** **reset** [_options_] [_commit_] [_--_] [_files_...]

# PARAMETERS

**--soft**
> Keep changes staged.

**--mixed**
> Unstage changes (default).

**--hard**
> Discard all changes.

**--keep**
> Reset but keep local changes.

**--merge**
> Reset to merge state.

**-p**, **--patch**
> Interactive reset.

**--recurse-submodules**
> Update submodule working trees to match the superproject.

# DESCRIPTION

**git reset** moves the current HEAD to a specified state. It can unstage files, undo commits, or completely discard changes depending on the mode used.

The three main modes are `--soft` (keeps changes staged), `--mixed` (unstages changes, the default), and `--hard` (discards all changes). When given file paths, it unstages those files without moving HEAD.

# CAVEATS

Hard reset discards changes permanently. Be careful with --hard on uncommitted work.

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

[git-checkout](/man/git-checkout)(1), [git-revert](/man/git-revert)(1), [git-restore](/man/git-restore)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-reset)```

<!-- verified: 2026-07-17 -->
