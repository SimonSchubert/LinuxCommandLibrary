# TAGLINE

Delete both local and remote branches

# TLDR

**Delete local and remote branch**

```git delete-branch [branch]```

# SYNOPSIS

**git** **delete-branch** _branch_

# PARAMETERS

_branch_
> Name of the branch to delete locally and remotely.

# DESCRIPTION

**git delete-branch** deletes a branch both locally and on the remote in a single command. Part of the **git-extras** collection, it simplifies branch cleanup by combining what would normally require separate **git branch -D** and **git push origin --delete** operations.

The command is particularly useful in pull request workflows where feature branches become obsolete after merging. Multiple branches can be passed and will each be deleted in turn.

# CAVEATS

Requires **git-extras** to be installed. Remote deletion requires push access to the remote. Local deletion uses **-D** (force), so unmerged work can be lost.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-extras](/man/git-extras)(1), [git-push](/man/git-push)(1)
