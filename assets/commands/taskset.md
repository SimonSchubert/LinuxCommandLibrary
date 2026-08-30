# TAGLINE

Set process CPU affinity

# TLDR

Show which CPUs a **running process** is allowed to use

```taskset --pid --cpu-list [pid]```

**Pin** a running process to one CPU

```taskset --pid --cpu-list [2] [pid]```

Pin **every thread** of the process, not just the main one

```taskset --all-tasks --pid --cpu-list [0-3] [pid]```

**Launch** a command pinned to a single CPU

```taskset --cpu-list [0] [command]```

Launch a command pinned to a **range** of CPUs

```taskset --cpu-list [0-3] [command]```

Launch a command pinned to a **non-contiguous set**

```taskset --cpu-list [0,2,4] [command]```

Use a **hexadecimal mask** instead of a list

```taskset [0x3] [command]```

Read a process's affinity **as a mask**

```taskset --pid [pid]```

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

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add util-linux-misc```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[chrt](/man/chrt)(1), [nice](/man/nice)(1), [renice](/man/renice)(1), [numactl](/man/numactl)(8)
