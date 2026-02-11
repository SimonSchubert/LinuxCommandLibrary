# TAGLINE

Dynamic system performance tuning daemon

# TLDR

**Start the tuned daemon**

```sudo systemctl start tuned```

**Enable tuned at boot**

```sudo systemctl enable tuned```

**List available profiles**

```tuned-adm list```

**Show active profile**

```tuned-adm active```

**Apply a performance profile**

```sudo tuned-adm profile [throughput-performance]```

**Get recommended profile**

```tuned-adm recommend```

**Disable tuning**

```sudo tuned-adm off```

# SYNOPSIS

**tuned** [_options_]

**tuned-adm** _command_ [_arguments_]

# PROFILES

**balanced**: General purpose; balances performance and power.

**throughput-performance**: Maximum throughput for servers.

**latency-performance**: Minimize latency for real-time workloads.

**powersave**: Reduce power consumption.

**virtual-guest**: Optimized for virtual machine guests.

**virtual-host**: Optimized for hypervisor hosts.

**network-latency**: Low latency network tuning.

**network-throughput**: High network throughput.

# TUNED-ADM COMMANDS

**list**: Show available profiles.

**active**: Display currently active profile.

**profile** _name_: Activate specified profile.

**recommend**: Suggest optimal profile for system.

**off**: Disable all tuning.

**verify**: Check if current settings match profile.

# DESCRIPTION

**tuned** is a daemon that monitors system usage and dynamically adjusts system settings to optimize performance. It uses profiles that configure CPU governors, disk I/O schedulers, kernel parameters, and power management settings.

The daemon can operate in static mode (applying fixed settings from a profile) or dynamic mode (adjusting settings based on real-time system activity). Profiles are stored in /etc/tuned/ and /usr/lib/tuned/.

Management is done through tuned-adm, which communicates with the daemon to switch profiles and query status. Custom profiles can be created by extending existing ones or defining new tuning rules.

# CONFIGURATION

**/etc/tuned/tuned-main.conf**
> Main daemon configuration controlling dynamic tuning, update interval, and logging.

**/etc/tuned/**_profile_**/tuned.conf**
> Custom profile definitions with kernel, disk, and CPU tuning parameters.

**/usr/lib/tuned/**
> System-provided default profiles directory.

# CAVEATS

Dynamic tuning is disabled by default on RHEL. Profile changes take effect immediately but don't persist reboots without enabling the service. Some settings may conflict with other system management tools.

# HISTORY

**tuned** was developed by Red Hat for enterprise Linux systems to simplify performance optimization. It evolved from manual kernel tuning practices into an automated system that applies best practices based on workload type, reducing the expertise required for system optimization.

# SEE ALSO

[tuned-adm](/man/tuned-adm)(8), [cpupower](/man/cpupower)(1), [sysctl](/man/sysctl)(8), [ionice](/man/ionice)(1)
