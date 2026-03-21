# TAGLINE

System call for process tracing and debugging

# TLDR

**Trace system calls (via strace)**

```strace [command]```

**Attach to process**

```strace -p [pid]```

**Trace child processes**

```strace -f [command]```

**Trace specific calls**

```strace -e [open,read,write] [command]```

# SYNOPSIS

**ptrace**(_request_, _pid_, _addr_, _data_)

# DESCRIPTION

**ptrace** (process trace) is a Linux system call that allows one process (the tracer) to observe and control the execution of another process (the tracee). It can inspect and modify the tracee's memory, registers, and signal delivery. It is the underlying mechanism used by debuggers like **gdb** and system call tracers like **strace** and **ltrace**. The tracee must either call PTRACE_TRACEME or be attached via PTRACE_ATTACH/PTRACE_SEIZE.

# REQUESTS

```c
PTRACE_TRACEME    - Allow parent to trace this process
PTRACE_ATTACH     - Attach to a running process
PTRACE_SEIZE      - Attach without stopping the process
PTRACE_DETACH     - Detach from traced process
PTRACE_PEEKTEXT   - Read a word from text/code memory
PTRACE_PEEKDATA   - Read a word from data memory
PTRACE_POKETEXT   - Write a word to text/code memory
PTRACE_POKEDATA   - Write a word to data memory
PTRACE_GETREGS    - Get general-purpose registers
PTRACE_SETREGS    - Set general-purpose registers
PTRACE_CONT       - Continue execution
PTRACE_SINGLESTEP - Execute a single instruction then stop
PTRACE_SYSCALL    - Continue and stop at next syscall entry/exit
```

# EXAMPLE (C)

```c
#include <sys/ptrace.h>

// In child:
ptrace(PTRACE_TRACEME, 0, NULL, NULL);

// In parent:
ptrace(PTRACE_ATTACH, child_pid, NULL, NULL);
ptrace(PTRACE_CONT, child_pid, NULL, NULL);
```

# SECURITY

```bash
# Check ptrace scope
cat /proc/sys/kernel/yama/ptrace_scope

# Values:
# 0 - Classic ptrace permissions
# 1 - Restricted to descendants
# 2 - Admin only
# 3 - No ptrace allowed
```

# CAVEATS

Linux-specific system call (other Unix systems have similar but incompatible implementations). Security restrictions are enforced via the YAMA LSM module (/proc/sys/kernel/yama/ptrace_scope). Tracing a non-child process requires CAP_SYS_PTRACE or root privileges. Only one tracer can be attached to a process at a time. Anti-debugging techniques can detect ptrace via PTRACE_TRACEME returning an error.

# HISTORY

ptrace originated in **Unix V7** (1979) and has been extended significantly in **Linux** for debugging and tracing.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [gdb](/man/gdb)(1)
