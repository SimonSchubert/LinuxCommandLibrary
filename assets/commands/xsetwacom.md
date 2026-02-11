# TAGLINE

Configure Wacom tablet settings

# TLDR

**List** devices

```xsetwacom list```

**Map** to screen

```xsetwacom set "[device_name]" MapToOutput [screen]```

Set **mode**

```xsetwacom set "[device_name]" Mode "[Relative|Absolute]"```

**Rotate** input

```xsetwacom set "[device_name]" Rotate [none|half|cw|ccw]```

Enable **tablet PC** mode

```xsetwacom set "[device_name]" TabletPCButton "on"```

# SYNOPSIS

**xsetwacom** _COMMAND_ [_OPTIONS_]

# PARAMETERS

**list**
> List all Wacom devices

**set** _DEVICE_ _PARAM_ _VALUE_
> Set device parameter

**get** _DEVICE_ _PARAM_
> Get device parameter value

**MapToOutput** _SCREEN_
> Map tablet to specific screen

**Mode** _MODE_
> Relative (mouse) or Absolute (pen) mode

**Rotate** _DIRECTION_
> Rotate input (none, half, cw, ccw)

# DESCRIPTION

**xsetwacom** configures Wacom pen tablets and touchscreens at runtime. It can set input mode, screen mapping, rotation, and button behavior.

Device names can be found using xsetwacom list or xinput list.

# CAVEATS

X11 only. Settings do not persist across reboots. Device names may change on reconnect.

# SEE ALSO

[xinput](/man/xinput)(1), [xrandr](/man/xrandr)(1)
