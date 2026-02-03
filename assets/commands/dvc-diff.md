# TLDR

**Show changes since last commit**

```dvc diff```

**Compare with specific revision**

```dvc diff [HEAD~1]```

**Compare two revisions**

```dvc diff [rev1] [rev2]```

**Show detailed output**

```dvc diff --json```

**Compare specific target**

```dvc diff [target.dvc]```

# SYNOPSIS

**dvc** **diff** [_options_] [_a_rev_] [_b_rev_]

# PARAMETERS

**--json**
> Output in JSON format.

**--show-hash**
> Show file hashes.

**--md**
> Output in markdown format.

# DESCRIPTION

**dvc diff** shows changes in tracked data between commits. Compares file hashes to detect additions, deletions, and modifications.

# SEE ALSO

[dvc-status](/man/dvc-status)(1), [git-diff](/man/git-diff)(1)

