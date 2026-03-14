# TAGLINE

display real-time celestial maps in the terminal

# TLDR

**Launch astroterm with default settings**

```astroterm```

**Set observer location by latitude and longitude**

```astroterm --latitude [42.36] --longitude [-71.06]```

**Set observer location by city name**

```astroterm --city "[Boston]"```

**Display a specific date and time**

```astroterm --datetime [1969-7-16T8:00:00]```

**Draw with azimuthal grid and unicode characters**

```astroterm --grid --unicode```

**Display metadata overlay**

```astroterm --metadata```

# SYNOPSIS

**astroterm** [_options_]

# PARAMETERS

**-a**, **--latitude** _float_
> Observer latitude in degrees.

**-o**, **--longitude** _float_
> Observer longitude in degrees.

**-i**, **--city** _name_
> Use latitude and longitude of the given city.

**-d**, **--datetime** _datetime_
> Set date and time (ISO 8601 format).

**-g**, **--grid**
> Draw an azimuthal grid overlay.

**-u**, **--unicode**
> Use Unicode characters for rendering.

**-m**, **--metadata**
> Display metadata information.

**-r**, **--aspect-ratio** _float_
> Override terminal cell aspect ratio.

**-q**, **--quit-on-any**
> Quit on any keypress.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**astroterm** is a terminal-based planetarium that renders real-time positions of stars, planets, constellations, and other astronomical objects directly in the console. It computes celestial positions based on the observer's location and time, providing an interactive sky map without a graphical desktop environment.

# CAVEATS

Requires a terminal with Unicode and 256-color or truecolor support for proper rendering. Display quality depends on terminal size and font. Location must be specified via --lat/--long or --city for accurate positioning.

# SEE ALSO

[xterm](/man/xterm)(1), [alacritty](/man/alacritty)(1)
