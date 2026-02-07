# TAGLINE

Generate a pull request summary for email submission

# TLDR

**Generate pull request summary**

```git request-pull [start] [url]```

**Include branch info**

```git request-pull [start] [url] [branch]```

**Show patch**

```git request-pull -p [start] [url]```

# SYNOPSIS

**git** **request-pull** [_options_] _start_ _url_ [_end_]

# PARAMETERS

**-p**
> Include patch text.

# DESCRIPTION

**git request-pull** generates a summary of pending changes suitable for email submission. It creates a message describing the commits between a starting point and the current HEAD, along with the URL to pull from.

This command is commonly used in email-based patch workflows to ask maintainers to pull changes from your repository.

# SEE ALSO

[git-format-patch](/man/git-format-patch)(1), [git-send-email](/man/git-send-email)(1)
