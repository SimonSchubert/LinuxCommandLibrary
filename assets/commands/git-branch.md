# TLDR

**List all local branches**

```git branch```

**List all branches** including remote

```git branch -a```

**Create a new branch**

```git branch [branch_name]```

**Create and switch** to a new branch

```git branch [branch_name] && git checkout [branch_name]```

**Delete a local branch**

```git branch -d [branch_name]```

**Force delete a branch** with unmerged changes

```git branch -D [branch_name]```

**Rename the current branch**

```git branch -m [new_name]```

**Set upstream tracking** branch

```git branch -u [origin/branch_name]```

**Show branches with last commit**

```git branch -v```

# SYNOPSIS

**git branch** [_OPTIONS_] [_BRANCH-NAME_] [_START-POINT_]

# PARAMETERS

**-a**, **--all**
> List both local and remote-tracking branches.

**-r**, **--remotes**
> List remote-tracking branches only.

**-d**, **--delete**
> Delete a branch (must be fully merged).

**-D**
> Force delete a branch regardless of merge status.

**-m**, **--move**
> Rename a branch.

**-M**
> Force rename even if target name exists.

**-c**, **--copy**
> Copy a branch.

**-u**, **--set-upstream-to**=_UPSTREAM_
> Set upstream tracking branch.

**--unset-upstream**
> Remove upstream tracking information.

**-v**, **--verbose**
> Show SHA1 and commit subject for each branch.

**--merged**
> List branches merged into current branch.

**--no-merged**
> List branches not merged into current branch.

**--contains** _COMMIT_
> List branches containing the specified commit.

# DESCRIPTION

**git branch** lists, creates, renames, and deletes branches. Without arguments, it lists existing local branches, marking the current branch with an asterisk.

Branches are lightweight pointers to commits, allowing parallel development workflows. Creating a branch does not switch to it; use **git checkout** or **git switch** to change branches.

Remote-tracking branches (origin/main, etc.) are read-only references to the state of branches on remote repositories. They are updated by **git fetch**.

# CAVEATS

Deleting a branch with **-d** fails if the branch has unmerged changes. Use **-D** to force deletion, but unmerged work will be lost (though commits remain recoverable via reflog temporarily). Cannot delete the currently checked-out branch.

# HISTORY

Branching has been a core Git feature since its creation by Linus Torvalds in **2005**. Git's lightweight branching model, where branches are simply pointers to commits rather than full directory copies, was revolutionary and enabled workflows like GitFlow and GitHub Flow.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-switch](/man/git-switch)(1), [git-merge](/man/git-merge)(1), [git-fetch](/man/git-fetch)(1)
