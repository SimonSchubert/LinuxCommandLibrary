# TAGLINE

Squash a branch into a single commit

# TLDR

**Squash branch into current** (leaves changes staged but uncommitted)

```git squash [branch]```

**Squash with message** (commits the result)

```git squash [branch] "[message]"```

**Squash the last N commits** on current branch

```git squash HEAD~[5] "[message]"```

**Squash with concatenated commit messages**

```git squash --squash-msg [branch]```

# SYNOPSIS

**git** **squash** [**--squash-msg**] _source-branch|commit-ref_ [_message_]

# PARAMETERS

**--squash-msg**
> Commit the squash result with the concatenated messages of all squashed commits. Cannot be used together with a commit message argument.

# DESCRIPTION

**git squash** merges all commits from a specified branch or commit range into the current branch as a single squashed commit. Part of git-extras, it is useful for cleaning up feature branch history before merging into the main branch. When a commit ref from the current branch is given, the range from that ref to HEAD is squashed. If no commit message is provided and **--squash-msg** is not used, changes are staged but not committed.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-rebase](/man/git-rebase)(1), [git-extras](/man/git-extras)(1)
