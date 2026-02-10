# TAGLINE

sends local changesets to a remote repository

# TLDR

**Push to default remote**

```hg push```

**Push to specific URL**

```hg push [url]```

**Push specific branch**

```hg push -b [branch]```

**Push specific revision**

```hg push -r [revision]```

**Force push**

```hg push -f```

**Push new branch**

```hg push --new-branch```

# SYNOPSIS

**hg push** [_options_] [_dest_]

# PARAMETERS

_DEST_
> Destination repository.

**-b**, **--branch** _BRANCH_
> Push specific branch.

**-r**, **--rev** _REV_
> Push up to revision.

**-f**, **--force**
> Force push.

**--new-branch**
> Allow pushing new branches.

**-B**, **--bookmark** _NAME_
> Push bookmark.

**--help**
> Display help information.

# DESCRIPTION

**hg push** sends local changesets to a remote repository. It transfers committed changes that the remote doesn't have.

The command verifies the push won't create multiple heads unless forced. It supports pushing specific branches or revisions.

# CAVEATS

Cannot push uncommitted changes. Force push can cause issues. Remote hooks may reject.

# HISTORY

Push is a core **Mercurial** command for distributed collaboration since version 1.0.

# SEE ALSO

[hg](/man/hg)(1), [hg-pull](/man/hg-pull)(1), [hg-outgoing](/man/hg-outgoing)(1)
