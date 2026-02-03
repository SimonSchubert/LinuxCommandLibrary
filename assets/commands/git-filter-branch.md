# TLDR

**Remove file from history**

```git filter-branch --tree-filter 'rm -f [file]' HEAD```

**Rewrite author**

```git filter-branch --env-filter 'GIT_AUTHOR_EMAIL="[new@email]"' HEAD```

**Subdirectory filter**

```git filter-branch --subdirectory-filter [dir] HEAD```

**Remove empty commits**

```git filter-branch --prune-empty HEAD```

**Force rewrite**

```git filter-branch -f --tree-filter '[command]' HEAD```

# SYNOPSIS

**git** **filter-branch** [_options_] [_--_] [_rev-list_]

# PARAMETERS

**--tree-filter** _cmd_
> Rewrite tree and contents.

**--env-filter** _cmd_
> Modify environment.

**--msg-filter** _cmd_
> Rewrite commit messages.

**--subdirectory-filter** _dir_
> Extract subdirectory.

**--prune-empty**
> Remove empty commits.

**-f**, **--force**
> Force overwrite backup.

# DESCRIPTION

**git filter-branch** rewrites branches by applying filters. Used for removing files from history, changing author info, or restructuring repos.

# CAVEATS

Deprecated in favor of git-filter-repo. Changes history and invalidates commit hashes.

# SEE ALSO

[git-filter-repo](/man/git-filter-repo)(1), [git-rebase](/man/git-rebase)(1)

