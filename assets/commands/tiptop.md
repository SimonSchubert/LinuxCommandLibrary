# TAGLINE

Top-like display backed by hardware performance counters

# TLDR

**Launch the interactive monitor**

```tiptop```

**Refresh every 2 seconds**

```tiptop -d [2]```

**Show only the named process**

```tiptop -p [firefox]```

**Show only one user's tasks**

```tiptop -u [$USER]```

**Run in batch mode** for 5 iterations (e.g., for logging)

```tiptop -b -n [5]```

**Include kernel activity** in counter values (needs root / **CAP_SYS_ADMIN**)

```sudo tiptop -K```

# SYNOPSIS

**tiptop** [_options_] [_command_]

# PARAMETERS

**-b**
> Batch mode: print to stdout, no interactive control.

**-c**
> Display the full command line instead of the process name.

**-d** _SECONDS_
> Delay between refreshes (fractional values allowed).

**-H**
> Show one line per thread instead of per process.

**-i**
> Include idle tasks.

**-K**
> Count kernel-mode events (needs **perf_event_paranoid <= 1** or root).

**-n** _COUNT_
> Exit after _COUNT_ refreshes (useful with **-b**).

**-p** _PID_or_NAME_
> Restrict the display to a process by PID or basename.

**-u** _USER_
> Restrict the display to a user.

**-w** _PID_
> Highlight/follow a single task.

**-S** _COL_
> Sort by the named column.

**--sticky**
> Keep finished tasks in the table.

**--epoch**
> Print Unix epoch timestamps in batch output.

# DESCRIPTION

**tiptop** displays a top-like view of running tasks but, instead of CPU% and RSS, the columns come from **hardware performance counters** (instructions per cycle, cache misses, branch mispredictions, etc.) read through the Linux **perf_event** interface. This makes it suitable for spotting microarchitectural bottlenecks — bad cache behavior, branch-prediction issues, FPU pressure — that a standard **top** cannot see.

The set of counters and how they are combined into columns is configured per-architecture; users can also define custom columns in **~/.tiptoprc** to expose additional counters or derived metrics.

# CAVEATS

Requires hardware performance-counter support and an accessible **perf_event** subsystem; on hardened kernels you may need to lower **/proc/sys/kernel/perf_event_paranoid**. **-K** (count kernel events) requires elevated privileges. Some virtual machines do not expose PMU counters, in which case columns will read as zero.

# HISTORY

**tiptop** was written by **Erven Rohou** at **INRIA** to make hardware performance counters as accessible as **top**. A separate, unrelated Python tool of the same name exists; this page documents the canonical Erven Rohou implementation packaged as **tiptop** in Debian, Ubuntu, Fedora, and Arch.

# INSTALL

```apt: sudo apt install tiptop```

```dnf: sudo dnf install tiptop```

```zypper: sudo zypper install tiptop```

```nix: nix profile install nixpkgs#tiptop```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[top](/man/top)(1), [htop](/man/htop)(1), [perf](/man/perf)(1), [pidstat](/man/pidstat)(1)
