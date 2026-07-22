# TAGLINE

schedules files to be added to the repository on the next commit

# TLDR

**Add a specific file**

```hg add [file]```

**Add all new files**

```hg add```

**Add files by pattern**

```hg add '*.py'```

**Add files in directory**

```hg add [path/to/directory]```

**Dry run to preview**

```hg add -n [file]```

# SYNOPSIS

**hg** **add** [_options_] [_files_...]

# PARAMETERS

**-n**, **--dry-run**
> Show what would be added without modifying state.

**-I**, **--include** _PATTERN_
> Add only files matching the pattern (repeatable).

**-X**, **--exclude** _PATTERN_
> Skip files matching the pattern (repeatable).

**-S**, **--subrepos**
> Recurse into subrepositories.

# DESCRIPTION

**hg add** schedules files to be added to the repository on the next commit. Without arguments, it adds all new files in the working directory. Use a .hgignore file to exclude files from version control. Added files appear with 'A' status in **hg status** until committed.

# INSTALL

```apt: sudo apt install mercurial```

```dnf: sudo dnf install mercurial```

```pacman: sudo pacman -S mercurial```

```apk: sudo apk add mercurial```

```zypper: sudo zypper install mercurial```

```brew: brew install mercurial```

```nix: nix profile install nixpkgs#mercurial```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hg](/man/hg)(1), [hg-commit](/man/hg-commit)(1), [hg-status](/man/hg-status)(1)

