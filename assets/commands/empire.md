# TAGLINE

classic full-scale war strategy game

# TLDR

**Start a new game**

```vms-empire```

**Start with mostly water** (island map)

```vms-empire -w [90]```

**Set message delay** to 500ms

```vms-empire -d [500]```

**Use a larger map** that wraps at its edges

```vms-empire -g [200x120] -t```

**Disable autosave**

```vms-empire -S [0]```

# SYNOPSIS

**vms-empire** [**-w** _water_] [**-s** _smooth_] [**-d** _delay_] [**-S** _interval_] [**-f** _savefile_] [**-g** _WIDTHxHEIGHT_] [**-t**]

# PARAMETERS

**-w** _water_
> Percentage of map that is water (10-90, default 70).

**-s** _smooth_
> Map smoothing level; low values create islands, high values create continents (default 5).

**-d** _delay_
> Delay in milliseconds after informational messages (default 2000).

**-S** _interval_
> Auto-save interval in turns; 0 disables interval saves (default 10).

**-f** _savefile_
> Specify save file name (default empire.sav).

**-g** _WIDTHxHEIGHT_
> Map size (default 100x60). Saved games restore only with the same geometry.

**-t**
> Treat the map as a torus that wraps at its edges.

# PREVIEW

```
 . . + + + . . .
 . + + A + + . .
 . + O + * + . .
 . . + + + . . .
 . . . . + + X .
```

# DESCRIPTION

**empire** is a classic full-scale war simulation strategy game. Two emperors compete for world domination on a randomly generated map, producing armies, fighters, ships, and other units to explore, conquer, and hold territory.

The game plays on a grid map with cities, land, and sea. Units are produced in captured cities and commanded individually. Fog of war means only the 8 squares adjacent to your units are updated. On the map, sea is shown as a dot, land as a plus, unowned cities as an asterisk, computer cities as **X** and your cities as **O**.

# CAVEATS

Complex controls and steep learning curve. Games can take a long time to complete. Terminal must be at least 80x24. The upstream Makefile installs the program as **vms-empire**, while its manual page calls it empire.

# HISTORY

**Empire** was originally created by **Walter Bright** in the early **1970s** while he was a student at Caltech, and is considered one of the first strategy war games. **Chuck Simmons** reverse-engineered and rewrote it in **1987**, and it has been maintained by **Eric S. Raymond** since around 1990.

# SEE ALSO

[curseofwar](/man/curseofwar)(6), [trek](/man/trek)(6)

# RESOURCES

```[Source code](https://gitlab.com/esr/vms-empire)```

```[Homepage](http://www.catb.org/~esr/vms-empire/)```

<!-- verified: 2026-11-09 -->
