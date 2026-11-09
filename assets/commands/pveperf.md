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

**pveperf** runs a quick benchmark to measure CPU and storage performance on a Proxmox VE host. It reports the following values:

**CPU BOGOMIPS**
> Sum of the bogomips of all CPUs.

**REGEX/SECOND**
> Perl regular expressions per second; should be above 300000.

**HD SIZE**
> Size of the disk at the tested path.

**BUFFERED READS**
> Simple read test; modern disks should reach at least 40 MB/sec.

**AVERAGE SEEK TIME**
> Average seek time in milliseconds.

**FSYNCS/SECOND**
> Synchronous write rate; should be greater than 200. RAID controllers should use battery-backed write-back cache.

**DNS EXT** / **DNS INT**
> Average time to resolve an external and a local DNS name.

The results help identify potential performance bottlenecks and verify that storage meets minimum requirements for virtualization workloads. The fsync rate is particularly important for database and VM disk performance.

# CAVEATS

Benchmark results are approximate and may vary between runs. For accurate storage benchmarking, consider dedicated tools like [fio](/man/fio)(1). Results should be interpreted in context of workload requirements. Requires root privileges: the tool drops the page cache and reads the raw block device. The read and seek tests only run when the path is backed by a **/dev/** device.

# HISTORY

Part of **Proxmox VE**, providing quick system performance validation. Useful for initial hardware assessment and troubleshooting performance issues in virtualization environments.

# SEE ALSO

[pveversion](/man/pveversion)(1), [pvesh](/man/pvesh)(1), [fio](/man/fio)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-manager.git)```

```[Homepage](https://www.proxmox.com/en/products/proxmox-virtual-environment/overview)```

```[Documentation](https://pve.proxmox.com/pve-docs/pveperf.1.html)```

<!-- verified: 2026-11-09 -->
