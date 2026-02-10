# TAGLINE

manjaro Linux utility for configuring graphics card settings, specifically

# TLDR

Show current **Xorg configuration path**

```mhwd-gpu --status```

**Check** if Xorg configuration has a valid symlink

```mhwd-gpu --check```

Set a **custom Xorg configuration** for an Nvidia GPU

```sudo mhwd-gpu --setmod nvidia --setxorg [/path/to/nvidia.conf]```

Set a custom Xorg configuration for an **AMD GPU**

```sudo mhwd-gpu --setmod [catalyst|ati] --setxorg [/path/to/amdgpu.conf]```

Display **help**

```mhwd-gpu --help```

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

[mhwd](/man/mhwd)(1), [mhwd-kernel](/man/mhwd-kernel)(1), [nvidia-settings](/man/nvidia-settings)(1), [xorg.conf](/man/xorg.conf)(5)
