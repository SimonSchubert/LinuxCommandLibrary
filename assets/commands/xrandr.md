# TLDR

**Query** current display configuration

```xrandr -q```

**Auto-configure** displays

```xrandr --auto```

Set **resolution and refresh rate**

```xrandr --output DP1 --mode 1920x1080 -r 60```

Position display **relative** to another

```xrandr --output HDMI2 --mode 1280x1024 --right-of DP1```

**Disable** an output

```xrandr --output VGA1 --off```

Set **brightness**

```xrandr --output LVDS1 --brightness 0.5```

**Rotate** display

```xrandr --output HDMI1 --rotate left```

**Mirror** displays

```xrandr --output HDMI1 --same-as LVDS1```

# SYNOPSIS

**xrandr** [_--output output_] [_--mode mode_] [_--rate rate_] [_--pos position_] [_options_]

# DESCRIPTION

**xrandr** is used to set the size, orientation, and reflection of the outputs for an X screen. It can also set the screen size, add/remove modes, and change display properties dynamically without restarting X.

# PARAMETERS

**-q, --query**
> Display current screen configuration

**--output OUTPUT**
> Select output to configure

**--mode MODE**
> Set resolution mode (WIDTHxHEIGHT)

**-r, --rate RATE**
> Set refresh rate in Hz

**--pos XxY**
> Set position of output

**--left-of OUTPUT**
> Position left of specified output

**--right-of OUTPUT**
> Position right of specified output

**--above OUTPUT**
> Position above specified output

**--below OUTPUT**
> Position below specified output

**--same-as OUTPUT**
> Mirror specified output

**--rotate ROTATION**
> Rotate output (normal, left, right, inverted)

**--reflect REFLECTION**
> Reflect output (x, y, xy, normal)

**--brightness LEVEL**
> Set brightness (0.0 to 1.0)

**--gamma R:G:B**
> Set gamma correction

**--off**
> Disable output

**--auto**
> Enable output with preferred mode

**--primary**
> Set as primary output

**-d, --display DISPLAY**
> Specify X display to use

**--dpi DPI**
> Set DPI for the screen

# CAVEATS

Changes are temporary and reset on X restart. For persistent settings, add xrandr commands to ~/.xprofile or use display manager settings. Some modes may not work with all hardware.

# HISTORY

**xrandr** is part of the X.Org project, implementing the RandR (Resize and Rotate) extension for dynamic display configuration without X server restart.

# SEE ALSO

[xset](/man/xset)(1), [xdpyinfo](/man/xdpyinfo)(1), [arandr](/man/arandr)(1)
