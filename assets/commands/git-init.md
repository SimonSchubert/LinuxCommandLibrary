# TAGLINE

Create empty repository

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

**--separate-git-dir** _dir_
> Store the `.git` directory at _dir_ instead of inside the working tree.

**--object-format** _format_
> Hash algorithm for objects: sha1 (default) or sha256.

**-q**, **--quiet**
> Quiet output.

# DESCRIPTION

**git init** creates an empty Git repository or reinitializes an existing one. It creates the `.git` directory structure with subdirectories for objects, refs/heads, refs/tags, and template files, establishing the foundation for version control.

Running git init in an existing repository is safe and won't overwrite existing history. It can be used to pick up newly added templates or move the repository to another place if `--separate-git-dir` is given. The command can create either a working repository (with a working directory) or a bare repository (no working directory, typically used as a central server).

The `--bare` option creates a repository optimized for sharing without a working directory. The `--initial-branch` option sets the name of the first branch, useful for starting with "main" instead of "master". Template directories allow customization of the initial repository structure, including hooks and configuration.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-clone](/man/git-clone)(1), [git-config](/man/git-config)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-init)```

<!-- verified: 2026-07-17 -->
