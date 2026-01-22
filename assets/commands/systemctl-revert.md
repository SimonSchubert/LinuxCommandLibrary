# TLDR

**Revert** units to vendor defaults

```systemctl revert [unit1 unit2 ...]```

Revert **user** unit

```systemctl revert [unit] --user```

# SYNOPSIS

**systemctl revert** _UNIT_...

# PARAMETERS

**--user**
> Operate on user units

# DESCRIPTION

**systemctl revert** restores unit files to their original vendor versions by removing all local customizations. This undoes the effects of `edit`, `enable`, `disable`, `set-property`, and `mask` commands.

It removes drop-in files from `/etc/systemd/system/<unit>.d/`, the unit file from `/etc/systemd/system/` if it's a local copy, and any symlinks created by enable/disable/mask.

# CAVEATS

Irreversibly removes all local customizations. Cannot recover deleted customizations without backups. Use carefully on production systems.

# HISTORY

The **revert** subcommand provides a clean way to reset unit configuration to distribution defaults, useful when troubleshooting or when customizations are no longer needed.

# SEE ALSO

[systemctl-edit](/man/systemctl-edit)(1), [systemctl-mask](/man/systemctl-mask)(1), [systemctl](/man/systemctl)(1)
