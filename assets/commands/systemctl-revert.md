# TAGLINE

Restore units to vendor defaults

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

**systemctl revert** restores unit files to their original vendor versions by removing all local customizations. This undoes the effects of the `edit`, `set-property`, and `mask` commands.

It removes matching `<unit>.d/` drop-in directories below `/etc/systemd/system/` and `/run/systemd/system/`, removes any local unit file there that overrides a vendor-supplied one, and unmasks the unit if it is masked.

# CAVEATS

Irreversibly removes all local customizations. A unit file with no vendor-supplied version below `/usr/` is not removed. Does not undo `enable` or `disable`. Cannot recover deleted customizations without backups. Use carefully on production systems.

# HISTORY

The **revert** subcommand provides a clean way to reset unit configuration to distribution defaults, useful when troubleshooting or when customizations are no longer needed. It has been documented since systemd 230.

# SEE ALSO

[systemctl-edit](/man/systemctl-edit)(1), [systemctl-mask](/man/systemctl-mask)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
