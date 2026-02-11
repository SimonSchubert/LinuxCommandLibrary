# TAGLINE

Stop the pueue daemon process

# TLDR

**Shutdown pueue daemon**

```pueue shutdown```

# SYNOPSIS

**pueue** **shutdown**

# DESCRIPTION

**pueue shutdown** stops the pueue daemon. All running tasks are killed. Queued tasks remain in state and resume when daemon restarts. Use for system shutdown or daemon restart.

# CAVEATS

Running tasks are killed immediately without completion.

# SEE ALSO

[pueue](/man/pueue)(1), [pueued](/man/pueued)(1)

