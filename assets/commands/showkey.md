# TAGLINE

Display keyboard keycodes and scancodes

# TLDR

**View** keycodes in decimal

```sudo showkey```

**Display** scancodes in hexadecimal

```sudo showkey -s```

**Display** keycodes in decimal

```sudo showkey -k```

**Display** keycodes in ASCII, decimal, and hexadecimal

```sudo showkey -a```

# SYNOPSIS

**showkey** [_options_]

# PARAMETERS

**-s**, **--scancodes**
> Display scancodes in hexadecimal.

**-k**, **--keycodes**
> Display keycodes in decimal (default mode).

**-a**, **--ascii**
> Display key values in ASCII, decimal, and hexadecimal.

**-h**, **--help**
> Display help message.

**-V**, **--version**
> Print version number and exit.

# DESCRIPTION

**showkey** prints to standard output either the scan codes, the keycode, or the ASCII code of each key pressed. This is useful for debugging keyboard-related issues, key remapping, and understanding keyboard input at a low level.

In scancode and keycode modes, the program runs until 10 seconds have elapsed since the last key press or release event. In ASCII mode, the program terminates when the user types Ctrl+D.

# CAVEATS

Must be run as root or with sudo. Only works on the Linux console, not in terminal emulators under X11 or Wayland. The keyboard becomes unusable for normal input while running.

# HISTORY

**showkey** is part of the **kbd** (keyboard tools) package for Linux console utilities.

# SEE ALSO

[loadkeys](/man/loadkeys)(1), [dumpkeys](/man/dumpkeys)(1), [getkeycodes](/man/getkeycodes)(1), [xmodmap](/man/xmodmap)(1)
