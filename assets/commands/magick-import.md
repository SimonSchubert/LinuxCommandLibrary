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

**Capture region**

```magick import -crop [800x600+100+100] [output.png]```

# SYNOPSIS

**magick** **import** [_options_] _output_

# PARAMETERS

**-window** _id_
> Capture specific window.

**-pause** _seconds_
> Delay before capture.

**-crop** _geometry_
> Capture specific region.

**-frame**
> Include window frame.

**-screen**
> Capture entire screen.

# DESCRIPTION

**magick import** captures screenshots from X11 displays. Part of ImageMagick. Can capture the entire screen, specific windows, or selected regions. Outputs to any supported image format.

# SEE ALSO

[magick](/man/magick)(1), [scrot](/man/scrot)(1)

