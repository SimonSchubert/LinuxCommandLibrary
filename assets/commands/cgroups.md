# TLDR

View documentation for **cgclassify**

```tldr cgclassify```

View documentation for **cgcreate**

```tldr cgcreate```

View documentation for **cgexec**

```tldr cgexec```

# DESCRIPTION

**cgroups** (control groups) is a Linux kernel feature for limiting, measuring, and controlling resource usage by processes. It is not a single command but a collection of tools and kernel interfaces.

Cgroups can limit CPU, memory, I/O, and network resources. They are fundamental to container technologies like Docker and systemd resource management.

# RELATED COMMANDS

**cgclassify**
> Move running processes to a cgroup

**cgcreate**
> Create new cgroups

**cgexec**
> Run a command in a cgroup

**cgget**
> Get cgroup parameters

**cgset**
> Set cgroup parameters

**cgdelete**
> Remove cgroups

# CAVEATS

Linux has two versions of cgroups (v1 and v2) with different interfaces. Modern systems often use cgroups v2 unified hierarchy. The libcgroup tools work with v1; systemd manages v2 natively.

# SEE ALSO

[cgclassify](/man/cgclassify)(1), [cgcreate](/man/cgcreate)(1), [cgexec](/man/cgexec)(1), [systemd-cgtop](/man/systemd-cgtop)(1)
