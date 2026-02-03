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

**git name-rev** finds symbolic names for given commits. Shows the nearest ref (branch or tag) that can describe the commit.

# SEE ALSO

[git-describe](/man/git-describe)(1), [git-rev-parse](/man/git-rev-parse)(1)

