# TLDR

**Stress CPU**

```stress-ng --cpu [4] --timeout [60s]```

**Stress memory**

```stress-ng --vm [2] --vm-bytes [1G] --timeout [60s]```

**Stress disk I/O**

```stress-ng --io [4] --timeout [60s]```

**Combined stress test**

```stress-ng --cpu [2] --vm [2] --io [2] --timeout [60s]```

**Matrix operations** (CPU intensive)

```stress-ng --matrix [4] --timeout [60s]```

**Show available stressors**

```stress-ng --stressors```

**Metrics output**

```stress-ng --cpu [4] --metrics --timeout [60s]```

**Limit CPU usage**

```stress-ng --cpu [4] --cpu-load [50] --timeout [60s]```

# SYNOPSIS

**stress-ng** [_--cpu n_] [_--vm n_] [_--io n_] [_--timeout t_] [_options_]

# PARAMETERS

**--cpu** _N_
> CPU stress workers.

**--cpu-load** _PERCENT_
> Target CPU load.

**--vm** _N_
> Memory stress workers.

**--vm-bytes** _SIZE_
> Memory per worker.

**--io** _N_
> I/O stress workers.

**--hdd** _N_
> Disk write workers.

**--matrix** _N_
> Matrix computation.

**--timeout** _TIME_
> Test duration.

**--metrics**
> Show statistics.

**--verbose**
> Verbose output.

**--stressors**
> List stressors.

**--class** _CLASS_
> Run stressor class.

**--sequential** _N_
> Run stressors sequentially.

**--all** _N_
> Run all stressors.

# DESCRIPTION

**stress-ng** tests system stability under various loads. It exercises CPU, memory, I/O, and other subsystems to find hardware or software issues.

CPU stressors include integer, floating-point, matrix operations, and cryptographic algorithms. Different stressors stress different CPU components.

Memory tests allocate, write, and verify RAM. They can uncover bad memory, cooling issues, and memory controller problems.

I/O stressors exercise filesystem and block device operations. They reveal disk, controller, and driver problems.

Metrics show operations per second and system statistics. These help quantify performance and identify bottlenecks.

Combined workloads simulate realistic multi-component stress. Thermal and power issues often appear only under mixed loads.

# CAVEATS

Can damage unstable hardware. High temperatures possible. May trigger OOM killer. Use with cooling monitoring.

# HISTORY

**stress-ng** was written by **Colin Ian King** at **Canonical** as an enhanced version of stress. It provides many more stressor types and is used for kernel and hardware testing.

# SEE ALSO

[stress](/man/stress)(1), [sysbench](/man/sysbench)(1), [memtester](/man/memtester)(8), [fio](/man/fio)(1)
