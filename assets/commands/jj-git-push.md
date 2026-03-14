# TAGLINE

pushes changes to Git remotes

# TLDR

**Push current bookmark**

```jj git push```

**Push specific bookmark**

```jj git push --bookmark [name]```

**Push all bookmarks**

```jj git push --all```

**Push to specific remote**

```jj git push --remote [origin]```

**Push a change by creating a bookmark automatically**

```jj git push --change [change_id]```

**Dry run**

```jj git push --dry-run```

**Push tracked bookmarks and delete removed ones**

```jj git push --tracked --deleted```

# SYNOPSIS

**jj git push** [_options_]

# PARAMETERS

**-b**, **--bookmark** _NAME_
> Bookmark to push (can be repeated).

**--all**
> Push all bookmarks.

**--tracked**
> Push all tracked bookmarks.

**--deleted**
> Push bookmarks that have been deleted locally.

**-c**, **--change** _CHANGE_
> Push this change by creating a bookmark based on the change ID.

**-r**, **--revisions** _REVISIONS_
> Push bookmarks pointing to the specified revisions.

**--remote** _NAME_
> Target remote (default: origin).

**--dry-run**
> Show what would be pushed without actually pushing.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jj git push** pushes changes to Git remotes. It translates jj bookmarks to Git branches for pushing. All commits in the range from the remote's current position up to and including the bookmark's target commit are pushed.

The **--change** flag is convenient for pushing a single change without manually creating and managing a bookmark.

# CAVEATS

Requires a bookmark on the changes to push. The remote must already be configured. Empty revisions produce a warning when bookmarked.

# HISTORY

jj git push is part of **Jujutsu**, enabling collaboration through Git hosting services.

# SEE ALSO

[jj](/man/jj)(1), [jj-git](/man/jj-git)(1), [git-push](/man/git-push)(1)
