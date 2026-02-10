# TAGLINE

used to query information about the systemd userspace out-of-memory

# TLDR

Show the current state of the cgroups and system contexts stored by **systemd-oomd**

```oomctl dump```

# SYNOPSIS

**oomctl** [_OPTIONS_...] _COMMAND_

# PARAMETERS

**dump**
> Show the current state of cgroups and system contexts monitored by systemd-oomd

**-h**, **--help**
> Print help text and exit

**--version**
> Print version string and exit

**--no-pager**
> Do not pipe output into a pager

# DESCRIPTION

**oomctl** is used to query information about the systemd userspace out-of-memory (OOM) killer, **systemd-oomd**. It displays the various cgroup contexts that systemd-oomd is monitoring for memory pressure and swap usage.

The systemd-oomd service monitors cgroups that have ManagedOOMSwap or ManagedOOMMemoryPressure enabled, using PSI (Pressure Stall Information) statistics to determine when memory pressure exceeds configured thresholds. When limits are exceeded, it selects and terminates a cgroup by sending SIGKILL to all its processes.

# CAVEATS

Requires systemd with full unified cgroup hierarchy (cgroups-v2) and memory accounting enabled for monitored units. The kernel must be compiled with PSI support (Linux 4.20+). System should have swap enabled for systemd-oomd to function optimally; without swap, the system may enter a livelocked state before oomd can respond.

# HISTORY

Introduced in **systemd version 247** (2020) as part of the systemd-oomd userspace OOM killer implementation. Provides a more intelligent alternative to the kernel OOM killer by using PSI metrics to proactively manage memory pressure before the system becomes unresponsive.

# SEE ALSO

[systemctl](/man/systemctl)(1), [journalctl](/man/journalctl)(1), [systemd](/man/systemd)(1)
