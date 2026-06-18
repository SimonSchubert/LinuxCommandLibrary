# TAGLINE

Hide the X11 mouse cursor while typing

# TLDR

**Hide the cursor when typing** and show it again on mouse movement

```xbanish```

**Keep the cursor hidden** the entire time the program runs

```xbanish -a```

**Ignore a modifier key** so it does not hide the cursor

```xbanish -i [shift]```

**Move the cursor** to a screen corner when hiding it

```xbanish -m [nw]```

**Hide the cursor** after a number of idle seconds

```xbanish -t [5]```

**Run automatically** by adding it to the X startup file

```echo "xbanish &" >> ~/.xinitrc```

# SYNOPSIS

**xbanish** [_-a_] [_-d_] [_-i modifier_] [_-m position_] [_-t seconds_] [_-s_]

# DESCRIPTION

**xbanish** hides the X11 mouse cursor when a key is pressed and shows it again when the mouse is moved or a button is clicked. This keeps the pointer out of the way during keyboard-driven work without removing it from sight when the mouse is actually needed.

It was written as an alternative to **unclutter -keystroke** mode, which has to grab and replay keystrokes and can interfere with other clients. Instead, xbanish uses the XInput extension to passively watch input events. On systems supporting XInput 2.2 it reads raw motion and button events; otherwise it walks the window hierarchy to register for events. The XFixes extension performs the actual hiding and showing of the cursor.

Because it only listens for events, xbanish runs as a lightweight background daemon and works across the whole X session regardless of the window manager.

# PARAMETERS

**-a**
> Always keep the cursor hidden while running.

**-d**
> Print debugging messages to standard output.

**-i** _MODIFIER_
> Ignore a key press when the given modifier is held, so the cursor stays visible. Valid modifiers are shift, lock, control, mod1, mod2, mod3, mod4, mod5, or all. May be given multiple times.

**-m** _POSITION_
> When hiding the cursor, move it to a screen corner (nw, ne, sw, se) or to an absolute position such as +50-100. Prefix a corner with **w** to position relative to the current window.

**-t** _SECONDS_
> Hide the cursor after the given number of seconds without mouse movement.

**-s**
> Ignore scrolling events, so scrolling the wheel does not reveal the cursor.

# CAVEATS

Works on X11 only and has no effect under native Wayland sessions. Requires the XInput and XFixes extensions, which are present on essentially all modern X servers.

# HISTORY

**xbanish** was written by Joshua Stein (jcs) to replace the keystroke-hiding behavior of **unclutter** with a cleaner, event-driven implementation built on the XInput and XFixes extensions.

# SEE ALSO

[unclutter](/man/unclutter)(1), [xdotool](/man/xdotool)(1), [xinput](/man/xinput)(1), [xsetroot](/man/xsetroot)(1)

# RESOURCES

```[Source code](https://github.com/jcs/xbanish)```

<!-- verified: 2026-06-18 -->
