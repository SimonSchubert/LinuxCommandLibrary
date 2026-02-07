# TAGLINE

Download objects and refs from remote repositories

# TLDR

**Fetch from origin**

```git fetch```

**Fetch from specific remote**

```git fetch [remote]```

**Fetch all remotes**

```git fetch --all```

**Fetch and prune**

```git fetch -p```

**Fetch specific branch**

```git fetch [remote] [branch]```

**Fetch with tags**

```git fetch --tags```

**Dry run**

```git fetch --dry-run```

# SYNOPSIS

**git** **fetch** [_options_] [_remote_] [_refspec_...]

# PARAMETERS

**--all**
> Fetch all remotes.

**-p**, **--prune**
> Remove deleted remote refs.

**--tags**
> Fetch all tags.

**--depth** _depth_
> Shallow fetch.

**--dry-run**
> Show what would be fetched.

**-j**, **--jobs** _n_
> Parallel fetches for submodules.

**--unshallow**
> Convert shallow to full.

# DESCRIPTION

**git fetch** retrieves commits, files, and references from a remote repository, updating your local repository's knowledge of remote branches without modifying your working directory or current branch. This makes it a safe operation for staying synchronized with remote changes.

When you fetch, Git downloads all new commits and objects from the remote and updates remote-tracking branches (like origin/main). Your local branches remain unchanged, allowing you to review remote changes before integrating them. This is the crucial distinction from git pull, which fetches and then automatically merges.

The prune option (-p) removes references to remote branches that no longer exist on the server. Shallow fetches with --depth limit history download, useful for CI/CD environments. The --unshallow option converts a shallow clone to a complete repository.

# SEE ALSO

[git-pull](/man/git-pull)(1), [git-push](/man/git-push)(1)
