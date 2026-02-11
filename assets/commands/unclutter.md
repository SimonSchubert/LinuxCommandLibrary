# TAGLINE

Auto-hide idle mouse cursor on X11

# TLDR

**Hide cursor after idle**

```unclutter```

**Custom timeout**

```unclutter -idle [3]```

**Ignore window**

```unclutter -not [window-name]```

**Run in background**

```unclutter -b```

**Don't touch root window**

```unclutter -noevents```

# SYNOPSIS

**unclutter** [_-idle seconds_] [_-b_] [_options_]

# PARAMETERS

**-idle** _SEC_
> Seconds before hide.

**-b**
> Background daemon.

**-not** _NAME_
> Ignore window.

**-noevents**
> No root events.

**-display** _DPY_
> X display.

# DESCRIPTION

**unclutter** automatically hides the mouse cursor on X11 desktops after a configurable period of inactivity. When the user moves the mouse, the cursor immediately reappears, making the hiding completely transparent during normal use.

The tool is particularly useful for presentations, kiosk displays, and keyboard-focused workflows where a stationary mouse pointer is a visual distraction. It can run as a background daemon and supports excluding specific windows from cursor hiding, allowing the cursor to remain visible in applications that need it.

Two main implementations exist: the original X11 version and **unclutter-xfixes**, which uses the XFixes extension for a more modern approach. Both serve the same purpose but differ in implementation details and compatibility with compositing window managers.

# CAVEATS

X11 only. Multiple versions exist. May conflict with apps.

# HISTORY

**unclutter** was created to hide the mouse cursor when it's not being used, cleaning up the X11 display.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xsetroot](/man/xsetroot)(1)
