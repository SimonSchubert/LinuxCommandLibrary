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

**git range-diff** compares two commit ranges. Shows how a series of patches changed between versions, useful for reviewing rebased or amended commits.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-log](/man/git-log)(1)

