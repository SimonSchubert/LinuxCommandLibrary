# TLDR

Create a **fullscreen** screenshot

```mate-screenshot```

Create an **active window** screenshot

```mate-screenshot --window```

Create a **specific area** screenshot

```mate-screenshot --area```

Create a screenshot **interactively**

```mate-screenshot --interactive```

Create a screenshot **without borders**

```mate-screenshot --window --remove-border```

Create a screenshot with a **specific effect**

```mate-screenshot --effect=[shadow|border|none]```

Create a screenshot with a **specific delay** in seconds

```mate-screenshot --delay=[5]```

# SYNOPSIS

**mate-screenshot** [_options_]

# PARAMETERS

**--window, -w**
> Capture only the active window

**--area, -a**
> Select a region to capture

**--interactive, -i**
> Open a dialog for capture options before taking screenshot

**--delay _seconds_, -d**
> Wait specified seconds before capturing

**--remove-border, -B**
> Remove window border from window captures

**--effect _type_, -e**
> Add an effect: shadow, border, or none

**--include-border, -b**
> Include window border in capture (default)

**--clipboard, -c**
> Copy screenshot to clipboard instead of saving

# DESCRIPTION

**mate-screenshot** captures screenshots in the MATE desktop environment. It can capture the entire screen, a single window, or a user-selected region.

By default, screenshots are saved to the Pictures directory with a timestamped filename. The interactive mode presents a dialog for choosing capture type, delay, and effects before taking the screenshot.

Effects like drop shadows can be applied to window captures for a more polished appearance.

# CAVEATS

Area selection requires mouse interaction to draw the capture region. The delay option is useful for capturing menus or tooltips that appear on hover. Window captures may not work correctly with some compositors or window managers.

# SEE ALSO

[gnome-screenshot](/man/gnome-screenshot)(1), [scrot](/man/scrot)(1), [flameshot](/man/flameshot)(1), [maim](/man/maim)(1)
