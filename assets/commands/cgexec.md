# TAGLINE

run a command in a control group

# TLDR

Run a command in a **cpu cgroup**

```cgexec -g cpu:mygroup [command]```

Run with **multiple controllers** in a single cgroup

```cgexec -g cpu,memory:mygroup [command]```

Run with **separate cgroups** for different controllers

```cgexec -g cpu:mygroup -g memory:memgroup [command]```

Run with **sticky** flag to prevent reclassification by cgred

```cgexec --sticky -g cpu:mygroup [command]```

# SYNOPSIS

**cgexec** [_OPTIONS_] -g _controller:cgroup_ _command_ [_args_]

# DESCRIPTION

**cgexec** executes a process within a specified control group (cgroup). Unlike cgclassify, which moves already-running processes, cgexec starts a new process directly inside the target cgroup from the beginning.

Cgroups allow limiting, measuring, and controlling resource usage by processes for CPU, memory, I/O, and other resources. By launching a process with cgexec, all resource constraints defined for that cgroup apply immediately from process startup, including any child processes it spawns.

cgexec is part of the libcgroup-tools package and works with cgroups v1. For cgroups v2 systems, systemd-run provides similar functionality.

# PARAMETERS

**-g** _controllers:path_
> Specify the controller(s) and cgroup path. Multiple controllers can be comma-separated. Can be used multiple times.

**--sticky**
> Prevent cgrulesengd (cgred) from reclassifying the process or its children.

**-b**
> Ignore the default systemd delegated hierarchy path and construct the cgroup path relative to the root hierarchy.

**-h**
> Display help information.

Controllers include:
> **cpu** - CPU time allocation
> **memory** - Memory usage limits
> **blkio** - Block I/O limits
> **cpuset** - CPU and memory node assignment
> **devices** - Device access control

# CAVEATS

The cgroup must exist before using cgexec (create with cgcreate). Multiple controllers can be comma-separated in a single -g option or specified with multiple -g options. Requires appropriate permissions or root access. If -g is not specified, cgexec assigns the task based on /etc/cgrules.conf.

# HISTORY

**cgexec** is part of **libcgroup**, providing cgroup management utilities for resource control on Linux.

# SEE ALSO

[cgcreate](/man/cgcreate)(1), [cgclassify](/man/cgclassify)(1), [cgdelete](/man/cgdelete)(1), [systemd-run](/man/systemd-run)(1)
