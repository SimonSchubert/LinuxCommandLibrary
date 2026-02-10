# TAGLINE

screen brightness and color temperature manager for Linux systems running X11

# TLDR

Set screen **temperature** to 3000K

```gummy -t [3000]```

Set screen **backlight** to 50%

```gummy --backlight [50]```

Set screen **pixel brightness** to 45%

```gummy -b [45]```

**Increase** current brightness by 10%

```gummy -b +10```

**Decrease** current brightness by 10%

```gummy -b -10```

Set temperature and brightness for a **specific screen**

```gummy -s [1] -t [3800] -b [65]```

# SYNOPSIS

**gummy** [_options_]

# PARAMETERS

**-t**, **--temperature** _KELVIN_
> Set screen color temperature in Kelvin

**-b**, **--brightness** _PERCENT_
> Set pixel brightness (use +/- for relative changes)

**--backlight** _PERCENT_
> Set hardware backlight level

**-s**, **--screen** _NUMBER_
> Apply settings to specific screen (0-indexed)

# DESCRIPTION

**gummy** is a screen brightness and color temperature manager for Linux systems running X11. It provides both software-based (gamma) adjustments and hardware backlight control.

The tool can adjust color temperature for reduced eye strain, particularly useful for night-time computing. Brightness can be controlled either through software gamma correction or hardware backlight where available.

# CAVEATS

Requires X11; does not work with Wayland. Hardware backlight control may require appropriate permissions or udev rules. Software brightness affects gamma, not actual backlight intensity.

# HISTORY

gummy was developed as a simple, command-line alternative to graphical redshift applications for managing screen brightness and temperature on Linux.

# SEE ALSO

[redshift](/man/redshift)(1), [xrandr](/man/xrandr)(1), [brightnessctl](/man/brightnessctl)(1)
