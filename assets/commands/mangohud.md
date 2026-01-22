# TLDR

Run application with **HUD overlay**

```mangohud [command]```

# SYNOPSIS

**mangohud** [_options_] _command_

# DESCRIPTION

**mangohud** displays a real-time monitoring overlay on Vulkan and OpenGL applications, showing FPS, frame times, CPU/GPU usage, temperatures, and other performance metrics.

# KEYBOARD SHORTCUTS

**RightShift+F11**
> Change overlay position

**RightShift+F10**
> Change overlay verbosity

**RightShift+F12**
> Toggle overlay visibility

# CONFIGURATION

Configuration file: ~/.config/MangoHud/MangoHud.conf

Environment variables:
**MANGOHUD=1**: Enable for application
**MANGOHUD_CONFIG**: Override config path

# CAVEATS

Requires Vulkan or OpenGL application. May impact performance slightly. Configure via config file for persistent settings.

# SEE ALSO

[nvidia-smi](/man/nvidia-smi)(1), [glxinfo](/man/glxinfo)(1)
