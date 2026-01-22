# TLDR

**List connectors** and their available modes for a specific driver

```modetest -M [driver] -c```

**Set resolution** of a connector

```sudo modetest -M [driver] -s [connector_id]:[1920]x[1080]```

**List all DRM objects** (connectors, encoders, CRTCs, planes)

```sudo modetest -M [i915]```

**Test a specific plane** with format

```sudo modetest -M [driver] -P [plane_id]@[crtc_id]:[WxH]+[X]+[Y]@[format]```

Display **verbose output**

```modetest -M [driver] -v```

# SYNOPSIS

**modetest** [**-M** _module_] [**-c**] [**-e**] [**-p**] [**-f**] [**-s** _connector:mode_] [**-P** _plane_] [**-v**]

# PARAMETERS

**-M _module_**
> Specify DRM driver module name (e.g., i915, amdgpu, nouveau, mgag200)

**-c, --connectors**
> List connectors and their available modes

**-e, --encoders**
> List encoders

**-p, --planes**
> List planes

**-f, --framebuffers**
> List framebuffers

**-s _connector:mode_**
> Set mode on connector (format: connector_id:WIDTHxHEIGHT[@refresh])

**-P _plane_spec_**
> Test plane with specified configuration

**-C, --crtc _id_**
> Target specific CRTC (display controller)

**--format _fmt_**
> Specify pixel format (e.g., XR24, BG24, ARGB8888)

**-v, --verbose**
> Enable verbose output with detailed information

**-h, --help**
> Display help message

# DESCRIPTION

**modetest** is a diagnostic tool for testing and debugging Kernel Mode Setting (KMS) functionality of Direct Rendering Manager (DRM) drivers. It enumerates DRM objects including connectors, encoders, CRTCs, and planes, and can set display modes directly.

The tool is part of **libdrm** and provides low-level access to the graphics subsystem for testing display configurations, pixel formats, and plane overlays. It displays an SMPTE color bar test pattern when setting modes.

# CAVEATS

Requires root privileges or membership in the render/video groups to access DRM devices. Running modetest on an active display can disrupt the current desktop environment (Xorg, Wayland), potentially causing blank screens or display corruption. Primarily intended for developers and diagnostic purposes.

# HISTORY

**modetest** is part of the **libdrm** project, which provides the userspace library for interacting with the Linux kernel's Direct Rendering Manager. KMS was introduced in Linux kernel 2.6.29 (2009) to move display mode setting from userspace X servers into the kernel.

# SEE ALSO

[drm](/man/drm)(7), [xrandr](/man/xrandr)(1), [wlr-randr](/man/wlr-randr)(1)
