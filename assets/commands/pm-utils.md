# TAGLINE

Suspend and hibernate your computer

# TLDR

**Suspend to RAM (S3 sleep state)**

```sudo pm-suspend```

**Hibernate to disk (S4 sleep state)**

```sudo pm-hibernate```

**Hybrid suspend (save to disk then suspend to RAM)**

```sudo pm-suspend-hybrid```

**Check if suspend is supported**

```pm-is-supported --suspend && echo "Supported"```

**Check if hibernate is supported**

```pm-is-supported --hibernate && echo "Supported"```

**Enable power saving mode**

```sudo pm-powersave true```

# SYNOPSIS

**pm-suspend** | **pm-hibernate** | **pm-suspend-hybrid** [_options_]

# PARAMETERS

**--quirk-dpms-on**
> Force DPMS on after resume.

**--quirk-vbe-post**
> Re-POST the video BIOS on resume.

**--quirk-vbestate-restore**
> Save and restore VBE state on suspend/resume.

**--quirk-vbemode-restore**
> Save and restore VBE mode on suspend/resume.

**--quirk-radeon-off**
> Turn the screen off when suspending with a Radeon video chip.

**--quirk-s3-bios**
> Use S3 BIOS mode when suspending.

**--quirk-s3-mode**
> Use S3 mode when suspending.

# DESCRIPTION

**pm-utils** is a collection of power management utilities for Linux. It provides a framework for suspend, hibernate, and power saving with hardware quirk support.

**pm-suspend** puts the system into S3 (suspend to RAM). Most devices are shut down and system state is saved in RAM, requiring ongoing power. Most systems enter and leave suspend in 3 to 5 seconds.

**pm-hibernate** puts the system into S4 (suspend to disk). The system is fully powered off and state is saved to the swap partition. The system can stay hibernated indefinitely without power.

**pm-suspend-hybrid** first saves state to disk like hibernate, then suspends to RAM. This allows quicker wake if power is maintained, with a fallback to resume from disk if power is lost.

**pm-is-supported** tests whether a given sleep mode is supported by the system (exit code 0 means supported).

**pm-powersave** enables or disables power saving mode. Hook scripts in `/etc/pm/sleep.d/` and `/etc/pm/power.d/` are executed during transitions, allowing custom actions on suspend, resume, hibernate, and thaw events.

# CAVEATS

Deprecated in favor of systemd (use `systemctl suspend` or `systemctl hibernate` on systemd systems). Still used on non-systemd systems. Requires ACPI support. Hibernate requires a swap partition at least as large as RAM.

# HISTORY

**pm-utils** was developed by **Peter Jones** for **Fedora** and adopted by other Linux distributions as a standard power management interface. It provided a hook-based framework to handle hardware quirks during suspend/resume. With the widespread adoption of systemd, pm-utils has been largely superseded by systemd's built-in power management.

# SEE ALSO

[systemctl](/man/systemctl)(1), [rtcwake](/man/rtcwake)(8), [acpid](/man/acpid)(8)
