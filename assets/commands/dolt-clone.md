# TLDR

**Clone from DoltHub**

```dolt clone [owner/repo]```

**Clone to specific** directory

```dolt clone [owner/repo] [directory]```

**Clone with specific** remote name

```dolt clone --remote [name] [owner/repo]```

**Clone specific branch**

```dolt clone -b [branch] [owner/repo]```

# SYNOPSIS

**dolt clone** [_options_] _repository_ [_directory_]

# PARAMETERS

_REPOSITORY_
> Remote repository (owner/repo format for DoltHub).

_DIRECTORY_
> Local directory name (defaults to repo name).

**-b**, **--branch** _BRANCH_
> Clone specific branch.

**--remote** _NAME_
> Name for the remote (default: origin).

**--single-branch**
> Clone only one branch.

**--help**
> Display help information.

# DESCRIPTION

**dolt clone** creates a local copy of a remote Dolt repository. It downloads the database including all tables, commit history, and branches from DoltHub or other Dolt remotes.

The cloned repository maintains a connection to its origin, enabling push and pull operations. By default, all branches are fetched, though single-branch cloning is available for efficiency.

This is typically the first step in collaborating on a Dolt database, bringing a shared dataset to your local environment for querying and modification.

# CAVEATS

Large repositories may take time to clone. Network connectivity required. Storage space needed for full history. Authentication may be required for private repos.

# HISTORY

dolt clone is part of **Dolt**, implementing Git's clone semantics for database repositories. It enables distributed collaboration on versioned databases through DoltHub and other remotes.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-push](/man/dolt-push)(1), [dolt-pull](/man/dolt-pull)(1), [git-clone](/man/git-clone)(1)
