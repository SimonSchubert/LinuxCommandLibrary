# TAGLINE

fast counterfeit flash memory detector

# TLDR

**Probe a flash drive** for counterfeit memory (destructive)

```sudo f3probe --destructive [/dev/sdX]```

**Probe with timing information**

```sudo f3probe --destructive --time-ops [/dev/sdX]```

**Probe with minimal memory usage** (slower but uses less RAM)

```sudo f3probe --destructive --min-memory [/dev/sdX]```

**Probe without restoring data** (faster, data lost)

```sudo f3probe --destructive -n [/dev/sdX]```

**Force a specific block size**

```sudo f3probe --destructive --block-order=[9] [/dev/sdX]```

# SYNOPSIS

**f3probe** [_OPTIONS_] _DEVICE_

# PARAMETERS

**-b**, **--block-order**=_ORDER_
> Force block size of the drive to 2^ORDER bytes.

**-l**, **--min-memory**
> Trade speed for less memory usage.

**-n**, **--destructive**
> Do not restore blocks after probing (faster but data is lost).

**-s**, **--reset-type**=_TYPE_
> Reset method to use during the probe.

**-t**, **--time-ops**
> Time reads, writes, and resets for diagnostic output.

**-?**, **--help**
> Display help message.

**-V**, **--version**
> Print program version.

# DESCRIPTION

**f3probe** is part of the F3 (Fight Flash Fraud) suite and detects counterfeit flash memory devices such as USB drives and SD cards that report false storage capacities. Many fake drives claim large sizes (e.g., 256GB) but contain only a fraction of that memory, causing data loss when the actual capacity is exceeded.

The tool works by writing unique sequential patterns from the end of the reported capacity backwards. When readback fails due to non-existent flash cells, it identifies the actual usable capacity. f3probe operates directly on the unmounted block device and requires root privileges.

If a fake drive is detected, f3probe reports the fake type and real memory size. The output can be used with **f3fix** to create a partition that fits the actual size of the drive.

# CAVEATS

**f3probe destroys all data on the tested device.** Never use on mounted filesystems, HDDs, or drives containing important data. Always unmount the device before testing. Testing can take considerable time on large drives. The device path can be found using **lsblk** command.

# HISTORY

F3 (Fight Flash Fraud) was created by Michel Machado to combat the widespread problem of counterfeit flash storage devices being sold online. These fake drives use modified firmware to report false capacities, leading to data corruption when users attempt to store more data than the actual capacity. The tool has become essential for verifying flash storage before trusting it with important data.

# SEE ALSO

[f3write](/man/f3write)(1), [f3read](/man/f3read)(1), [f3fix](/man/f3fix)(1), [lsblk](/man/lsblk)(8), [badblocks](/man/badblocks)(8)
