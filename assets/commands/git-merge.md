# TLDR

**Merge branch into current**

```git merge [branch-name]```

**Merge with commit message**

```git merge [branch] -m "[message]"```

**Merge without fast-forward**

```git merge --no-ff [branch]```

**Squash merge**

```git merge --squash [branch]```

**Abort merge**

```git merge --abort```

# SYNOPSIS

**git merge** [_options_] [_commit_]

# PARAMETERS

_COMMIT_
> Branch or commit to merge.

**--no-ff**
> Always create merge commit.

**--ff-only**
> Only fast-forward merge.

**--squash**
> Squash commits into one.

**-m** _MESSAGE_
> Merge commit message.

**--abort**
> Abort current merge.

**--continue**
> Continue after conflict resolution.

**-s** _STRATEGY_
> Merge strategy.

**--help**
> Display help information.

# DESCRIPTION

**git merge** joins development histories together. It combines the specified commit and its history into the current branch, creating a merge commit when necessary.

Fast-forward merges move the branch pointer without creating a commit. Non-fast-forward merges create explicit merge commits. Squash merges combine all changes into one commit.

git merge is fundamental to branch-based workflows.

# CAVEATS

Conflicts require manual resolution. Fast-forward may hide branch history. Merge commits can complicate history.

# HISTORY

git merge is a core **Git** command from initial release, implementing the branch combination essential to git's distributed workflow.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-cherry-pick](/man/git-cherry-pick)(1), [git-mergetool](/man/git-mergetool)(1)
