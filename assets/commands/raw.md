# TAGLINE

Bind raw character devices to block devices

# TLDR

**Bind** a raw character device to a block device

```raw /dev/raw/raw1 /dev/block_device```

**Query** an existing binding

```raw /dev/raw/raw1```

**Query all** bound raw devices

```raw -qa```

**Unbind** a raw device

```raw /dev/raw/raw1 0 0```

# SYNOPSIS

**raw** _/dev/raw/rawN_ _major_ _minor_

**raw** _/dev/raw/rawN_ _/dev/blockdev_

**raw** **-q** [**-a**] [_rawN_]

# PARAMETERS

**/dev/raw/raw**_N_
> Raw device node to bind or query

**-q**, **--query**
> Query binding for specified raw device

**-a**, **--all**
> Query all raw devices (with -q)

_major_ _minor_
> Block device specified by major/minor numbers; **0 0** removes the binding

_/dev/blockdev_
> Block device path to bind to raw device

# DESCRIPTION

**raw** binds Linux raw character devices to block devices, allowing direct (unbuffered) I/O access to the underlying storage. Raw devices bypass the kernel's buffer cache, providing direct access to block devices for applications that manage their own caching (like databases).

When a raw device is bound to a block device, reading and writing to the raw device performs synchronous, direct I/O to the underlying storage without kernel buffering.

# CAVEATS

The raw driver was **removed in Linux 5.14**, so this command only works on older kernels; use the O_DIRECT flag instead. On those kernels it requires the raw driver to be loaded (modprobe raw). All I/O must be sector-aligned in memory and on disk, and an exact number of sectors long. Raw device nodes must exist in /dev/raw/ before binding. Only root can bind raw devices.

# HISTORY

Raw devices were introduced in **Linux 2.4** to support databases like Oracle that required unbuffered I/O. The O_DIRECT flag added in later kernels provides similar functionality without dedicated raw devices, making this interface largely obsolete.

# SEE ALSO

[losetup](/man/losetup)(8), [dd](/man/dd)(1), [blockdev](/man/blockdev)(8)

# RESOURCES

```[Source code](https://github.com/util-linux/util-linux)```

```[Documentation](https://man7.org/linux/man-pages/man8/raw.8.html)```

<!-- verified: 2026-11-08 -->
