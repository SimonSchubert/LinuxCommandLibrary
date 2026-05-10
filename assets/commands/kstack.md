# TAGLINE

Capture kernel stack traces for selected processes (Oracle Linux Enhanced Diagnostics)

# TLDR

**Show kernel stacks for all processes once**

```kstack -a```

**Show kernel stacks for processes waiting on I/O**

```kstack -D```

**Show kernel stacks for specific PIDs**

```kstack -p [pid1],[pid2]```

**Combine selectors: D-state plus PIDs**

```kstack -Dp [pid1],[pid2]```

**Sample D-state processes every 30 seconds for 30 minutes in the background**

```kstack -D -b -t [30] -i [30]```

**Background sampling, write logs to a custom directory**

```kstack -b -d [/var/log/kstack]```

# SYNOPSIS

**kstack** **-a** | **-DIRSZ** **-p** _PID_[**,**...] [_options_]

# PARAMETERS

**-a**
> All processes (cannot be combined with the state selectors).

**-D**
> Processes in the **D** state (uninterruptible sleep, e.g. waiting on I/O or a lock).

**-R**
> Running or runnable processes.

**-S**
> Sleeping (interruptible) processes.

**-Z**
> Zombie processes.

**-p** _PID_[**,**...]
> Dump kernel stacks for the listed PIDs (comma-separated).

**-b**
> Run in background mode, sampling at intervals and writing files to disk.

**-t** _MINUTES_
> Number of minutes to run in background mode (default **30**).

**-i** _SECONDS_
> Sampling interval in seconds when in background mode (default **60**).

**-d** _DIRECTORY_
> Output directory for background-mode log files (default **/var/oled/kstack**).

**-m** _SIZE_MB_
> Maximum log-file size in megabytes before rotation and compression (default **1**).

**-n** _COUNT_
> Number of rotated log files to keep (default **5**).

**-x** _PERCENT_
> Refuse to run when the destination filesystem usage exceeds _PERCENT_ (default **85**).

**-h**, **--help**
> Show help text.

**-v**, **--verbose**
> Print debugging information.

# DESCRIPTION

**kstack** is a diagnostic utility from the **Oracle Linux Enhanced Diagnostics (OLED)** toolset that captures the kernel stack trace of one or more processes. It reads from **/proc/[pid]/stack** and **/proc/[pid]/status**, then groups processes that share an identical stack so duplicates are folded together.

In foreground mode (the default) **kstack** prints a single sample to standard output. In background mode (**-b**) it loops at a configured interval for a configured duration, writing rotated log files under **/var/oled/kstack** (overridable with **-d**). The state selectors **-D**, **-R**, **-S**, **-Z** and **-p** can be combined; **-a** is exclusive.

The tool is most often used to investigate hung tasks, I/O latency, and lock contention, where viewing the kernel call stack of a process in **D** state reveals which kernel function it is blocked in.

# CAVEATS

Must be run as **root**. Refuses to write to filesystems above **85%** utilisation by default (tunable with **-x**). On systems with very many processes, **-a** can produce large amounts of output. Provided by the **oled-tools** package on Oracle Linux 7, 8, and 9; not generally available on other distributions.

# HISTORY

**kstack** ships as part of **Oracle Linux Enhanced Diagnostics (OLED)**, a collection of debugging utilities open-sourced by Oracle in **2021** to support the diagnosis of complex kernel issues on Oracle Linux. The collection also includes **lkce**, **memstate**, **syswatch**, **trace**, and other tools.

# SEE ALSO

[oled](/man/oled)(8), [ps](/man/ps)(1), [top](/man/top)(1), [strace](/man/strace)(1), [perf](/man/perf)(1), [proc](/man/proc)(5)
