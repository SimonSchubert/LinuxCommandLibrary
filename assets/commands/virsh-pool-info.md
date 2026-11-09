# TAGLINE

Display storage pool details

# TLDR

**Show pool information**

```virsh pool-info [pool]```

**Show sizes in bytes**

```virsh pool-info [pool] --bytes```

**Show all pools info**

```virsh pool-list --details```

# SYNOPSIS

**virsh** **pool-info** [**--bytes**] _pool-or-uuid_

# PARAMETERS

**--bytes**
> Do not convert sizes to human-friendly units.

# DESCRIPTION

**virsh pool-info** displays storage pool details. Shows state, capacity, allocation, and availability. Useful for monitoring storage usage.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-list](/man/virsh-pool-list)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-09 -->
