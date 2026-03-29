# TAGLINE

utility for managing Device DAX and persistent memory

# TLDR

**List all DAX devices and regions**

```daxctl list```

**List devices with detailed output including region info**

```daxctl list -d -r```

**Reconfigure device to system-ram mode**

```daxctl reconfigure-device --mode=system-ram [dax0.0]```

**Reconfigure to devdax mode**

```daxctl reconfigure-device --mode=devdax [dax0.0]```

**Online memory from a device in system-ram mode**

```daxctl online-memory [dax0.0]```

**Offline memory from a device in system-ram mode**

```daxctl offline-memory [dax0.0]```

**Enable a devdax device**

```daxctl enable-device [dax0.0]```

**Disable a devdax device**

```daxctl disable-device [dax0.0]```

# SYNOPSIS

**daxctl** _command_ [_options_] [_device_]

# PARAMETERS

**list** [_options_]
> List DAX devices and regions in JSON format.

**reconfigure-device** _device_
> Change device mode (devdax or system-ram).

**online-memory** _device_
> Bring DAX memory online for system use (device must be in system-ram mode).

**offline-memory** _device_
> Take DAX memory offline (device must be in system-ram mode).

**enable-device** _device_
> Enable a devdax device.

**disable-device** _device_
> Disable a devdax device.

**create-device**
> Create a new devdax device within a region.

**destroy-device** _device_
> Destroy a devdax device.

**migrate-device-model**
> Opt in to the /sys/bus/dax device model, allowing alternative Device-DAX instance drivers.

**-d**, **--devices**
> Include device details in listing.

**-r**, **--regions**
> Include region details in listing.

**-m**, **--mode** _mode_
> Device mode: devdax or system-ram.

**-s**, **--size** _size_
> For regions supporting device creation, set the device size (supports k, m, g, t suffixes).

**-a**, **--align** _align_
> Set alignment for large page mappings (default: 2M).

**-N**, **--no-online**
> Do not automatically online memory sections when switching to system-ram mode.

**--no-movable**
> Online new memory as non-movable (allows kernel use of this memory).

**-C**, **--check-config**
> Read reconfiguration parameters from the global daxctl config file.

**-f**, **--force**
> Force offline of memory sections or override kernel auto-online policies.

**-u**, **--human**
> Format storage sizes as human-readable strings with units.

**-v**, **--verbose**
> Emit debug messages.

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
