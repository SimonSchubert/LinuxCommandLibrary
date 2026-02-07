# TAGLINE

Delete both local and remote branches

# TLDR

**Delete local and remote branch**

```git delete-branch [branch]```

# SYNOPSIS

**git** **delete-branch** _branch_

# DESCRIPTION

**git delete-branch** deletes a branch both locally and on the remote in a single command. Part of the git-extras collection, it simplifies branch cleanup by combining what would normally require separate git branch -d and git push origin --delete operations.

The command is particularly useful in pull request workflows where feature branches become obsolete after merging. It provides safety through Git's standard branch deletion checks, refusing to delete unmerged branches unless forced.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-extras](/man/git-extras)(1)
