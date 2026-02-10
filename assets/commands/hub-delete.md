# TAGLINE

deletes a GitHub repository

# TLDR

**Delete repository**

```hub delete [user/repo]```

**Delete current repo**

```hub delete```

**Force delete**

```hub delete -y [user/repo]```

# SYNOPSIS

**hub delete** [_options_] [_repository_]

# PARAMETERS

_REPOSITORY_
> Repository to delete (user/repo).

**-y**, **--yes**
> Skip confirmation.

**--help**
> Display help information.

# DESCRIPTION

**hub delete** deletes a GitHub repository. Without arguments, it deletes the repository associated with the current directory.

The command requires confirmation unless forced. It permanently removes the repository including all issues, PRs, and wiki.

# CAVEATS

Destructive and irreversible. Requires authentication. Owner permissions needed.

# HISTORY

hub delete is part of **hub**, GitHub's original CLI for repository management.

# SEE ALSO

[hub](/man/hub)(1), [gh](/man/gh)(1), [hub-create](/man/hub-create)(1)
