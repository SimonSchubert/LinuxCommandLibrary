# TAGLINE

Find symbolic names for commits

# TLDR

**Find symbolic name for commit**

```git name-rev [commit]```

**Name multiple commits**

```git name-rev [commit1] [commit2]```

**Annotate commit hashes from stdin**

```git log --oneline | git name-rev --annotate-stdin```

**Only use tags to name a commit**

```git name-rev --tags [commit]```

**Exclude refs matching a pattern**

```git name-rev --exclude="refs/tags/*" [commit]```

**Name all reachable commits from all refs**

```git name-rev --all```

# SYNOPSIS

**git** **name-rev** [_options_] _commit_...
**git** **name-rev** [_options_] **--all**
**git** **name-rev** [_options_] **--annotate-stdin**

# PARAMETERS

**--annotate-stdin**
> Transform stdin by substituting commit hashes with their symbolic names. Replaces deprecated --stdin.

**--tags**
> Only use tags to name the commits.

**--refs** _pattern_
> Only use refs whose names match a given shell pattern.

**--exclude** _pattern_
> Do not use any ref whose name matches a given shell pattern.

**--all**
> List all commits reachable from all refs.

**--name-only**
> Print only the symbolic name, not the SHA-1.

**--no-undefined**
> Exit with error when a reference is undefined instead of printing "undefined".

**--always**
> Show uniquely abbreviated commit object as fallback when no name is found.

# DESCRIPTION

**git name-rev** finds symbolic names for given commit hashes, making them more human-readable. It shows the nearest ref (branch or tag) that can describe each commit, along with the number of commits from that ref (e.g., "main~3" means three commits before main).

The `--annotate-stdin` option allows processing commit hashes from pipelines, enabling annotation of `git log` output or other commands that produce commit IDs. Filter options like `--tags` or `--refs` restrict which references are used for naming.

# SEE ALSO

[git-describe](/man/git-describe)(1), [git-rev-parse](/man/git-rev-parse)(1), [git-log](/man/git-log)(1)
