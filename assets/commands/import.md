# TAGLINE

ImageMagick utility for capturing X Window screenshots

# TLDR

**Capture window by click** (interactive crosshair selector)

```import screenshot.png```

**Capture entire screen**

```import -window root screenshot.png```

**Capture specific window**

```import -window [window_id] screenshot.png```

**Capture with delay**

```import -pause [5] screenshot.png```

**Capture region**

```import -crop [640x480+100+100] screenshot.png```

**Set image format**

```import screenshot.[jpg|png|gif]```

# SYNOPSIS

**import** [_options_] _output_file_

# PARAMETERS

**-window** _ID_
> Capture specific window ID or "root" for full screen.

**-pause** _SECONDS_
> Delay before capture.

**-crop** _GEOMETRY_
> Crop to specified geometry.

**-frame**
> Include window frame.

**-border**
> Include window border.

**-screen**
> Capture from virtual root window.

**-silent**
> Suppress progress monitor.

**--help**
> Display help information.

# DESCRIPTION

**import** is an ImageMagick utility for capturing X Window screenshots. It can capture the entire screen, specific windows, or user-selected regions.

The tool supports various output formats determined by file extension. It integrates with the ImageMagick processing pipeline for immediate manipulation.

# CAVEATS

X11 only. Requires ImageMagick. Click-to-select default behavior.

# HISTORY

import is part of the **ImageMagick** suite, created by **John Cristy** in 1987 for X Window screen capture.

# SEE ALSO

[convert](/man/convert)(1), [display](/man/display)(1), [scrot](/man/scrot)(1), [xwd](/man/xwd)(1)
