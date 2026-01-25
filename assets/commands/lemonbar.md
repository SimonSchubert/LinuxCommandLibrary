# TLDR

**Start bar reading from stdin**

```lemonbar```

**Set bar geometry**

```lemonbar -g [1920x30+0+0]```

**Set background and foreground**

```lemonbar -B "[#1d1f21]" -F "[#c5c8c6]"```

**Set font**

```lemonbar -f "[monospace:size=10]"```

**Bottom bar with underline**

```lemonbar -b -u [2]```

**Pipe script to bar**

```[./status.sh] | lemonbar```

# SYNOPSIS

**lemonbar** [_options_]

# PARAMETERS

**-g** _geometry_
> Bar geometry (WxH+X+Y).

**-b**
> Dock bar at bottom.

**-f** _font_
> Font specification.

**-B** _color_
> Background color.

**-F** _color_
> Foreground color.

**-u** _pixels_
> Underline width.

**-n** _name_
> WM_NAME property.

**-d**
> Force docking.

# DESCRIPTION

**lemonbar** (formerly bar) is a lightweight bar based on XCB. It reads text from stdin and displays it as a status bar, supporting colors, alignment, and clickable areas.

The bar uses a simple markup format for formatting: %{F#color} for foreground, %{B#color} for background, %{A:command:} for clickable areas.

# MARKUP FORMAT

```
%{l}left %{c}center %{r}right
%{F#ff0000}red text%{F-}
%{A:command:}clickable%{A}
```

# CAVEATS

X11 only. Requires scripting for dynamic content. No built-in system monitoring. Markup errors can cause display issues.

# HISTORY

lemonbar was created as **bar** by **LemonBoy** around **2012**, renamed to lemonbar to avoid confusion with other projects.

# SEE ALSO

[polybar](/man/polybar)(1), [i3status](/man/i3status)(1), [dzen2](/man/dzen2)(1)
