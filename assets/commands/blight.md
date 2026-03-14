# TAGLINE

Control display backlight brightness

# TLDR

**Set** display brightness to a percentage

```blight set [50]```

**Show** current brightness status

```blight status```

**Increase** display brightness by percentage

```blight inc [5]```

**Decrease** display brightness with smooth transition

```blight dec [10] -s```

**List** available backlight devices

```blight list```

**Set brightness** on a specific device

```blight inc [2] -d [nvidia_0]```

**Save** current brightness level for later restore

```blight save```

**Restore** previously saved brightness level

```blight restore```

**Configure** permissions and udev rules

```sudo blight setup```

# SYNOPSIS

**blight** _command_ [_value_] [_options_]

# DESCRIPTION

**blight** is a hassle-free CLI utility to manage backlight brightness on Linux. It plays well with hybrid GPU configurations and proprietary drivers, intelligently detecting the active graphics device.

The utility prioritizes integrated graphics, followed by dedicated Nvidia GPU and ACPI kernel module, so you do not need to manually specify which device is active.

# SUBCOMMANDS

**set** _value_
> Set brightness to specified percentage

**status**
> Display current brightness status

**list**
> Show all available backlight devices

**inc** _value_
> Increase brightness by percentage

**dec** _value_
> Decrease brightness by percentage

**save**
> Store current brightness setting

**restore**
> Recover previously saved brightness

**setup**
> Configure write permissions and udev rules (requires sudo)

# PARAMETERS

**-d**, **--device** _device_
> Target a specific backlight device (e.g., nvidia_0, amdgpu_bl0)

**-s**, **--sweep**
> Enable smooth brightness transitions instead of instant changes

# CAVEATS

Requires write access to sysfs backlight files. Run `sudo blight setup` once to configure udev rules and permissions, or add your user to the video group manually. Only works with displays that expose backlight control through sysfs.

# SEE ALSO

[xbacklight](/man/xbacklight)(1), [brightnessctl](/man/brightnessctl)(1), [light](/man/light)(1)
