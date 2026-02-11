# TAGLINE

Reset pueue daemon to clean state

# TLDR

**Reset pueue state**

```pueue reset```

**Force reset**

```pueue reset --force```

# SYNOPSIS

**pueue** **reset** [_options_]

# PARAMETERS

**-f**, **--force**
> Kill running tasks and reset.

# DESCRIPTION

**pueue reset** kills all running tasks and removes all task history. Resets the daemon to a clean state. Use with caution as it removes all queued and completed tasks.

# CAVEATS

This command permanently removes all task history and kills running tasks.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-clean](/man/pueue-clean)(1)

