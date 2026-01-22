# TLDR

**Preview files to remove**

```git clean -n```

**Remove untracked files**

```git clean -f```

**Remove untracked directories**

```git clean -fd```

**Remove ignored files**

```git clean -fX```

**Interactive clean**

```git clean -i```

# SYNOPSIS

**git clean** [_options_] [_path_]

# PARAMETERS

**-n**, **--dry-run**
> Show what would be removed.

**-f**, **--force**
> Actually remove files.

**-d**
> Remove untracked directories.

**-x**
> Remove ignored files too.

**-X**
> Remove only ignored files.

**-i**, **--interactive**
> Interactive mode.

**-e** _PATTERN_
> Exclude pattern.

**--help**
> Display help information.

# DESCRIPTION

**git clean** removes untracked files from the working tree. It cleans up generated files, build artifacts, and other files not tracked by git.

The command requires -f to actually delete files, preventing accidental data loss. Dry run mode (-n) shows what would be removed. Options control whether ignored files and directories are included.

git clean resets the working directory to tracked-only state.

# CAVEATS

**Deleted files cannot be recovered.** Always use -n first. Force required to prevent accidents.

# HISTORY

git clean is a core **Git** command for maintaining clean working directories, particularly useful for build cleanup and fresh starts.

# SEE ALSO

[git-status](/man/git-status)(1), [git-reset](/man/git-reset)(1), [gitignore](/man/gitignore)(5)
