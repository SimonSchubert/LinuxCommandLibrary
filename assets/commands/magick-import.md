# TAGLINE

captures screenshots from X11 displays

# TLDR

**Capture screenshot**

```magick import [screenshot.png]```

**Capture specific window**

```magick import -window [window-id] [output.png]```

**Capture root window**

```magick import -window root [desktop.png]```

**Capture after delay**

```magick import -pause [5] [screenshot.png]```

**Capture with specific quality**

```magick import -quality [90] [screenshot.jpg]```

# SYNOPSIS

**magick** **import** [_options_] _output_

# PARAMETERS

**-window** _id_
> Capture specific window by ID or name (use "root" for entire screen).

**-pause** _seconds_
> Delay in seconds before capture.

**-crop** _geometry_
> Crop the captured image to specified size and offset.

**-frame**
> Include window manager frame in capture.

**-screen**
> Capture the entire screen instead of a single window.

**-border**
> Include window border in the output image.

**-descend**
> Obtain image by descending the window hierarchy.

**-snaps** _value_
> Number of screen snapshots to take.

**-quality** _value_
> Set output compression quality (e.g., JPEG quality 1-100).

**-silent**
> Operate silently without audio notification.

**-resize** _geometry_
> Resize the captured image.

# DESCRIPTION

**magick import** captures screenshots from X11 displays. Part of ImageMagick. Can capture the entire screen, specific windows, or selected regions. Outputs to any supported image format.

# SEE ALSO

[magick](/man/magick)(1), [scrot](/man/scrot)(1)

