# TLDR

Get current **backlight** value

```light```

**Set** backlight to 50%

```light -S 50```

**Increase** backlight by 20%

```light -A 20```

**Decrease** backlight by 20%

```light -U 20```

# SYNOPSIS

**light** [_options_]

# DESCRIPTION

**light** controls the backlight brightness of laptop screens and other controllable backlights. It works without X or Wayland and can save and restore brightness levels.

# PARAMETERS

**-S PERCENT**
> Set brightness to specified percent

**-A PERCENT**
> Add percent to current brightness

**-U PERCENT**
> Subtract percent from current brightness

**-G**
> Get current brightness (default)

**-O**
> Save current brightness

**-I**
> Restore previously saved brightness

**-L**
> List available devices

**-s DEVICE**
> Select specific device

# CAVEATS

May require udev rules for non-root access. Works with devices exposed through /sys/class/backlight.

# SEE ALSO

[xbacklight](/man/xbacklight)(1), [brightnessctl](/man/brightnessctl)(1)
