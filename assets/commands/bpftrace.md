# TAGLINE

High-level tracing language for Linux eBPF.

# TLDR

List all **available probes**

```sudo bpftrace -l```

Run a **one-liner program**

```sudo bpftrace -e 'tracepoint:raw_syscalls:sys_enter { @[comm] = count(); }'```

Run a **program from file**

```sudo bpftrace [path/to/file]```

Trace a program by **PID**

```sudo bpftrace -e 'tracepoint:raw_syscalls:sys_enter /pid == 123/ { @[comm] = count(); }'```

**Dry run** and display eBPF output

```sudo bpftrace -d -e '[one_line_program]'```

Display **version**

```bpftrace -V```

# SYNOPSIS

**bpftrace** [_options_] [_program_|_file_]

# DESCRIPTION

**bpftrace** is a high-level tracing language for Linux eBPF. It provides a powerful scripting interface for kernel and userspace tracing, similar to DTrace on other Unix systems.

Programs can attach to tracepoints, kprobes, uprobes, and other probe types to collect and aggregate data about system behavior in real-time.

# PARAMETERS

**-l**
> List available probes

**-e** _program_
> Execute a one-liner program

**-d**
> Dry run; show compiled eBPF without executing

**-p** _pid_
> Enable USDT probes for the specified PID

**-v**
> Verbose output

**-V, --version**
> Display version information

# CAVEATS

Requires root privileges. Kernel must have eBPF and BTF support enabled. Some probes may not be available on all kernel versions. Performance impact varies by probe type and frequency.

# HISTORY

**bpftrace** was created by Alastair Robertson and first released in **2018**. It was inspired by DTrace and aimed to bring similar high-level tracing capabilities to Linux using eBPF.

# SEE ALSO

[bpftool](/man/bpftool)(8), [perf](/man/perf)(1), [strace](/man/strace)(1)
