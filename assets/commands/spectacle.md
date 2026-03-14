# TAGLINE

KDE Plasma screenshot capture tool

# TLDR

**Take screenshot**

```spectacle```

**Capture full screen**

```spectacle -f```

**Capture active window**

```spectacle -a```

**Capture rectangular region**

```spectacle -r```

**Capture window under cursor**

```spectacle -u```

**Capture after delay** (in seconds)

```spectacle -d [5]```

**Save to file** in background mode

```spectacle -b -o [screenshot.png]```

**Copy to clipboard** in background mode

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

**-u**, **--windowundercursor**
> Capture window under cursor (including pop-up parents)

**-t**, **--transientonly**
> Capture window under cursor (excluding pop-up parents)

**-m**, **--currentmonitor**
> Capture the current monitor

**-p**, **--pointer**
> Include pointer in screenshot (background mode)

**-w**, **--nowindow**
> Launch without taking a screenshot

**-n**, **--nonotify**
> Suppress notification

# DESCRIPTION

**spectacle** is KDE's screenshot tool. It captures screen content with various options.

Mode selection chooses the capture area: full screen, current monitor, active window, window under cursor, or a rectangular region.

The delay option allows time to position windows or open menus before capture. Background mode enables scripted captures without showing the GUI.

# CAVEATS

KDE/Plasma application. May not work on other desktops. Wayland has limitations.

# HISTORY

**Spectacle** is the default screenshot application for **KDE Plasma**. It replaced KSnapshot with a modernized interface.

# SEE ALSO

[scrot](/man/scrot)(1), [gnome-screenshot](/man/gnome-screenshot)(1), [flameshot](/man/flameshot)(1)
