# TAGLINE

Screen locker for Sway Wayland compositor

# TLDR

**Lock screen**

```swaylock```

**With solid color**

```swaylock -c [1a1a2e]```

**With image**

```swaylock -i [wallpaper.jpg]```

**Per-output images**

```swaylock -i [HDMI-A-1:wallpaper.jpg]```

**Blur effect**

```swaylock --effect-blur [7x5]```

**Show failed attempts**

```swaylock -f --show-failed-attempts```

**Daemonize**

```swaylock -f```

# SYNOPSIS

**swaylock** [_-c color_] [_-i image_] [_-f_] [_options_]

# PARAMETERS

**-c**, **--color** _COLOR_
> Background color.

**-i**, **--image** _IMAGE_
> Background image.

**-f**, **--daemonize**
> Run as daemon.

**-s**, **--scaling** _MODE_
> Image scaling.

**--effect-blur** _PARAMS_
> Blur effect.

**--show-failed-attempts**
> Show failures.

**--indicator-radius** _N_
> Indicator size.

# DESCRIPTION

**swaylock** is a screen locking utility for Sway and other Wayland compositors, providing secure session locking with PAM-based authentication. It renders a lock screen over all outputs and requires the user's password to unlock.

The lock screen background can be customized with solid colors or images, with per-output image support for multi-monitor setups. An indicator ring shows the current state: idle, typing, password verification, and incorrect password. The swaylock-effects fork adds additional visual effects like blur.

The daemonize flag causes swaylock to fork to the background after the lock screen is displayed, which is essential when used with swayidle's before-sleep event to ensure the screen is locked before the system suspends.

# CAVEATS

Wayland/Sway only. PAM configuration needed. Some effects need swaylock-effects fork.

# HISTORY

**swaylock** is the screen locker for **Sway** compositor. It's a Wayland replacement for i3lock.

# SEE ALSO

[sway](/man/sway)(1), [swaybg](/man/swaybg)(1), [i3lock](/man/i3lock)(1)
