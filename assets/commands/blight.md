# TAGLINE

Control display backlight brightness

# TLDR

**Set** display brightness to a percentage

```blight set [50] -r```

**Show** current display brightness

```blight show```

Print **maximum** display brightness

```blight max```

**Increase** display brightness by percentage

```blight inc [number] -r```

**Decrease** display brightness

```blight dec [number]```

# SYNOPSIS

**blight** _command_ [_value_] [_options_]

# DESCRIPTION

**blight** adjusts display brightness on Linux systems. It can set brightness to absolute values or relative percentages, and supports incrementing and decrementing brightness levels.

The tool interfaces with the kernel's backlight subsystem to control display brightness.

# SUBCOMMANDS

**set** _value_
> Set brightness to specified value

**show**
> Display current brightness level

**max**
> Print maximum brightness value

**inc** _value_
> Increase brightness by value

**dec** _value_
> Decrease brightness by value

# PARAMETERS

**-r, --relative**
> Interpret value as percentage (0-100)

# CAVEATS

Requires appropriate permissions to access backlight controls. May need to run as root or configure udev rules for unprivileged access. Only works with displays that expose backlight control through sysfs.

# SEE ALSO

[backlight_control](/man/backlight_control)(1), [xbacklight](/man/xbacklight)(1), [brightnessctl](/man/brightnessctl)(1)
