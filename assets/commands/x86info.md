# TLDR

**Display all CPU information**

```x86info -a```

**Show CPU feature flags**

```x86info -f```

**Show cache and TLB information**

```x86info -c```

**Estimate current clock speed**

```x86info -mhz```

**Show raw CPUID register values**

```x86info -r```

**Dump model-specific registers** (requires root)

```sudo x86info -m```

**Show verbose descriptions**

```x86info -v```

**Dump MP table** (multiprocessor info)

```sudo x86info -mp```

# SYNOPSIS

**x86info** [**-a**] [**-c**] [**-f**] [**-m**] [**-mhz**] [**-mp**] [**-r**] [**-s**] [**-v**]

# PARAMETERS

**-a**, **--all**
> Show all available information. Equivalent to -c -f -m -r -mhz.

**-c**, **--cache**
> Display TLB and cache sizes, including cache associativity.

**-f**, **--flags**
> Show CPU feature flags (SSE, AVX, etc.).

**-m**, **--msr**
> Dump model-specific registers. Requires root and supported processor.

**-mhz**, **--mhz**
> Estimate current CPU clock rate.

**-mp**, **--mptable**
> Dump MP table showing CPUs known to BIOS.

**-r**, **--registers**
> Show raw register values from all possible CPUID calls.

**-s**, **--show-machine-check**
> Display machine check exception information.

**-v**, **--verbose**
> Show verbose descriptions of CPU features.

**-?**, **--help**
> Display help message.

# DESCRIPTION

**x86info** displays detailed diagnostic information about x86 CPUs, including processor identification, feature flags, cache topology, and model-specific registers. It queries the processor using the CPUID instruction and MSR (Model Specific Register) reads.

The tool provides information similar to /proc/cpuinfo but with more detail, including cache associativity, TLB configuration, and raw CPUID data. It can identify the CPU vendor, family, model, and stepping, along with supported instruction set extensions.

For full functionality, the kernel must have CPUID and MSR device drivers enabled, creating device files at /dev/cpu/\<n\>/cpuid and /dev/cpu/\<n\>/msr. Some options (MSR reading, MP table) require root privileges.

# CAVEATS

Requires CPUID and MSR kernel modules for full functionality. MSR access requires root privileges. Model-specific register support varies by processor. Clock rate estimation may be inaccurate on systems with frequency scaling.

# HISTORY

**x86info** was written by **Dave Jones** (davej@redhat.com), who also contributed significantly to the Linux kernel's CPU identification code. The tool has been available since the early **2000s** and provides detailed x86 CPU diagnostics not easily available through other means.

# SEE ALSO

[cpuid](/man/cpuid)(1), [lscpu](/man/lscpu)(1), [dmidecode](/man/dmidecode)(8)
