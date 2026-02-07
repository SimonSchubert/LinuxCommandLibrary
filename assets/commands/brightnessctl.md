# TAGLINE

Control device brightness

# TLDR

**List devices** with changeable brightness

```brightnessctl -l```

Print the **current brightness**

```brightnessctl get```

Print brightness of a **specific device**

```brightnessctl get -d '[device_name]'```

**Set** brightness to a percentage

```brightnessctl set [50]%```

**Increase** brightness by a percentage

```brightnessctl set +[10]%```

**Decrease** brightness by a percentage

```brightnessctl set [10]%-```

# SYNOPSIS

**brightnessctl** [_options_] _command_ [_arguments_]

# DESCRIPTION

**brightnessctl** reads and controls device brightness on Linux systems. It supports display backlights, keyboard backlights, and other brightness-controllable devices through the sysfs interface.

The tool can adjust brightness using absolute values or percentages, with support for increment and decrement operations.

# SUBCOMMANDS

**list** (or **-l**)
> List all devices with controllable brightness

**get** (or **g**)
> Get current brightness value

**set** (or **s**)
> Set brightness to a value or percentage

**max** (or **m**)
> Get maximum brightness value

# PARAMETERS

**-d, --device** _name_
> Specify device (supports wildcards)

**-c, --class** _class_
> Device class (backlight, leds)

**-s, --save**
> Save state before change

**-r, --restore**
> Restore saved state

**-q, --quiet**
> Suppress output

# CAVEATS

Requires appropriate permissions (often the video group membership). Not all devices support fine-grained brightness control. Minimum brightness may not be zero.

# SEE ALSO

[xbacklight](/man/xbacklight)(1), [light](/man/light)(1), [backlight_control](/man/backlight_control)(1)
