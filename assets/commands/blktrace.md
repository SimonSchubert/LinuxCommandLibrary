# TAGLINE

Trace block layer I/O events

# TLDR

**Trace block I/O** on a device

```blktrace -d [/dev/sda]```

**Trace with output to specific directory**

```blktrace -d [/dev/sda] -D [/tmp/traces]```

**Trace multiple devices**

```blktrace -d [/dev/sda] -d [/dev/sdb]```

**Trace for a specific duration**

```blktrace -d [/dev/sda] -w [10]```

**Trace and pipe to blkparse**

```blktrace -d [/dev/sda] -o - | blkparse -i -```

**Trace with specific buffer size**

```blktrace -d [/dev/sda] -b [1024]```

**Stop tracing** (in another terminal)

```killall blktrace```

# SYNOPSIS

**blktrace** [_options_]

# DESCRIPTION

**blktrace** is a Linux block layer I/O tracing utility that captures detailed information about block device operations. It tracks requests from submission through the I/O scheduler to completion, providing visibility into storage subsystem behavior.

The traces include information like queue insertions, merges, dispatch to driver, and completion events. Each event contains timestamp, process ID, action code, and I/O parameters (sector, size, flags).

blktrace produces binary trace files that are analyzed with blkparse, btt, or other tools. It's invaluable for diagnosing I/O performance issues, understanding workload patterns, and tuning storage configurations.

# PARAMETERS

**-d** _device_
> Device to trace (can specify multiple).

**-o** _file_
> Output file base name.

**-D** _dir_
> Directory for output files.

**-w** _seconds_
> Trace duration in seconds.

**-b** _size_
> Per-CPU buffer size in KB.

**-n** _num_
> Number of per-CPU buffers.

**-a** _action_
> Trace only specific actions.

**-A** _mask_
> Set action mask.

**-r** _relay_
> Use specific debugfs relay path.

**-I** _devs_
> Add multiple devices from file.

**-h**
> Display help.

**-V**
> Display version.

# CAVEATS

Requires root privileges. Must have debugfs mounted (usually at /sys/kernel/debug). Creates binary trace files per CPU that need blkparse to read. High I/O rates can produce large trace files quickly. May impact performance on very busy systems due to trace overhead.

# HISTORY

**blktrace** was developed by **Jens Axboe** and merged into the Linux kernel in version **2.6.17** (released **2006**). It was created to provide detailed insight into the Linux block I/O layer, replacing older and less detailed tracing methods. The tool has become standard for storage performance analysis on Linux and is part of the blktrace package alongside blkparse and btt.

# SEE ALSO

[blkparse](/man/blkparse)(1), [btt](/man/btt)(1), [iostat](/man/iostat)(1), [iotop](/man/iotop)(1)
