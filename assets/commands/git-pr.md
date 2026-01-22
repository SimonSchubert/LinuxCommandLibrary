# TLDR

**Check out pull request**

```git pr [123]```

**Check out from upstream**

```git pr [123] upstream```

**Clean up PR branch**

```git pr clean [123]```

**List pull requests**

```git pr list```

# SYNOPSIS

**git pr** [_number_] [_remote_]

# PARAMETERS

_NUMBER_
> Pull request number.

_REMOTE_
> Remote name (default: origin).

**clean** _NUMBER_
> Delete local PR branch.

**list**
> List open PRs.

**--help**
> Display help information.

# DESCRIPTION

**git pr** checks out GitHub pull requests locally. It fetches the pull request reference and creates a local branch for testing, reviewing, or contribution.

The command simplifies reviewing pull requests by handling ref fetching automatically. It creates a branch named "pr/N" for the specified PR number.

git pr enables easy pull request checkout for GitHub repos.

# CAVEATS

Part of git-extras package. GitHub-specific functionality. GitLab equivalent is git mr.

# HISTORY

git pr is part of **git-extras**, providing GitHub pull request checkout functionality for local testing and review.

# SEE ALSO

[git-mr](/man/git-mr)(1), [gh-pr](/man/gh-pr)(1), [git-checkout](/man/git-checkout)(1)
