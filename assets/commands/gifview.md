# TAGLINE

Display GIF images and animations in an X11 window

# TLDR

**View a GIF**

```gifview [image.gif]```

**View with animation**

```gifview -a [image.gif]```

**Specify minimum frame delay** (in centiseconds)

```gifview --min-delay [10] [image.gif]```

**View with unoptimized frames** for faithful display

```gifview -U [image.gif]```

**Disable interactive controls**

```gifview +e [image.gif]```

# SYNOPSIS

**gifview** [_options_] _files_

# PARAMETERS

_FILES_
> GIF files to display.

**-a**, **--animate**
> Animate multi-image GIFs (default behavior in most builds).

**+a**, **--no-animate**
> Display frames as a slideshow instead of animating.

**-U**, **--unoptimize**
> Display multi-image GIFs as unoptimized for faithful frame display.

**--min-delay** _DELAY_
> Minimum delay between frames in centiseconds (default: 0).

**--fallback-delay** _DELAY_
> Delay for frames with unspecified delay, in centiseconds.

**+e**, **--no-interactive**
> Ignore mouse and keyboard input.

**-w** _WINDOW_, **--window** _WINDOW_
> Display in an existing X window (ID or 'root').

**--new-window** _WINDOW_
> Display in a new child of an existing X window.

**--geometry** _GEOMETRY_
> Set window size and position.

**--title** _TITLE_
> Set the window title.

**--bg** _COLOR_, **--background** _COLOR_
> Background color for transparent pixels.

**-i**, **--install-colormap**
> Use a private colormap per window.

**--memory-limit** _LIM_
> Cache up to LIM megabytes of images (default: 40).

**-d** _DISPLAY_, **--display** _DISPLAY_
> Use the given X display.

**--name** _NAME_
> Set application name for resource lookup.

**--version**
> Print version number and exit.

**--help**
> Display help information.

# DESCRIPTION

**gifview** displays GIF images and animations in an X11 window. It is part of the gifsicle package and provides simple GIF viewing with animation support and configurable playback speed.

The viewer can display specific frames for inspection and supports basic window management options. It handles animated GIFs with proper frame timing.

# CAVEATS

Requires X11 display. Part of gifsicle package. Limited to GIF format only.

# HISTORY

gifview is part of **gifsicle**, the GIF manipulation toolkit created by **Eddie Kohler**.

# SEE ALSO

[gifsicle](/man/gifsicle)(1), [feh](/man/feh)(1), [display](/man/display)(1)
