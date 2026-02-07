# TAGLINE

resource limit query and management interface

# TLDR

**Get resource limits (shell)**

```ulimit -a```

**Get specific limit (shell)**

```ulimit -n```

# SYNOPSIS

**#include <sys/resource.h>**

**int getrlimit(int** _resource_, **struct rlimit** \*_rlim_**);**

**int setrlimit(int** _resource_, **const struct rlimit** \*_rlim_**);**

# PARAMETERS

_resource_
> Resource type (RLIMIT_NOFILE, RLIMIT_NPROC, etc.).

_rlim_
> Pointer to rlimit structure with soft/hard limits.

# DESCRIPTION

**getrlimit()** and **setrlimit()** are system calls for querying and setting resource limits for the calling process. These limits control maximum values for various system resources.

The **ulimit** shell built-in provides command-line access to these limits. Limits have soft (current) and hard (maximum) values.

# RESOURCES

```
RLIMIT_NOFILE  - Maximum open files
RLIMIT_NPROC   - Maximum processes
RLIMIT_AS      - Maximum address space
RLIMIT_CORE    - Maximum core file size
RLIMIT_STACK   - Maximum stack size
RLIMIT_DATA    - Maximum data segment
RLIMIT_FSIZE   - Maximum file size
RLIMIT_CPU     - CPU time limit
RLIMIT_MEMLOCK - Maximum locked memory
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

System call, not a command. Non-root users cannot raise hard limits. Some limits affect child processes. PAM may set limits at login.

# SEE ALSO

[ulimit](/man/ulimit)(1), [prlimit](/man/prlimit)(1), [limits.conf](/man/limits.conf)(5)
