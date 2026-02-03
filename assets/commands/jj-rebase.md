# TLDR

**Rebase current change onto destination**

```jj rebase -d [destination]```

**Rebase specific revision**

```jj rebase -r [revision] -d [destination]```

**Rebase branch onto main**

```jj rebase -b [branch] -d main```

# SYNOPSIS

**jj** **rebase** [_options_]

# PARAMETERS

**-r**, **--revision** _rev_
> Revision to rebase.

**-s**, **--source** _rev_
> Rebase this revision and descendants.

**-b**, **--branch** _rev_
> Rebase whole branch.

**-d**, **--destination** _rev_
> Destination to rebase onto.

# DESCRIPTION

**jj rebase** moves commits to a new base in Jujutsu. Automatically rebases descendant commits when modifying ancestors. Conflicts are recorded in commits and can be resolved later.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1)

