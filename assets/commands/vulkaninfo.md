# TAGLINE

Display Vulkan GPU and driver information

# TLDR

**Show Vulkan information summary**

```vulkaninfo --summary```

**Display full Vulkan information** (verbose)

```vulkaninfo```

**Output to a file**

```vulkaninfo -o [vulkan_info.txt]```

**Generate JSON output**

```vulkaninfo --json```

**Generate HTML report**

```vulkaninfo --html```

**Show all available formats**

```vulkaninfo --show-formats```

**Target specific GPU** in multi-GPU system

```vulkaninfo --json=[0]```

# SYNOPSIS

**vulkaninfo** [**--summary**] [**--json**[=_gpu_]] [**--html**] [**--text**] [**-o** _file_] [**--show-formats**]

# PARAMETERS

**--summary**
> Display a brief summary of Vulkan information for all GPUs.

**--text**
> Produce text output to stdout. This is the default format.

**--html**
> Generate HTML report saved as vulkaninfo.html.

**-j**, **--json**[=_gpu_]
> Produce JSON output conforming to Vulkan Profiles schema. Optional GPU number targets specific device.

**-o** _file_, **--output** _file_
> Save output to the specified file.

**--show-formats**
> Display detailed information about supported image formats.

**--show-all**
> Display all available information.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**vulkaninfo** displays detailed information about Vulkan API support on the system, including physical devices (GPUs), available extensions, layers, memory types, queue families, and supported formats.

The tool queries the Vulkan runtime to enumerate all Vulkan-capable devices and their capabilities. This includes device properties (name, type, driver version, API version), limits, supported features, memory heaps, and queue family properties.

Output can be extremely verbose on systems with multiple GPUs or extensive driver features. Use **--summary** for a quick overview or redirect output to a file for detailed analysis. The tool is essential for verifying Vulkan installation, debugging driver issues, and determining hardware capabilities for application development.

vulkaninfo is part of the vulkan-tools package on most Linux distributions.

# CAVEATS

Requires working Vulkan drivers and runtime. Default output can be thousands of lines; use **--summary** for brief output. Some features require specific Vulkan extensions to be present. Multi-GPU systems show information for all devices unless filtered.

# HISTORY

**vulkaninfo** is developed by the **Khronos Group** as part of the Vulkan SDK tools, maintained by **LunarG**. Vulkan was announced in **2015** and released in **February 2016** as the successor to OpenGL for high-performance graphics. vulkaninfo has been part of the Vulkan SDK since its initial release, serving as the primary diagnostic tool for Vulkan installations.

# SEE ALSO

[glxinfo](/man/glxinfo)(1), [nvidia-smi](/man/nvidia-smi)(1), [lspci](/man/lspci)(8), [clinfo](/man/clinfo)(1)
