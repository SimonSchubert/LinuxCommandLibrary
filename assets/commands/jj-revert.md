# TLDR

**Revert changes from revision**

```jj revert -r [revision]```

**Revert multiple revisions**

```jj revert -r [rev1] -r [rev2]```

# SYNOPSIS

**jj** **revert** [_options_]

# PARAMETERS

**-r**, **--revision** _rev_
> Revision to revert.

# DESCRIPTION

**jj revert** creates a new commit that undoes the changes from specified revisions. The original commits remain in history. Unlike restore, revert creates new commits to reverse changes.

# SEE ALSO

[jj](/man/jj)(1), [jj-restore](/man/jj-restore)(1), [jj-undo](/man/jj-undo)(1)

