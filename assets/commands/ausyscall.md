# TAGLINE

Map system call names to numbers and vice versa

# TLDR

Display **syscall number** of a specific system call

```ausyscall [search_pattern]```

Display **name** of a specific system call number

```ausyscall [system_call_number]```

Display **all system calls** for a specific architecture

```ausyscall [architecture] --dump```

# SYNOPSIS

**ausyscall** [_arch_] _name_|_number_ [**--dump**]

# DESCRIPTION

**ausyscall** maps between system call names and their numeric values. This is useful when analyzing audit logs, writing system call filters, or understanding strace output.

The tool supports multiple architectures and can display the complete syscall table for any supported platform.

# PARAMETERS

**--dump**
> Display all system calls for the specified architecture

**--exact**
> Only match exact syscall names

# CAVEATS

System call numbers vary between architectures (x86, x86_64, ARM, etc.). When no architecture is specified, the current system's architecture is used. Part of the **audit** package.

# HISTORY

**ausyscall** is part of the Linux Audit framework, developed to provide comprehensive system auditing capabilities. The audit system was originally developed by Red Hat.

# SEE ALSO

[auditctl](/man/auditctl)(8), [ausearch](/man/ausearch)(8), [strace](/man/strace)(1), [seccomp](/man/seccomp)(2)
