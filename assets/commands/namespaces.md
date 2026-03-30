# TAGLINE

Overview of Linux kernel namespaces for resource isolation

# TLDR

**List all namespaces**

```lsns```

**Enter namespace of process**

```nsenter -t [PID] -a```

**Create new mount namespace**

```unshare --mount [command]```

**Create new network namespace**

```ip netns add [name]```

**Run in new user namespace**

```unshare --user --map-root-user [command]```

# SYNOPSIS

**namespaces** - Linux kernel namespace overview

# DESCRIPTION

**Namespaces** are a Linux kernel feature that wraps global system resources in an abstraction layer, making it appear to processes within a namespace that they have their own isolated instance of the resource. They are fundamental to container technologies like Docker and LXC.

Each namespace type isolates a different aspect of the system.

# NAMESPACE TYPES

```
mnt    - Mount points
pid    - Process IDs
net    - Network devices, stacks, ports
ipc    - System V IPC, POSIX message queues
uts    - Hostname and NIS domain name
user   - User and group IDs
cgroup - Cgroup root directory
time   - Boot and monotonic clocks
```

# RELATED TOOLS

```
unshare   - Create new namespace
nsenter   - Enter existing namespace
lsns      - List namespaces
ip netns  - Network namespace management
```

# SYSTEM CALLS

```
clone()    - Create process in new namespace
unshare()  - Disassociate from current namespace
setns()    - Join an existing namespace
ioctl()    - Discover namespace relationships
```

# CAVEATS

Some operations require root/capabilities. Namespace limits exist. User namespaces have security implications.

# HISTORY

Namespaces were incrementally added to Linux starting with mount namespaces in kernel **2.4.19** (2002). Full container support matured around kernel **3.8** (2013).

# SEE ALSO

[unshare](/man/unshare)(1), [nsenter](/man/nsenter)(1), [lsns](/man/lsns)(8), [clone](/man/clone)(2), [ip](/man/ip)(8), [cgroups](/man/cgroups)(7)
