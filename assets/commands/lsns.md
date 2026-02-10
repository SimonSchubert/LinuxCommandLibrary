# TAGLINE

lists information about Linux namespaces

# TLDR

List all **namespaces**

```lsns```

List namespaces in **JSON format**

```lsns -J```

List namespaces for a **specific process**

```lsns -p 1234```

List only **specific type** of namespaces

```lsns -t net```

List with **custom columns**

```lsns -o NS,TYPE,PID,COMMAND```

List **persistent** namespaces only

```lsns -P```

# SYNOPSIS

**lsns** [_options_] [_namespace_]

# DESCRIPTION

**lsns** lists information about Linux namespaces. Namespaces provide isolation for various system resources, and this tool displays which namespaces exist and which processes are using them.

# PARAMETERS

**-t, --type TYPE**
> Filter by namespace type (mnt, net, ipc, user, pid, uts, cgroup, time)

**-p, --task PID**
> Show namespaces for specific process

**-o, --output LIST**
> Specify columns to display

**-l, --list**
> Use list output format

**-J, --json**
> Output in JSON format

**-r, --raw**
> Use raw output format

**-n, --noheadings**
> Do not print headers

**-u, --notruncate**
> Do not truncate text in columns

**-W, --nowrap**
> Do not wrap multi-line cells

**-P, --persistent**
> Show only persistent namespaces

**-T, --tree REL**
> Show tree view with specified relationship

# NAMESPACE TYPES

**mnt**: Mount points
**net**: Network resources
**ipc**: System V IPC objects
**user**: User and group IDs
**pid**: Process IDs
**uts**: Hostname and domain
**cgroup**: Cgroup root directory
**time**: Boot and monotonic clocks

# CAVEATS

Non-root users may see incomplete results as some namespace information requires elevated privileges. The default output format may change between versions; use explicit options for scripts.

# HISTORY

**lsns** is part of **util-linux**, providing visibility into the Linux namespace subsystem used for containerization and process isolation.

# SEE ALSO

[nsenter](/man/nsenter)(1), [unshare](/man/unshare)(1), [namespaces](/man/namespaces)(7), [ip-netns](/man/ip-netns)(8)
