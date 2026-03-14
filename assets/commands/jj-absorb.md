# TAGLINE

Move changes into the appropriate ancestor commits automatically

# TLDR

**Absorb working copy changes into ancestor commits**

```jj absorb```

**Absorb only specific file paths**

```jj absorb [file1] [file2]```

**Absorb from a specific source revision**

```jj absorb --from [revision]```

**Absorb into a specific set of destination revisions**

```jj absorb --into [revset]```

# SYNOPSIS

**jj** **absorb** [_options_] [_filesets_...]

# PARAMETERS

**-f**, **--from** _REVSET_
> Source revision to absorb from (default: @).

**-t**, **--into** _REVSETS_
> Destination revisions to absorb into (default: mutable()). Only ancestors of the source are considered.

**-R**, **--repository** _PATH_
> Path to repository to operate on.

**--ignore-working-copy**
> Don't snapshot or update the working copy.

**--ignore-immutable**
> Allow rewriting immutable commits.

# DESCRIPTION

**jj absorb** splits changes in the source revision and moves each change to the closest mutable ancestor where the corresponding lines were last modified. This is useful for fixing up a series of commits without manual rebasing.

If the destination revision cannot be determined unambiguously for a change, that change is left in the source revision. The source revision is abandoned if all changes are absorbed and it has no description.

The modifications made by absorb can be reviewed with `jj op show -p`.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1), [git-absorb](/man/git-absorb)(1)

