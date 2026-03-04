# TAGLINE

Top-like TUI for the Austin Python frame stack sampler

# TLDR

**Profile a Python script**

```austin-tui python3 [path/to/script.py]```

**Attach to a running Python process** by PID

```sudo austin-tui -p [pid]```

**Attach to a process and its child processes**

```sudo austin-tui -Cp [pid]```

**Profile memory usage** instead of CPU time

```austin-tui -m python3 [path/to/script.py]```

**Profile with a custom sampling interval** (in microseconds)

```austin-tui -i [200] python3 [path/to/script.py]```

**Sample for a limited duration** (in seconds)

```austin-tui -x [10] python3 [path/to/script.py]```

# SYNOPSIS

**austin-tui** [_options_] [_command_ [_args..._]]

**austin-tui** [_options_] **-p** _pid_

# PARAMETERS

**-p** _pid_, **--pid** _pid_
> Attach to an existing Python process by its process ID.

**-C**, **--children**
> Also sample child Python processes. Navigate between them with the arrow keys.

**-m**, **--memory**
> Profile memory usage instead of wall-clock time.

**-c**, **--cpu**
> Sample on-CPU stacks only, ignoring idle time.

**-i** _microseconds_, **--interval** _microseconds_
> Set the sampling interval in microseconds (default is 100).

**-x** _seconds_, **--exposure** _seconds_
> Sample for the given number of seconds only, then stop.

**-t** _milliseconds_, **--timeout** _milliseconds_
> Approximate startup wait time; increase on slow machines (default is 100 ms).

# DESCRIPTION

**austin-tui** is a top-like text-based user interface for **Austin**, the frame stack sampler for CPython. It provides a real-time terminal view of where a Python application spends its time or allocates memory, displaying CPU and memory usage plots alongside per-frame statistics.

Austin works by reading the CPython interpreter's virtual memory to sample frame stacks, requiring zero instrumentation and imposing minimal overhead on the target application. austin-tui wraps this sampling data in a curses-based interface inspired by the Unix **top** command.

The default view shows the last-seen stack for the current process and thread, refreshing approximately once per second. Pressing **F** switches to full mode, which displays a hierarchical tree of all collected frame statistics. Pressing **G** activates a live flame graph visualization. Thread navigation is done with the left and right arrow keys, with the current PID and TID shown in the header.

Additional interactive keys include **P** to pause the display while sampling continues in the background, **S** to save collected profiling data to a timestamped file, and **+**/**-** to adjust the minimum percentage threshold for displayed frames.

When running in a VS Code terminal, source file paths in the output support Ctrl+Click (Cmd+Click on macOS) navigation. Saved data can be loaded in the Austin VS Code extension for further flame graph analysis.

# CONFIGURATION

austin-tui does not use a configuration file. All options are passed via command-line arguments. The underlying Austin binary must be installed separately and be discoverable on the system PATH.

On Linux, to avoid running with **sudo**, grant the ptrace capability to the Austin binary:

```sudo setcap cap_sys_ptrace+ep `which austin```

# CAVEATS

Requires the **Austin 3** binary to be installed and available on the PATH. On macOS, System Integrity Protection prevents profiling the system Python at /usr/bin/python3; use a virtual environment or a Homebrew-installed interpreter instead. On Windows, the standard Python curses module is broken and a replacement wheel must be installed manually.

# HISTORY

**austin-tui** was created by **Gabriele N. Tornetta** (P403n1x87) with the first release candidate (v1.1.0rc1) published in **November 2019**. The flame graph mode was added in **v1.2.0** (April 2021), and support for the MOJO binary format arrived in **v1.4.0** (November 2024). The project is licensed under GPL-3.0.

# SEE ALSO

[austin](/man/austin)(1), [top](/man/top)(1), [htop](/man/htop)(1), [py-spy](/man/py-spy)(1), [perf](/man/perf)(1)
