# TAGLINE

Monitor cgroup resource usage

# TLDR

**Start** an interactive view

```systemd-cgtop```

**Change** the sort order

```systemd-cgtop --order [cpu|memory|path|tasks|io]```

**Show** CPU usage by time instead of percentage

```systemd-cgtop --cpu=percentage```

**Change** the update interval

```systemd-cgtop -d [interval]```

**Only** count userspace processes (no kernel threads)

```systemd-cgtop -P```

# SYNOPSIS

**systemd-cgtop** [_options_]

# PARAMETERS

**--order _field_**
> Sort by cpu, memory, path, tasks, or io

**-d, --delay _interval_**
> Update interval (supports ms, us, min suffixes)

**-P**
> Count only userspace processes

**-k**
> Include kernel threads in counts

**-n, --iterations _n_**
> Run for n iterations and exit

**-b, --batch**
> Run in batch mode (non-interactive)

**-r, --raw**
> Output raw numbers without units

**--depth _n_**
> Maximum cgroup tree depth to show

# DESCRIPTION

**systemd-cgtop** shows the top control groups by resource usage, similar to **top** but organized by cgroups. It displays CPU, memory, and I/O statistics for each control group.

The tool is useful for monitoring resource consumption by services and understanding which systemd units are using system resources. Interactive mode supports keyboard shortcuts for changing display options.

# CAVEATS

I/O accounting requires appropriate cgroup controllers to be enabled. Some resource statistics may not be available depending on kernel configuration. Part of the systemd suite.

# SEE ALSO

[systemd-cgls](/man/systemd-cgls)(1), [top](/man/top)(1), [systemctl](/man/systemctl)(1), [cgroups](/man/cgroups)(7)
