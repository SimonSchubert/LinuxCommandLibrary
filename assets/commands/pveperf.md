# TAGLINE

Benchmark Proxmox host performance

# TLDR

Benchmark **root filesystem** performance

```pveperf```

Benchmark a **specific mount point**

```pveperf [/mnt/storage]```

# SYNOPSIS

**pveperf** [_path_]

# PARAMETERS

_path_
> Mount point to test (default: /)

# DESCRIPTION

**pveperf** runs a quick benchmark to measure CPU and storage performance on a Proxmox VE host. It reports CPU BOGOMIPS, regex processing speed (REGEX/SECOND), hard disk size, buffered read speed, average seek time, fsync rate (FSYNCS/SECOND), and DNS resolution times (external and internal).

The results help identify potential performance bottlenecks and verify that storage meets minimum requirements for virtualization workloads. The fsync rate is particularly important for database and VM disk performance. Default test runs on the root filesystem mount point.

# CAVEATS

Benchmark results are approximate and may vary between runs. For accurate storage benchmarking, consider dedicated tools like [fio](/man/fio)(1). Results should be interpreted in context of workload requirements. Requires root privileges.

# HISTORY

Part of **Proxmox VE**, providing quick system performance validation. Useful for initial hardware assessment and troubleshooting performance issues in virtualization environments.

# SEE ALSO

[pveversion](/man/pveversion)(1), [pvesh](/man/pvesh)(1)
