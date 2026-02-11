# TAGLINE

Benchmark Proxmox host performance

# TLDR

Show **CPU and hard disk performance** data

```pveperf```

# SYNOPSIS

**pveperf** [_path_]

# PARAMETERS

_path_
> Mount point to test (default: /)

# DESCRIPTION

**pveperf** runs a quick benchmark to measure CPU and storage performance on a Proxmox VE host. It tests CPU performance using BogoMIPS calculations and storage performance with sequential and random read/write tests.

The results help identify potential performance bottlenecks and verify that storage meets minimum requirements for virtualization workloads. Default test runs on the root filesystem mount point.

# CAVEATS

Benchmark results are approximate and may vary between runs. For accurate storage benchmarking, consider dedicated tools like fio. Results should be interpreted in context of workload requirements.

# HISTORY

Part of **Proxmox VE**, providing quick system performance validation. Useful for initial hardware assessment and troubleshooting performance issues in virtualization environments.

# SEE ALSO

[pveversion](/man/pveversion)(1), [pvesh](/man/pvesh)(1)
