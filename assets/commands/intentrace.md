# TAGLINE

Strace with intent for meaningful syscall tracing

# TLDR

**Trace a command**

```intentrace [command]```

**Trace a running process** by PID

```intentrace -p [pid]```

**Show only a summary table**

```intentrace -c [command]```

**Follow child processes** (forks)

```intentrace -f [command]```

**Only show failed syscalls**

```intentrace -Z [command]```

**Redirect output to a file**

```intentrace -o [file] [command]```

# SYNOPSIS

**intentrace** [_options_] [_command_ [_args_...]]

# PARAMETERS

**-p** _pid_, **--attach** _pid_
> Attach to a running process by PID.

**-c**, **--summary-only**
> Display only a summary table.

**-C**, **--summary**
> Show summary table in addition to normal output.

**-f**, **--follow-forks**
> Trace child processes when traced programs create them.

**-Z**, **--failed-only**
> Only show failed syscalls.

**-o** _file_, **--output** _file_
> Redirect output to a file.

**-q**, **--mute-stdout**
> Suppress traced program's standard output.

**--trace**=_syscall1,syscall2_
> Trace only specific syscalls.

# DESCRIPTION

**intentrace** is a syscall tracer that goes beyond raw syscall logging by consulting an extensive backlog of deduction heuristics to explain what each syscall is actually trying to accomplish. Because Linux syscalls often have dual usage that is obfuscated by libraries, seeing the intent behind a syscall is immensely useful when debugging crashing binaries.

Unlike traditional strace output which shows raw syscall numbers and arguments, intentrace provides human-readable explanations of what each system call is doing in context.

# CAVEATS

Currently only supports **x86-64** Linux. Covers approximately 166 of the 380+ Linux syscalls, focusing on the most commonly used ones. The project is in beta; multi-threaded programs may not trace reliably.

# HISTORY

**intentrace** was created by **sectordistrict** and is written in **Rust**. It was designed as a more informative alternative to strace that provides context and meaning for each syscall rather than just raw data.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [ptrace](/man/ptrace)(2)
