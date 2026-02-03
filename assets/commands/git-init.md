# TLDR

**Initialize repository**

```git init```

**Initialize in directory**

```git init [path]```

**Initialize bare repository**

```git init --bare```

**Initialize with specific branch**

```git init -b [main]```

**Initialize with template**

```git init --template=[template_dir]```

# SYNOPSIS

**git** **init** [_options_] [_directory_]

# PARAMETERS

**--bare**
> Create bare repository.

**-b**, **--initial-branch** _name_
> Initial branch name.

**--template** _dir_
> Template directory.

**--shared** _permissions_
> Set repository permissions.

**-q**, **--quiet**
> Quiet output.

# DESCRIPTION

**git init** creates an empty Git repository or reinitializes an existing one. Creates the .git directory with subdirectories for objects, refs/heads, refs/tags, and template files.

# SEE ALSO

[git-clone](/man/git-clone)(1), [git-config](/man/git-config)(1)

