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

**-s, --scancodes**
> Display scancodes in hexadecimal

**-k, --keycodes**
> Display keycodes in decimal (default)

**-a, --ascii**
> Display keycodes in ASCII, decimal, and hexadecimal

**-h, --help**
> Display help message

# DESCRIPTION

**showkey** displays the keycode of pressed keys on the keyboard. This is useful for debugging keyboard-related issues, key remapping, and understanding keyboard input at a low level.

The program runs until 10 seconds pass without any key press, or until Ctrl+D is pressed (in ASCII mode).

# CAVEATS

Must be run as root or with sudo. Only works on the Linux console, not in terminal emulators under X11 or Wayland. The keyboard becomes unusable for normal input while running.

# SEE ALSO

[loadkeys](/man/loadkeys)(1), [dumpkeys](/man/dumpkeys)(1), [xmodmap](/man/xmodmap)(1)
