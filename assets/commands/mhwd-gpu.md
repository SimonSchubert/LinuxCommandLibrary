# TAGLINE

manjaro Linux utility for configuring graphics card settings, specifically

# TLDR

Print which **Xorg configuration is active**

```mhwd-gpu --status```

Confirm the Xorg configuration **symlink is valid**

```mhwd-gpu --check```

Point Xorg at a **custom configuration for an NVIDIA card**

```sudo mhwd-gpu --setmod nvidia --setxorg [/etc/X11/mhwd.d/nvidia.conf]```

Do the same for an **AMD card**

```sudo mhwd-gpu --setmod [ati] --setxorg [/etc/X11/mhwd.d/amdgpu.conf]```

Switch the active **OpenGL implementation**

```sudo mhwd-gpu --setgl [nvidia]```

# SYNOPSIS

**mhwd-gpu** [_options_]

# PARAMETERS

**--status**
> Display the current Xorg configuration path

**--check**
> Verify the Xorg configuration symlink is valid

**--setmod _driver_**
> Set the GPU driver module (nvidia, catalyst, ati, intel)

**--setxorg _path_**
> Set the path to the Xorg configuration file

**--help**
> Display help information

# DESCRIPTION

**mhwd-gpu** is a Manjaro Linux utility for configuring graphics card settings, specifically managing Xorg configuration files for different GPU drivers. It handles the symlink at **/etc/X11/xorg.conf.d/** that points to the active GPU configuration.

The tool simplifies switching between different GPU configurations, particularly useful for systems with multiple graphics cards or when switching between open-source and proprietary drivers.

Part of the Manjaro Hardware Detection (MHWD) toolset, it works alongside **mhwd** for driver installation and **mhwd-kernel** for kernel management.

# CAVEATS

Requires root privileges for configuration changes. Incorrect Xorg configuration can result in a non-functional display; always have a backup configuration or recovery method ready. Specific to Manjaro Linux and may not work on other distributions.

# SEE ALSO

[mhwd](/man/mhwd)(1), [mhwd-kernel](/man/mhwd-kernel)(1), [nvidia-settings](/man/nvidia-settings)(1)
