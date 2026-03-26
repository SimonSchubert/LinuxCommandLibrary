# TAGLINE

diagnostic tool for testing and debugging Kernel Mode Setting functionality

# TLDR

**List connectors** and their available modes for a specific driver

```modetest -M [driver] -c```

**List all DRM objects** (connectors, encoders, CRTCs, planes)

```modetest -M [i915]```

**Set resolution** of a connector

```sudo modetest -M [driver] -s [connector_id]:[1920x1080]```

**Test a specific plane** with format

```sudo modetest -M [driver] -P [plane_id]@[crtc_id]:[WxH]+[X]+[Y]@[format]```

**Set a DRM property** on an object

```sudo modetest -M [driver] -w [obj_id]:[prop_name]:[value]```

**Use atomic mode setting** with a connector

```sudo modetest -M [driver] -a -s [connector_id]:[1920x1080]```

# SYNOPSIS

**modetest** [**-M** _module_] [**-D** _device_] [**-c**] [**-e**] [**-f**] [**-p**] [**-s** _connector:mode_] [**-P** _plane_] [**-a**] [**-C**] [**-w** _prop_] [**-v**] [**-d**]

# PARAMETERS

**-M _module_**
> Use the given DRM driver module (e.g., i915, amdgpu, nouveau)

**-D _device_**
> Use the given DRM device node

**-c**
> List connectors and their available modes

**-e**
> List encoders

**-f**
> List framebuffers

**-p**
> List CRTCs and planes

**-s _connector_id[,connector_id][@crtc_id]:mode[-vrefresh][@format]_**
> Set a mode on one or more connectors

**-P _plane_id@crtc_id:WxH[+X+Y][*scale][@format]_**
> Test a plane with specified configuration

**-C**
> Test hardware cursor

**-v**
> Test vsynced page flipping

**-w _obj_id:prop_name:value_**
> Set a property on a DRM object

**-a**
> Use atomic mode setting API

**-F _pattern1,pattern2_**
> Specify fill patterns for test image

**-d**
> Drop DRM master after mode set

# DESCRIPTION

**modetest** is a diagnostic tool for testing and debugging Kernel Mode Setting (KMS) functionality of Direct Rendering Manager (DRM) drivers. It enumerates DRM objects including connectors, encoders, CRTCs, and planes, and can set display modes directly.

The tool is part of **libdrm** and provides low-level access to the graphics subsystem for testing display configurations, pixel formats, and plane overlays. When no query or test options are given, it dumps all available DRM information. It displays an SMPTE color bar test pattern when setting modes.

# CAVEATS

Requires root privileges or membership in the render/video groups to access DRM devices. Running modetest on an active display can disrupt the current desktop environment (Xorg, Wayland), potentially causing blank screens or display corruption. Primarily intended for developers and diagnostic purposes.

# HISTORY

**modetest** is part of the **libdrm** project, which provides the userspace library for interacting with the Linux kernel's Direct Rendering Manager. KMS was introduced in Linux kernel 2.6.29 (2009) to move display mode setting from userspace X servers into the kernel.

# SEE ALSO

[xrandr](/man/xrandr)(1)
