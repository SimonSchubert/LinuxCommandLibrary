# TAGLINE

Vulkan spinning cube demo application

# TLDR

**Run Vulkan demo**

```vkcube```

**With frame count**

```vkcube --c [1000]```

**Present mode**

```vkcube --present_mode [0]```

**GPU select**

```vkcube --gpu [0]```

# SYNOPSIS

**vkcube** [_--c frames_] [_--present_mode mode_] [_options_]

# PARAMETERS

**--c** _FRAMES_
> Frame count.

**--present_mode** _MODE_
> Presentation mode.

**--gpu** _INDEX_
> GPU selection.

**--width** _W_
> Window width.

**--height** _H_
> Window height.

# DESCRIPTION

**vkcube** is a simple demo application from the Vulkan SDK that displays a spinning 3D cube rendered using the Vulkan graphics API. It serves as a quick verification tool to confirm that Vulkan drivers and libraries are correctly installed and functioning on the system.

The application opens a window showing a textured cube rotating continuously. If the cube renders and spins smoothly, it indicates that the GPU, Vulkan driver, and display system are working together properly. Options allow selecting a specific GPU, setting the presentation mode, and limiting the number of rendered frames.

As part of the official Vulkan-Tools package maintained by the Khronos Group, vkcube is the C implementation of the demo (vkcubepp is the C++ version). It is commonly used as a first diagnostic step when troubleshooting Vulkan support on Linux systems.

# CAVEATS

Vulkan drivers needed. GPU required. Display required.

# HISTORY

**vkcube** is part of the **Vulkan SDK**, providing a simple test application for Vulkan functionality.

# SEE ALSO

[vulkaninfo](/man/vulkaninfo)(1), [glxgears](/man/glxgears)(1), [vkcubepp](/man/vkcubepp)(1)
