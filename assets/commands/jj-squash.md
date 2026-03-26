# TAGLINE

moves changes from a revision into its parent or a specified destination in Jujutsu

# TLDR

**Squash working copy into its parent**

```jj squash```

**Squash a specific revision into its parent**

```jj squash -r [revision]```

**Interactively select which parts to squash**

```jj squash -i```

**Squash into a specific destination revision**

```jj squash --into [destination]```

**Squash from one revision into another**

```jj squash --from [source] --into [destination]```

**Squash with a custom description message**

```jj squash -m "[message]"```

**Squash only specific file paths**

```jj squash [path/to/file]```

# SYNOPSIS

**jj** **squash** [_options_] [_FILESETS_]

# PARAMETERS

**-r**, **--revision** _REVSET_
> Revision to squash into its parent (default: @).

**-f**, **--from** _REVSETS_
> Revision(s) to squash from (default: @).

**-t**, **--into** _REVSET_
> Revision to squash into (default: parent of source).

**-i**, **--interactive**
> Interactively choose which parts to squash.

**--tool** _NAME_
> Specify diff editor to use (implies --interactive).

**-m**, **--message** _MESSAGE_
> Description for the squashed revision (don't open editor).

**-u**, **--use-destination-message**
> Use the description of the destination revision and discard the source description(s).

**-k**, **--keep-emptied**
> Do not abandon the source revision even if it becomes empty.

# DESCRIPTION

**jj squash** moves changes from a revision into its parent or a specified destination in Jujutsu. Without options, it moves all changes from the working-copy commit (@) into its parent. The source commit becomes empty and is abandoned by default. Use **--from** and **--into** to move changes between arbitrary revisions. You can restrict the operation to specific file paths by passing filesets as arguments.

# SEE ALSO

[jj](/man/jj)(1), [jj-abandon](/man/jj-abandon)(1), [jj-split](/man/jj-split)(1), [jj-diffedit](/man/jj-diffedit)(1)

