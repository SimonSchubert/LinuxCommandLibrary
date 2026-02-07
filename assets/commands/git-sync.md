# TAGLINE

Synchronize local branch with remote

# TLDR

**Sync with remote**

```git sync```

**Sync specific branch**

```git sync [branch]```

**Sync with upstream**

```git sync upstream```

# SYNOPSIS

**git sync** [_remote_] [_branch_]

# PARAMETERS

_REMOTE_
> Remote to sync with (default: origin).

_BRANCH_
> Branch to sync (default: current).

**--help**
> Display help information.

# DESCRIPTION

**git sync** synchronizes the current branch with its remote tracking branch. It combines fetch and rebase/merge into a single command for quick synchronization.

The command stashes local changes if needed, syncs with remote, then restores changes. It simplifies the common workflow of updating a branch.

# CAVEATS

Part of git-extras package. Behavior depends on configuration. May stash uncommitted changes.

# HISTORY

git sync is part of **git-extras**, combining common synchronization steps into one command.

# SEE ALSO

[git-pull](/man/git-pull)(1), [git-fetch](/man/git-fetch)(1), [git-rebase](/man/git-rebase)(1)
