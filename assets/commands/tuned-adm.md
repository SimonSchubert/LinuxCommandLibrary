# TLDR

**List** available profiles

```tuned-adm list```

**Show** the currently active profile

```tuned-adm active```

**Set** a specific tuning profile

```tuned-adm profile [profile_name]```

**Recommend** a suitable profile based on the current system

```tuned-adm recommend```

**Disable** tuning

```tuned-adm off```

# SYNOPSIS

**tuned-adm** [_command_] [_arguments_]

# PARAMETERS

**list**
> List available tuning profiles

**active**
> Show currently active profile

**profile _name_**
> Switch to specified profile

**recommend**
> Recommend optimal profile for this system

**off**
> Disable tuned and reset to defaults

**verify**
> Verify current profile settings match configuration

**auto_profile**
> Enable/disable automatic profile selection

# DESCRIPTION

**tuned-adm** manages system performance tuning profiles provided by the **tuned** daemon. Profiles optimize various kernel and system parameters for specific workloads like throughput, latency, power saving, or virtualization.

Common profiles include: **balanced**, **throughput-performance**, **latency-performance**, **powersave**, **virtual-guest**, and **virtual-host**. The **recommend** command analyzes the system to suggest the best profile.

# CAVEATS

Requires the tuned service to be running. Profile changes take effect immediately. Some settings may require a reboot to fully apply. Available profiles vary by distribution.

# SEE ALSO

[tuned](/man/tuned)(8), [tuned.conf](/man/tuned.conf)(5), [cpupower](/man/cpupower)(1)
