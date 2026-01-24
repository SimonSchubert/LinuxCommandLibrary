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

**vainfo** shows VA-API support. It displays capabilities.

Hardware video acceleration. GPU encoding/decoding.

Supported profiles. H.264, HEVC, etc.

Driver information. Vendor and version.

Diagnostic tool. Check VA-API setup.

# CAVEATS

Requires VA-API drivers. GPU-specific. Part of libva-utils.

# HISTORY

**vainfo** is part of **libva-utils**, providing information about VA-API (Video Acceleration API) support.

# SEE ALSO

[vdpauinfo](/man/vdpauinfo)(1), [glxinfo](/man/glxinfo)(1), [vulkaninfo](/man/vulkaninfo)(1)
