# TAGLINE

Create a child process with fine-grained resource sharing

# TLDR

**Clone a process with namespace isolation** (in C)

```clone(child_func, stack_top, CLONE_NEWNS | SIGCHLD, arg)```

**Create new namespaces** (unshare command)

```sudo unshare --mount --uts --ipc --net --pid --fork /bin/bash```

**Create user namespace without root**

```unshare --user --map-root-user /bin/bash```

**Enter existing namespace of a process**

```sudo nsenter --target [pid] --mount --uts --ipc --net --pid```

# SYNOPSIS

```c
#include <sched.h>

int clone(int (*fn)(void *), void *stack, int flags, void *arg, ...);
```

# PARAMETERS

**CLONE_NEWNS**
> Create new mount namespace.

**CLONE_NEWUTS**
> Create new UTS namespace (hostname/domainname).

**CLONE_NEWIPC**
> Create new IPC namespace.

**CLONE_NEWPID**
> Create new PID namespace.

**CLONE_NEWNET**
> Create new network namespace.

**CLONE_NEWUSER**
> Create new user namespace.

**CLONE_NEWCGROUP**
> Create new cgroup namespace.

**CLONE_VM**
> Share virtual memory space (used for threads).

**CLONE_FILES**
> Share file descriptor table.

**CLONE_FS**
> Share filesystem information (root, cwd, umask).

**CLONE_SIGHAND**
> Share signal handler table.

**CLONE_THREAD**
> Place child in same thread group as caller.

**CLONE_SYSVSEM**
> Share System V semaphore adjustment values.

**CLONE_CHILD_SETTID**
> Store child thread ID at a location in child's memory.

**CLONE_CHILD_CLEARTID**
> Clear child thread ID at a location in child's memory on exit and wake a futex at that address.

**CLONE_PARENT_SETTID**
> Store child thread ID at a location in the parent's memory.

**CLONE_SETTLS**
> Set the thread-local storage descriptor of the child.

**CLONE_PARENT**
> Give the child the same parent as the calling process.

**CLONE_VFORK**
> Suspend the calling process until the child exits or calls execve.

**CLONE_PTRACE**
> Trace the child if the calling process is being traced.

**CLONE_PIDFD**
> Return a PID file descriptor referring to the child (Linux 5.2+).

**CLONE_INTO_CGROUP**
> Place the child directly in a given cgroup (clone3 only, Linux 5.7+).

**CLONE_CLEAR_SIGHAND**
> Reset all signal handlers in the child to default (clone3 only, Linux 5.5+).

# DESCRIPTION

**clone()** is a Linux system call that creates a new process or thread with fine-grained control over what resources are shared between parent and child. It is the foundation for both thread creation (via pthread) and container isolation (via namespaces).

Unlike **fork()**, which creates a complete copy of the parent process, clone() allows specifying exactly which resources to share (memory, file descriptors, signal handlers) or isolate (namespaces). This flexibility enables implementing threads (maximum sharing) and containers (maximum isolation).

Namespace flags create isolated environments for system resources. Containers like Docker use clone() with namespace flags to provide process isolation. The **unshare** and **nsenter** commands provide user-space access to these capabilities. The low byte of the flags argument contains the signal number sent to the parent when the child exits.

# CAVEATS

Creating namespaces typically requires **CAP_SYS_ADMIN**, except for user namespaces, which unprivileged processes may create (and which grant that capability inside the new namespace). Improper use can create resource leaks or security issues. The function has a complex interface; errors in stack allocation are common. For threads, use pthread_create() instead of direct clone() calls. The **clone3()** system call (Linux 5.3+) provides a more extensible interface.

# HISTORY

The **clone()** system call dates from the Linux 1.3 development series, added to support native thread implementations. It evolved significantly with the addition of namespace support starting with mount namespaces in kernel **2.4.19** (2002). User namespaces became meaningful for clone() in **2.6.23** and were completed in kernel **3.8** (2013), enabling unprivileged container creation. **clone3()** was added in kernel **5.3** (2019) as a more extensible successor.

# SEE ALSO

[unshare](/man/unshare)(1), [nsenter](/man/nsenter)(1), [namespaces](/man/namespaces)(7), [cgroups](/man/cgroups)(7), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git)```

```[Homepage](https://www.kernel.org/)```

```[Documentation](https://man7.org/linux/man-pages/man2/clone.2.html)```

<!-- verified: 2026-11-09 -->
