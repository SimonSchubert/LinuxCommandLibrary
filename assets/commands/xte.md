# TLDR

**Simulate key press**

```xte 'key [Return]'```

**Type a string**

```xte 'str [Hello World]'```

**Click left mouse button**

```xte 'mouseclick 1'```

**Move mouse to absolute position**

```xte 'mousemove [100] [200]'```

**Move mouse relative**

```xte 'mousermove [10] [-5]'```

**Simulate Ctrl+C**

```xte 'keydown Control_L' 'key c' 'keyup Control_L'```

**Sleep between actions**

```xte 'mousemove 100 100' 'sleep 1' 'mouseclick 1'```

# SYNOPSIS

**xte** [_options_] _command_ [_command_...]

# COMMANDS

**key** _k_: Press and release key k.

**keydown** _k_: Press key k down.

**keyup** _k_: Release key k.

**str** _text_: Type text string.

**mouseclick** _n_: Click mouse button (1=left, 2=middle, 3=right).

**mousedown** _n_: Press mouse button down.

**mouseup** _n_: Release mouse button.

**mousemove** _x_ _y_: Move to absolute position.

**mousermove** _x_ _y_: Move relative to current position.

**sleep** _n_: Sleep n seconds.

**usleep** _n_: Sleep n microseconds.

# PARAMETERS

**-x** _display_
> Send commands to specified display.

**-i** _id_
> Use specific XInput device.

# DESCRIPTION

**xte** generates fake keyboard and mouse input using the XTest X11 extension. It's part of the xautomation package and enables automation of GUI interactions from scripts.

Commands can be chained in a single invocation or across multiple calls. Key names follow X11 keysym naming conventions. Mouse buttons are numbered: 1 (left), 2 (middle), 3 (right), 4/5 (scroll).

Common uses include GUI testing, automating repetitive tasks, and creating macros. Often combined with xbindkeys for keyboard shortcuts.

# CAVEATS

X11 only; no Wayland support. The str command has limited Unicode support. Some applications may detect synthetic input. Part of xautomation package.

# HISTORY

**xte** is part of xautomation, a suite of tools for X11 automation created by Steve Slaven. It provides a simple command-line interface to the XTest extension, which was designed for automated testing of X applications.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xbindkeys](/man/xbindkeys)(1), [xmacro](/man/xmacro)(1), [xinput](/man/xinput)(1)
