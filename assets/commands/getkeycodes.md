# TAGLINE

Print the kernel scancode-to-keycode mapping table

# TLDR

**Display keyboard scancodes**

```getkeycodes```

# SYNOPSIS

**getkeycodes**

# PARAMETERS

**-V**, **--version**
> Print version number.

**-h**, **--help**
> Print usage message.

# DESCRIPTION

**getkeycodes** displays the kernel scancode-to-keycode mapping table. It shows how raw keyboard scancodes are translated to key codes used by applications.

The output shows scancode ranges and their corresponding keycodes. This mapping is used by the Linux input system to translate hardware key presses.

getkeycodes is useful for debugging keyboard issues and understanding key mapping.

# CAVEATS

Requires access to the Linux console (will not work in X11 or Wayland terminal emulators). Output format is dense with hexadecimal scan codes and decimal key codes. Shows kernel-level mapping only, not X11 or desktop keymaps.

# HISTORY

getkeycodes is part of the **kbd** package, providing keyboard utilities for Linux console management.

# SEE ALSO

[showkey](/man/showkey)(1), [dumpkeys](/man/dumpkeys)(1), [loadkeys](/man/loadkeys)(1)
