# TAGLINE

resource limit query and management interface

# TLDR

**Get resource limits (shell)**

```ulimit -a```

**Get specific limit (open files)**

```ulimit -n```

**Show resource limits of a process**

```prlimit --pid [pid]```

**Set open file limit for a command**

```prlimit --nofile=4096 [command]```

# SYNOPSIS

**#include <sys/resource.h>**

**int getrlimit(int** _resource_, **struct rlimit** \*_rlim_**);**

**int setrlimit(int** _resource_, **const struct rlimit** \*_rlim_**);**

**int prlimit(pid_t** _pid_, **int** _resource_, **const struct rlimit** \*_new_limit_, **struct rlimit** \*_old_limit_**);**

# PARAMETERS

_resource_
> Resource type (RLIMIT_NOFILE, RLIMIT_NPROC, etc.).

_rlim_
> Pointer to rlimit structure with the soft limit (**rlim_cur**) and hard limit (**rlim_max**).

_pid_
> Target process for **prlimit()**; 0 means the calling process.

_new_limit_, _old_limit_
> For **prlimit()**: new limits to set and buffer receiving the previous limits. Either may be NULL.

# DESCRIPTION

**getrlimit()** and **setrlimit()** are system calls for querying and setting resource limits for the calling process. The Linux-specific **prlimit()** combines both and can act on another process. These limits control maximum values for various system resources.

The **ulimit** shell built-in provides command-line access to these limits. Limits have soft (current) and hard (maximum) values: the kernel enforces the soft limit, and the hard limit is the ceiling for it.

# RESOURCE TYPES

```
RLIMIT_AS         Address space size (bytes)
RLIMIT_CORE       Core file size (0 disables)
RLIMIT_CPU        CPU time (seconds)
RLIMIT_DATA       Data segment size
RLIMIT_FSIZE      File size
RLIMIT_MEMLOCK    Locked memory (bytes)
RLIMIT_MSGQUEUE   POSIX message queue bytes
RLIMIT_NICE       Ceiling for nice value
RLIMIT_NOFILE     Max file descriptor number + 1
RLIMIT_NPROC      Processes/threads per user
RLIMIT_RTPRIO     Real-time priority ceiling
RLIMIT_RTTIME     Real-time CPU time (us)
RLIMIT_SIGPENDING Queued signals per user
RLIMIT_STACK      Stack size (bytes)
```

# SHELL ACCESS

```bash
ulimit -n        # Open files
ulimit -u        # Max processes
ulimit -s        # Stack size
ulimit -a        # All limits
ulimit -n 4096   # Set open files limit
```

# CONFIGURATION

**/etc/security/limits.conf**
> PAM configuration for setting default resource limits per user or group.

**/etc/systemd/system.conf**
> Systemd-wide default resource limits for services and user sessions.

# CAVEATS

System call, not a command. Raising a hard limit requires **CAP_SYS_RESOURCE**; an unprivileged process can only lower its hard limit, irreversibly, and set its soft limit up to the hard limit. Limits are per-process, inherited across **fork()** and preserved across **execve()**. PAM may set limits at login.

# SEE ALSO

[ulimit](/man/ulimit)(1), [prlimit](/man/prlimit)(1), [limits.conf](/man/limits.conf)(5)

# RESOURCES

```[Documentation](https://man7.org/linux/man-pages/man2/getrlimit.2.html)```

<!-- verified: 2026-11-09 -->
