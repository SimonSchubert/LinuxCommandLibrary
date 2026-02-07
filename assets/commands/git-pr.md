# TAGLINE

Check out GitHub pull requests

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

**git pr** checks out GitHub pull requests locally for testing, reviewing, or contributing. It fetches the pull request reference and creates a local branch named "pr/N" for the specified PR number.

The command simplifies the review workflow by handling ref fetching and branch creation in a single step. For GitLab repositories, the equivalent command is `git mr`.

# CAVEATS

Part of git-extras package. GitHub-specific functionality. GitLab equivalent is git mr.

# HISTORY

git pr is part of **git-extras**, providing GitHub pull request checkout functionality for local testing and review.

# SEE ALSO

[git-mr](/man/git-mr)(1), [gh-pr](/man/gh-pr)(1), [git-checkout](/man/git-checkout)(1)
