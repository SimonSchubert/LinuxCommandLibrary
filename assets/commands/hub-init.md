# TAGLINE

same as **git init** but extended with hub features

# TLDR

**Initialize repository and create on GitHub**

```hub init && hub create```

**Initialize with specific directory**

```hub init [directory]```

# SYNOPSIS

**hub** **init** [_options_] [_directory_]

# PARAMETERS

**-g**
> Create .gitignore with GitHub templates.

**--bare**
> Create bare repository.

**-q**, **--quiet**
> Quiet mode.

**--template** _dir_
> Use template directory.

# DESCRIPTION

**hub init** is the same as **git init** but extended with hub features. Typically used with **hub create** to initialize a local repository and create a matching GitHub repository in one workflow.

# CAVEATS

Hub is deprecated. Consider using **git init** and **gh repo create** instead.

# SEE ALSO

[hub](/man/hub)(1), [git-init](/man/git-init)(1), [hub-create](/man/hub-create)(1)

