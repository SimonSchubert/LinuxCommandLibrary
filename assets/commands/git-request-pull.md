# TAGLINE

Generate a pull request summary for email submission

# TLDR

**Generate pull request summary**

```git request-pull [start] [url]```

**Generate summary between a tag and a specific branch end point**

```git request-pull [v1.0] [https://example.com/repo.git] [my-branch]```

**Include patch text in the output**

```git request-pull -p [v1.0] [https://example.com/repo.git]```

# SYNOPSIS

**git** **request-pull** [**-p**] _start_ _url_ [_end_]

# PARAMETERS

**-p**
> Include patch text in the output.

_start_
> Commit to start at. This names a commit that is already in the upstream history.

_url_
> The repository URL to be pulled from.

_end_
> Commit to end at (defaults to HEAD). This names the commit at the tip of the history you are asking to be pulled.

# DESCRIPTION

**git request-pull** generates a summary of pending changes suitable for email submission. It creates a message describing the commits between a starting point and the current HEAD, along with the URL to pull from.

This command is commonly used in email-based patch workflows to ask maintainers to pull changes from your repository.

# SEE ALSO

[git-format-patch](/man/git-format-patch)(1), [git-send-email](/man/git-send-email)(1), [git-pull](/man/git-pull)(1)
