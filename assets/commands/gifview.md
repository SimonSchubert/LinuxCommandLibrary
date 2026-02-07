# TAGLINE

Display GIF images and animations in an X11 window

# TLDR

**View a GIF**

```gifview [image.gif]```

**View with animation**

```gifview -a [image.gif]```

**Specify animation delay**

```gifview -d [100] [image.gif]```

**View specific frame**

```gifview -f [5] [image.gif]```

**View without window decoration**

```gifview -U [image.gif]```

# SYNOPSIS

**gifview** [_options_] _files_

# PARAMETERS

_FILES_
> GIF files to display.

**-a**, **--animate**
> Animate the GIF.

**-d** _DELAY_, **--delay** _DELAY_
> Frame delay in centiseconds.

**-f** _FRAME_
> Display specific frame.

**-U**, **--unoptimize**
> Unoptimize for display.

**-w** _WINDOW_
> Use existing window.

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
