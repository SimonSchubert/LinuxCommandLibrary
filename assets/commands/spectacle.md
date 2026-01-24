# TLDR

**Take screenshot**

```spectacle```

**Capture full screen**

```spectacle -f```

**Capture active window**

```spectacle -a```

**Capture rectangular region**

```spectacle -r```

**Capture after delay**

```spectacle -d [5]```

**Save to file**

```spectacle -b -o [screenshot.png]```

**Copy to clipboard**

```spectacle -b -c```

# SYNOPSIS

**spectacle** [_-f_] [_-a_] [_-r_] [_-d delay_] [_-o file_] [_options_]

# PARAMETERS

**-f**, **--fullscreen**
> Full screen capture.

**-a**, **--activewindow**
> Active window.

**-r**, **--region**
> Rectangular region.

**-d**, **--delay** _SECS_
> Delay in seconds.

**-o**, **--output** _FILE_
> Save to file.

**-c**, **--clipboard**
> Copy to clipboard.

**-b**, **--background**
> No GUI.

**-n**, **--nonotify**
> No notification.

# DESCRIPTION

**spectacle** is KDE's screenshot tool. It captures screen content with various options.

Mode selection chooses capture area. Full screen, window, or region.

Delay allows positioning. Open menus or prepare screen.

Background mode for scripting. No GUI interface shown.

Output options include file and clipboard. Direct to destination.

# CAVEATS

KDE/Plasma application. May not work on other desktops. Wayland has limitations.

# HISTORY

**Spectacle** is the default screenshot application for **KDE Plasma**. It replaced KSnapshot with a modernized interface.

# SEE ALSO

[scrot](/man/scrot)(1), [gnome-screenshot](/man/gnome-screenshot)(1), [flameshot](/man/flameshot)(1)
