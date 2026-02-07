# TAGLINE

set cgroup parameters

# TLDR

**Set CPU quota** for a cgroup

```cgset -r cpu.cfs_quota_us=[50000] [/mygroup]```

**Set memory limit** for a cgroup

```cgset -r memory.limit_in_bytes=[512M] [/mygroup]```

**Set multiple parameters** at once

```cgset -r cpu.shares=[512] -r memory.limit_in_bytes=[1G] [/mygroup]```

**Copy settings** from one cgroup to another

```cgset --copy-from [/source_group] [/dest_group]```

# SYNOPSIS

**cgset** [**-r** _name=value_]... _cgroup_

**cgset** **--copy-from** _source_ _destination_

# DESCRIPTION

**cgset** modifies parameters of existing control groups (cgroups). It allows setting resource limits and controls for CPU, memory, I/O, and other subsystems on groups of processes.

Common parameters include CPU shares (relative priority), CPU quotas (hard limits), memory limits, and I/O weights. The available parameters depend on which controllers are mounted and the cgroup version.

cgset is part of libcgroup-tools for managing cgroups v1. For cgroups v2, systemd or direct filesystem writes are typically used instead.

# PARAMETERS

**-r** _name=value_
> Set a parameter to a value.

**--copy-from** _cgroup_
> Copy parameters from another cgroup.

**-h**, **--help**
> Display help information.

# CAVEATS

Requires appropriate permissions (typically root). Parameter names and values are controller-specific. Invalid values may be rejected by the kernel. Only works with cgroups v1 hierarchy. Some parameters cannot be changed while processes are in the cgroup.

# HISTORY

**cgset** is part of **libcgroup**, developed by **Red Hat** starting around **2008** to provide user-space cgroup management. The tool provided a way to configure resource limits without direct filesystem manipulation. As cgroups v2 and systemd became prevalent, direct management through these tools became less common.

# SEE ALSO

[cgcreate](/man/cgcreate)(1), [cgdelete](/man/cgdelete)(1), [cgget](/man/cgget)(1), [cgexec](/man/cgexec)(1)
