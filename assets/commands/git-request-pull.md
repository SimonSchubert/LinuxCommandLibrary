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

**git request-pull** generates a summary of pending changes for email submission. Creates a message describing the commits and where to pull them from.

# SEE ALSO

[git-format-patch](/man/git-format-patch)(1), [git-send-email](/man/git-send-email)(1)

