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

**ptrace** is a system call for process tracing and debugging. It allows one process to observe and control another, inspect and modify memory and registers. Used by debuggers like gdb and tracers like strace.

# REQUESTS

```c
PTRACE_TRACEME    - Allow parent to trace
PTRACE_ATTACH     - Attach to process
PTRACE_DETACH     - Detach from process
PTRACE_PEEKTEXT   - Read word from memory
PTRACE_POKETEXT   - Write word to memory
PTRACE_GETREGS    - Get registers
PTRACE_SETREGS    - Set registers
PTRACE_CONT       - Continue execution
PTRACE_SINGLESTEP - Single instruction step
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

Linux-specific. Security restrictions via YAMA. Requires appropriate privileges. Anti-debugging techniques can detect ptrace.

# HISTORY

ptrace originated in **Unix V7** (1979) and has been extended significantly in **Linux** for debugging and tracing.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [gdb](/man/gdb)(1), [ptrace](/man/ptrace)(2)
