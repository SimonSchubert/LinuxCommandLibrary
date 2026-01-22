# TLDR

**Check** for updates

```updatectl check```

**Update** to latest version

```updatectl update```

**List** update targets

```updatectl list```

Show **target** data

```updatectl list [target]```

List target **offline**

```updatectl --offline list [target]```

Update and **reboot**

```updatectl --reboot update [target]```

**Clean up** old versions

```updatectl vacuum [target]```

# SYNOPSIS

**updatectl** [_OPTIONS_] _COMMAND_ [_TARGET_]

# COMMANDS

**check**
> Check for available updates

**update**
> Update to latest version

**list**
> Show update targets and versions

**vacuum**
> Clean up old versions

# PARAMETERS

**--offline**
> Use local data without network fetch

**--reboot**
> Reboot after applying update

**-h, --help**
> Display help information

# DESCRIPTION

**updatectl** is a systemd-based system update utility. It manages system updates including checking for new versions, applying updates, and cleaning up old versions.

The tool works with update targets which can represent different system components that can be updated independently.

# CAVEATS

Systemd-based systems only. Some operations require root privileges. Reboot may be required for certain updates to take effect.

# SEE ALSO

[systemctl](/man/systemctl)(1)
