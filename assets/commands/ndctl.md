# TAGLINE

utility for managing Non-Volatile DIMMs on Linux

# TLDR

Create an **fsdax mode namespace**

```ndctl create-namespace --mode=fsdax```

**Change mode** of a namespace to raw

```ndctl create-namespace --reconfigure=[namespaceX.Y] --mode=raw```

**Check and repair** a sector mode namespace

```ndctl check-namespace --repair [namespaceX.Y]```

**List all** namespaces, regions, and buses

```ndctl list --namespaces --regions --buses --idle```

List namespace with **verbose information**

```ndctl list -vvv --namespace=[namespaceX.Y]```

**Monitor** SMART health events

```ndctl monitor --bus=ACPI.NFIT```

**Destroy** or reset a namespace

```ndctl destroy-namespace --force [namespaceX.Y]```

# SYNOPSIS

**ndctl** _command_ [_options_] [_namespace_]

# COMMANDS

**create-namespace**
> Create a new namespace with specified mode

**destroy-namespace**
> Remove or reset namespace to initial state

**check-namespace**
> Check namespace for consistency

**list**
> List namespaces, regions, buses, and dimms

**monitor**
> Watch for SMART health events

**enable-namespace**
> Enable a disabled namespace

**disable-namespace**
> Disable an active namespace

**enable-region**
> Enable a region

**disable-region**
> Disable a region

# PARAMETERS

**--mode _mode_**
> Namespace mode: fsdax, devdax, sector, raw

**--reconfigure _namespace_**
> Reconfigure existing namespace

**--repair**
> Repair errors found during check

**--force, -f**
> Force operation without confirmation

**--bus _bus_**
> Operate on specific bus

**--region _region_**
> Operate on specific region

**--idle**
> Include disabled/idle objects in listing

**-v, -vv, -vvv**
> Increase verbosity level

# DESCRIPTION

**ndctl** is a utility for managing Non-Volatile DIMMs (NVDIMMs) on Linux. NVDIMMs are persistent memory modules that retain data without power, providing storage-class memory capabilities.

The tool manages namespaces (logical storage units), regions (physical NVDIMM groupings), and monitors NVDIMM health. Different namespace modes support various use cases: fsdax for filesystem DAX, devdax for device DAX, sector for legacy block access.

# CAVEATS

Operations on active namespaces may require unmounting filesystems first. Destroying namespaces is irreversible. NVDIMM support requires appropriate hardware and kernel configuration. Health monitoring requires ACPI NFIT support.

# HISTORY

**ndctl** was developed by Intel and the Linux community as part of the **pmem** (persistent memory) project. It provides userspace tools for managing NVDIMMs as standardized by ACPI NFIT and the NVDIMM driver subsystem.

# SEE ALSO

[daxctl](/man/daxctl)(1), [cxl](/man/cxl)(1)
