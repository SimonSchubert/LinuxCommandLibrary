# TAGLINE

Merge pull requests using GitHub API

# TLDR

**Merge current PR**

```gh pr merge```

**Merge with squash**

```gh pr merge --squash```

**Merge with rebase**

```gh pr merge --rebase```

**Delete branch after merge**

```gh pr merge --delete-branch```

**Auto-merge when ready**

```gh pr merge --auto```

# SYNOPSIS

**gh pr merge** [_pr-number_] [_options_]

# PARAMETERS

_PR-NUMBER_
> Pull request number (defaults to current branch).

**--merge**
> Use merge commit (default).

**--squash**
> Squash commits into one.

**--rebase**
> Rebase commits onto base branch.

**--delete-branch**
> Delete branch after merge.

**--auto**
> Enable auto-merge when requirements met.

**--admin**
> Merge with admin privileges.

**--body** _TEXT_
> Custom merge commit message.

**--help**
> Display help information.

# DESCRIPTION

**gh pr merge** merges pull requests using GitHub's merge API. It supports all merge strategies: merge commits, squash merging, and rebasing. The command can wait for required checks and approvals before proceeding.

Auto-merge (--auto) sets a PR to merge automatically once all requirements are satisfied, useful for approved PRs waiting on CI. The --delete-branch option cleans up feature branches after merging.

# CAVEATS

Branch protection rules may prevent merging. Auto-merge requires repository feature enabled. Admin flag overrides protections.

# HISTORY

gh pr merge is part of the **GitHub CLI**, implementing all merge strategies available through GitHub's web interface.

# SEE ALSO

[gh-pr](/man/gh-pr)(1), [gh-pr-checks](/man/gh-pr-checks)(1), [git-merge](/man/git-merge)(1)
