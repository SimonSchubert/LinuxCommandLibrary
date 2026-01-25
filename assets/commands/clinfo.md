# TLDR

**Display all OpenCL information**

```clinfo```

**Display only platform and device list**

```clinfo -l```

**Display in raw format**

```clinfo --raw```

**Display specific property**

```clinfo --prop [CL_DEVICE_NAME]```

**Display offline devices**

```clinfo --offline```

# SYNOPSIS

**clinfo** [_options_]

# PARAMETERS

**-l**, **--list**
> List platforms and devices only.

**--raw**
> Raw output format.

**-a**, **--all**
> Show all properties including unsupported.

**--offline**
> Show offline devices.

**--prop** _name_
> Show specific property value.

**-h**, **--human**
> Human-readable format (default).

# DESCRIPTION

**clinfo** displays detailed information about OpenCL platforms and devices available on the system. It queries the OpenCL runtime to report capabilities, memory sizes, supported features, and extensions.

The output includes information for each OpenCL platform (vendor implementation) and its devices (GPUs, CPUs, accelerators). Details include device type, compute units, memory sizes, supported OpenCL versions, and available extensions.

This information is essential for developing and debugging OpenCL applications, verifying driver installations, and understanding hardware capabilities for GPU computing tasks.

# OUTPUT INCLUDES

**Platform**: Vendor, version, profile, extensions
**Device**: Type, vendor, compute units, frequencies
**Memory**: Global, local, constant memory sizes
**Workgroup**: Maximum sizes and dimensions
**Image**: Supported image formats and sizes
**Extensions**: Available OpenCL extensions

# CAVEATS

Requires OpenCL runtime and ICD (Installable Client Driver) loader installed. Output varies based on installed drivers; missing or outdated drivers may show incomplete information. clinfo only shows OpenCL devices, not CUDA or other compute APIs.

# HISTORY

clinfo was developed as a diagnostic tool for the OpenCL ecosystem. OpenCL (Open Computing Language) was released by **Apple** and standardized by **Khronos Group** in **2009** as a framework for parallel programming across heterogeneous platforms. clinfo became an essential utility for developers and users to verify OpenCL setup and understand available compute capabilities.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [glxinfo](/man/glxinfo)(1), [vulkaninfo](/man/vulkaninfo)(1)
