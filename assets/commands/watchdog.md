# TLDR

**Start watchdog daemon**

```sudo systemctl start watchdog```

**Enable at boot**

```sudo systemctl enable watchdog```

**Test configuration**

```sudo watchdog -v```

**Run in foreground**

```sudo watchdog -f```

**Force test mode**

```sudo watchdog -F```

# SYNOPSIS

**watchdog** [_options_]

# PARAMETERS

**-f**, **--foreground**
> Run in foreground, don't fork.

**-F**, **--force**
> Force test mode.

**-v**, **--verbose**
> Verbose output.

**-c** _file_
> Use specified configuration file.

**-s**, **--sync**
> Sync before reboot.

**--help**
> Display help.

# CONFIGURATION

Config file: /etc/watchdog.conf

Key settings: watchdog-device, interval, max-load-1, min-memory, and test commands.

# DESCRIPTION

**watchdog** is a daemon that monitors system health and resets the system if problems are detected. It periodically writes to /dev/watchdog to prevent the kernel from triggering a hardware reset.

The daemon can monitor various system conditions: load average, memory usage, file presence, process existence, temperature, and custom test scripts. If any check fails, the system reboots after logging the failure reason.

Hardware watchdog support requires appropriate kernel modules (e.g., iTCO_wdt for Intel). Software watchdog via the softdog module provides fallback when hardware isn't available.

# CAVEATS

Requires appropriate kernel watchdog driver. Improper configuration can cause unexpected reboots. Test thoroughly before production use. Software watchdog less reliable than hardware.

# HISTORY

**watchdog** was developed for Linux systems requiring high availability without human intervention. The concept dates to embedded systems where hardware watchdog timers ensure recovery from system hangs. The Linux implementation combines hardware timer support with software monitoring.

# SEE ALSO

[watchdog.conf](/man/watchdog.conf)(5), [systemd](/man/systemd)(1), [dmesg](/man/dmesg)(1)
