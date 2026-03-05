# TAGLINE

Strace with intent for meaningful syscall tracing

# TLDR

**Trace a command**

```intentrace [command]```

**Trace a running process** by PID

```intentrace -p [pid]```

**Trace with verbose output**

```intentrace -v [command]```

# SYNOPSIS

**intentrace** [**-p** _pid_] [**-v**] [_command_ [_args_...]]

# DESCRIPTION

**intentrace** is a syscall tracer that goes beyond raw syscall logging by consulting an extensive backlog of deduction heuristics to explain what each syscall is actually trying to accomplish. Because Linux syscalls often have dual usage that is obfuscated by libraries, seeing the intent behind a syscall is immensely useful when debugging crashing binaries.

Unlike traditional strace output which shows raw syscall numbers and arguments, intentrace provides human-readable explanations of what each system call is doing in context.

# CAVEATS

Currently only supports **x86-64** Linux. Covers approximately 166 of the 380+ Linux syscalls, focusing on the most commonly used ones. The project is in beta and actively developing cross-platform support.

# HISTORY

**intentrace** was created by **sectordistrict** and is written in **Zig**. It was designed as a more informative alternative to strace that provides context and meaning for each syscall rather than just raw data.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [ptrace](/man/ptrace)(2)
