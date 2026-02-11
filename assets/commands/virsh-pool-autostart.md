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

**virsh pool-autostart** configures storage pool autostart. Pools with autostart enabled are automatically started when libvirtd starts.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-start](/man/virsh-pool-start)(1)

