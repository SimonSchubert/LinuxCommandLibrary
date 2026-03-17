# TAGLINE

Improved screen locker

# TLDR

**Lock the screen with a white background**

```i3lock```

**Lock with a solid color background**

```i3lock -c [000000]```

**Lock with a background image**

```i3lock -i [path/to/image.png]```

**Lock with a tiled background image**

```i3lock -t -i [path/to/image.png]```

**Lock without showing the unlock indicator**

```i3lock -u```

**Lock and show failed authentication attempts**

```i3lock -f```

**Lock without forking to the background**

```i3lock -n```

# SYNOPSIS

**i3lock** [_options_]

# PARAMETERS

**-v**, **--version**
> Display the version of i3lock.

**-n**, **--nofork**
> Do not fork after starting. Useful for combining with other commands.

**-b**, **--beep**
> Enable beeping on authentication failure.

**-c** _RRGGBB_, **--color** _RRGGBB_
> Set background color in 6-byte hex format (default: white).

**-i** _PATH_, **--image** _PATH_
> Display the given PNG image as background instead of a blank screen.

**-t**, **--tiling**
> Tile the image across the entire screen.

**-u**, **--no-unlock-indicator**
> Disable the unlock indicator circle shown when typing.

**-f**, **--show-failed-attempts**
> Show the number of failed authentication attempts.

**-p** _win|default_, **--pointer** _win|default_
> Control mouse pointer visibility. "default" shows the pointer, "win" shows a Windows-style pointer.

**-e**, **--ignore-empty-password**
> Do not validate an empty password.

**--raw** _FORMAT_
> Read the image given by --image as raw bytes instead of PNG.

**--debug**
> Enable debug logging. Note: this logs the password to stdout.

# DESCRIPTION

**i3lock** is an improved screen locker based on slock. It displays a blank screen or image and requires PAM authentication (typically a password) to unlock. After a configurable timeout, the screen turns off via DPMS.

An unlock indicator circle appears when typing: it shows a green fill while verifying, a red fill on failure, and clears when idle. The indicator provides visual feedback without revealing password length.

The locker was designed for the i3 window manager but works with any X11 session.

# CAVEATS

X11 only; for Wayland, use **swaylock** instead. Only PNG images are supported (unless using --raw). The **i3lock-color** fork adds many additional features such as custom ring colors and clock display.

# HISTORY

**i3lock** was created by Michael Stapelberg as the screen locker for the **i3** window manager, focusing on simplicity and security. It is a significantly improved version of **slock** with features like an unlock indicator and PAM support.

# SEE ALSO

[i3](/man/i3)(1), [swaylock](/man/swaylock)(1), [xlock](/man/xlock)(1), [xdotool](/man/xdotool)(1)
