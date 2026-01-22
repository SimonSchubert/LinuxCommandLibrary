# TLDR

**Add worktree**

```git worktree add [../feature-branch] [branch-name]```

**List worktrees**

```git worktree list```

**Remove worktree**

```git worktree remove [path]```

**Prune stale worktrees**

```git worktree prune```

**Add worktree for new branch**

```git worktree add -b [new-branch] [path]```

# SYNOPSIS

**git worktree** _command_ [_options_]

# PARAMETERS

**add** _PATH_ _BRANCH_
> Add new worktree.

**list**
> List worktrees.

**remove** _PATH_
> Remove worktree.

**prune**
> Remove stale worktrees.

**-b** _BRANCH_
> Create new branch.

**--help**
> Display help information.

# DESCRIPTION

**git worktree** manages multiple working trees attached to one repository. Each worktree can have a different branch checked out, enabling parallel work without stashing.

Worktrees share the same repository data but have separate working directories. This enables working on multiple branches simultaneously, useful for bug fixes during feature work.

git worktree provides parallel branch development.

# CAVEATS

Same branch can't be checked out twice. Worktrees share reflog. Removing worktree doesn't delete branch.

# HISTORY

git worktree was added in **Git 2.5** to enable multiple working directories from a single repository clone.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-branch](/man/git-branch)(1)
