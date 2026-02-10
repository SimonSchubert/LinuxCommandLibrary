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

_REPOSITORY_
> Repository to fork.

**--no-remote**
> Don't add remote.

**--org** _ORG_
> Fork to organization.

**--remote-name** _NAME_
> Remote name (default: origin).

**--help**
> Display help information.

# DESCRIPTION

**hub fork** creates a fork of a GitHub repository. It adds a remote pointing to your fork automatically.

The command forks to your account or specified organization. It sets up the remote for pushing to your fork.

# CAVEATS

Part of hub tool. Requires GitHub authentication. Creates copy under your account.

# HISTORY

hub fork is part of **hub**, GitHub's original CLI for repository operations.

# SEE ALSO

[hub](/man/hub)(1), [gh](/man/gh)(1), [hub-clone](/man/hub-clone)(1)
