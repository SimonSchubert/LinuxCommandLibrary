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

**extrepo** manages external Debian repositories. It provides a safe way to enable third-party software repositories on Debian systems with verified GPG keys.

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
