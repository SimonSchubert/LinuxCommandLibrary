# TLDR

**List tracked files**

```git ls-files```

**List untracked files**

```git ls-files --others```

**List ignored files**

```git ls-files --ignored --exclude-standard```

**List modified files**

```git ls-files --modified```

**List deleted files**

```git ls-files --deleted```

# SYNOPSIS

**git ls-files** [_options_] [_files_]

# PARAMETERS

**--cached**, **-c**
> Show staged files (default).

**--modified**, **-m**
> Show modified files.

**--deleted**, **-d**
> Show deleted files.

**--others**, **-o**
> Show untracked files.

**--ignored**
> Show ignored files.

**--exclude-standard**
> Use standard exclusions.

**--stage**, **-s**
> Show staging info.

**--help**
> Display help information.

# DESCRIPTION

**git ls-files** lists files in the index and working tree. It shows tracked files, untracked files, ignored files, and various file states useful for scripting.

The command provides low-level access to git's file tracking. It's commonly used in scripts to enumerate files matching certain criteria. Various flags control which file states to show.

git ls-files enables programmatic file listing.

# CAVEATS

Shows index state, not commits. Output format varies by options. Useful for scripting.

# HISTORY

git ls-files is a core **Git** plumbing command for inspecting the index, used both directly and by other git commands.

# SEE ALSO

[git-status](/man/git-status)(1), [git-ls-tree](/man/git-ls-tree)(1)
