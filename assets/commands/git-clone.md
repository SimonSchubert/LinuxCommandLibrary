# TAGLINE

Clone a remote repository

# TLDR

**Clone a repository**

```git clone [https://github.com/owner/repo.git]```

**Clone to specific directory**

```git clone [url] [directory]```

**Shallow clone**

```git clone --depth 1 [url]```

**Clone specific branch**

```git clone --branch [branch] [url]```

**Clone with submodules**

```git clone --recursive [url]```

# SYNOPSIS

**git clone** [_options_] _repository_ [_directory_]

# PARAMETERS

_REPOSITORY_
> Repository URL or path.

_DIRECTORY_
> Target directory name.

**--depth** _N_
> Create shallow clone with N commits.

**--branch** _BRANCH_
> Clone specific branch.

**--recursive**
> Initialize submodules.

**--bare**
> Create bare repository.

**--mirror**
> Create mirror clone.

**--single-branch**
> Clone only one branch.

**--help**
> Display help information.

# DESCRIPTION

**git clone** creates a complete copy of a remote repository, establishing a local working directory with all version history, branches, and tags. It automatically sets up the origin remote and configures tracking branches for remote branches.

The command supports multiple transfer protocols including HTTPS (standard for public repositories), SSH (preferred for authenticated access), and the git:// protocol (read-only). When cloning, Git fetches all commits, branches, and tags by default, creating a full mirror of the repository's history.

Shallow clones (--depth) are useful for large repositories where full history isn't needed, such as CI/CD environments or deployment scenarios. This reduces download time and disk usage significantly by fetching only the most recent commits. However, shallow clones have limitations: some operations like rebasing or examining old history may fail or require fetching additional depth.

Bare repositories (--bare) contain only the Git data without a working directory, making them ideal for server-side hosting or backup purposes. Mirror clones (--mirror) are like bare clones but also replicate all refs including remotes and configuration, perfect for creating complete repository backups.

The --recursive option initializes and updates all Git submodules recursively, essential when working with projects that depend on external repositories. Without this flag, submodule directories will be empty after cloning.

# CAVEATS

Large repos can take time. Shallow clones limit some operations. SSH requires key setup.

# HISTORY

git clone is a fundamental **Git** command from its initial release, providing distributed repository copying that defines git's model.

# SEE ALSO

[git](/man/git)(1), [git-fetch](/man/git-fetch)(1), [git-remote](/man/git-remote)(1)
