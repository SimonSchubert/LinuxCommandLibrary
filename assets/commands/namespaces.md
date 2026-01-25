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

**Namespaces** are a Linux kernel feature that partitions kernel resources so that processes see different views of the system. They are fundamental to container technologies like Docker.

Each namespace type isolates a different aspect of the system.

# NAMESPACE TYPES

```
mnt   - Mount points
pid   - Process IDs
net   - Network stack
ipc   - System V IPC
uts   - Hostname/domain
user  - User/group IDs
cgroup - Cgroup root
time  - System time
```

# RELATED TOOLS

```
unshare   - Create new namespace
nsenter   - Enter existing namespace
lsns      - List namespaces
ip netns  - Network namespace management
```

# SYSTEM CALLS

```c
clone()    - Create new namespace
unshare()  - Disassociate from namespace
setns()    - Join namespace
```

# CAVEATS

Some operations require root/capabilities. Namespace limits exist. User namespaces have security implications.

# HISTORY

Namespaces were incrementally added to Linux starting with mount namespaces in kernel **2.4.19** (2002). Full container support matured around kernel **3.8** (2013).

# SEE ALSO

[unshare](/man/unshare)(1), [nsenter](/man/nsenter)(1), [lsns](/man/lsns)(8), [cgroups](/man/cgroups)(7)
