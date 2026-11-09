# TAGLINE

Reload systemd unit configuration

# TLDR

**Reload** systemd configuration

```systemctl daemon-reload```

Reload the **user** service manager

```systemctl --user daemon-reload```

# SYNOPSIS

**systemctl daemon-reload** [_OPTIONS_]

# PARAMETERS

**--user**
> Reload the calling user's service manager instead of PID 1

# DESCRIPTION

**systemctl daemon-reload** reloads the systemd manager configuration, scanning for new or modified unit files. This command must be run after creating, modifying, or deleting unit files for the changes to take effect.

The reload reruns all generators, reloads all unit files, and recreates the entire dependency tree. Sockets that systemd listens on stay accessible meanwhile. Running services are not affected; their new configuration applies on the next start. Not to be confused with `systemctl reload`, which asks a unit to reload its own configuration.

# CAVEATS

Does not restart or affect currently running services. To apply configuration changes to running services, use `systemctl restart` after the reload. Errors in unit files are logged to the journal and do not prevent other units from loading.

# HISTORY

The **daemon-reload** subcommand is a fundamental part of the **systemd** workflow. It provides a safe way to update configuration without interrupting running services.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-daemon-reexec](/man/systemctl-daemon-reexec)(1), [systemctl-reload](/man/systemctl-reload)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
