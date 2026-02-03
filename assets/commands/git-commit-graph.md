# TLDR

**Write commit graph**

```git commit-graph write```

**Write with reachable commits**

```git commit-graph write --reachable```

**Verify commit graph**

```git commit-graph verify```

# SYNOPSIS

**git** **commit-graph** _command_ [_options_]

# SUBCOMMANDS

**write**
> Write commit graph file.

**verify**
> Verify commit graph.

# PARAMETERS

**--reachable**
> Include reachable commits.

**--stdin-commits**
> Read commits from stdin.

**--append**
> Add to existing graph.

**--split**
> Use incremental graph.

# DESCRIPTION

**git commit-graph** writes and verifies commit-graph files. Commit graphs accelerate commit walks and reachability queries by caching commit metadata.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-maintenance](/man/git-maintenance)(1)

