# TAGLINE

List tree object contents

# TLDR

**List tree contents**

```git ls-tree HEAD```

**List recursively**

```git ls-tree -r HEAD```

**Show only names**

```git ls-tree --name-only HEAD```

**List specific directory**

```git ls-tree HEAD [src/]```

**Show sizes**

```git ls-tree -l HEAD```

# SYNOPSIS

**git ls-tree** [_options_] _tree-ish_ [_path_]

# PARAMETERS

_TREE-ISH_
> Tree or commit to list.

_PATH_
> Limit to path.

**-r**
> Recurse into subtrees.

**-d**
> Show only trees.

**--name-only**
> Show only names.

**--name-status**
> Show names and status.

**-l**, **--long**
> Show object sizes.

**--abbrev** _N_
> Abbreviate hashes.

**--help**
> Display help information.

# DESCRIPTION

**git ls-tree** lists the contents of a tree object, showing file names, modes, types, and object hashes for a specific commit's directory structure. It provides a snapshot of the repository's file layout at any given commit.

The command is useful for scripting and understanding how Git stores directory contents internally. Recursive mode (`-r`) shows all files across all subdirectories, while `--name-only` provides clean output suitable for piping to other commands.

# CAVEATS

Shows tree at specific commit. Plumbing command for scripts. Output format is machine-readable.

# HISTORY

git ls-tree is a core **Git** plumbing command for examining tree objects, part of git's low-level interface.

# SEE ALSO

[git-ls-files](/man/git-ls-files)(1), [git-ls-remote](/man/git-ls-remote)(1), [git-show](/man/git-show)(1)
