# TAGLINE

List unpushed local commits

# TLDR

**Show local commits not pushed**

```git local-commits```

**Show local commits with a graph**

```git local-commits --graph```

# SYNOPSIS

**git** **local-commits** [_git-log-options_]

# PARAMETERS

_GIT-LOG-OPTIONS_
> Any options accepted by **git log**; passed through unchanged.

# DESCRIPTION

**git local-commits**, a git-extras command, lists commits on the current branch that haven't been pushed to its upstream tracking branch. It runs `git log @{upstream}..@`, so it requires HEAD to be tracking a remote branch. Any extra arguments are forwarded directly to `git log`, so flags like `--graph` or `--stat` work as expected.

This provides a quick way to see what changes will be pushed before actually pushing them.

# CAVEATS

Requires the current branch to have an upstream set; otherwise Git reports an error about there being no upstream configured.

# SEE ALSO

[git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md)```

<!-- verified: 2026-07-17 -->
