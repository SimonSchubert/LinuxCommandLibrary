# TLDR

Display information for **all CPUs**

```cpuid```

Display information for **current CPU** only

```cpuid -1```

Display **raw hex** information without decoding

```cpuid -r```

# SYNOPSIS

**cpuid** [_options_]

# DESCRIPTION

**cpuid** dumps detailed CPU information by executing the CPUID instruction and decoding the results. It displays processor identification, feature flags, cache information, and other CPU details.

More detailed than /proc/cpuinfo, it shows low-level processor capabilities.

# PARAMETERS

**-1, --one-cpu**
> Display information for current CPU only

**-r, --raw**
> Show raw hex values without decoding

**-f, --file** _file_
> Read raw data from file

# CAVEATS

x86/x86_64 only. Some information may be virtualized when running in VMs. Output interpretation requires understanding of CPU architecture.

# SEE ALSO

[lscpu](/man/lscpu)(1), [x86info](/man/x86info)(1)
