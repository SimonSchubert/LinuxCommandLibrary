# TLDR

**List all commits**

```git rev-list HEAD```

**Count commits**

```git rev-list --count HEAD```

**List commits in range**

```git rev-list [commit1]..[commit2]```

**List with date order**

```git rev-list --date-order HEAD```

**List reachable from multiple**

```git rev-list [branch1] [branch2] --not [main]```

**First parent only**

```git rev-list --first-parent HEAD```

# SYNOPSIS

**git** **rev-list** [_options_] _commits_... [_--_] [_paths_...]

# PARAMETERS

**--count**
> Show count only.

**--max-count** _n_
> Limit output.

**--since** _date_
> Commits after date.

**--until** _date_
> Commits before date.

**--author** _pattern_
> Filter by author.

**--first-parent**
> Follow first parent only.

**--ancestry-path**
> Show ancestry path.

**--objects**
> Include objects.

# DESCRIPTION

**git rev-list** lists commit objects in reverse chronological order. A low-level command used for enumerating commits and objects.

# SEE ALSO

[git-log](/man/git-log)(1), [git-rev-parse](/man/git-rev-parse)(1)

