# TAGLINE

Find symbolic names for commits

# TLDR

**Find symbolic name for commit**

```git name-rev [commit]```

**Name multiple commits**

```git name-rev [commit1] [commit2]```

**Name from stdin**

```git log --oneline | git name-rev --stdin```

**Exclude refs**

```git name-rev --exclude="refs/tags/*" [commit]```

# SYNOPSIS

**git** **name-rev** [_options_] _commit_...

# PARAMETERS

**--stdin**
> Read from stdin.

**--tags**
> Only use tags.

**--refs** _pattern_
> Use refs matching pattern.

**--exclude** _pattern_
> Exclude refs matching pattern.

**--always**
> Show abbreviated commit if no name.

# DESCRIPTION

**git name-rev** finds symbolic names for given commit hashes, making them more human-readable. It shows the nearest ref (branch or tag) that can describe each commit, along with the number of commits from that ref (e.g., "main~3" means three commits before main).

The `--stdin` option allows processing commit hashes from pipelines, enabling annotation of `git log` output or other commands that produce commit IDs. Filter options like `--tags` or `--refs` restrict which references are used for naming.

# SEE ALSO

[git-describe](/man/git-describe)(1), [git-rev-parse](/man/git-rev-parse)(1)
