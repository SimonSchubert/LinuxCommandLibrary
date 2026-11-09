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

**List persistent pools** that start automatically

```virsh pool-list --all --persistent --autostart```

**List pools of specific types**

```virsh pool-list --all --type [dir,logical]```

**Print only pool names** for scripting

```virsh pool-list --all --name```

# SYNOPSIS

**virsh** **pool-list** [**--inactive**|**--all**] [**--persistent**|**--transient**] [**--autostart**|**--no-autostart**] [**--details**|**--uuid**|**--name**] [**--type** _types_]

# PARAMETERS

**--all**
> List both active and inactive pools.

**--inactive**
> List only inactive pools.

**--persistent**
> List only persistent pools.

**--transient**
> List only transient pools.

**--autostart**
> List only pools with autostart enabled.

**--no-autostart**
> List only pools with autostart disabled.

**--details**
> Additionally show persistence, capacity, allocation, and available space. Cannot be combined with **--uuid** or **--name**.

**--uuid**
> Print only pool UUIDs.

**--name**
> Print only pool names. Combined with **--uuid**, prints UUIDs and names side by side without a header.

**--type** _types_
> Comma-separated pool types to list, such as dir, fs, netfs, logical, disk, iscsi, scsi, mpath, rbd, gluster, or zfs.

# DESCRIPTION

**virsh pool-list** displays storage pools managed by libvirt. By default, only active pools are shown. The output includes pool name, state, and autostart configuration. Use --details for capacity and allocation information.

# SEE ALSO

[virsh](/man/virsh)(1), [virsh-pool-info](/man/virsh-pool-info)(1), [virsh-pool-define-as](/man/virsh-pool-define-as)(1), [virsh-pool-start](/man/virsh-pool-start)(1), [virsh-pool-destroy](/man/virsh-pool-destroy)(1)

# RESOURCES

```[Source code](https://gitlab.com/libvirt/libvirt)```

```[Homepage](https://libvirt.org/)```

```[Documentation](https://libvirt.org/manpages/virsh.html)```

<!-- verified: 2026-11-09 -->
