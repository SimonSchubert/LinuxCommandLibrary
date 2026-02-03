# TLDR

**Show diff between two revisions' changes**

```jj interdiff --from [rev1] --to [rev2]```

**Show interdiff with context**

```jj interdiff --from [rev1] --to [rev2] --context [5]```

# SYNOPSIS

**jj** **interdiff** [_options_]

# PARAMETERS

**--from** _revision_
> First revision to compare.

**--to** _revision_
> Second revision to compare.

**--context** _lines_
> Number of context lines.

# DESCRIPTION

**jj interdiff** shows the difference between the changes introduced by two revisions. Unlike regular diff which compares file contents, interdiff compares what each revision changed relative to its parent. Useful for comparing different implementations of the same change.

# SEE ALSO

[jj](/man/jj)(1), [jj-diff](/man/jj-diff)(1)

