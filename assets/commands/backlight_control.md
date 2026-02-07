# TAGLINE

Adjust screen backlight brightness by percentage.

# TLDR

**Increase** the backlight by a percentage

```backlight_control +[5]```

**Decrease** the backlight by a percentage

```backlight_control -[5]```

**Set** the backlight to a specific percentage

```backlight_control [90]```

Display **help**

```backlight_control```

# SYNOPSIS

**backlight_control** [**+**|**-**]_percentage_

# DESCRIPTION

**backlight_control** adjusts the screen backlight brightness on Linux systems using percentage values. It provides a simple interface to the kernel's backlight subsystem.

The tool works with laptop displays and other devices that expose backlight control through **/sys/class/backlight/**.

# PARAMETERS

**+**_n_
> Increase brightness by n percent

**-**_n_
> Decrease brightness by n percent

_n_
> Set brightness to n percent (0-100)

# CAVEATS

Requires appropriate permissions to write to backlight control files. May require adding the user to a video or similar group. Only works with hardware that exposes backlight controls through the sysfs interface.

# SEE ALSO

[xbacklight](/man/xbacklight)(1), [brightnessctl](/man/brightnessctl)(1), [light](/man/light)(1)
