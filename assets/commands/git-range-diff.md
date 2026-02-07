# TAGLINE

Compare two commit ranges

# TLDR

**Compare two revision ranges**

```git range-diff [base1]..[rev1] [base2]..[rev2]```

**Compare with upstream**

```git range-diff @{u} @{1} @```

**Compare rebase iterations**

```git range-diff [main]..@{1} [main]..@```

**Show with color**

```git range-diff --color [range1] [range2]```

# SYNOPSIS

**git** **range-diff** [_options_] _range1_ _range2_

# PARAMETERS

**--creation-factor** _n_
> Commit matching threshold.

**--no-dual-color**
> Disable dual color mode.

**--notes** _ref_
> Show notes.

# DESCRIPTION

**git range-diff** compares two commit ranges, showing how a series of patches changed between versions. It performs a diff-of-diffs, matching commits between the two ranges based on content similarity and revealing what changed during a rebase, amend, or other history rewrite.

Common use cases include comparing a feature branch before and after rebasing, reviewing how patches evolved during iterative development, or verifying that a rebase preserved intended changes. The output uses dual coloring to distinguish between the two levels of diff.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-log](/man/git-log)(1)
