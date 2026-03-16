# TAGLINE

Change the working copy revision relative to the parent revision

# TLDR

**Move to the parent revision**

```jj prev```

**Move multiple steps back**

```jj prev [3]```

**Move and directly edit the parent revision**

```jj prev --edit```

**Jump to the previous conflicted ancestor**

```jj prev --conflict```

# SYNOPSIS

**jj** **prev** [_OPTIONS_] [_OFFSET_]

# PARAMETERS

_OFFSET_
> Number of revisions to move backward. Default: **1**.

**-e**, **--edit**
> Edit the parent directly, instead of moving the working-copy commit. Overrides the **ui.movement.edit** configuration.

**-n**, **--no-edit**
> Inverse of --edit; create a new working-copy commit on top of the destination.

**--conflict**
> Jump to the previous conflicted ancestor.

# DESCRIPTION

**jj prev** moves the working-copy commit to an ancestor revision. By default it creates a new empty working-copy revision as a child of the target ancestor. With **--edit**, it directly edits the ancestor revision instead.

This command is a convenient shorthand for navigating backward through commit history in the Jujutsu version control system.

# SEE ALSO

[jj](/man/jj)(1), [jj-next](/man/jj-next)(1), [jj-log](/man/jj-log)(1)

