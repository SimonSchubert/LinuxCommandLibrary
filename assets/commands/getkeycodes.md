# TAGLINE

keyboard scancode-to-keycode mapping display

# TLDR

**Display keyboard scancodes**

```getkeycodes```

# SYNOPSIS

**getkeycodes**

# PARAMETERS

None.

# DESCRIPTION

**getkeycodes** displays the kernel scancode-to-keycode mapping table. It shows how raw keyboard scancodes are translated to key codes used by applications.

The output shows scancode ranges and their corresponding keycodes. This mapping is used by the Linux input system to translate hardware key presses.

getkeycodes is useful for debugging keyboard issues and understanding key mapping.

# CAVEATS

Requires console access. Output format is dense. Shows kernel-level mapping only.

# HISTORY

getkeycodes is part of the **kbd** package, providing keyboard utilities for Linux console management.

# SEE ALSO

[setkeycodes](/man/setkeycodes)(1), [showkey](/man/showkey)(1), [dumpkeys](/man/dumpkeys)(1)
