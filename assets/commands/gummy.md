# TAGLINE

screen brightness and color temperature manager for Linux systems running X11

# TLDR

**Start the gummy daemon** (required before adjustments take effect)

```gummy start```

Set screen **temperature** to 3400K on all screens

```gummy -t [3400]```

Set **brightness** to 60% on a specific screen

```gummy -b [60] -s [1]```

**Enable automatic brightness** based on screen content

```gummy -B [1]```

**Enable automatic temperature** with sunrise/sunset times

```gummy -T [1] -y [06:00] -u [16:30]```

**Disable automatic brightness** on a specific screen

```gummy -B [0] -s [1]```

# SYNOPSIS

**gummy** **start**

**gummy** [_options_]

# PARAMETERS

**start**
> Start the gummy background daemon that applies brightness/temperature adjustments.

**-t** _KELVIN_
> Set screen color temperature manually.

**-T** _0|1_
> Toggle automatic temperature adjustment based on sunrise/sunset times.

**-b** _PERCENT_
> Set screen brightness manually.

**-B** _0|1|2_
> Toggle automatic brightness: 0 = off, 1 = based on captured screen content, 2 = based on an ambient light sensor (if available).

**-y** _HH:MM_
> Set the sunrise time used for automatic temperature.

**-u** _HH:MM_
> Set the sunset time used for automatic temperature.

**-s** _NUMBER_
> Apply the given options to a specific screen (0-indexed) instead of all screens.

**-h**
> Print help information.

# DESCRIPTION

**gummy** is a CLI screen manager for X11 that adjusts brightness and color temperature, automatically or manually, per screen or across all screens. Brightness is applied via gamma (and, on supported embedded displays, backlight), while temperature adjustment reduces blue light for reduced eye strain in the evening.

Automatic brightness can follow either captured screen content (estimating ambient brightness from what's being displayed) or an ambient light sensor where present. Automatic temperature follows configurable sunrise/sunset times. The **gummy start** daemon must be running for either automatic mode, or for changes to persist.

# CAVEATS

Requires X11; does not work under Wayland. The upstream `Fushko/gummy` repository is no longer available on GitHub; forks/mirrors such as `Gitoffthelawn/gummy` carry the code forward. A separate configuration GUI, **gummy-conf**, exists for users who prefer not to use the CLI directly.

# HISTORY

**gummy** was created by **Francesco Fusco** as a lightweight, daemon-based alternative to Redshift-style tools for managing screen brightness and color temperature on Linux/X11.

# SEE ALSO

[redshift](/man/redshift)(1), [xrandr](/man/xrandr)(1), [brightnessctl](/man/brightnessctl)(1)

# RESOURCES

```[Source code](https://github.com/Gitoffthelawn/gummy)```

<!-- verified: 2026-07-17 -->
