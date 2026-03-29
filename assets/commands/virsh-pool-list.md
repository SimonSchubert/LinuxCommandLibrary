# TAGLINE

List libvirt storage pools

# TLDR

**List active pools**

```virsh pool-list```

**List all pools including inactive**

```virsh pool-list --all```

**List only inactive pools**

```virsh pool-list --inactive```

**List all pools with capacity details**

```virsh pool-list --all --details```

# SYNOPSIS

**virsh** **pool-list** [_options_]

# PARAMETERS

**--all**
> List both active and inactive pools.

**--inactive**
> List only inactive pools.

**--details**
> Show detailed information including capacity, allocation, and available space.

**--uuid**
> Display pool UUIDs.

**--name**
> Display pool names only.

**--autostart**
> Show autostart status.

# DESCRIPTION

**virsh pool-list** displays storage pools managed by libvirt. By default, only active pools are shown. The output includes pool name, state, and autostart configuration. Use --details for capacity and allocation information.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-info](/man/virsh-pool-info)(1), [virsh-pool-define-as](/man/virsh-pool-define-as)(1), [virsh-pool-start](/man/virsh-pool-start)(1), [virsh-pool-destroy](/man/virsh-pool-destroy)(1)

