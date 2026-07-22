# TAGLINE

Reset and clean the working directory, preserving ignored files

# TLDR

**Clear working directory** (prompts for confirmation)

```git clear-soft```

# SYNOPSIS

**git** **clear-soft**

# DESCRIPTION

**git clear-soft** is a **git-extras** command that discards all uncommitted work: it removes untracked files and directories and resets tracked files back to **HEAD**. It is the gentler sibling of **git-clear**, since it leaves files matched by **.gitignore** untouched instead of deleting them too.

Under the hood it runs **git clean -d -f** followed by **git reset --hard**, after asking **"Sure? - This command may delete files that cannot be recovered. Files and directories in .gitignore will be preserved [y/N]:"**. Unlike **git-clear**, it takes no **-f**/**--force** flag, so the confirmation prompt cannot be skipped and the command cannot be used non-interactively.

# CAVEATS

Destructive and irreversible for untracked, non-ignored files: they are deleted, not stashed. Only available when **git-extras** is installed; it is not part of core Git.

# HISTORY

git clear-soft was added to **git-extras**, the community-maintained collection of Git utility scripts, as a less destructive alternative to **git-clear** that spares ignored files.

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

[git-clear](/man/git-clear)(1), [git-reset](/man/git-reset)(1), [git-clean](/man/git-clean)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-clear-soft)```

<!-- verified: 2026-07-17 -->
