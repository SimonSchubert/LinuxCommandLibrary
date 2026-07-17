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

**--env-filter** _cmd_
> Rewrite author/committer environment variables (name, email, date).

**--tree-filter** _cmd_
> Rewrite tree and contents; checks out each commit, so slow on large repos.

**--index-filter** _cmd_
> Rewrite the index without checking out the tree; much faster than **--tree-filter**. Commonly used with **git rm --cached**.

**--parent-filter** _cmd_
> Rewrite a commit's parent list.

**--msg-filter** _cmd_
> Rewrite commit messages.

**--commit-filter** _cmd_
> Replace the commit-creation step entirely.

**--tag-name-filter** _cmd_
> Rewrite tag names pointing at rewritten commits.

**--subdirectory-filter** _dir_
> Only rewrite history touching _dir_, and make it the new project root.

**--prune-empty**
> Remove commits that become empty after filtering.

**--original** _namespace_
> Namespace for backup refs (default **refs/original**).

**-d** _dir_
> Temporary directory to use (e.g. tmpfs, for I/O speed).

**-f**, **--force**
> Force the operation, overwriting an existing backup namespace.

# DESCRIPTION

**git filter-branch** is a powerful but deprecated tool for rewriting Git history by applying filter commands to every commit in a branch. It walks through the entire commit history, allowing modifications to trees, commit messages, author information, or other metadata.

The subdirectory-filter is particularly useful for extracting a subdirectory into a new repository with its history intact. Performance is notably poor on large repositories because it must check out every commit's tree. This limitation led to the development of git-filter-repo as the official replacement.

# CAVEATS

**Officially deprecated** in favor of git-filter-repo. Slow on large repositories. Changes history, invalidating commit hashes and requiring force pushes. Collaborators must reclone. Creates backup refs that must be manually cleaned.

# SEE ALSO

[git-filter-repo](/man/git-filter-repo)(1), [git-rebase](/man/git-rebase)(1), [git-rm](/man/git-rm)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-filter-branch)```

<!-- verified: 2026-07-17 -->
