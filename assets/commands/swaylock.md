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

**swaylock** locks the screen on Sway and Wayland compositors. It provides secure session locking.

Password authentication unlocks. PAM integration for system auth.

Background customization sets visual. Images or solid colors.

Indicator shows typing state. Clear, password, wrong feedback.

Daemonize mode returns immediately. Lock persists in background.

# CAVEATS

Wayland/Sway only. PAM configuration needed. Some effects need swaylock-effects fork.

# HISTORY

**swaylock** is the screen locker for **Sway** compositor. It's a Wayland replacement for i3lock.

# SEE ALSO

[sway](/man/sway)(1), [swaybg](/man/swaybg)(1), [i3lock](/man/i3lock)(1)
