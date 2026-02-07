# TAGLINE

Search patterns in tracked files

# TLDR

**Search for pattern**

```git grep "[pattern]"```

**Search with line numbers**

```git grep -n "[pattern]"```

**Case insensitive search**

```git grep -i "[pattern]"```

**Search in specific commit**

```git grep "[pattern]" [commit]```

**Show only filenames**

```git grep -l "[pattern]"```

# SYNOPSIS

**git grep** [_options_] _pattern_ [_revision_] [_--_] [_path_]

# PARAMETERS

_PATTERN_
> Search pattern (regex).

_REVISION_
> Commit/branch to search.

**-n**, **--line-number**
> Show line numbers.

**-i**, **--ignore-case**
> Case insensitive.

**-l**, **--files-with-matches**
> Show only filenames.

**-c**, **--count**
> Show match counts.

**-w**, **--word-regexp**
> Match whole words.

**-e** _PATTERN_
> Pattern argument.

**--help**
> Display help information.

# DESCRIPTION

**git grep** searches tracked files for patterns, optimized specifically for Git repositories. Unlike regular grep, it ignores untracked files and can search any commit in the repository history.

The command is significantly faster on large repositories because it uses Git's index rather than scanning the filesystem directly. It supports the same regex syntax as grep and integrates seamlessly with Git's revision and path specifications.

# CAVEATS

Only searches tracked files. Regex syntax differs from grep. Binary files skipped by default.

# HISTORY

git grep is a core **Git** command providing optimized search that understands git's object model and history.

# SEE ALSO

[grep](/man/grep)(1), [git-log](/man/git-log)(1), [rg](/man/rg)(1)
