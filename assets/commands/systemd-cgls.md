# TAGLINE

Show cgroup hierarchy tree

# TLDR

**Display** the whole control group hierarchy

```systemd-cgls```

**Display** a control group tree of a specific resource controller

```systemd-cgls [cpu|memory|io]```

**Display** the control group hierarchy of specific units

```systemd-cgls -u [unit1] [unit2]```

# SYNOPSIS

**systemd-cgls** [_options_] [_cgroup_...]

# PARAMETERS

**-u, --unit _unit_**
> Show control groups of specified unit(s)

**-a, --all**
> Show all control groups, including empty ones

**-l, --full**
> Don't truncate process names

**-k**
> Include kernel threads

**--no-pager**
> Don't pipe output to a pager

**-M, --machine _container_**
> Show control groups in specified container

# DESCRIPTION

**systemd-cgls** recursively shows the contents of the Linux control group (cgroup) hierarchy in a tree format. It displays which processes belong to which control groups, organized by systemd slices and services.

The tool is useful for understanding how systemd organizes processes and for debugging resource management issues.

# CAVEATS

Requires cgroups v2 or v1 to be mounted. The tree structure reflects the systemd unit hierarchy. Empty control groups are hidden by default. Part of the systemd suite.

# SEE ALSO

[systemd-cgtop](/man/systemd-cgtop)(1), [systemctl](/man/systemctl)(1), [cgroups](/man/cgroups)(7)
