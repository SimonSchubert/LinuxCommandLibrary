# TLDR

**Run Vulkan cube demo**

```vkcubepp```

**Run with validation layers**

```vkcubepp --validate```

**Run on specific GPU**

```vkcubepp --gpu_number [0]```

**Run in fullscreen**

```vkcubepp --fullscreen```

**Suppress frame count output**

```vkcubepp --suppress_popups```

**Display help**

```vkcubepp --help```

# SYNOPSIS

**vkcubepp** [_options_]

# PARAMETERS

**--validate**
> Enable Vulkan validation layers.

**--gpu_number** _n_
> Select GPU by index.

**--fullscreen**
> Run in fullscreen mode.

**--present_mode** _mode_
> Set presentation mode.

**--suppress_popups**
> Suppress informational popups.

**--width** _n_
> Window width in pixels.

**--height** _n_
> Window height in pixels.

**--help**, **-h**
> Display help.

# DESCRIPTION

**vkcubepp** displays a spinning 3D cube rendered using the Vulkan graphics API. It's a simple test application to verify that Vulkan drivers and libraries are correctly installed and functioning.

Part of the Vulkan-Tools package from the Khronos Group, vkcubepp is written in C++ (vkcube is the C version). Both produce the same visual output but demonstrate different API usage patterns.

Running with --validate enables Vulkan validation layers, useful for developers debugging Vulkan applications. The cube should spin smoothly if Vulkan is working correctly.

# CAVEATS

Requires Vulkan-capable GPU and drivers. May fail silently if Vulkan is misconfigured. Part of vulkan-tools package. Window system support (X11/Wayland) depends on build options.

# HISTORY

**vkcubepp** is part of the official Vulkan-Tools repository maintained by the Khronos Group. Vulkan was released in 2016 as a successor to OpenGL, providing lower-level GPU access. The cube demo serves as a minimal Vulkan test case.

# SEE ALSO

[vulkaninfo](/man/vulkaninfo)(1), [vkcube](/man/vkcube)(1), [glxinfo](/man/glxinfo)(1), [glxgears](/man/glxgears)(1)
