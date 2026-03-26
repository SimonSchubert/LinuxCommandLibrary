# TAGLINE

display real-time celestial maps in the terminal

# TLDR

**Launch with color and constellations**

```astroterm --color --constellations```

**Set observer location by city name**

```astroterm --city "[Boston]"```

**Set observer location by latitude and longitude**

```astroterm --latitude [42.36] --longitude [-71.06]```

**Display a specific date and time** in UTC

```astroterm --datetime [1969-07-16T13:32:00]```

**Animate at high speed** with custom FPS

```astroterm --color --constellations --speed [10000] --fps [64]```

**Draw with azimuthal grid and unicode characters**

```astroterm --grid --unicode --metadata```

# SYNOPSIS

**astroterm** [_options_]

# PARAMETERS

**-a**, **--latitude** _degrees_
> Observer latitude [-90, 90] (default: 0.0).

**-o**, **--longitude** _degrees_
> Observer longitude [-180, 180] (default: 0.0).

**-i**, **--city** _name_
> Use latitude and longitude of the given city.

**-d**, **--datetime** _yyyy-mm-ddThh:mm:ss_
> Observation datetime in UTC (default: system time).

**-t**, **--threshold** _float_
> Only render stars brighter than this magnitude (default: 5.0).

**-l**, **--label-thresh** _float_
> Label stars brighter than this magnitude (default: 0.25).

**-f**, **--fps** _int_
> Frames per second (default: 24).

**-s**, **--speed** _float_
> Animation speed multiplier (default: 1.0).

**-c**, **--color**
> Enable terminal colors.

**-C**, **--constellations**
> Draw constellation stick figures.

**-g**, **--grid**
> Draw an azimuthal grid overlay.

**-u**, **--unicode**
> Use Unicode characters for rendering.

**-m**, **--metadata**
> Display metadata information.

**-r**, **--aspect-ratio** _float_
> Override the calculated terminal cell aspect ratio.

**-q**, **--quit-on-any**
> Quit on any keypress (default: quit on 'q' or ESC only).

**-h**, **--help**
> Print help message.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**astroterm** is a terminal-based planetarium written in C that renders real-time positions of stars, planets, constellations, and other astronomical objects directly in the console. It computes celestial positions based on the observer's location and time, providing an interactive sky map without a graphical desktop environment. Press **q** or **ESC** to quit (or any key with **--quit-on-any**).

# CAVEATS

Color output requires **--color** flag and a terminal with 256-color or truecolor support. Display quality depends on terminal size and font. Without **--latitude**/**--longitude** or **--city**, the observer defaults to 0,0 (Gulf of Guinea).

# SEE ALSO

[cal](/man/cal)(1), [date](/man/date)(1)
