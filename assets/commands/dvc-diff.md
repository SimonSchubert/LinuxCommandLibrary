# TAGLINE

show changes in tracked data files

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

**dvc diff** compares DVC-tracked data between Git commits to show what data changed, similar to how git diff shows code changes. It reports added, deleted, and modified files by comparing the hashes stored in .dvc metadata files across different commits.

This enables data versioning workflows: you can see what datasets changed between experiments, compare model checkpoints across branches, or review data modifications before merging. The output shows file paths and their hash changes, making it clear which data files have new versions.

The tool accepts Git revision specifiers (HEAD, branch names, commit hashes) to compare any two points in history. The --json output format is useful for programmatic analysis, while --md generates markdown tables suitable for documentation or pull request descriptions.

# SEE ALSO

[dvc-status](/man/dvc-status)(1), [git-diff](/man/git-diff)(1)

