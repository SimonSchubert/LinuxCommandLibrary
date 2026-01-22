# TLDR

**List all device** mapper devices

```dmsetup ls```

**Show device status**

```dmsetup status [device_name]```

**Show detailed information**

```dmsetup info```

**Show device table**

```dmsetup table [device_name]```

**Create a device** mapper target

```dmsetup create [name] --table "[0 size linear /dev/sda 0]"```

**Remove a device**

```dmsetup remove [device_name]```

**Suspend a device**

```dmsetup suspend [device_name]```

# SYNOPSIS

**dmsetup** _command_ [_options_] [_device_name_]

# PARAMETERS

_COMMAND_
> Operation: ls, status, info, table, create, remove, etc.

**ls**
> List device mapper devices.

**status** [_DEVICE_]
> Show device status.

**info** [_DEVICE_]
> Show detailed information.

**table** [_DEVICE_]
> Show device table.

**create** _NAME_
> Create new device.

**remove** _DEVICE_
> Remove device.

**suspend**/**resume** _DEVICE_
> Suspend/resume device.

**--table** _TABLE_
> Device table specification.

# DESCRIPTION

**dmsetup** is the low-level administration tool for the Linux device-mapper. Device-mapper provides a generic way to create virtual block devices that map onto physical devices through various target types.

The tool can create, configure, and manage device-mapper devices including linear mappings, striped volumes, snapshots, mirrors, and more. It's the foundation underlying LVM, dm-crypt, and other Linux storage technologies.

While typically used indirectly through LVM or cryptsetup, dmsetup provides direct access for debugging, custom configurations, or understanding device-mapper internals.

# CAVEATS

Requires root privileges. Incorrect use can cause data loss. Tables must specify valid targets and parameters. Some operations require suspended devices.

# HISTORY

dmsetup is part of the **device-mapper** component of **LVM2**, developed primarily by **Red Hat** and **Sistina Software**. Device-mapper was merged into the Linux kernel in **2003**, providing the foundation for flexible storage management.

# SEE ALSO

[lvm](/man/lvm)(8), [cryptsetup](/man/cryptsetup)(8), [dmraid](/man/dmraid)(8)
