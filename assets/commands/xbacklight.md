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

**-get**
> Print current brightness percentage (default when no action given).

**-set** _PERCENT_
> Set brightness to percentage.

**-inc** _PERCENT_
> Increase brightness by percentage.

**-dec** _PERCENT_
> Decrease brightness by percentage.

**-time** _MS_
> Fade duration in milliseconds.

**-steps** _N_
> Number of steps for fade.

**-display** _DISPLAY_
> X display to use.

**-help**
> Display help information.

# DESCRIPTION

**xbacklight** adjusts backlight brightness using the X RandR extension's backlight property. When called without arguments, it prints the current brightness level as a percentage. The **-set**, **-inc**, and **-dec** options modify the brightness.

The **-time** and **-steps** parameters enable smooth fade transitions, spreading the brightness change over the specified duration.

# CAVEATS

X11 only; does not work with Wayland. Requires the RandR backlight property to be exposed by the display driver. Many modern laptops and proprietary drivers (e.g., NVIDIA) do not expose this property. Use **brightnessctl** or **light** as more reliable alternatives that work via sysfs.

# INSTALL

```apt: sudo apt install xbacklight```

```dnf: sudo dnf install xbacklight```

```apk: sudo apk add xbacklight```

```zypper: sudo zypper install xbacklight```

```nix: nix profile install nixpkgs#xbacklight```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[brightnessctl](/man/brightnessctl)(1), [light](/man/light)(1), [xrandr](/man/xrandr)(1)
