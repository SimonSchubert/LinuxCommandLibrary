# TLDR

Add **Requires** dependency to a target

```systemctl add-requires [target] [unit]```

Add **multiple** dependencies

```systemctl add-requires [target] [unit1 unit2 ...]```

Add **user-level** dependency

```systemctl add-requires [target] [unit] --user```

# SYNOPSIS

**systemctl add-requires** _TARGET_ _UNIT_...

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

**systemctl add-requires** appends `Requires=` dependencies to a specified systemd target for one or more units. A `Requires=` relationship establishes a hard dependency: if any of the listed units fail to start, the target itself will also fail to activate.

This command provides a programmatic way to establish unit dependencies without manually editing unit files or creating symlinks in `.requires/` directories.

# CAVEATS

Changes made without --runtime are persistent and survive reboots. Hard dependencies (Requires) can cause cascading failures if a unit cannot start. Consider using add-wants for softer dependencies where failure should not propagate.

# HISTORY

The **add-requires** subcommand was added to **systemctl** in systemd version **217**. Systemd was created by **Lennart Poettering** and **Kay Sievers** at Red Hat and has been the default init system for most major Linux distributions since **2015**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-add-wants](/man/systemctl-add-wants)(1), [systemd.unit](/man/systemd.unit)(5)
