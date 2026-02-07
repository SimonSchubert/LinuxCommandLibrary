# TAGLINE

remove control groups

# TLDR

**Delete a cgroup**

```cgdelete -g [cpu]:[/mygroup]```

**Delete a cgroup** from multiple controllers

```cgdelete -g [cpu,memory]:[/mygroup]```

**Delete a cgroup recursively** (including children)

```cgdelete -r -g [cpu]:[/mygroup]```

**Delete cgroup and all empty parents**

```cgdelete -g [memory]:[/parent/child]```

# SYNOPSIS

**cgdelete** [**-r**] [**-g** _controllers_:_path_]...

# DESCRIPTION

**cgdelete** removes cgroups from the Linux control group hierarchy. Cgroups (control groups) are used to limit, account for, and isolate resource usage of processes.

The command removes the specified cgroup directory from the cgroup filesystem. By default, the cgroup must be empty (no processes or child cgroups) before deletion. The -r flag allows recursive deletion of child cgroups.

cgdelete is part of libcgroup-tools, which provides user-space utilities for managing cgroups v1. Note that cgroups v2 uses a unified hierarchy and different management approaches.

# PARAMETERS

**-g** _controllers_:_path_
> Specify controller(s) and cgroup path to delete.

**-r**
> Recursively delete child cgroups.

**-h**, **--help**
> Display help information.

# CAVEATS

Cannot delete cgroups that contain running processes. Requires appropriate permissions (typically root). The specified controllers must be mounted. Does not work with cgroups v2 unified hierarchy (use direct filesystem operations or systemd instead). Empty parent cgroups may be automatically removed.

# HISTORY

**cgdelete** is part of **libcgroup**, a library and tools for managing Linux cgroups. The project was started by **Red Hat** around **2008** to provide user-space utilities for cgroups v1. As Linux moved toward cgroups v2, systemd became the primary cgroup manager on most systems, though libcgroup tools remain useful for cgroups v1 systems.

# SEE ALSO

[cgcreate](/man/cgcreate)(1), [cgset](/man/cgset)(1), [cgget](/man/cgget)(1), [lscgroup](/man/lscgroup)(1)
