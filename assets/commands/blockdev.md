# TAGLINE

Query and set block device parameters

# TLDR

**Report** all devices

```sudo blockdev --report```

Report **specific** device

```sudo blockdev --report /dev/sda1```

Get **size** in sectors

```sudo blockdev --getsz /dev/sda1```

Set **read-only**

```sudo blockdev --setro /dev/sda1```

Set **read-write**

```sudo blockdev --setrw /dev/sda1```

**Flush** buffers

```sudo blockdev --flushbufs /dev/sda1```

Get **block size**

```sudo blockdev --getpbsz /dev/sda1```

Set **read-ahead**

```sudo blockdev --setra 128 /dev/sda1```

# SYNOPSIS

**blockdev** [_OPTIONS_] _device_...

# DESCRIPTION

**blockdev** queries and manipulates block device properties from the command line. It can report device sizes, set read-only/read-write modes, flush buffers, and configure performance parameters like read-ahead.

# PARAMETERS

**--report**
> Print a report for specified devices or all devices

**--getsz**
> Get size in 512-byte sectors

**--getsize64**
> Get size in bytes

**--getpbsz**
> Get physical block size

**--getbsz**
> Get logical block size

**--setro**
> Set device to read-only

**--setrw**
> Set device to read-write

**--flushbufs**
> Flush buffers

**--setra** _sectors_
> Set read-ahead value in 512-byte sectors

**--getra**
> Get current read-ahead value

# CAVEATS

Requires root privileges. Setting a device read-only while mounted may cause issues. Changes to read-ahead affect I/O performance and may not be beneficial for all workloads.

# HISTORY

**blockdev** is part of the **util-linux** package, providing low-level block device management on Linux systems.

# SEE ALSO

[lsblk](/man/lsblk)(8), [blkid](/man/blkid)(8), [fdisk](/man/fdisk)(8)
