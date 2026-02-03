# TLDR

**Display info about all DRM devices** with formatted output

```drm_info```

**Query a specific DRM device**

```drm_info [/dev/dri/card0]```

**Output device information** in JSON format

```drm_info -j```

**Submit GPU information** to the DRM database

```drm_info -j | curl -d @- https://drmdb.emersion.fr/submit```

# SYNOPSIS

**drm_info** [**-j**] [**--**] [_path_...]

# PARAMETERS

**-j**
> Output info in JSON format. Otherwise the output is pretty-printed.

**path**
> Zero or more device paths to query, such as /dev/dri/card0. When omitted, the tool automatically scans /dev/dri/card* for all available devices.

**--**
> End of options delimiter.

# DESCRIPTION

**drm_info** is a small utility to dump information about DRM (Direct Rendering Manager) devices. It queries the Linux kernel's DRM subsystem and displays details about available GPUs, their capabilities, supported formats, connectors, encoders, CRTCs, and planes.

The tool is useful for debugging display issues, checking GPU feature support, and contributing hardware information to the community DRM database. It provides insight into what the DRM driver exposes for each graphics device.

# CAVEATS

Requires appropriate permissions to access DRM device files under /dev/dri/. May need to run as root or be a member of the video group. The tool depends on libdrm and json-c libraries being installed.

# HISTORY

**drm_info** was created by Simon Ser (emersion) and is hosted on freedesktop.org GitLab. It serves as the data collection tool for drmdb, a community database tracking GPU and DRM driver feature support across different hardware.

# SEE ALSO

[amdgpu_top](/man/amdgpu_top)(1), [nvidia-smi](/man/nvidia-smi)(1), [lspci](/man/lspci)(8), [xrandr](/man/xrandr)(1)
