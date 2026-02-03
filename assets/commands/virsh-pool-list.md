# TLDR

**List active pools**

```virsh pool-list```

**List all pools**

```virsh pool-list --all```

**List with details**

```virsh pool-list --all --details```

# SYNOPSIS

**virsh** **pool-list** [_options_]

# PARAMETERS

**--all**
> Include inactive pools.

**--details**
> Show detailed info.

**--autostart**
> Show autostart status.

# DESCRIPTION

**virsh pool-list** displays storage pools. Shows pool name, state, and autostart configuration. Use --details for capacity information.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-info](/man/virsh-pool-info)(1)

