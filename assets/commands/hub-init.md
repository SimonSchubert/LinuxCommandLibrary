# TAGLINE

Initialize a git repository and add a GitHub remote

# TLDR

**Initialize repository and create on GitHub**

```hub init && hub create```

**Initialize with specific directory**

```hub init [directory]```

# SYNOPSIS

**hub** **init** [_options_] [_directory_]

# PARAMETERS

**-g**
> After initializing, create a "USER/REPO" repository on GitHub and add it as the "origin" remote.

**--bare**
> Create bare repository.

**-q**, **--quiet**
> Quiet mode.

**--template** _dir_
> Use template directory.

# DESCRIPTION

**hub init** creates a git repository as with git-init(1) and adds remote "origin" at "git@github.com:USER/REPOSITORY.git". With the **-g** flag, it also creates the GitHub repository. Typically used with **hub create** to initialize a local repository and create a matching GitHub repository in one workflow.

# CAVEATS

Hub is no longer maintained. Consider using **git init** and **gh repo create** instead.

# SEE ALSO

[hub](/man/hub)(1), [git-init](/man/git-init)(1), [hub-create](/man/hub-create)(1)

