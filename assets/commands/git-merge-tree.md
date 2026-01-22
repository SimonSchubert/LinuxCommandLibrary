# TLDR

**Show merge result**

```git merge-tree [base] [branch1] [branch2]```

**Check merge without merging**

```git merge-tree --write-tree [branch1] [branch2]```

# SYNOPSIS

**git merge-tree** [_options_] _base_ _branch1_ _branch2_

# PARAMETERS

_BASE_
> Common ancestor commit.

_BRANCH1_
> First branch to merge.

_BRANCH2_
> Second branch to merge.

**--write-tree**
> Modern mode: write result tree.

**--trivial-merge**
> Only trivial merges.

**--help**
> Display help information.

# DESCRIPTION

**git merge-tree** performs a three-way merge without touching the index or working tree. It shows what merge would produce, useful for previewing merges or scripted merge analysis.

The traditional mode requires specifying the base commit. Modern mode (--write-tree) automatically finds the merge base. It reports conflicts without actually merging.

git merge-tree enables merge preview and scripted merge testing.

# CAVEATS

Plumbing command. Output format varies by mode. Modern mode added in Git 2.38.

# HISTORY

git merge-tree is a **Git** plumbing command enhanced in **Git 2.38** with --write-tree mode for easier programmatic merge testing.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-merge-file](/man/git-merge-file)(1)
