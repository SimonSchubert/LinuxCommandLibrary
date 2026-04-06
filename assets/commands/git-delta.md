# TAGLINE

List files that differ from another branch

# TLDR

**List files that differ from master** (added, copied, or modified by default)

```git delta```

**List files that differ from a specific branch**

```git delta [branch]```

**Show only modified and renamed files** compared to master

```git delta master MR```

**Show only deleted files** compared to a branch

```git delta [branch] D```

# SYNOPSIS

**git delta** [_branch_] [_filter_]

# PARAMETERS

_branch_
> Branch to compare against. Defaults to **master** if not specified.

_filter_
> Diff filter characters to select file status types. Uses the same filter letters as **git diff --diff-filter**: **A** (added), **C** (copied), **D** (deleted), **M** (modified), **R** (renamed). Multiple letters can be combined (e.g., **MR**). Defaults to **ACM** (added, copied, modified).

# DESCRIPTION

**git delta** lists files that differ from a given branch, showing only file names without content differences. By default it compares against the **master** branch and shows files that have been added, copied, or modified.

The filter parameter allows narrowing results to specific change types using git's diff-filter notation. This is useful for code review preparation, deployment planning, or quickly assessing the scope of changes on a feature branch.

Part of the **git-extras** suite. Not to be confused with the separate **delta** project (dandavison/delta), which is a syntax-highlighting pager for git diff output.

# CAVEATS

Requires the **git-extras** package to be installed. Only shows file names, not content differences. The default comparison branch is **master**, not **main** -- this may need adjustment for repositories using **main** as their default branch.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-log](/man/git-log)(1), [git-branch](/man/git-branch)(1), [git-extras](/man/git-extras)(1), [delta](/man/delta)(1)
