# TAGLINE

Check out GitLab merge requests

# TLDR

**Check out merge request from origin**

```git mr [51]```

**Check out merge request from a specific remote**

```git mr [51] [upstream]```

**Check out merge request by URL**

```git mr [https://gitlab.com/owner/repo/merge_requests/51]```

**Clean up all local mr/ branches**

```git mr clean```

# SYNOPSIS

**git mr** _number_ [_remote_]

**git mr** _url_

**git mr** **clean**

# PARAMETERS

_NUMBER_
> Merge request number.

_REMOTE_
> Remote name (default: origin).

_URL_
> GitLab merge request URL (e.g. https://gitlab.tld/owner/repo/merge_requests/453).

**clean**
> Delete all local mr/ branches.

**--help**
> Display help information.

# DESCRIPTION

**git mr** fetches a GitLab merge request head by its number or URL and checks it out in a local branch named mr/_number_. It handles ref fetching and branch creation in a single step, simplifying the code review workflow.

For GitHub repositories, the equivalent command is `git pr`.

# CAVEATS

Part of git-extras package. GitLab-specific functionality. GitHub equivalent is git pr.

# HISTORY

git mr is part of **git-extras**, providing GitLab merge request checkout similar to git pr for GitHub pull requests.

# SEE ALSO

[git-pr](/man/git-pr)(1), [git-checkout](/man/git-checkout)(1)
