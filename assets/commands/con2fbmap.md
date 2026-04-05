# TAGLINE

Show or set console-to-framebuffer mappings

# TLDR

**Show** which framebuffer device is mapped to console 1

```con2fbmap 1```

**Map** console 1 to framebuffer device 0

```con2fbmap 1 0```

**Map** console 3 to framebuffer device 1

```con2fbmap 3 1```

# SYNOPSIS

**con2fbmap** _console_ [_framebuffer_]

# PARAMETERS

**console**
> The virtual console number to query or modify (required).

**framebuffer**
> The framebuffer device number to map the console to. If omitted, the current mapping is displayed.

# DESCRIPTION

**con2fbmap** shows or sets the mapping between Linux virtual consoles and framebuffer devices. Framebuffer devices provide a unified interface for accessing graphics displays and are accessed through device nodes **/dev/fb\<n\>**, where **n** is the device number.

When called with only a console number, it displays the current framebuffer mapping for that console. When called with both a console number and a framebuffer number, it reassigns the console to use the specified framebuffer device.

This is useful on systems with multiple graphics adapters or displays, allowing different virtual consoles to render on different screens.

# CAVEATS

Requires root privileges to change mappings. Only works on systems using the Linux framebuffer subsystem. On modern systems using KMS/DRM, framebuffer devices may be provided through the **vesafb**, **simplefb**, or DRM framebuffer emulation layers.

# HISTORY

**con2fbmap** is part of the **fbset** package, a collection of framebuffer utilities for Linux. The framebuffer subsystem was introduced in **Linux 2.1.107** in **1998**, originally ported from the Amiga and Atari Linux kernels. The fbset package was maintained by **Geert Uytterhoeven** as part of the early Linux framebuffer infrastructure.

# SEE ALSO

[fbset](/man/fbset)(1), [setterm](/man/setterm)(1)
