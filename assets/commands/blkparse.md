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
> Input file (use "-" for stdin)

**-o** _file_
> Output file (default: stdout)

**-d** _dir_
> Input directory for trace files

**-f** _format_
> Custom output format string

**-q**
> Quiet mode; only print summary at end

**-s**
> Show per-program statistics

**-t**
> Track individual I/O completions

**-w** _span_
> Time span to process (in seconds)

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
