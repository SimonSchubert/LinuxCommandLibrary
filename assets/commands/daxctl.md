# TAGLINE

utility for managing Device DAX and persistent memory

# TLDR

**List DAX devices**

```daxctl list```

**Show detailed device information**

```daxctl list -d```

**Reconfigure device to system-ram mode**

```daxctl reconfigure-device --mode=system-ram [dax0.0]```

**Reconfigure to devdax mode**

```daxctl reconfigure-device --mode=devdax [dax0.0]```

**Online memory from DAX device**

```daxctl online-memory [dax0.0]```

**Offline memory**

```daxctl offline-memory [dax0.0]```

# SYNOPSIS

**daxctl** _command_ [_options_] [_device_]

# PARAMETERS

**list** [_options_]
> List DAX devices and regions.

**reconfigure-device**
> Change device mode.

**online-memory**
> Bring DAX memory online for system use.

**offline-memory**
> Take DAX memory offline.

**-d**, **--devices**
> Include device details in listing.

**-r**, **--regions**
> Include region details.

**--mode** _mode_
> Device mode: devdax or system-ram.

**-f**, **--force**
> Force operation.

**--no-online**
> Don't automatically online memory.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**daxctl** manages Device DAX (Direct Access) devices, which provide direct memory-mapped access to persistent memory (PMEM) or CXL memory regions. It configures how this memory appears to the system.

In **devdax** mode, memory is accessed through a character device for applications needing direct access (databases, memory-mapped files). In **system-ram** mode, the memory appears as regular system RAM and can be used by any application.

The tool works with regions created by **ndctl** (for NVDIMM) or **cxl** (for CXL memory). It's essential for managing disaggregated and persistent memory in modern server systems.

# MODES

**devdax**: Direct character device access (/dev/daxX.Y)
> Used for applications that explicitly mmap the device

**system-ram**: Hot-plugged system memory
> Treated as regular RAM, usable by any process

# CAVEATS

Mode changes may require the device to be unmapped first. System-ram mode memory may have different NUMA characteristics than normal RAM. Requires kernel support for DAX (Device-DAX). Persistent memory in system-ram mode loses persistence benefit.

# HISTORY

daxctl is part of the **ndctl** project led by **Dan Williams** at Intel. It was developed alongside Linux kernel support for persistent memory (NVDIMM) starting around **2016**. As persistent memory technology (Intel Optane, CXL memory) evolved, daxctl became essential for managing how this memory integrates with the operating system.

# SEE ALSO

[ndctl](/man/ndctl)(1), [cxl](/man/cxl)(1), [numactl](/man/numactl)(8)
