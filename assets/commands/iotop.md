# TAGLINE

top-like utility for monitoring disk I/O usage by processes in real-time

# TLDR

**Start iotop** (shows all processes)

```sudo iotop```

**Show only processes doing I/O**

```sudo iotop -o```

**Show accumulated I/O** instead of bandwidth

```sudo iotop -a```

**Don't show threads** (processes only)

```sudo iotop -P```

**Non-interactive mode** with specific iterations

```sudo iotop -b -n [10]```

**Monitor specific process** by PID

```sudo iotop -p [PID]```

**Monitor specific user**

```sudo iotop -u [username]```

**Update every N seconds**

```sudo iotop -d [2]```

# SYNOPSIS

**iotop** [_-oaPbkqtd_] [_-n iterations_] [_-p pid_] [_-u user_]

# PARAMETERS

**-o**, **--only**
> Show only processes actually doing I/O.

**-a**, **--accumulated**
> Show accumulated I/O instead of bandwidth.

**-P**, **--processes**
> Show processes only, not threads.

**-b**, **--batch**
> Non-interactive batch mode (for logging).

**-n** _NUM_
> Number of iterations before exiting.

**-d** _SEC_
> Delay between updates in seconds.

**-p** _PID_
> Monitor specific process(es).

**-u** _USER_
> Monitor processes for specific user(s).

**-k**, **--kilobytes**
> Use kilobytes instead of human-readable.

**-t**, **--time**
> Add timestamp to each line (batch mode).

**-q**, **--quiet**
> Suppress header lines (batch mode).

# INTERACTIVE KEYS

**Left/Right arrows**
> Change sort column.

**r**
> Reverse sort order.

**o**
> Toggle showing only active processes.

**p**
> Toggle showing processes/threads.

**a**
> Toggle accumulated/bandwidth mode.

**q**
> Quit.

**i**
> Change ionice priority of selected process.

# DESCRIPTION

**iotop** is a top-like utility for monitoring disk I/O usage by processes in real-time. It displays a live view of read/write operations per process, helping identify which applications are causing disk activity.

The display shows columns for thread/process ID, priority, user, disk read rate, disk write rate, swap-in percentage, I/O percentage, and command. The I/O percentage indicates time spent waiting for I/O operations.

Accumulated mode (-a) is useful for finding processes that perform sporadic but significant I/O. Instead of showing instantaneous bandwidth, it shows total bytes read/written since iotop started, revealing processes that did heavy I/O even briefly.

The tool requires root privileges to access I/O accounting data from the kernel's taskstats interface. The kernel must have CONFIG_TASK_IO_ACCOUNTING enabled (most distributions include this).

Batch mode enables logging I/O activity over time. Combined with -t for timestamps, it can diagnose intermittent I/O issues by capturing activity during problem periods.

# CAVEATS

Requires root privileges. Kernel must have IO accounting enabled (CONFIG_TASK_IO_ACCOUNTING). Shows disk I/O, not network or other I/O. May add slight overhead. Some I/O may be attributed to kernel threads rather than user processes.

# HISTORY

**iotop** was written by Guillaume Chazarain and released around **2007**. It was created to fill the gap in Linux monitoring tools - while CPU and memory monitoring had top, disk I/O monitoring lacked an equivalent. The tool relies on kernel features added in Linux 2.6.20.

# SEE ALSO

[htop](/man/htop)(1), [top](/man/top)(1), [iostat](/man/iostat)(1), [vmstat](/man/vmstat)(8), [dstat](/man/dstat)(1)
