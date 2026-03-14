# TAGLINE

Remove branches that were squash-merged

# TLDR

**Delete squash-merged branches**

```git delete-squashed-branches```

# SYNOPSIS

**git** **delete-squashed-branches**

# DESCRIPTION

**git delete-squashed-branches** deletes local branches that have been squash-merged into the current branch. Part of **git-extras**, it detects branches whose commits were combined and merged as a single squash commit, which Git's standard **--merged** flag cannot identify.

Squash merging creates a new commit combining all branch changes, leaving the original branch commits technically unmerged. This causes branch accumulation since **git branch --merged** won't flag them for deletion. The command uses tree comparison heuristics to detect when a branch's changes exist in the target branch despite differing commit history.

Particularly useful for workflows on GitHub and GitLab where squash merging is the default merge strategy.

# SEE ALSO

[git-delete-merged-branches](/man/git-delete-merged-branches)(1), [git-extras](/man/git-extras)(1)
