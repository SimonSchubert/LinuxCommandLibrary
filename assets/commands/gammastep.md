# TAGLINE

screen color temperature adjuster

# TLDR

**Start with automatic location**

```gammastep```

**Set manual location**

```gammastep -l [37.7749:-122.4194]```

**Set color temperatures**

```gammastep -t [6500:3500]```

**One-shot mode (apply once)**

```gammastep -O [3500]```

**Reset screen**

```gammastep -x```

**Use Wayland backend**

```gammastep -m wayland```

# SYNOPSIS

**gammastep** [_options_]

# PARAMETERS

**-l** _lat:lon_
> Manual location (latitude:longitude).

**-t** _day:night_
> Color temperature (day:night Kelvin).

**-b** _day:night_
> Brightness (day:night, 0.1-1.0).

**-O** _temp_
> One-shot mode with temperature.

**-x**
> Reset and exit.

**-m** _method_
> Adjustment method: randr, wayland, drm.

**-P**
> Reset before applying.

**-v**
> Verbose output.

**-r**
> Disable gradual transition.

# DESCRIPTION

**gammastep** adjusts screen color temperature based on time of day to reduce eye strain and improve sleep. It makes screens warmer (redder) at night and cooler (bluer) during day.

Gammastep is a fork of Redshift with Wayland support. It's commonly used with tiling window managers and supports automatic location detection or manual coordinates.

# CONFIGURATION

**~/.config/gammastep/config.ini**
> Configuration for color temperature, brightness, and location settings.

# CONFIGURATION EXAMPLE

```ini
# ~/.config/gammastep/config.ini
[general]
temp-day=6500
temp-night=3500
brightness-day=1.0
brightness-night=0.8

[manual]
lat=37.7749
lon=-122.4194
```

# CAVEATS

Requires compatible display server (X11/Wayland). Automatic location needs geoclue or manual coordinates. Some applications may display colors inaccurately. Night light features in DEs may conflict.

# HISTORY

Gammastep was forked from **Redshift** by **Maxime Coste** to add Wayland support. Redshift was created by **Jon Lund Steffensen** in 2009 based on research about blue light's effects on circadian rhythms.

# SEE ALSO

[redshift](/man/redshift)(1), [xrandr](/man/xrandr)(1), [wlsunset](/man/wlsunset)(1)
