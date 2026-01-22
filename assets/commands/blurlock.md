# TLDR

**Lock** the screen with a blurred screenshot

```blurlock```

Lock screen and **disable unlock indicator**

```blurlock -u```

Lock screen and **don't hide** the mouse pointer

```blurlock -p default```

Lock screen and **show failed attempts**

```blurlock -f```

# SYNOPSIS

**blurlock** [_options_]

# DESCRIPTION

**blurlock** is a wrapper around **i3lock** that takes a screenshot of the current screen, applies a blur effect, and uses it as the lock screen background. This provides a visually appealing lock screen while obscuring screen contents.

The tool is commonly used with the i3 window manager and related tiling window managers.

# PARAMETERS

**-u, --no-unlock-indicator**
> Disable the unlock indicator (no feedback on keypress)

**-p, --pointer** _mode_
> Control mouse pointer visibility (default hides pointer)

**-f, --show-failed-attempts**
> Display the number of failed login attempts

# CAVEATS

Requires i3lock and ImageMagick or similar for blur effects. Screenshot capture adds a slight delay before locking. May not work correctly with multiple monitors.

# SEE ALSO

[i3lock](/man/i3lock)(1), [slock](/man/slock)(1), [xscreensaver](/man/xscreensaver)(1)
