# TAGLINE

Wlroots-compatible Wayland color picker for Hyprland

# TLDR

**Pick** a color in hex format

```hyprpicker```

Pick a color in a **specific format**

```hyprpicker -f [hex|rgb|hsl|hsv|cmyk]```

Pick and **copy** the color to clipboard

```hyprpicker -a```

**Disable** colored output (plain text only)

```hyprpicker -n```

Store picked color in a **shell variable**

```color=$(hyprpicker -f hex)```

# SYNOPSIS

**hyprpicker** [_options_]

# PARAMETERS

**-f**, **--format** _FORMAT_
> Output format: hex, rgb, hsl, hsv, or cmyk

**-a**, **--autocopy**
> Automatically copy picked color to clipboard

**-n**, **--no-fancy**
> Disable colored output, print plain text only

**-r**, **--render-inactive**
> Render (freeze) inactive displays

**-z**, **--no-zoom**
> Disable the zoom lens

**-q**, **--quiet**
> Disable most logging output

**-t**, **--no-fractional**
> Disable fractional scaling support

**-h**, **--help**
> Display help message

# DESCRIPTION

**hyprpicker** is a wlroots-compatible Wayland color picker designed for Hyprland. It allows users to select any pixel on screen and get its color value in various formats.

When launched, the cursor transforms into a magnifying lens. Clicking anywhere on screen captures the color at that pixel and outputs it in the specified format. The tool integrates with wl-copy for clipboard support.

# CAVEATS

Requires a Wayland session with a wlroots-based compositor. For autocopy functionality, wl-copy must be installed. Does not work under X11 or non-wlroots Wayland compositors.

# HISTORY

hyprpicker is part of the Hyprland ecosystem, created by Vaxry alongside the Hyprland compositor. Hyprland gained popularity starting in **2022** as a highly customizable dynamic tiling Wayland compositor.

# SEE ALSO

[hyprctl](/man/hyprctl)(1), [hyprshot](/man/hyprshot)(1), [wl-copy](/man/wl-copy)(1)
