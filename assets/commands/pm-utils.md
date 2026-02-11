# TAGLINE

Linux power management utilities

# TLDR

**Suspend to RAM**

```sudo pm-suspend```

**Hibernate (suspend to disk)**

```sudo pm-hibernate```

**Check if suspend is supported**

```pm-is-supported --suspend && echo "Supported"```

**Hybrid suspend**

```sudo pm-suspend-hybrid```

# SYNOPSIS

**pm-suspend** | **pm-hibernate** | **pm-suspend-hybrid** [_options_]

# COMMANDS

**pm-suspend**
> Suspend to RAM (S3).

**pm-hibernate**
> Suspend to disk (S4).

**pm-suspend-hybrid**
> Suspend to both.

**pm-is-supported**
> Check support.

**pm-powersave**
> Power saving mode.

# DESCRIPTION

**pm-utils** is a collection of power management utilities for Linux. It provides a framework for suspend, hibernate, and power saving with hardware quirk support.

# EXAMPLES

```bash
# Check what's supported
pm-is-supported --suspend
pm-is-supported --hibernate

# Suspend to RAM
sudo pm-suspend

# Hibernate to swap
sudo pm-hibernate

# Hybrid (both RAM and disk)
sudo pm-suspend-hybrid
```

# HOOKS

```bash
/etc/pm/sleep.d/   # Sleep hooks
/etc/pm/power.d/   # Power hooks

# Hook script example
#!/bin/bash
case "$1" in
    suspend) service foo stop ;;
    resume)  service foo start ;;
esac
```

# QUIRKS

```
--quirk-dpms-on
--quirk-vbe-post
--quirk-vbestate-restore
```

# CAVEATS

Deprecated in favor of systemd. Still used on non-systemd systems. Requires ACPI support.

# HISTORY

pm-utils was developed for **Fedora** and other Linux distributions as a standard power management interface.

# SEE ALSO

[systemctl](/man/systemctl)(1), [rtcwake](/man/rtcwake)(8), [acpid](/man/acpid)(8)
