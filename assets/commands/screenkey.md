# TLDR

Display **key presses** on screen

```screenkey```

Display keys and **mouse** buttons

```screenkey -M```

Open **settings** menu

```screenkey --show-settings```

Set display **position**

```screenkey -p bottom```

Set **modifier** display format

```screenkey --mods-mode emacs```

Customize **appearance**

```screenkey --bg-color "#000000" -f "Monospace" --font-color yellow --opacity 0.8```

Display in **fixed** position with geometry

```screenkey -p fixed -g 400x100+100+100```

# SYNOPSIS

**screenkey** [_options_]

# DESCRIPTION

**screenkey** is a screencast tool that displays pressed keys on screen. It is useful for screencasts, tutorials, and demonstrations to show viewers what keys are being pressed.

# PARAMETERS

**-M, --mouse**
> Display mouse button clicks

**--show-settings**
> Launch the settings menu

**-p, --position POSITION**
> Set display position (top, center, bottom, fixed)

**-g, --geometry GEOMETRY**
> Set window geometry (for fixed position)

**--mods-mode MODE**
> Set modifier key display format (normal, emacs, mac, win, tux)

**--bg-color COLOR**
> Set background color (hex format)

**-f, --font FONT**
> Set display font

**--font-color COLOR**
> Set font color

**--opacity VALUE**
> Set window opacity (0.0 to 1.0)

**-t, --timeout SECONDS**
> Time to display each key

**--key-mode MODE**
> Set key display mode (composed, translated, raw, keysyms)

**--no-systray**
> Do not show system tray icon

**-d, --debug**
> Enable debug output

# CAVEATS

Requires X11; may not work properly on Wayland without XWayland. The tool captures all keystrokes system-wide, which may have security implications. Can be used with slop for custom window geometry selection.

# HISTORY

**screenkey** was created for screencasting and educational purposes, allowing presenters to show keyboard input visually to their audience.

# SEE ALSO

[slop](/man/slop)(1), [xdotool](/man/xdotool)(1)
