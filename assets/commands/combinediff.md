# TAGLINE

merge two incremental patches into one

# TLDR

**Combine two patches**

```combinediff [patch1.diff] [patch2.diff]```

**Combine with custom context**

```combinediff -U [5] [patch1.diff] [patch2.diff]```

**Strip path components**

```combinediff -p [1] [patch1.diff] [patch2.diff]```

**Ignore whitespace changes**

```combinediff -w [patch1.diff] [patch2.diff]```

**Decompress gzipped patches**

```combinediff -z [patch1.diff.gz] [patch2.diff.gz]```

# SYNOPSIS

**combinediff** [_options_] _diff1_ _diff2_

# DESCRIPTION

**combinediff** creates a unified diff expressing the sum of two diffs. The second patch must be relative to files after the first patch was applied. Part of patchutils package.

# PARAMETERS

**-p** _n_, **--strip-match** _n_
> Ignore first n path components when comparing filenames

**-U** _n_, **--unified** _n_
> Display n lines of context

**-d** _pat_, **--drop-context** _pat_
> No context for files matching pattern

**-q**, **--quiet**
> Suppress output

**-i**, **--ignore-case**
> Case-insensitive comparison

**-w**, **--ignore-all-space**
> Ignore whitespace changes

**-b**, **--ignore-space-change**
> Ignore changes in whitespace amount

**-B**, **--ignore-blank-lines**
> Ignore blank line changes

**-z**, **--decompress**
> Decompress .gz and .bz2 files

**--interpolate**
> Run as interdiff instead

**--help**
> Display help

**--version**
> Show version

# REQUIREMENTS

Input patches must be in strict incremental order. Requires at least 3 lines of context for best results. Output is always unified format.

# CAVEATS

Needs clean GNU diff output. Part of patchutils package (not pre-installed). Use recountdiff to fix hand-edited patches first.

# SEE ALSO

[diff](/man/diff)(1), [patch](/man/patch)(1), [interdiff](/man/interdiff)(1)
