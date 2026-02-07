# TAGLINE

List unpushed local commits

# TLDR

**Show local commits not pushed**

```git local-commits```

# SYNOPSIS

**git** **local-commits**

# DESCRIPTION

**git local-commits** lists commits on the current branch that haven't been pushed to the remote. This git-extras command provides a quick way to see what changes will be pushed before actually pushing them.

The command compares the current branch with its upstream tracking branch and shows commits that exist locally but not on the remote. It is functionally similar to `git log @{u}..HEAD` but provides a more memorable and explicit command for this common operation.

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1)
