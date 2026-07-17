# TAGLINE

Write and verify commit graph files

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

**--stdin-packs**
> Scan pack indexes listed on stdin for commits.

**--append**
> Add to existing graph.

**--split**[=_STRATEGY_]
> Use incremental graph.

**--changed-paths**
> Compute Bloom filters for changed paths, speeding up history queries like **git log -- path**.

**--object-dir** _DIR_
> Object directory used to store the graph.

**--shallow**
> With **verify**, only check the tip file of a split commit graph.

# DESCRIPTION

**git commit-graph** manages commit-graph files, a performance optimization feature that stores commit metadata in a format optimized for fast graph traversal operations. These files significantly accelerate common operations like git log, git merge-base, and reachability checks in repositories with deep history.

The commit graph stores a pre-computed representation of the commit DAG (directed acyclic graph), including commit parent relationships, generation numbers, and tree object IDs. This avoids repeatedly parsing commit objects during graph walks, providing dramatic performance improvements for large repositories.

The write subcommand generates or updates the commit graph, either for all reachable commits (--reachable) or for commits provided via stdin (--stdin-commits). Incremental graphs (--split) allow updating the graph efficiently as new commits are added without rewriting the entire file.

Modern Git versions include commit-graph maintenance as part of git gc and git maintenance, so manual invocation is rarely necessary. The verify subcommand checks graph integrity, ensuring the data structure remains consistent with repository state.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-maintenance](/man/git-maintenance)(1), [git-log](/man/git-log)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-commit-graph)```

<!-- verified: 2026-07-17 -->

