# TAGLINE

Resume tracking changes to a locked file

# TLDR

**Unlock a file**

```git unlock [file]```

# SYNOPSIS

**git** **unlock** _file_

# DESCRIPTION

**git unlock** removes the assume-unchanged flag from a file, allowing Git to track changes again. This reverses the effect of `git lock`, which tells Git to ignore local modifications to a file.

Part of the **git-extras** package.

# SEE ALSO

[git-lock](/man/git-lock)(1), [git-update-index](/man/git-update-index)(1), [git-extras](/man/git-extras)(1)
