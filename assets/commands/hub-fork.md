# TAGLINE

creates a fork of a GitHub repository

# TLDR

**Fork current repository**

```hub fork```

**Fork without remote**

```hub fork --no-remote```

**Fork specific repository**

```hub fork [user/repo]```

**Fork to organization**

```hub fork --org [myorg]```

# SYNOPSIS

**hub fork** [_options_] [_repository_]

# PARAMETERS

**--no-remote**
> Skip adding a git remote for the fork.

**--remote-name** _REMOTE_
> Set the name for the new git remote.

**--org** _ORGANIZATION_
> Fork the repository within this organization instead of your account.

# DESCRIPTION

**hub fork** creates a fork of a GitHub repository. It adds a remote pointing to your fork automatically.

The command forks the repository detected in the current directory to your account or the specified organization, then adds a git remote for it (named **origin** by default, unless **origin** is already taken, in which case it uses your GitHub username).

# CAVEATS

Part of **hub**, which is deprecated in favor of the official GitHub CLI (**gh**); use **gh repo fork** instead. Requires GitHub authentication.

# HISTORY

hub fork is part of **hub**, GitHub's original command-line wrapper around git for repository operations, created in 2012.

# SEE ALSO

[hub](/man/hub)(1), [gh](/man/gh)(1), [hub-clone](/man/hub-clone)(1)

# RESOURCES

```[Source code](https://github.com/github/hub)```

```[Homepage](https://hub.github.com/)```

<!-- verified: 2026-07-19 -->
