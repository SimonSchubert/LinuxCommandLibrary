# TAGLINE

Reload systemd unit configuration

# TLDR

**Reload** systemd configuration

```systemctl daemon-reload```

# SYNOPSIS

**systemctl daemon-reload**

# DESCRIPTION

**systemctl daemon-reload** reloads the systemd manager configuration, scanning for new or modified unit files. This command must be run after creating, modifying, or deleting unit files for the changes to take effect.

The reload rescans all unit file directories, updates the dependency tree, and reloads modified units. Running services are not affected; only their configuration is updated for the next start.

# CAVEATS

Does not restart or affect currently running services. To apply configuration changes to running services, use `systemctl restart` after the reload. Errors in unit files will be reported but won't prevent the reload of other units.

# HISTORY

The **daemon-reload** subcommand is a fundamental part of the **systemd** workflow. It provides a safe way to update configuration without interrupting running services.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-daemon-reexec](/man/systemctl-daemon-reexec)(1), [systemctl-reload](/man/systemctl-reload)(1)
