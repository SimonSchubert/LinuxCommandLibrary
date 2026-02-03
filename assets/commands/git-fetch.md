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

**git fetch** downloads objects and refs from another repository. Updates remote-tracking branches without modifying local branches. Use git pull to fetch and merge.

# SEE ALSO

[git-pull](/man/git-pull)(1), [git-push](/man/git-push)(1)

