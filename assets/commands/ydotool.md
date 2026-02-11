# TAGLINE

Simulate input on X11 and Wayland

# TLDR

Start **daemon**

```ydotoold```

**Left click**

```ydotool click 0xC0```

**Right click**

```ydotool click 0xC1```

Press **Alt+F4**

```ydotool key 56:1 62:1 62:0 56:0```

# SYNOPSIS

**ydotool** _COMMAND_ [_OPTIONS_]

# PARAMETERS

**click** _CODE_
> Simulate mouse click (0xC0=left, 0xC1=right, 0xC2=middle)

**key** _KEYCODE:STATE..._
> Simulate key press/release (1=press, 0=release)

**type** _TEXT_
> Type text string

**mousemove** _X_ _Y_
> Move mouse to position

# DESCRIPTION

**ydotool** simulates keyboard and mouse input on Linux. Unlike xdotool, it works on both X11 and Wayland by using the kernel uinput module.

Requires the ydotoold daemon to be running.

# CAVEATS

Requires ydotoold daemon running. Needs access to /dev/uinput. Key codes are hardware scancodes, not X11 keysyms.

# SEE ALSO

[xdotool](/man/xdotool)(1), [wtype](/man/wtype)(1)
