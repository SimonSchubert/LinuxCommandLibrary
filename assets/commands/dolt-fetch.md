# TLDR

**Fetch from remote**

```dolt fetch```

**Fetch from specific remote**

```dolt fetch [remote]```

**Fetch specific branch**

```dolt fetch [remote] [branch]```

**Fetch all remotes**

```dolt fetch --all```

# SYNOPSIS

**dolt** **fetch** [_options_] [_remote_] [_refspec_]

# PARAMETERS

**--all**
> Fetch from all remotes.

**--prune**
> Remove stale remote tracking branches.

# DESCRIPTION

**dolt fetch** downloads objects and refs from a remote repository. Updates remote tracking branches without merging changes into local branches.

# SEE ALSO

[dolt-pull](/man/dolt-pull)(1), [dolt-push](/man/dolt-push)(1)

