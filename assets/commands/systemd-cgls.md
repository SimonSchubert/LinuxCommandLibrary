# TAGLINE

Recursively show control group contents in a tree

# TLDR

**Display the whole control group hierarchy**

```systemd-cgls```

**Display the cgroup tree for a specific controller**

```systemd-cgls [cpu|memory|io]```

**Display the control group hierarchy of specific units**

```systemd-cgls -u [unit1] [unit2]```

**Show all control groups including empty ones**

```systemd-cgls --all```

**Display without truncating process names**

```systemd-cgls -l```

# SYNOPSIS

**systemd-cgls** [_options_] [_cgroup_...]

# PARAMETERS

**-u**, **--unit** _UNIT_
> Show the cgroup subtree of the specified systemd unit(s).

**-a**, **--all**
> Show all control groups, including empty ones that contain no processes.

**-l**, **--full**
> Do not ellipsize (truncate) process tree members.

**-k**
> Include kernel threads in the output.

**--no-pager**
> Do not pipe output into a pager.

**-M**, **--machine** _CONTAINER_
> Show control group contents in the specified container.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**systemd-cgls** recursively shows the contents of the Linux control group (cgroup) hierarchy in a tree format. It displays which processes belong to which control groups, organized by systemd slices, scopes, and services.

If arguments are specified, shows all member processes of the specified control groups plus their subgroups. If no argument is given and the current working directory is beneath **/sys/fs/cgroup/**, it shows the contents of that cgroup. Otherwise, the full systemd control group hierarchy is shown.

The tool provides a clear visual representation of the cgroup nesting and processes, making it useful for understanding how systemd organizes processes and for debugging resource management issues.

# CAVEATS

Requires cgroups (v1 or v2) to be mounted. Empty control groups are hidden by default unless **--all** is used. The tree structure reflects the systemd unit hierarchy. Part of the systemd suite.

# HISTORY

systemd-cgls was introduced as part of the **systemd** project by Lennart Poettering, providing a user-friendly view of the cgroup hierarchy managed by systemd.

# SEE ALSO

[systemd-cgtop](/man/systemd-cgtop)(1), [systemctl](/man/systemctl)(1), [ps](/man/ps)(1), [cgroups](/man/cgroups)(7)
