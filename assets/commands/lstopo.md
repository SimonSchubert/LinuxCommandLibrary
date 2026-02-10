# TAGLINE

displays hardware topology including CPUs, caches, memory, and I/O devices

# TLDR

**Show hardware topology**

```lstopo```

**Display in terminal** (text mode)

```lstopo-no-graphics```

**Output as image**

```lstopo [topology.png]```

**Output as PDF**

```lstopo [topology.pdf]```

**Output as XML**

```lstopo [topology.xml]```

**Show only CPU info**

```lstopo --only core```

**Show with PCI devices**

```lstopo --whole-io```

**Show physical indexes**

```lstopo -p```

# SYNOPSIS

**lstopo** [_--of format_] [_--only type_] [_--whole-io_] [_options_] [_output_]

# PARAMETERS

**--of** _FORMAT_
> Output format (png, pdf, svg, xml, txt, console).

**--only** _TYPE_
> Show only specific object types.

**--whole-io**
> Show all I/O devices.

**--no-io**
> Hide I/O devices.

**-p**, **--physical**
> Show physical/OS indexes.

**-l**, **--logical**
> Show logical indexes.

**--merge**
> Merge identical objects.

**--no-legend**
> Hide the legend.

**--no-caches**
> Hide cache information.

**-v**, **--verbose**
> Verbose output.

**--input** _FILE_
> Read topology from XML file.

**--version**
> Print version.

# DESCRIPTION

**lstopo** displays hardware topology including CPUs, caches, memory, and I/O devices. It visualizes the hierarchical structure of the system from machine level down to individual cores and threads.

The output shows NUMA nodes, packages (sockets), cores, and processing units (threads). Cache levels (L1, L2, L3) are displayed with their sizes and sharing between cores.

Graphical output creates images showing the topology tree. Text mode (lstopo-no-graphics) works in terminals without graphics support.

Understanding topology is important for performance optimization. It shows which cores share caches, which are on the same NUMA node, and how memory is organized.

The tool can load topology from XML files, enabling offline analysis or comparison between systems.

# CAVEATS

Graphical output requires Cairo/X11 libraries. Some virtual environments may show incorrect topology. Root access may be needed for complete I/O device information.

# HISTORY

**lstopo** is part of **hwloc** (Hardware Locality), developed by the **Open MPI** project starting around **2009**. hwloc provides a portable abstraction for hardware topology across different operating systems. lstopo evolved from earlier tools in the project.

# SEE ALSO

[hwloc-info](/man/hwloc-info)(1), [hwloc-bind](/man/hwloc-bind)(1), [lscpu](/man/lscpu)(1), [numactl](/man/numactl)(8)
