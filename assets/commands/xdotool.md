# TLDR

**Search** for windows by name

```xdotool search --onlyvisible --name firefox```

Perform **mouse click**

```xdotool click 1```

Get **active window** ID

```xdotool getactivewindow```

**Focus** on specific window

```xdotool windowfocus --sync 12345```

**Type** text with delay

```xdotool type --delay 500 "Hello world"```

Press a **key**

```xdotool key Return```

**Move mouse** to position

```xdotool mousemove 100 200```

Get **mouse location**

```xdotool getmouselocation```

# SYNOPSIS

**xdotool** _command_ [_options_] [_args_]

# DESCRIPTION

**xdotool** simulates keyboard and mouse input in X11. It can search for windows, send keystrokes, move/click the mouse, and manipulate windows, making it useful for automation and scripting.

# COMMANDS

**search [options] pattern**
> Search for windows matching pattern

**getactivewindow**
> Output currently active window ID

**getwindowfocus**
> Output currently focused window ID

**windowfocus [options] window_id**
> Focus a window

**windowactivate [options] window_id**
> Activate (focus and raise) a window

**windowmove [options] window_id x y**
> Move a window

**windowsize [options] window_id width height**
> Resize a window

**windowminimize window_id**
> Minimize a window

**key [options] keystroke**
> Send a keystroke

**keydown/keyup key**
> Press/release a key

**type [options] text**
> Type a string of characters

**click [options] button**
> Click mouse button (1=left, 2=middle, 3=right)

**mousedown/mouseup button**
> Press/release mouse button

**mousemove [options] x y**
> Move mouse cursor

**getmouselocation**
> Get current mouse position

# PARAMETERS

**--delay milliseconds**
> Delay between keystrokes when typing

**--clearmodifiers**
> Clear modifier keys before command

**--sync**
> Wait for window to be visible

**--onlyvisible**
> Search only visible windows

**--name**
> Search by window name

**--class**
> Search by window class

**--window window_id**
> Target specific window

# CAVEATS

Only works with X11, not Wayland. Some applications may not respond to synthetic input. Window IDs are session-specific and change between restarts.

# HISTORY

**xdotool** was written by Jordan Sissel as an automation tool for X11. It provides scriptable access to the XTEST extension for simulating input events.

# SEE ALSO

[xte](/man/xte)(1), [xprop](/man/xprop)(1), [wmctrl](/man/wmctrl)(1)
