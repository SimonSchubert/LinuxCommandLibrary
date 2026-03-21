# TAGLINE

Control UVC webcam dynamic settings

# TLDR

**List connected cameras**

```uvcdynctrl -l```

**List available controls for the default device**

```uvcdynctrl -c```

**List available controls for a specific device**

```uvcdynctrl -d [device_name] -c```

**Get the current value of a control**

```uvcdynctrl -g "[control_name]"```

**Set a control to a specific value**

```uvcdynctrl -s "[control_name]" -- [value]```

**List supported frame formats**

```uvcdynctrl -f```

**Save current control state to a file**

```uvcdynctrl -W [filename]```

**Load control state from a file**

```uvcdynctrl -L [filename]```

# SYNOPSIS

**uvcdynctrl** [_OPTIONS_] [_VALUES_]

# PARAMETERS

**-l**, **--list**
> List all connected UVC cameras.

**-d**, **--device** _NAME_
> Use a specific device (default: video0).

**-c**, **--clist**
> List available controls for the selected device.

**-g**, **--get** _CONTROL_
> Get current value of a control.

**-G**, **--get_raw** _unit_id:selector_
> Get raw control value by unit ID and selector.

**-s**, **--set** _CONTROL_ _VALUE_
> Set a control to the given value.

**-S**, **--set_raw** _unit_id:selector_ _VALUE_
> Set a raw control value (hex string; prefix with (BE) for big-endian).

**-f**, **--formats**
> List supported frame formats.

**-i**, **--import** _FILE_
> Import dynamic controls from an XML file.

**-a**, **--addctrl** _VID_
> Load dynamic controls for a vendor ID from the default system location.

**-W**, **--save** _FILE_
> Save device control state to a file.

**-L**, **--load** _FILE_
> Load device control state from a file.

**-v**, **--verbose**
> Enable verbose output.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**uvcdynctrl** manages dynamic controls in the uvcvideo Linux kernel driver. It allows adjusting camera settings like brightness, contrast, exposure, white balance, and other UVC-specific controls.

The tool works with USB Video Class (UVC) compatible webcams and cameras. It can also import custom control definitions from XML files for vendor-specific extensions.

# CAVEATS

Only works with UVC-compatible cameras. Available controls depend on the hardware. For negative values, use **--** before the value to prevent interpretation as an option flag.

# SEE ALSO

[v4l2-ctl](/man/v4l2-ctl)(1), [v4l2loopback-ctl](/man/v4l2loopback-ctl)(1)
