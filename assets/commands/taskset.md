# TAGLINE

Set process CPU affinity

# TLDR

**Get** a running process' CPU affinity by PID

```taskset -p -c [pid]```

**Set** a running process' CPU affinity by PID

```taskset -p -c [cpu_id] [pid]```

**Start** a new process with affinity for a single CPU

```taskset -c [cpu_id] [command]```

**Start** a new process with affinity for multiple non-sequential CPUs

```taskset -c [cpu_id_1,cpu_id_2,cpu_id_3] [command]```

**Start** a new process with affinity for CPUs 1 through 4

```taskset -c [1-4] [command]```

**Set affinity using a hex bitmask** (CPUs 0 and 1)

```taskset -p [0x3] [pid]```

**Set affinity for all threads** of a process

```taskset -a -p -c [0-3] [pid]```

# SYNOPSIS

**taskset** [_options_] [_mask_|_list_] [_pid_|_command_]

# PARAMETERS

**-p, --pid**
> Operate on an existing PID

**-c, --cpu-list**
> Specify CPUs as a list instead of a bitmask

**-a, --all-tasks**
> Set/get affinity of all tasks (threads)

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# DESCRIPTION

**taskset** retrieves or sets a process's CPU affinity, which controls which CPUs the process can run on. CPU affinity can be specified as a bitmask or a comma-separated list of CPU IDs.

This is useful for performance tuning, isolating processes to specific cores, or testing how software behaves on limited CPU resources.

# CAVEATS

CPU IDs start at 0. Setting affinity may not improve performance and can hurt it if done incorrectly. The kernel may still migrate processes for load balancing unless CPU isolation is configured. The CPU list supports stride syntax (e.g. 0-10:2 means CPUs 0,2,4,6,8,10). Part of the util-linux package.

# SEE ALSO

[chrt](/man/chrt)(1), [nice](/man/nice)(1), [renice](/man/renice)(1), [numactl](/man/numactl)(8)
