# TAGLINE

external Debian repository manager

# TLDR

**Search** for a repository

```extrepo search keyword```

**Enable** a repository

```sudo extrepo enable repository_name```

**Disable** a repository

```sudo extrepo disable repository_name```

**Update** a repository

```sudo extrepo update repository_name```

**List** all available repositories

```extrepo search```

# SYNOPSIS

**extrepo** [_command_] [_arguments_]

# DESCRIPTION

**extrepo** manages external Debian repositories in a secure, standardized way. It provides a curated collection of third-party repositories that have been vetted by the Debian project, each with verified GPG keys and proper configuration.

Instead of manually editing /etc/apt/sources.list or using add-apt-repository with untrusted sources, extrepo offers a safe method to enable popular external repositories like Docker, Node.js, Kubernetes, and other projects. All repository configurations are maintained centrally and include proper security verification.

This tool helps avoid common pitfalls like insecure repository additions, missing GPG keys, or incorrect sources.list syntax when adding third-party software sources to Debian systems.

# PARAMETERS

**search [KEYWORD]**
> Search for repositories matching keyword (or list all if no keyword)

**enable REPO**
> Enable the specified repository

**disable REPO**
> Disable the specified repository

**update REPO**
> Update the repository configuration

# CAVEATS

Requires root privileges for enable/disable operations. Only repositories vetted by the Debian project are available. After enabling a repository, run apt update to refresh package lists.

# HISTORY

**extrepo** was developed for Debian to provide a secure method for managing external repositories, replacing manual sources.list editing with verified repository configurations.

# SEE ALSO

[apt](/man/apt)(8), [add-apt-repository](/man/add-apt-repository)(1), [sources.list](/man/sources.list)(5)
