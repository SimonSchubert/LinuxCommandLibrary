# TAGLINE

Rewrite branch history by applying filters

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

**git filter-branch** is a powerful but deprecated tool for rewriting Git history by applying filter commands to every commit in a branch. It walks through the entire commit history, allowing modifications to trees, commit messages, author information, or other metadata.

The subdirectory-filter is particularly useful for extracting a subdirectory into a new repository with its history intact. Performance is notably poor on large repositories because it must check out every commit's tree. This limitation led to the development of git-filter-repo as the official replacement.

# CAVEATS

**Officially deprecated** in favor of git-filter-repo. Slow on large repositories. Changes history, invalidating commit hashes and requiring force pushes. Collaborators must reclone. Creates backup refs that must be manually cleaned.

# SEE ALSO

[git-filter-repo](/man/git-filter-repo)(1), [git-rebase](/man/git-rebase)(1)
