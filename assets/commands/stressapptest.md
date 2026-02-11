# TAGLINE

Google memory and hardware stress tester

# TLDR

**Run memory stress**

```stressapptest -s [60]```

**With specific memory**

```stressapptest -M [1024] -s [60]```

**File test**

```stressapptest -f [/tmp/testfile] -s [60]```

**Verbose output**

```stressapptest -v [2] -s [60]```

**Multiple threads**

```stressapptest -m [4] -s [60]```

# SYNOPSIS

**stressapptest** [_-s seconds_] [_-M mbytes_] [_-m threads_] [_options_]

# PARAMETERS

**-s** _SEC_
> Duration seconds.

**-M** _MB_
> Memory in MB.

**-m** _N_
> Memory threads.

**-f** _FILE_
> Test file.

**-v** _LEVEL_
> Verbosity level.

**-l** _FILE_
> Log file.

# DESCRIPTION

**stressapptest** (Stressful Application Test) is a memory and hardware verification tool developed by Google to find errors in memory subsystems, disk I/O, and other hardware components. It generates realistic high-load patterns that exercise the memory bus, cache hierarchy, and storage pathways to expose intermittent hardware faults.

The tool allocates a configurable amount of memory and continuously writes data patterns, reads them back, and verifies correctness. This approach is effective at detecting ECC memory errors, faulty DIMM modules, memory controller issues, and thermal throttling problems. File I/O tests can be included to stress disk and storage controller hardware simultaneously.

Stressapptest is particularly useful for qualifying new hardware, burn-in testing servers before production deployment, and diagnosing systems that exhibit intermittent crashes or data corruption under load.

# CAVEATS

Generates heat. May trigger failures. Use carefully on production.

# HISTORY

**stressapptest** was developed by **Google** to stress test memory subsystems and find hardware errors.

# SEE ALSO

[stress](/man/stress)(1), [memtester](/man/memtester)(1), [mprime](/man/mprime)(1)
