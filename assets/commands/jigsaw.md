# TAGLINE

XScreenSaver hack that animates a jigsaw puzzle solving itself

# TLDR

**Run as the screensaver** on the root window

```jigsaw -root```

**Run in a window** for testing

```jigsaw -window```

**Set the animation speed**

```jigsaw -root -speed [1.0]```

**Make a more complex puzzle** (more pieces)

```jigsaw -window -complexity [2.0]```

**Use thicker pieces** and keep the view stationary

```jigsaw -window -thickness [0.15] -no-wobble```

# SYNOPSIS

**jigsaw** [**-root** | **-window**] [_options_]

# PARAMETERS

**-root**
> Draw on the root window (used by xscreensaver itself).

**-window**
> Draw in a new top-level window (default).

**-window-id** _id_
> Draw in an existing window with the given X11 ID.

**-speed** _ratio_
> Less than 1 for slower, greater than 1 for faster (default 1).

**-complexity** _ratio_
> Less than 1 for fewer pieces, greater than 1 for more pieces (default 1).

**-resolution** _ratio_
> Smoothness of piece edges; higher values use more polygons (default 1).

**-thickness** _float_
> Thickness of the pieces relative to their width (default 0.06).

**-no-wobble**
> Keep the display stationary instead of slowly wobbling back and forth.

**-delay** _usecs_
> Delay between frames, in microseconds (default 20000).

**-fps**
> Display the frame rate, polygon count, and CPU load.

**-visual** _visual_
> X visual class name or ID to use.

# DESCRIPTION

**jigsaw** is one of the OpenGL hacks shipped with **xscreensaver** (and **xscreensaver-gl**). It loads an image, carves it into 3D jigsaw puzzle pieces, shuffles them, and then animates the puzzle solving itself before starting over with a new image.

The image source is controlled by xscreensaver's standard image-grabbing settings (**grabDesktopImages**, **grabVideoFrames**, **chooseRandomImages** in **~/.xscreensaver**), so the hack can use a random image from disk, a video frame, or a screenshot of the desktop. Options may also be written with a double dash (**--speed**).

# CAVEATS

Requires OpenGL and a working X11 display. Hacks are usually installed outside **PATH** (e.g. **/usr/libexec/xscreensaver/** or **/usr/lib/xscreensaver/**), so run them by full path when testing. Systems without 3D acceleration will see degraded performance. Image source is configured globally for xscreensaver via **xscreensaver-settings**, not per-hack.

# HISTORY

**jigsaw** was written by **Jamie Zawinski** as a 2D X11 hack in **1997** and rewritten as an OpenGL hack with 3D pieces in **2008**.

# SEE ALSO

[xscreensaver](/man/xscreensaver)(1), [xscreensaver-settings](/man/xscreensaver-settings)(1)

# RESOURCES

```[Homepage](https://www.jwz.org/xscreensaver/)```

<!-- verified: 2026-11-23 -->
