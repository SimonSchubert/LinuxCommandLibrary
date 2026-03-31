# TAGLINE

updates the working directory to a specific revision

# TLDR

**Update to tip**

```hg update```

**Update to specific revision**

```hg update -r [revision]```

**Update to branch**

```hg update [branch-name]```

**Update to tag**

```hg update [tag-name]```

**Clean update discarding changes**

```hg update -C```

**Check for uncommitted changes first**

```hg update -c [revision]```

# SYNOPSIS

**hg** **update** [_options_] [_rev_]

# PARAMETERS

**-r**, **--rev** _rev_
> Revision to update to.

**-C**, **--clean**
> Discard uncommitted changes.

**-c**, **--check**
> Abort if uncommitted changes exist.

**-m**, **--merge**
> Merge uncommitted changes.

**-d**, **--date** _date_
> Tipmost revision matching date.

# DESCRIPTION

**hg update** (alias: **up**, **checkout**, **co**) updates the working directory to a specific revision. Without arguments, updates to the tip of the current branch. Can update to revisions, branches, tags, or bookmarks. Use **-C** to discard local changes or **-c** to abort if changes exist.

# SEE ALSO

[hg](/man/hg)(1), [hg-pull](/man/hg-pull)(1), [hg-commit](/man/hg-commit)(1), [hg-status](/man/hg-status)(1)

