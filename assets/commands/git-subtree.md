# TAGLINE

Merge and split repositories using subdirectories

# TLDR

**Add subtree**

```git subtree add --prefix=[dir] [repo] [branch]```

**Pull subtree changes**

```git subtree pull --prefix=[dir] [repo] [branch]```

**Push subtree changes**

```git subtree push --prefix=[dir] [repo] [branch]```

**Split subtree**

```git subtree split --prefix=[dir] -b [new_branch]```

**Merge subtree**

```git subtree merge --prefix=[dir] [commit]```

# SYNOPSIS

**git** **subtree** _command_ [_options_]

# SUBCOMMANDS

**add**
> Add repository as subtree.

**pull**
> Pull subtree changes.

**push**
> Push subtree changes.

**merge**
> Merge subtree changes.

**split**
> Extract subtree history.

# PARAMETERS

**--prefix** _dir_
> Subdirectory for subtree.

**--squash**
> Squash history.

**-b** _branch_
> Branch name for split.

# DESCRIPTION

**git subtree** merges and splits repositories into subdirectories, providing an alternative to submodules. Unlike submodules, subtrees keep everything in a single repository with a unified history.

The `split` command extracts the history of a subdirectory into a separate branch, while `add`, `pull`, and `push` manage the ongoing synchronization with the upstream repository.

# SEE ALSO

[git-submodule](/man/git-submodule)(1), [git-merge](/man/git-merge)(1)
