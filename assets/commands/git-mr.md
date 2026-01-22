# TLDR

**Check out merge request**

```git mr [123]```

**Check out from origin**

```git mr origin [123]```

**Clean up merge request**

```git mr --clean [123]```

# SYNOPSIS

**git mr** [_remote_] _number_

# PARAMETERS

_REMOTE_
> Remote name (default: origin).

_NUMBER_
> Merge request number.

**--clean**
> Delete local MR branch.

**--help**
> Display help information.

# DESCRIPTION

**git mr** checks out GitLab merge requests locally. It fetches the merge request reference and creates a local branch for testing or review.

The command simplifies the workflow of reviewing merge requests by handling the ref fetching and branch creation automatically.

git mr enables easy merge request checkout for GitLab repos.

# CAVEATS

Part of git-extras package. GitLab-specific functionality. GitHub equivalent is git pr.

# HISTORY

git mr is part of **git-extras**, providing GitLab merge request checkout similar to git pr for GitHub pull requests.

# SEE ALSO

[git-pr](/man/git-pr)(1), [git-checkout](/man/git-checkout)(1)
