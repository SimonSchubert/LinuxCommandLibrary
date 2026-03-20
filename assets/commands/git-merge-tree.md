# TAGLINE

Perform merge without touching index or working tree

# TLDR

**Preview merge result** (modern mode, Git 2.38+)

```git merge-tree [branch1] [branch2]```

**Perform a three-way merge** with explicit base (deprecated mode)

```git merge-tree [base] [branch1] [branch2]```

**Check for merge conflicts and show informational messages**

```git merge-tree --write-tree --messages [branch1] [branch2]```

**Check if a branch can be cleanly merged** (exit code 0 = clean, 1 = conflicts)

```git merge-tree --write-tree --no-messages [branch1] [branch2]```

# SYNOPSIS

**git merge-tree** [**--write-tree**] [_options_] _branch1_ _branch2_

**git merge-tree** [**--trivial-merge**] _base_ _branch1_ _branch2_

# PARAMETERS

_BRANCH1_
> First branch to merge.

_BRANCH2_
> Second branch to merge.

_BASE_
> Common ancestor commit (deprecated trivial-merge mode only).

**--write-tree**
> Modern mode (default since Git 2.38): automatically finds the merge base and writes a result tree object. Reports conflicts via exit code and stdout.

**--trivial-merge**
> Deprecated mode: reads three trees and outputs trivial merge results. Requires explicit base.

**--[no-]messages**
> Write informational messages such as "Auto-merging" and CONFLICT notices. Default: included when conflicts exist.

**--name-only**
> In the output, show only filenames instead of full merge details.

**--allow-unrelated-histories**
> Allow merging branches that share no common history.

**--merge-base** _commit_
> Specify a merge base instead of computing one automatically. With this option, branch arguments can be trees instead of commits. Incompatible with --stdin.

**--stdin**
> Read commits to merge from standard input, one pair per line. Implies -z.

**-z**
> Use NUL characters as line terminators instead of newlines (for scripting).

# DESCRIPTION

**git merge-tree** performs a three-way merge without touching the index or working tree. It shows what a merge would produce, making it useful for previewing merges or performing scripted merge analysis.

The modern mode (default since Git 2.38) automatically finds the merge base, writes a result tree object, and reports conflicts. The exit code indicates success (0) or conflicts (1). This makes it ideal for CI pipelines and automation scripts that need to check mergeability without modifying any files.

The deprecated trivial-merge mode requires specifying the base commit explicitly and only handles trivial merges.

# CAVEATS

Plumbing command primarily intended for scripting. Output format differs between modern and deprecated modes. Modern mode requires Git 2.38 or later.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-merge-file](/man/git-merge-file)(1)
