# TLDR

**List CXL memory devices**

```cxl list```

**Show detailed device information**

```cxl list -vvv```

**List memory regions**

```cxl list -R```

**Show device health**

```cxl list -H```

**Enable a memory device**

```cxl enable-memdev [mem0]```

**Create a region**

```cxl create-region -d [decoder0.0] -m [mem0]```

# SYNOPSIS

**cxl** _command_ [_options_] [_device_]

# PARAMETERS

**list**
> List CXL devices, regions, or decoders.

**enable-memdev** _device_
> Enable a memory device.

**disable-memdev** _device_
> Disable a memory device.

**create-region**
> Create a memory region.

**destroy-region** _region_
> Destroy a memory region.

**enable-region** _region_
> Enable a memory region.

**disable-region** _region_
> Disable a memory region.

**-m**, **--memdev** _device_
> Specify memory device.

**-d**, **--decoder** _decoder_
> Specify decoder.

**-R**, **--regions**
> List regions.

**-H**, **--health**
> Include health information.

**-v**, **--verbose**
> Increase verbosity (repeat for more).

# DESCRIPTION

**cxl** is the management utility for Compute Express Link (CXL) devices, a new interconnect standard for attaching memory and accelerators to CPUs. It manages CXL memory expanders, configures memory regions, and monitors device health.

CXL enables disaggregated memory architectures where memory can be pooled and dynamically allocated to different hosts. The cxl tool configures how this memory appears to the operating system through regions and decoders.

Common operations include listing available CXL devices, checking health status, creating memory regions that can be used by the system, and managing the device lifecycle.

# CAVEATS

Requires kernel 5.15+ with CXL support enabled. Hardware must support CXL (Intel 4th gen Xeon, AMD EPYC, etc.). Configuration changes may require system restart. CXL is evolving technology; some features depend on specific kernel versions.

# HISTORY

CXL was developed by the **CXL Consortium**, founded in **2019** by Intel, with specifications contributed by major hardware vendors. The Linux **cxl** tool was developed as part of the **ndctl** project by **Dan Williams** at Intel. CXL 1.1 support appeared in Linux 5.12 (2021), with ongoing development adding features for newer CXL specifications (2.0, 3.0).

# SEE ALSO

[ndctl](/man/ndctl)(1), [daxctl](/man/daxctl)(1), [lspci](/man/lspci)(8)
