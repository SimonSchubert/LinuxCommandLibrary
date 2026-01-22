# TLDR

**Suspend** the system

```systemctl suspend```

**Force** suspend

```systemctl suspend -f```

# SYNOPSIS

**systemctl suspend** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Force suspend even if inhibitors are present

**--no-wall**
> Don't send wall message to users

# DESCRIPTION

**systemctl suspend** puts the system into suspend mode (suspend-to-RAM), a low-power state where the system contents are kept in memory. Wake-up is fast since the system state doesn't need to be restored from disk.

Power is maintained to RAM to preserve the system state. This is the standard sleep mode for laptops and desktops.

# CAVEATS

System state is lost if power fails while suspended. Battery drain continues (slowly) during suspend. Some hardware may not support suspend reliably. Wake devices (keyboard, power button) must be configured.

# HISTORY

The **suspend** subcommand integrates system sleep into the systemd command interface, coordinating with power management and inhibitor locks.

# SEE ALSO

[systemctl-hibernate](/man/systemctl-hibernate)(1), [systemctl-hybrid-sleep](/man/systemctl-hybrid-sleep)(1), [systemctl-suspend-then-hibernate](/man/systemctl-suspend-then-hibernate)(1)
