# TAGLINE

join branch histories and table changes

# TLDR

**Merge branch into** current branch

```dolt merge [branch_name]```

**Merge with commit** message

```dolt merge [branch_name] -m "[Merge message]"```

**Abort in-progress merge**

```dolt merge --abort```

**Squash merge**

```dolt merge --squash [branch_name]```

# SYNOPSIS

**dolt merge** [_options_] _branch_

# PARAMETERS

_BRANCH_
> Branch to merge into current branch.

**-m** _MESSAGE_
> Commit message for merge.

**--squash**
> Squash commits into single change.

**--abort**
> Abort current merge operation.

**--no-commit**
> Merge but don't auto-commit.

**--help**
> Display help information.

# DESCRIPTION

**dolt merge** joins development histories by incorporating changes from another branch into the current branch. It combines table modifications, resolving changes where possible.

When merge conflicts occur (same row modified differently in both branches), the merge pauses for manual resolution. Conflict markers identify problematic rows that need attention before completing the merge.

Squash merges combine all branch changes into a single commit, useful for maintaining clean history when feature branches have many small commits.

# CAVEATS

Conflicts require manual resolution. Large merges may be complex. Squash loses individual commit history. Cannot merge with uncommitted changes.

# HISTORY

dolt merge implements **git merge** semantics for database tables, enabling collaborative workflows with branch-based development on versioned data.

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-checkout](/man/dolt-checkout)(1), [git-merge](/man/git-merge)(1)
