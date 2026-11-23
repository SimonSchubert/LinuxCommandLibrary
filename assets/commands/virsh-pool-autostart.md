# TAGLINE

Configure storage pool autostart

# TLDR

**Enable pool autostart**

```virsh pool-autostart [pool]```

**Disable pool autostart**

```virsh pool-autostart [pool] --disable```

**List pools** marked for autostart

```virsh pool-list --all --autostart```

**Check** a pool's autostart setting

```virsh pool-info [pool]```

# SYNOPSIS

**virsh** **pool-autostart** _pool-or-uuid_ [**--disable**]

# PARAMETERS

_pool-or-uuid_
> Pool name or UUID.

**--disable**
> Disable autostart.

# DESCRIPTION

**virsh pool-autostart** configures whether a libvirt storage pool starts automatically when the libvirt storage driver starts, typically at boot. When enabled, the pool becomes active at daemon startup; otherwise it has to be started manually with `virsh pool-start`. The setting is stored as a symlink to the pool's XML file in **/etc/libvirt/storage/autostart/** (or **~/.config/libvirt/storage/autostart/** for qemu:///session).

# CAVEATS

Only applies to persistent pools. Transient pools have no config file and cannot be marked for autostart. Enabling autostart does not start the pool immediately.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-start](/man/virsh-pool-start)(1), [virsh-pool-list](/man/virsh-pool-list)(1), [virsh-pool-info](/man/virsh-pool-info)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-23 -->
