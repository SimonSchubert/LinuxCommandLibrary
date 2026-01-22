# TLDR

Display the machine **topology in tree format**

```lstopo-no-graphics```

Display only **physical cores** (ignore logical processors)

```lstopo-no-graphics --only pu```

Display the topology with **physical indexes**

```lstopo-no-graphics -p```

Display **help**

```lstopo-no-graphics -h```

# SYNOPSIS

**lstopo-no-graphics** [_options_]

# PARAMETERS

**--only _type_**
> Display only objects of the specified type (e.g., pu for processing units)

**-p, --physical**
> Display physical indexes instead of logical indexes

**-l, --logical**
> Display logical indexes (default)

**--no-io**
> Hide I/O devices from the output

**--no-bridges**
> Hide bridge devices from the output

**-h, --help**
> Display help information

# DESCRIPTION

**lstopo-no-graphics** displays the hardware topology of the system in text format without requiring a graphical display. Part of the **hwloc** (Hardware Locality) package, it shows the hierarchical structure of CPUs, caches, memory, and I/O devices.

The output shows the system's NUMA nodes, packages (sockets), cores, and processing units (hardware threads) in a tree structure. This information is useful for understanding CPU architecture, cache sharing, and memory locality for performance optimization.

Unlike **lstopo**, this variant works in console-only environments without X11 or graphical libraries.

# CAVEATS

Output detail depends on the kernel's exposure of hardware information. Some virtual machines or containers may show limited topology data. The hwloc library must be installed for this command to be available.

# HISTORY

The hwloc project was developed at Inria Bordeaux and the University of Tennessee, first released around 2009. It provides portable abstraction of hierarchical topology information across various operating systems and architectures.

# SEE ALSO

[lstopo](/man/lstopo)(1), [hwloc-ls](/man/hwloc-ls)(1), [lscpu](/man/lscpu)(1), [numactl](/man/numactl)(8)
