# TAGLINE

blue light filter for Hyprland, the dynamic tiling Wayland compositor

# TLDR

**Start** the blue light filter service

```hyprsunset```

Start with specific **temperature** and **gamma**

```hyprsunset -t [4000] -g [90]```

**Adjust temperature** while running (via hyprctl)

```hyprctl hyprsunset temperature [4000]```

**Adjust gamma** while running (via hyprctl)

```hyprctl hyprsunset gamma [90]```

**Reset** temperature to default (6000K)

```hyprctl hyprsunset reset temperature```

**Reset** gamma to default (100%)

```hyprctl hyprsunset reset gamma```

# SYNOPSIS

**hyprsunset** [_options_]

# PARAMETERS

**-t**, **--temperature** _KELVIN_
> Set color temperature in Kelvin (lower is warmer)

**-g**, **--gamma** _PERCENT_
> Set gamma percentage

# DESCRIPTION

**hyprsunset** is a blue light filter for Hyprland, the dynamic tiling Wayland compositor. It adjusts screen color temperature to reduce blue light emission, which can help reduce eye strain and improve sleep quality during evening computer use.

The service can be configured via **~/.config/hypr/hyprsunset.conf** or command-line options. Once running, settings can be adjusted dynamically using hyprctl commands without restarting the service.

Lower temperature values (e.g., 3000K-4000K) produce warmer, more orange-tinted colors suitable for night use. The default 6000K represents standard daylight white.

# CAVEATS

Only works with Hyprland compositor. Requires Hyprland to be running. Changes affect all monitors. May interfere with color-accurate work like photo editing.

# HISTORY

hyprsunset is part of the Hyprland ecosystem, created by Vaxry. It provides functionality similar to redshift or gammastep but specifically designed for the Hyprland Wayland compositor.

# SEE ALSO

[hyprctl](/man/hyprctl)(1), [redshift](/man/redshift)(1), [gammastep](/man/gammastep)(1)
