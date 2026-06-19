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

Get **physical sector size**

```sudo blockdev --getpbsz /dev/sda1```

Set **read-ahead** in 512-byte sectors

```sudo blockdev --setra 128 /dev/sda1```

**Reread** the partition table

```sudo blockdev --rereadpt /dev/sda```

# SYNOPSIS

**blockdev** [**-q**] [**-v**] _command_... _device_...

**blockdev** **--report** [_device_...]

# DESCRIPTION

**blockdev** queries and manipulates block device properties from the command line. It can report device sizes, set read-only/read-write modes, flush buffers, and configure performance parameters like read-ahead.

# PARAMETERS

**--report**
> Print a report for specified devices or all devices

**--getsz**
> Get size in 512-byte sectors

**--getsize64**
> Print device size in bytes

**--getss**
> Print logical sector size in bytes, usually 512

**--getpbsz**
> Get physical block (sector) size

**--getbsz**
> Print the blocksize in bytes (the value the kernel uses internally, file-descriptor specific)

**--getiomin**
> Get minimum I/O size

**--getioopt**
> Get optimal I/O size

**--getro**
> Get read-only state. Prints 1 if read-only, 0 otherwise

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

**--rereadpt**
> Reread the partition table

**-q**
> Be quiet

**-v**
> Be verbose

# CAVEATS

Requires root privileges. Setting a device read-only while mounted may cause issues. Changes to read-ahead affect I/O performance and may not be beneficial for all workloads.

# HISTORY

**blockdev** is part of the **util-linux** package, providing low-level block device management on Linux systems.

# SEE ALSO

[lsblk](/man/lsblk)(8), [blkid](/man/blkid)(8), [fdisk](/man/fdisk)(8), [hdparm](/man/hdparm)(8), [partprobe](/man/partprobe)(8)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://www.man7.org/linux/man-pages/man8/blockdev.8.html)```

<!-- verified: 2026-06-19 -->
