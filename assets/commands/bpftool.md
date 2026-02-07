# TAGLINE

Inspect and manage eBPF programs and maps.

# TLDR

List information about loaded **eBPF programs**

```bpftool prog list```

List eBPF program attachments in the **networking subsystem**

```bpftool net list```

List all **active links**

```bpftool link list```

List all **tracepoint and kprobe** attachments

```bpftool perf list```

List **BPF Type Format (BTF)** data

```bpftool btf list```

List information about loaded **maps**

```bpftool map list```

**Probe** a network device for supported eBPF features

```bpftool feature probe dev [eth0]```

Run commands in **batch mode** from a file

```bpftool batch file [myfile]```

# SYNOPSIS

**bpftool** [_object_] _command_ [_options_]

# DESCRIPTION

**bpftool** inspects and manipulates eBPF (extended Berkeley Packet Filter) programs and maps. It provides visibility into loaded BPF programs, their attachments, and the data structures they use.

eBPF is a powerful Linux kernel technology used for networking, security, tracing, and performance analysis. bpftool is essential for debugging and managing eBPF-based tools.

# OBJECTS

**prog**
> Manage BPF programs

**map**
> Manage BPF maps

**link**
> Manage BPF links

**net**
> Inspect network-related BPF attachments

**perf**
> Inspect perf-related BPF attachments

**btf**
> Manage BTF (BPF Type Format) data

**feature**
> Probe kernel/device for BPF feature support

# CAVEATS

Requires root privileges or CAP_BPF capability. Output format may vary between kernel versions. Some features require specific kernel configuration options.

# SEE ALSO

[bpftrace](/man/bpftrace)(8), [tc](/man/tc)(8), [perf](/man/perf)(1)
