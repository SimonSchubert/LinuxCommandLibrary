# TAGLINE

Create orphan branch with no commit history

# TLDR

**Create orphan branch**

```git fresh-branch [branch_name]```

# SYNOPSIS

**git** **fresh-branch** _name_

# DESCRIPTION

**git fresh-branch** creates a new orphan branch with no parent commits or history connection to the existing repository. This provides a completely clean slate within the same repository, useful for maintaining entirely separate content streams.

The primary use case is gh-pages branches for GitHub Pages hosting, where documentation or website content lives in the same repository but shares no history with the codebase. Other uses include documentation branches, experimental branches, or vendor branches for third-party code.

As part of git-extras, this command wraps the more complex git checkout --orphan with additional cleanup steps to ensure a truly fresh starting point.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-extras](/man/git-extras)(1)
