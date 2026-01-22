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

# SYNOPSIS

**kscreen-doctor** [_options_] [_output.ID.property.value_...]

# DESCRIPTION

**kscreen-doctor** manipulates display settings on KDE Plasma. It can enable/disable outputs, set rotation, scaling, resolution, and primary display status using a simple dot-notation syntax.

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

Output IDs can be numeric (1, 2) or connector names (HDMI-A-1, DP-2). Use `--outputs` to find the correct identifiers.

# SEE ALSO

[kscreen-console](/man/kscreen-console)(1), [xrandr](/man/xrandr)(1)
