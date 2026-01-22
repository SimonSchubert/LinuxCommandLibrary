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

**git clone** creates a copy of a remote repository. It downloads all branches, tags, and history, setting up remote tracking for the origin.

The command supports various protocols including HTTPS, SSH, and git://. Shallow clones reduce download size for large repositories. Bare clones create server-side repositories.

git clone is the standard way to obtain a copy of any git repository.

# CAVEATS

Large repos can take time. Shallow clones limit some operations. SSH requires key setup.

# HISTORY

git clone is a fundamental **Git** command from its initial release, providing distributed repository copying that defines git's model.

# SEE ALSO

[git](/man/git)(1), [git-fetch](/man/git-fetch)(1), [git-remote](/man/git-remote)(1)
