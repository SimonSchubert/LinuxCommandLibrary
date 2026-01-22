# TLDR

**Generate modeline for 1920x1080@60Hz**

```gtf 1920 1080 60```

**Generate for specific refresh rate**

```gtf [1280] [1024] [75]```

**Output in X format**

```gtf 1920 1080 60 -x```

**Verbose output**

```gtf 1920 1080 60 -v```

# SYNOPSIS

**gtf** _h-pixels_ _v-pixels_ _refresh_ [_options_]

# PARAMETERS

_H-PIXELS_
> Horizontal resolution.

_V-PIXELS_
> Vertical resolution.

_REFRESH_
> Refresh rate in Hz.

**-x**
> Output in X11 modeline format.

**-v**, **--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**gtf** calculates VESA Generalized Timing Formula modelines. It generates the timing parameters needed for X11 configuration at specific resolutions.

The tool outputs modelines suitable for xorg.conf. It's useful for setting up custom display modes not automatically detected.

gtf calculates display timing modelines.

# CAVEATS

Modern systems auto-detect modes. May damage older monitors. Use cvt for newer standard.

# HISTORY

gtf was developed for **XFree86/X.Org** to generate VESA GTF compliant modelines for monitor configuration.

# SEE ALSO

[cvt](/man/cvt)(1), [xrandr](/man/xrandr)(1), [xorg.conf](/man/xorg.conf)(5)
