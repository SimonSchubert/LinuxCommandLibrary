# TAGLINE

Adjust screen backlight brightness

# TLDR

Get current **brightness**

```xbacklight```

**Set** brightness

```xbacklight -set [40]```

**Increase** brightness

```xbacklight -inc [25]```

**Decrease** brightness

```xbacklight -dec [75]```

Set with **fade** effect

```xbacklight -set [100] -time [60000] -steps [60]```

# SYNOPSIS

**xbacklight** [_OPTIONS_]

# PARAMETERS

**-set** _PERCENT_
> Set brightness to percentage

**-inc** _PERCENT_
> Increase brightness by percentage

**-dec** _PERCENT_
> Decrease brightness by percentage

**-time** _MS_
> Fade duration in milliseconds

**-steps** _N_
> Number of steps for fade

# DESCRIPTION

**xbacklight** adjusts backlight brightness using the X RandR extension. It provides a simple interface for getting and setting screen brightness on laptops.

The time and steps parameters enable smooth fade transitions when changing brightness.

# CAVEATS

X11 only. Requires RandR backlight support. May not work on all hardware or with proprietary drivers. Alternative tools like brightnessctl may work better.

# SEE ALSO

[brightnessctl](/man/brightnessctl)(1), [light](/man/light)(1), [xrandr](/man/xrandr)(1)
