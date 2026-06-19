# TAGLINE

Parse and display block I/O trace data

# TLDR

**Parse and display blktrace output** for a device

```blkparse [sda]```

**Parse multiple devices**

```blkparse [sda] [sdb]```

**Parse from stdin** (live mode with blktrace)

```blktrace -d [/dev/sda] -o - | blkparse -i -```

**Output to a file**

```blkparse [sda] -o [output.txt]```

**Show specific output fields**

```blkparse -f "%D %a %S %n\n" [sda]```

**Parse with quiet output** (summary only)

```blkparse -q [sda]```

# SYNOPSIS

**blkparse** [_options_] [_device_...]

# DESCRIPTION

**blkparse** produces formatted output from event streams recorded by **blktrace**. It combines event streams from multiple CPUs and devices, converting machine-readable trace data into human-readable format.

The tool is essential for analyzing block I/O patterns, debugging storage performance issues, and understanding how the Linux I/O scheduler processes requests.

# PARAMETERS

**-i** _file_
> Base name for input files (default device.blktrace.cpu); use "-" for live stdin

**-o** _file_
> Output file (default: stdout)

**-D** _dir_
> Prepend this directory to the input file names

**-d** _file_
> Dump a merged binary event stream to _file_

**-f** _format_
> Custom output format string for all events

**-F** _typ,format_
> Output format string for a specific event type

**-q**
> Quiet mode; only print summary at end

**-s**
> Show per-program (per-process) statistics

**-t**
> Track I/O timing; display time deltas per I/O

**-w** _span_
> Limit output to a time window; _end_ or _start:end_ in nanoseconds

**-a** _mask_
> Add _mask_ to the current trace action filter

**-A** _hexmask_
> Set the trace action filter to _hexmask_

**-v**
> More verbose output

# TRACE ACTIONS

**Q** - Queued: Intent to queue I/O noted
**I** - Inserted: Request sent to I/O scheduler
**D** - Issued: Request sent to driver
**C** - Complete: Request completed
**M** - Back merge: Request merged with existing
**F** - Front merge: Request merged at front
**P** - Plug: Queue plugged
**U** - Unplug: Queue unplugged

# CAVEATS

Requires trace data from **blktrace** to function. Trace files can become very large for busy systems. Running blktrace requires root privileges. Output can be overwhelming; use format options to limit fields.

# HISTORY

blkparse was written by **Jens Axboe**, **Alan D. Brunelle**, and **Nathan Scott** as part of the blktrace toolkit. It was developed to provide detailed I/O tracing capabilities for Linux storage subsystem analysis and debugging.

# SEE ALSO

[blktrace](/man/blktrace)(8), [btrace](/man/btrace)(8), [btt](/man/btt)(1), [iostat](/man/iostat)(1)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/linux/kernel/git/axboe/blktrace.git)```

<!-- verified: 2026-06-19 -->
