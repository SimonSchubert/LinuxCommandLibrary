# TAGLINE

manipulates display settings on KDE Plasma

# TLDR

Show **display outputs**

```kscreen-doctor --outputs```

**Rotate** display to the right

```kscreen-doctor output.1.rotation.right```

Set display **scale** to 200%

```kscreen-doctor output.HDMI-2.scale.2```

**Enable** a display

```kscreen-doctor output.HDMI-A-1.enable```

**Disable** a display

```kscreen-doctor output.DP-2.disable```

Set **primary** display

```kscreen-doctor output.HDMI-A-1.primary```

Set display **resolution and refresh rate**

```kscreen-doctor output.HDMI-A-1.mode.1920x1080@60```

Set display **position**

```kscreen-doctor output.DP-1.position.1920,0```

# SYNOPSIS

**kscreen-doctor** [_options_] [_output.ID.property.value_...]

# DESCRIPTION

**kscreen-doctor** is a command-line tool for manipulating display settings on KDE Plasma desktops. It can enable/disable outputs, set rotation, scaling, resolution, refresh rate, position, and primary display status using a simple dot-notation syntax. Multiple output changes can be specified in a single command invocation. Changes take effect immediately without requiring a restart.

# PARAMETERS

**-o, --outputs**
> Show display output information

**output.ID.enable**
> Enable the specified output

**output.ID.disable**
> Disable the specified output

**output.ID.primary**
> Set as primary display

**output.ID.rotation.VALUE**
> Set rotation: none, left, right, inverted

**output.ID.scale.VALUE**
> Set scaling factor (e.g., 1, 1.5, 2)

**output.ID.mode.WxH@RATE**
> Set resolution and refresh rate

**output.ID.position.X,Y**
> Set display position

# CAVEATS

Output IDs can be numeric (1, 2) or connector names (HDMI-A-1, DP-2). Use `--outputs` to find the correct identifiers. This tool is specific to KDE Plasma and requires the KScreen backend to be running. On X11, xrandr provides similar functionality; on Wayland-only desktops outside KDE, use compositor-specific tools.

# SEE ALSO

[kscreen-console](/man/kscreen-console)(1), [xrandr](/man/xrandr)(1)
