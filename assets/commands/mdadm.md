# TLDR

**Create** RAID array

```sudo mdadm --create /dev/md/MyRAID --level raid1 --raid-devices 2 /dev/sda1 /dev/sdb1```

**Stop** array

```sudo mdadm --stop /dev/md0```

Mark disk **failed**

```sudo mdadm --fail /dev/md0 /dev/sda1```

**Remove** disk

```sudo mdadm --remove /dev/md0 /dev/sda1```

**Add** disk

```sudo mdadm --assemble /dev/md0 /dev/sdc1```

Show **details**

```sudo mdadm --detail /dev/md0```

**Clear** RAID metadata

```sudo mdadm --zero-superblock /dev/sda1```

# SYNOPSIS

**mdadm** [_mode_] [_OPTIONS_] _device_

# DESCRIPTION

**mdadm** manages Linux software RAID arrays (md devices). It can create, assemble, monitor, grow, and manage arrays of various RAID levels including RAID 0, 1, 5, 6, and 10.

# PARAMETERS

**--create** _device_
> Create a new array

**--assemble** _device_
> Assemble a previously created array

**--stop** _device_
> Stop an active array

**--detail** _device_
> Display detailed information about an array

**--examine** _device_
> Examine RAID superblock on a component device

**--fail** _device_ _component_
> Mark a component as failed

**--remove** _device_ _component_
> Remove a component from an array

**--add** _device_ _component_
> Add a component to an array

**--level** _level_
> RAID level (0, 1, 5, 6, 10, linear)

**--raid-devices** _n_
> Number of active devices in array

**--zero-superblock** _device_
> Erase RAID superblock from a device

# CAVEATS

Creating an array destroys existing data on component devices. RAID is not a backup solution. RAID 5/6 require minimum 3/4 devices respectively. Always monitor arrays for failed drives.

# HISTORY

**mdadm** is the modern Linux software RAID management tool, replacing older raidtools.

# SEE ALSO

[lsblk](/man/lsblk)(8), [blkid](/man/blkid)(8)
