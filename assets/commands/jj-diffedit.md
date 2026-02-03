# TLDR

**Edit revision in diff editor**

```jj diffedit```

**Edit specific revision**

```jj diffedit -r [revision]```

**Edit range between revisions**

```jj diffedit --from [rev1] --to [rev2]```

# SYNOPSIS

**jj** **diffedit** [_options_]

# PARAMETERS

**-r**, **--revision** _rev_
> Revision to edit.

**--from** _rev_
> Base revision for comparison.

**--to** _rev_
> Target revision to modify.

# DESCRIPTION

**jj diffedit** opens a diff editor to interactively modify the changes in a revision. Allows adding, removing, or changing hunks in a commit. The editor shows the diff and saves modifications back to the revision.

# SEE ALSO

[jj](/man/jj)(1), [jj-diff](/man/jj-diff)(1), [jj-split](/man/jj-split)(1)

