# TAGLINE

run a command in a control group

# TLDR

Run in **cgroup**

```cgexec -g cpu:mygroup [process_name]```

Run with **multiple controllers**

```cgexec -g cpu:mygroup -g memory:mygroup [process_name]```

Run with **sticky** flag to prevent reclassification

```cgexec --sticky -g cpu:mygroup [process_name]```

# SYNOPSIS

**cgexec** [_OPTIONS_] -g _controller:cgroup_ _command_ [_args_]

# DESCRIPTION

**cgexec** executes a process within a specified control group (cgroup). Unlike cgclassify, which moves already-running processes, cgexec starts a new process directly inside the target cgroup from the beginning.

Cgroups allow limiting, measuring, and controlling resource usage by processes for CPU, memory, I/O, and other resources. By launching a process with cgexec, all resource constraints defined for that cgroup apply immediately from process startup, including any child processes it spawns.

cgexec is part of the libcgroup-tools package and works with cgroups v1. For cgroups v2 systems, systemd-run provides similar functionality.

# PARAMETERS

**-g** _controller:cgroup_
> Specify the controller and cgroup to use

**--sticky**
> Prevent cgred from moving the process

Controllers include:
> **cpu** - CPU time allocation
> **memory** - Memory usage limits
> **blkio** - Block I/O limits
> **cpuset** - CPU and memory node assignment
> **devices** - Device access control

# CAVEATS

The cgroup must exist before using cgexec (create with cgcreate). Multiple controllers can be specified with multiple -g options. Requires appropriate permissions or root access.

# HISTORY

**cgexec** is part of **libcgroup**, providing cgroup management utilities for resource control on Linux.

# SEE ALSO

[cgcreate](/man/cgcreate)(1), [cgclassify](/man/cgclassify)(1), [cgdelete](/man/cgdelete)(1)
