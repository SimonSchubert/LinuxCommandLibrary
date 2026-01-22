# TLDR

**Push current bookmark**

```jj git push```

**Push specific bookmark**

```jj git push --bookmark [name]```

**Push all bookmarks**

```jj git push --all```

**Push to specific remote**

```jj git push --remote [origin]```

**Dry run**

```jj git push --dry-run```

# SYNOPSIS

**jj git push** [_options_]

# PARAMETERS

**--bookmark** _NAME_
> Bookmark to push.

**--all**
> Push all bookmarks.

**--remote** _NAME_
> Target remote.

**--dry-run**
> Show what would be pushed.

**--help**
> Display help information.

# DESCRIPTION

**jj git push** pushes changes to Git remotes. It converts jj bookmarks to Git branches for pushing.

The command handles the translation between jj's model and Git refs. It supports selective or bulk pushing.

jj git push pushes to Git.

# CAVEATS

Subcommand of jj. Requires bookmark on changes. Remote must exist.

# HISTORY

jj git push is part of **Jujutsu**, enabling collaboration through Git hosting services.

# SEE ALSO

[jj](/man/jj)(1), [jj-git](/man/jj-git)(1), [git-push](/man/git-push)(1)
