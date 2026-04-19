# TAGLINE

Configure storage pool autostart

# TLDR

**Enable pool autostart**

```virsh pool-autostart [pool]```

**Disable pool autostart**

```virsh pool-autostart [pool] --disable```

# SYNOPSIS

**virsh** **pool-autostart** _pool_ [_options_]

# PARAMETERS

**--disable**
> Disable autostart.

# DESCRIPTION

**virsh pool-autostart** configures whether a libvirt storage pool starts automatically with the libvirt daemon. When enabled, the pool becomes active at daemon startup; disabling it requires manual start via `virsh pool-start`. The setting is persisted in the pool's XML definition.

# CAVEATS

Only applies to persistent pools. Transient pools cannot be marked for autostart.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-start](/man/virsh-pool-start)(1), [virsh-pool-list](/man/virsh-pool-list)(1)

