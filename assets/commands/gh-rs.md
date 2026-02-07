# TAGLINE

Bulk repository synchronization and cloning extension

# TLDR

**Sync all repos**

```gh rs sync```

**Sync specific org**

```gh rs sync --org [orgname]```

**Clone all repos**

```gh rs clone --org [orgname]```

**List repos to sync**

```gh rs list```

# SYNOPSIS

**gh rs** _command_ [_options_]

# PARAMETERS

**sync**
> Synchronize repositories.

**clone**
> Clone multiple repositories.

**list**
> List repositories.

**--org** _ORGNAME_
> Target organization.

**--user** _USERNAME_
> Target user.

**--concurrency** _N_
> Parallel operations.

**--help**
> Display help information.

# DESCRIPTION

**gh rs** (repo-sync) is a GitHub CLI extension for bulk repository operations. It enables synchronizing and cloning multiple repositories from organizations or users in parallel.

The extension is useful for maintaining local copies of many repositories, setting up development environments, or backing up organization code. It handles authentication and rate limiting automatically.

# CAVEATS

Extension must be installed via **gh extension install**. Bulk operations consume API rate limits. Large clones need sufficient disk space.

# HISTORY

gh rs is a community **GitHub CLI extension** that adds bulk repository management capabilities beyond the built-in repo commands.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1), [gh-extension](/man/gh-extension)(1)
