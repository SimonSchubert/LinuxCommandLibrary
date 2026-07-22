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

**git subtree** merges and splits repositories into subdirectories, providing an alternative to submodules. Unlike submodules, subtrees keep everything in a single repository with a unified history, so clones don't need any extra init/update step to get the vendored code.

The `split` command extracts the history of a subdirectory into a separate branch, while `add`, `pull`, and `push` manage the ongoing synchronization with the upstream repository.

# CAVEATS

Shipped as a `contrib` script, not part of the core `git` binary, so it isn't installed everywhere by default (e.g. some Linux distros package it separately, such as Debian/Ubuntu's `git-subtree` package). Merging a large upstream history in still adds all of its commits to your repository.

# INSTALL

```dnf: sudo dnf install git-subtree```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-submodule](/man/git-submodule)(1), [git-merge](/man/git-merge)(1)

# RESOURCES

```[Source code](https://github.com/git/git/tree/master/contrib/subtree)```

```[Documentation](https://manpages.debian.org/testing/git-man/git-subtree.1.en.html)```

<!-- verified: 2026-07-17 -->
