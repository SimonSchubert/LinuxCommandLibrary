# TAGLINE

marks revisions as abandoned in Jujutsu

# TLDR

**Abandon current change**

```jj abandon```

**Abandon specific revision**

```jj abandon [revision]```

**Abandon multiple revisions**

```jj abandon [rev1] [rev2]```

# SYNOPSIS

**jj** **abandon** [_options_] [_revisions_...]

# DESCRIPTION

**jj abandon** marks revisions as abandoned in Jujutsu. Abandoned commits are hidden from default log output but remain in history. Their changes are rebased onto their parents. Useful for discarding work or empty commits after squashing.

# PARAMETERS

**-r**, **--revisions** _revsets_
> Revisions to abandon (deprecated in favor of positional arguments).

**-s**, **--summary**
> Do not print every abandoned commit on a separate line.

**--restore-descendants**
> Do not rebase descendants of abandoned commits onto their parents.

# CAVEATS

Abandoning a commit does not permanently delete it. It can still be accessed via `jj obslog` or by its change ID until garbage collected. If the working copy commit is abandoned, jj creates a new empty working copy commit.

# SEE ALSO

[jj](/man/jj)(1), [jj-squash](/man/jj-squash)(1), [jj-git-push](/man/jj-git-push)(1)

