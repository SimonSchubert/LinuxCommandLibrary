# TAGLINE

Stop the pueue daemon process

# TLDR

**Shutdown pueue daemon**

```pueue shutdown```

# SYNOPSIS

**pueue** **shutdown**

# DESCRIPTION

**pueue shutdown** remotely shuts down the pueue daemon. All running tasks are killed. Queued and stashed tasks remain in state and resume when the daemon restarts. This should only be used if the daemon is not started by a service manager.

# CAVEATS

Running tasks are killed immediately without completion. If the daemon was started by a service manager (e.g., systemd), use the service manager to stop it instead.

# SEE ALSO

[pueue](/man/pueue)(1), [pueue-status](/man/pueue-status)(1), [pueue-stash](/man/pueue-stash)(1)

