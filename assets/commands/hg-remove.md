# TAGLINE

schedules files for removal from the repository

# TLDR

**Remove file**

```hg remove [file]```

**Remove with force**

```hg remove -f [file]```

**Remove after deletion**

```hg remove -A```

**Remove directory**

```hg remove [directory]```

**Dry run**

```hg remove -n [file]```

# SYNOPSIS

**hg remove** [_options_] _files_

# PARAMETERS

_FILES_
> Files to remove.

**-f**, **--force**
> Remove even if modified.

**-A**, **--after**
> Record removal of missing files.

**-I**, **--include** _PATTERN_
> Include pattern.

**-X**, **--exclude** _PATTERN_
> Exclude pattern.

**-n**, **--dry-run**
> Show what would be done.

**--help**
> Display help information.

# DESCRIPTION

**hg remove** schedules files for removal from the repository. The files are deleted from the working directory and marked for removal on next commit.

The -A flag records removal of files already deleted from the filesystem. Force removes modified files.

# CAVEATS

Removal requires commit. History preserved. Use forget to just untrack.

# HISTORY

Remove is a core **Mercurial** command for managing tracked files since version 1.0.

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

[hg](/man/hg)(1), [hg-add](/man/hg-add)(1)
