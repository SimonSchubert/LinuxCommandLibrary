# TAGLINE

shows differences between revisions in Jujutsu

# TLDR

**Show working copy diff**

```jj diff```

**Diff specific revision**

```jj diff -r [revision]```

**Diff between revisions**

```jj diff --from [rev1] --to [rev2]```

**Diff specific file**

```jj diff [file]```

# SYNOPSIS

**jj** **diff** [_options_] [_paths_...]

# PARAMETERS

**-r**, **--revision** _rev_
> Show changes in revision.

**--from** _rev_
> Start revision for comparison.

**--to** _rev_
> End revision for comparison.

**-s**, **--summary**
> Show summary only.

**--stat**
> Show diffstat.

# DESCRIPTION

**jj diff** shows differences between revisions in Jujutsu. By default, shows changes in the working copy. Use **-r** for specific revision or **--from/--to** for range comparisons.

# SEE ALSO

[jj](/man/jj)(1), [jj-status](/man/jj-status)(1)

