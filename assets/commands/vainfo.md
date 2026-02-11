# TAGLINE

Display VA-API video acceleration info

# TLDR

**Show VA-API info**

```vainfo```

**Specific display**

```vainfo --display [drm] --device [/dev/dri/renderD128]```

**Show all profiles**

```vainfo```

# SYNOPSIS

**vainfo** [_--display type_] [_--device path_] [_options_]

# PARAMETERS

**--display** _TYPE_
> Display type (drm, x11, wayland).

**--device** _PATH_
> DRM device path.

**--help**
> Show help.

# DESCRIPTION

**vainfo** displays information about the Video Acceleration API (VA-API) support available on the system. It queries the GPU driver and reports which video encoding and decoding profiles are supported, such as H.264, HEVC, VP9, and AV1.

The output includes the VA-API driver name, version, and a list of supported profiles with their entry points (encoding, decoding, video processing). This information is essential for diagnosing hardware video acceleration issues and verifying that the correct VA-API driver is loaded for the GPU.

# CAVEATS

Requires VA-API drivers. GPU-specific. Part of libva-utils.

# HISTORY

**vainfo** is part of **libva-utils**, providing information about VA-API (Video Acceleration API) support.

# SEE ALSO

[vdpauinfo](/man/vdpauinfo)(1), [glxinfo](/man/glxinfo)(1), [vulkaninfo](/man/vulkaninfo)(1)
