# TAGLINE

moves commits to a new base in Jujutsu

# TLDR

**Rebase current change onto destination**

```jj rebase -d [destination]```

**Rebase specific revision**

```jj rebase -r [revision] -d [destination]```

**Rebase current branch onto main**

```jj rebase -b @ -d main```

**Insert revision after destination**

```jj rebase -r [revision] -A [destination]```

# SYNOPSIS

**jj** **rebase** [_options_]

# PARAMETERS

**-r**, **--revisions** _rev_
> Rebase only the specified revisions, filling holes by rebasing descendants onto their parents.

**-s**, **--source** _rev_
> Rebase this revision and all its descendants as a subtree.

**-b**, **--branch** _rev_
> Rebase whole branch including ancestors not shared with the destination.

**-d**, **--destination** _rev_
> Destination to rebase onto.

**-A**, **--insert-after** _rev_
> Insert rebased revisions after target, rebasing target's descendants onto them.

**-B**, **--insert-before** _rev_
> Insert rebased revisions before target by rebasing onto target's parents.

# DESCRIPTION

**jj rebase** moves commits to a new base in Jujutsu. If none of **-b**, **-s**, or **-r** is specified, defaults to **-b @** (rebase current branch). Conflicts are recorded in commits and can be resolved later.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1)

