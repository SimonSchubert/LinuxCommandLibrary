# TAGLINE

combines a commit's changes into its parent in Jujutsu

# TLDR

**Squash into parent**

```jj squash```

**Squash specific revision into parent**

```jj squash -r [revision]```

**Squash interactively**

```jj squash -i```

**Squash into specific destination**

```jj squash --into [destination]```

# SYNOPSIS

**jj** **squash** [_options_]

# PARAMETERS

**-r**, **--revision** _rev_
> Revision to squash.

**--into** _rev_
> Destination commit.

**-i**, **--interactive**
> Select changes interactively.

**-m**, **--message** _msg_
> New commit message.

**--keep-emptied**
> Keep the emptied source commit instead of abandoning it.

# DESCRIPTION

**jj squash** combines a commit's changes into its parent (or a specified destination) in Jujutsu. The squashed commit becomes empty and can be abandoned. Use **-i** to interactively select which changes to squash.

# SEE ALSO

[jj](/man/jj)(1), [jj-abandon](/man/jj-abandon)(1)

