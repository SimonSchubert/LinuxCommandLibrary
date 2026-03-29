# TAGLINE

Configure Wacom tablet settings

# TLDR

**List** all Wacom devices

```xsetwacom list devices```

**List** available parameters

```xsetwacom list parameters```

**Get** all current settings for a device

```xsetwacom get "[device_name]" all```

**Map** tablet input to a specific screen

```xsetwacom set "[device_name]" MapToOutput [screen]```

Set input **mode** to Relative (mouse) or Absolute (pen)

```xsetwacom set "[device_name]" Mode [Relative|Absolute]```

**Rotate** tablet input

```xsetwacom set "[device_name]" Rotate [none|half|cw|ccw]```

Set **pressure curve** using Bezier control points (0-100)

```xsetwacom set "[device_name]" PressureCurve [0] [0] [100] [100]```

**Map** a tablet button to a keystroke

```xsetwacom set "[device_name]" Button [button_number] "key [keystroke]"```

# SYNOPSIS

**xsetwacom** [_options_] _command_ [_device_name_] [_parameter_] [_value_]

# PARAMETERS

**list** devices
> List all recognized Wacom input devices.

**list** parameters
> List all parameters suitable for get or set commands.

**list** modifiers
> List available modifiers for key and button actions.

**set** _DEVICE_ _PARAM_ _VALUE_
> Set a parameter value on the given device.

**get** _DEVICE_ _PARAM_
> Get the current value of a parameter. Use "all" to show all settings.

**-s**, **--shell**
> Display output as shell commands that can reproduce the same settings.

**-x**, **--xconf**
> Display output as xorg.conf options.

# COMMON PARAMETERS

**Mode** [Relative|Absolute]
> Relative mode makes the device act like a mouse. Absolute mode maps position directly to the screen.

**MapToOutput** _SCREEN_
> Map tablet input area to a specific screen output (e.g. "HDMI-1") or X11 geometry (WIDTHxHEIGHT+X+Y).

**Rotate** [none|half|cw|ccw]
> Rotate input. none: no rotation, half: 180 degrees, cw: 90 clockwise, ccw: 90 counter-clockwise.

**Button** _NUMBER_ _MAPPING_
> Map a button to a mouse button number or a key action.

**PressureCurve** _x1_ _y1_ _x2_ _y2_
> Bezier curve control points (0-100) defining pressure response.

**Area** _x1_ _y1_ _x2_ _y2_
> Set the tablet input area in device coordinates (top-left and bottom-right).

**Threshold** _LEVEL_
> Minimum pressure to generate a button event. Range 0-2047, default 27.

**Touch** [on|off]
> Enable or disable touch input on the device.

**TabletPCButton** [on|off]
> When on, the stylus must touch the screen to generate button events. On by default for Tablet PCs.

**Suppress** _LEVEL_
> Minimum coordinate change required before sending an input event.

# DESCRIPTION

**xsetwacom** is a command-line utility to query and modify Wacom driver settings at runtime. It can configure input mode, screen mapping, rotation, pressure response, button mapping, and touch behavior.

Device names can be found using `xsetwacom list devices` or `xinput list`. Not all parameters are available on all device types; use `xsetwacom list parameters` to see what is supported.

# CAVEATS

X11 only; does not work with Wayland. Settings do not persist across reboots or device reconnection. For persistent configuration, use xorg.conf.d snippets. Device names may change when devices are reconnected.

# SEE ALSO

[xinput](/man/xinput)(1), [xrandr](/man/xrandr)(1), [xdotool](/man/xdotool)(1)
