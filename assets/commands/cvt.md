# TLDR

**Generate a modeline** for a resolution and refresh rate

```cvt [1920] [1080] [60]```

**Generate reduced blanking modeline** (for LCD displays)

```cvt -r [1920] [1080] [60]```

**Generate modeline with reduced blanking v2**

```cvt -r2 [2560] [1440] [144]```

**Generate verbose output** with more details

```cvt -v [1920] [1200] [75]```

# SYNOPSIS

**cvt** [_options_] _width_ _height_ [_refresh_]

# PARAMETERS

_WIDTH_
> Horizontal resolution in pixels.

_HEIGHT_
> Vertical resolution in pixels.

_REFRESH_
> Refresh rate in Hz (default: 60).

**-r**, **--reduced**
> Generate reduced blanking timings (CVT-RB).

**-r2**, **--reduced-v2**
> Generate reduced blanking v2 timings (CVT-RBv2).

**-v**, **--verbose**
> Enable verbose output.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**cvt** calculates VESA Coordinated Video Timing (CVT) modelines for X11 display configuration. It outputs modeline parameters suitable for use with xrandr or in xorg.conf files.

CVT is the standard formula for calculating display timing parameters from resolution and refresh rate. The tool generates timing values including pixel clock, horizontal and vertical sync parameters, and blanking intervals.

Reduced blanking modes (**-r**, **-r2**) are designed for LCD displays and digital connections (HDMI, DisplayPort), using less bandwidth than traditional CRT-compatible timings. This enables higher resolutions and refresh rates over limited bandwidth connections.

# CAVEATS

Generated modelines may not be supported by all displays or graphics hardware. Reduced blanking is not compatible with CRT monitors. Custom timings can potentially damage displays if incorrect. Always verify timings are within display specifications.

# HISTORY

The CVT standard was developed by **VESA** (Video Electronics Standards Association) to provide a standardized method for calculating display timings. The cvt tool is part of the xorg-server utilities, implementing the CVT 1.1 and CVT-RB specifications.

# SEE ALSO

[gtf](/man/gtf)(1), [xrandr](/man/xrandr)(1), [xorg.conf](/man/xorg.conf)(5)
