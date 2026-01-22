# TLDR

**List** cameras

```uvcdynctrl -l```

Use specific **device**

```uvcdynctrl -d [device_name]```

List available **controls**

```uvcdynctrl -c```

**Set** control value

```uvcdynctrl -s [control_name] [value]```

**Get** control value

```uvcdynctrl -g [control_name]```

**Save** control state

```uvcdynctrl -W [filename]```

**Load** control state

```uvcdynctrl -L [filename]```

# SYNOPSIS

**uvcdynctrl** [_OPTIONS_]

# PARAMETERS

**-l, --list**
> List all available cameras

**-d, --device** _NAME_
> Use specific device (default: video0)

**-c, --clist**
> List available controls

**-s, --set** _CONTROL_ _VALUE_
> Set control value

**-g, --get** _CONTROL_
> Get current control value

**-W, --save** _FILE_
> Save control state to file

**-L, --load** _FILE_
> Load control state from file

# DESCRIPTION

**uvcdynctrl** manages dynamic controls in the uvcvideo Linux kernel driver. It allows adjusting camera settings like brightness, contrast, exposure, and other UVC-specific controls.

The tool works with USB Video Class (UVC) compatible webcams and cameras.

# CAVEATS

Only works with UVC-compatible cameras. Available controls depend on hardware. For negative values, use -- before the value.

# SEE ALSO

[v4l2-ctl](/man/v4l2-ctl)(1)
