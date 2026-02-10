# TAGLINE

distributes hardware interrupts across CPUs

# TLDR

**Start irqbalance**

```sudo irqbalance```

**Run in foreground**

```sudo irqbalance --foreground```

**One-shot balance**

```sudo irqbalance --oneshot```

**Debug mode**

```sudo irqbalance --debug```

**Ban specific IRQ**

```sudo irqbalance --banirq=[irq_num]```

# SYNOPSIS

**irqbalance** [_options_]

# PARAMETERS

**--foreground**
> Run in foreground.

**--oneshot**
> Balance once and exit.

**--debug**
> Enable debug output.

**--banirq** _IRQ_
> Exclude IRQ from balancing.

**--policyscript** _SCRIPT_
> Custom placement policy.

**--pid** _FILE_
> PID file location.

**--help**
> Display help information.

# DESCRIPTION

**irqbalance** distributes hardware interrupts across CPUs. It optimizes interrupt handling for multi-processor systems.

The daemon monitors IRQ patterns and migrates them for better load distribution. It improves performance on multi-core systems.

# CAVEATS

Runs as daemon. May conflict with manual IRQ affinity. Linux-specific.

# HISTORY

irqbalance was created to automatically balance IRQ loads across CPUs, replacing manual smp_affinity configuration.

# SEE ALSO

[irq-info](/man/irq-info)(1), [cpupower](/man/cpupower)(1), [taskset](/man/taskset)(1)
