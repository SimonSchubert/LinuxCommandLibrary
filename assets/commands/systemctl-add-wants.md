# TLDR

Add **Wants** dependency to a target

```systemctl add-wants [target] [unit]```

Add **multiple** dependencies

```systemctl add-wants [target] [unit1 unit2 ...]```

Add **user-level** dependency

```systemctl add-wants [target] [unit] --user```

# SYNOPSIS

**systemctl add-wants** _TARGET_ _UNIT_...

# PARAMETERS

**--system**
> Operate on system configuration (default)

**--user**
> Operate on user configuration

**--runtime**
> Make temporary changes until reboot

**--global**
> Apply globally for all user logins

# DESCRIPTION

**systemctl add-wants** appends `Wants=` dependencies to a specified systemd target for one or more units. A `Wants=` relationship establishes a soft dependency: the target will attempt to start the listed units, but will not fail if they cannot be activated.

This command provides a programmatic way to establish unit dependencies without manually editing unit files or creating symlinks in `.wants/` directories. It is commonly used to enable services at specific boot targets.

# CAVEATS

Changes made without --runtime are persistent and survive reboots. Wants dependencies are weaker than Requires; units may fail to start without affecting the target. For critical dependencies where failure should propagate, use add-requires instead.

# HISTORY

The **add-wants** subcommand was added to **systemctl** in systemd version **217**. Systemd was created by **Lennart Poettering** and **Kay Sievers** at Red Hat and has been the default init system for most major Linux distributions since **2015**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-add-requires](/man/systemctl-add-requires)(1), [systemd.unit](/man/systemd.unit)(5)
