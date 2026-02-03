# TLDR

**Simplify parent relationships**

```jj simplify-parents```

**Simplify specific revision**

```jj simplify-parents -r [revision]```

# SYNOPSIS

**jj** **simplify-parents** [_options_]

# PARAMETERS

**-r**, **--revision** _rev_
> Revision to simplify.

# DESCRIPTION

**jj simplify-parents** removes redundant parent edges from merge commits. When a commit has multiple parents where one is an ancestor of another, the redundant parent is removed. Cleans up unnecessary merge complexity.

# SEE ALSO

[jj](/man/jj)(1), [jj-rebase](/man/jj-rebase)(1)

