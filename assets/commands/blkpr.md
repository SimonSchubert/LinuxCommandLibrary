# TLDR

**Register** reservation

```blkpr -c register -k reservation_key /dev/sda```

**Reserve** exclusive access

```blkpr -c reserve -k key -t exclusive-access /dev/sda```

**Preempt** existing reservation

```blkpr -c preempt -K old_key -k new_key -t write-exclusive /dev/sda```

**Release** reservation

```blkpr -c release -k key -t type /dev/sda```

**Clear** all reservations

```blkpr -c clear -k key /dev/sda```

# SYNOPSIS

**blkpr** [_OPTIONS_] _device_

# DESCRIPTION

**blkpr** manages persistent reservations on block devices that support SCSI Persistent Reservations. It allows registering, reserving, releasing, preempting, and clearing reservations for shared storage access control.

# PARAMETERS

**-c, --command** _cmd_
> Command: register, reserve, release, preempt, clear

**-k, --key** _key_
> Reservation key

**-K, --oldkey** _key_
> Old key for preempt operations

**-t, --type** _type_
> Reservation type (exclusive-access, write-exclusive, etc.)

# CAVEATS

Requires devices that support SCSI Persistent Reservations. Used in clustered storage environments to coordinate access. Keys are typically 64-bit values.

# HISTORY

**blkpr** is part of **util-linux**, providing block device persistent reservation management.

# SEE ALSO

[sg_persist](/man/sg_persist)(8), [blockdev](/man/blockdev)(8)
