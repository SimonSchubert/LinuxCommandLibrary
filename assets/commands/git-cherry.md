# TLDR

**Show unpicked commits**

```git cherry [upstream] [branch]```

**Show with commit messages**

```git cherry -v [upstream]```

**Compare branches**

```git cherry [main] [feature]```

# SYNOPSIS

**git cherry** [_options_] [_upstream_] [_head_]

# PARAMETERS

_UPSTREAM_
> Branch to compare against.

_HEAD_
> Branch to check (default: current).

**-v**
> Show commit subjects.

**--abbrev** _N_
> Abbreviate commit hashes.

**--help**
> Display help information.

# DESCRIPTION

**git cherry** finds commits not yet applied to upstream. It compares commits between branches, identifying which commits from your branch are missing from upstream based on patch content, not commit hashes.

Output uses + for commits not in upstream and - for equivalent commits already present. This helps identify what still needs to be merged or cherry-picked.

git cherry is useful for reviewing branch status before merging.

# CAVEATS

Compares patch content, not commit IDs. Rebased commits show as missing. Works best for linear histories.

# HISTORY

git cherry is a core **Git** command for comparing branches by patch equivalence, named after the cherry-pick operation it helps plan.

# SEE ALSO

[git-cherry-pick](/man/git-cherry-pick)(1), [git-log](/man/git-log)(1), [git-rebase](/man/git-rebase)(1)
