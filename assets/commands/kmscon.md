# TAGLINE

terminal emulator that runs on the Linux console using the kernel mode setting

# TLDR

**Start** kmscon on the first available TTY

```sudo kmscon```

Start on a **specific TTY**

```sudo kmscon --vt [/dev/ttyX]```

Enable **mouse** support

```sudo kmscon --mouse```

Specify **login command**

```sudo kmscon -l [command]```

# SYNOPSIS

**kmscon** [_options_]

# PARAMETERS

**--vt** _TTY_
> Specify the virtual terminal to use

**--mouse**
> Enable mouse support

**-l**, **--login** _COMMAND_
> Specify the login command to execute

**--font-name** _NAME_
> Set the font to use

**--font-size** _SIZE_
> Set font size in points

# DESCRIPTION

**kmscon** is a terminal emulator that runs on the Linux console using the kernel mode setting (KMS) and framebuffer. It provides a modern terminal experience on TTYs without requiring X11.

Unlike the traditional text-mode VT, kmscon uses the GPU framebuffer, enabling features like Unicode support, TrueType fonts, and hardware-accelerated rendering on virtual terminals.

# CAVEATS

Requires KMS support from the graphics driver. May conflict with other framebuffer applications. Some systems may need kernel parameters adjusted for proper operation.

# HISTORY

kmscon was developed as part of the systemd project to provide a modern replacement for the Linux VT subsystem. It uses libtsm for terminal emulation and works with Wayland-like infrastructure.

# SEE ALSO

[getty](/man/getty)(8), [agetty](/man/agetty)(8), [fbterm](/man/fbterm)(1)
