# TAGLINE

Track multiple Git repositories status

# TLDR

**Show** status of all repos in current directory

```gfold```

**Show** all repos recursively

```gfold -r```

**Show** only repos with uncommitted changes

```gfold --dirty```

**Display** in JSON format

```gfold --json```

# SYNOPSIS

**gfold** [_options_] [_path_]

# PARAMETERS

**-r, --recursive**
> Search recursively for repositories

**--dirty**
> Show only repositories with uncommitted changes

**--json**
> Output in JSON format

**-p, --path** _PATH_
> Path to search for repositories (default: current directory)

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gfold** is a CLI tool that tracks the status of multiple Git repositories. It scans directories for Git repositories and displays their status in a clean, organized format.

The tool shows whether repositories are clean, have uncommitted changes, are ahead/behind the remote, or have untracked files. It's useful for developers working with many repositories who want a quick overview of all their projects.

# OUTPUT FORMAT

The output is organized by category:
- **Clean**: Repository is up to date
- **Unclean**: Has uncommitted changes
- **Unpushed**: Commits not yet pushed
- **Untracked**: Has untracked files

# CAVEATS

Large directory trees may take time to scan. Requires read access to repository directories. Status may not reflect upstream changes without fetch.

# HISTORY

**gfold** was created as a modern alternative to manually checking multiple Git repositories, providing a unified view of repository status across projects.

# SEE ALSO

[git](/man/git)(1), [ghq](/man/ghq)(1), [myrepos](https://myrepos.branchable.com/)