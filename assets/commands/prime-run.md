# TAGLINE

Run commands on dedicated Nvidia GPU

# TLDR

Run command on **dedicated Nvidia GPU**

```prime-run [command]```

Run a **game** on the Nvidia GPU

```prime-run steam```

**Verify** Nvidia card is used

```prime-run glxinfo | grep "OpenGL renderer"```

Check **Vulkan** renderer

```prime-run vulkaninfo | grep "deviceName"```

# SYNOPSIS

**prime-run** _command_ [_arguments_...]

# DESCRIPTION

**prime-run** executes programs using a dedicated Nvidia GPU on hybrid graphics systems (Optimus). It is a thin wrapper that sets the environment variables **__NV_PRIME_RENDER_OFFLOAD=1**, **__NV_PRIME_RENDER_OFFLOAD_PROVIDER=NVIDIA-G0**, **__GLX_VENDOR_LIBRARY_NAME=nvidia**, and **__VK_LAYER_NV_optimus=NVIDIA_only** before executing the given command.

The tool is part of PRIME render offload, allowing selective use of the powerful GPU for specific applications while conserving power with integrated graphics for general use.

# CAVEATS

Requires nvidia-prime package and proper driver setup. Only works with Nvidia proprietary drivers. Some applications may not respect the environment variables. Wayland support varies by compositor.

# HISTORY

**prime-run** was introduced with NVIDIA's PRIME render offload support in driver version 435. It provides a simpler alternative to Bumblebee for hybrid graphics on Linux laptops.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [optirun](/man/optirun)(1), [switcheroo-control](/man/switcheroo-control)(1)
