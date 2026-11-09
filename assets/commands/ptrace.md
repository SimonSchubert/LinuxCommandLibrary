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

```strace -e trace=[open,read,write] [command]```

**Show the current ptrace restriction level**

```cat /proc/sys/kernel/yama/ptrace_scope```

# SYNOPSIS

**ptrace**(_op_, _pid_, _addr_, _data_)

# DESCRIPTION

**ptrace** (process trace) is a Linux system call that allows one process (the tracer) to observe and control the execution of another process (the tracee). It can inspect and modify the tracee's memory, registers, and signal delivery. It is the underlying mechanism used by debuggers like **gdb** and system call tracers like **strace** and **ltrace**. The tracee must either call PTRACE_TRACEME or be attached via PTRACE_ATTACH/PTRACE_SEIZE.

There is no ptrace command-line program: it is used from C through `<sys/ptrace.h>`, or indirectly through the tools above.

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
PTRACE_GETREGSET  - Get a register set (architecture-independent)
PTRACE_SETREGSET  - Set a register set (architecture-independent)
PTRACE_SETOPTIONS - Set tracing options
PTRACE_CONT       - Continue execution
PTRACE_SINGLESTEP - Execute a single instruction then stop
PTRACE_SYSCALL    - Continue and stop at next syscall entry/exit
```

# EXAMPLE (C)

```c
#include <sys/ptrace.h>
#include <sys/wait.h>
#include <unistd.h>

pid_t child = fork();
if (child == 0) {
    ptrace(PTRACE_TRACEME, 0, NULL, NULL);
    execl("/bin/ls", "ls", NULL); // stops with SIGTRAP at exec
}
waitpid(child, NULL, 0);
ptrace(PTRACE_CONT, child, NULL, NULL);
```

# SECURITY

```bash
# Check ptrace scope
cat /proc/sys/kernel/yama/ptrace_scope

# Values:
# 0 - Classic: attach to any dumpable process of the same uid
# 1 - Restricted: attach to descendants only
# 2 - Admin only: requires CAP_SYS_PTRACE
# 3 - No attach: no PTRACE_ATTACH or PTRACE_TRACEME, cannot be changed once set
```

# CAVEATS

Linux-specific behavior (other Unix systems have similar but incompatible implementations). Without CAP_SYS_PTRACE, a process can only trace processes it could send signals to, and not set-user-ID or set-group-ID programs. The Yama LSM adds further restrictions through /proc/sys/kernel/yama/ptrace_scope, and a tracee can name an allowed tracer with prctl(PR_SET_PTRACER). Only one tracer can be attached to a process at a time, which is why anti-debugging code can detect a debugger when PTRACE_TRACEME fails.

# HISTORY

ptrace appears in the **Version 6 Unix** manual (1975) as a way for a parent process to control a child for debugging, and was later carried into SVr4 and 4.3BSD. Linux has extended it significantly with requests such as PTRACE_SEIZE and PTRACE_GETREGSET.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [gdb](/man/gdb)(1)

# RESOURCES

```[Documentation](https://man7.org/linux/man-pages/man2/ptrace.2.html)```

<!-- verified: 2026-11-09 -->
