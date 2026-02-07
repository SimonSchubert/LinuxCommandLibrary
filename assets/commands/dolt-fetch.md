# TAGLINE

download objects and refs from remote

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

**dolt fetch** downloads objects, commits, and branch references from a remote Dolt repository. It synchronizes the local repository's knowledge of the remote's state without modifying the working set or local branches.

This command updates remote-tracking branches (e.g., origin/main) to reflect the current state of the remote repository. Unlike pull, fetch does not automatically merge changes, allowing you to review remote changes before integrating them into your local branches.

The --prune option removes remote-tracking branches that no longer exist on the remote, keeping the local repository clean. Fetching from all remotes simultaneously is useful in multi-remote workflows.

# SEE ALSO

[dolt-pull](/man/dolt-pull)(1), [dolt-push](/man/dolt-push)(1)

