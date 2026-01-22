# TLDR

**Lock screen**

```i3lock```

**Lock with color**

```i3lock -c [000000]```

**Lock with image**

```i3lock -i [image.png]```

**Tiled image**

```i3lock -t -i [image.png]```

**No unlock indicator**

```i3lock -u```

**Show failed attempts**

```i3lock -f```

# SYNOPSIS

**i3lock** [_options_]

# PARAMETERS

**-c** _COLOR_
> Background color (hex).

**-i** _IMAGE_
> Background image (PNG).

**-t**
> Tile image.

**-u**
> No unlock indicator.

**-f**
> Show failed attempts.

**-n**
> Don't fork.

**-e**
> Ignore empty password.

**--help**
> Display help information.

# DESCRIPTION

**i3lock** is a simple screen locker. It displays a blank screen or image and requires password to unlock.

The locker integrates with i3 window manager but works with any X11 session. It provides security with minimal interface.

i3lock locks the X11 screen.

# CAVEATS

X11 only. PNG images only. i3lock-color adds more features.

# HISTORY

i3lock was created as the screen locker for the **i3** window manager, focusing on simplicity and security.

# SEE ALSO

[i3](/man/i3)(1), [swaylock](/man/swaylock)(1), [xlock](/man/xlock)(1)
