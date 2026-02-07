# TAGLINE

Linux system call for creating processes with shared resources

# TLDR

**Clone a process** (in C)

```clone(child_func, stack_top, CLONE_NEWNS | SIGCHLD, arg)```

**Create new namespace** (unshare command)

```sudo unshare --mount --uts --ipc --net --pid --fork /bin/bash```

**Create user namespace** without root

```unshare --user --map-root-user /bin/bash```

**Enter existing namespace**

```sudo nsenter --target [pid] --mount --uts --ipc --net --pid```

# SYNOPSIS

```c
#include <sched.h>

int clone(int (*fn)(void *), void *stack, int flags, void *arg, ...);
```

# FLAGS

**CLONE_NEWNS**
> New mount namespace.

**CLONE_NEWUTS**
> New UTS namespace (hostname).

**CLONE_NEWIPC**
> New IPC namespace.

**CLONE_NEWPID**
> New PID namespace.

**CLONE_NEWNET**
> New network namespace.

**CLONE_NEWUSER**
> New user namespace.

**CLONE_NEWCGROUP**
> New cgroup namespace.

**CLONE_VM**
> Share virtual memory (threads).

**CLONE_FILES**
> Share file descriptors.

**CLONE_FS**
> Share filesystem information.

**CLONE_SIGHAND**
> Share signal handlers.

**CLONE_THREAD**
> Same thread group (for threads).

# DESCRIPTION

**clone()** is a Linux system call that creates a new process or thread with fine-grained control over what resources are shared between parent and child. It is the foundation for both thread creation (via pthread) and container isolation (via namespaces).

Unlike **fork()**, which creates a complete copy of the parent process, clone() allows specifying exactly which resources to share (memory, file descriptors, signal handlers) or isolate (namespaces). This flexibility enables implementing threads (maximum sharing) and containers (maximum isolation).

Namespace flags create isolated environments for system resources. Containers like Docker use clone() with namespace flags to provide process isolation. The **unshare** and **nsenter** commands provide user-space access to these capabilities.

# CAVEATS

Creating namespaces typically requires root privileges, except for user namespaces. Improper use can create resource leaks or security issues. The function has a complex interface; errors in stack allocation are common. For threads, use pthread_create() instead of direct clone() calls.

# HISTORY

The **clone()** system call was introduced to Linux in version **1.3.43** (1995) to support native thread implementations. It evolved significantly with the addition of namespace support starting with mount namespaces in kernel **2.4.19** (2002). User namespaces were added in kernel **3.8** (2013), enabling unprivileged container creation. The system call is central to modern container technologies.

# SEE ALSO

[clone](/man/clone)(2), [unshare](/man/unshare)(1), [nsenter](/man/nsenter)(1), [namespaces](/man/namespaces)(7)
