# TAGLINE

classic full-scale war strategy game

# TLDR

**Start a new game**

```empire```

**Start with mostly water** (island map)

```empire -w [90]```

**Set message delay** to 500ms

```empire -d [500]```

# SYNOPSIS

**empire** [**-w** _water_] [**-s** _smooth_] [**-d** _delay_] [**-S** _interval_] [**-f** _savefile_]

# PARAMETERS

**-w** _water_
> Percentage of map that is water (10-90, default 70).

**-s** _smooth_
> Map smoothing level; low values create islands, high values create continents (default 5).

**-d** _delay_
> Delay in milliseconds after informational messages (default 2000).

**-S** _interval_
> Auto-save interval in turns (default 10).

**-f** _savefile_
> Specify save file name (default empsave.dat).

# PREVIEW

```
 . . + . ~ ~ ~ ~
 . A . . ~ ~ ~ ~
 . . . . . ~ ~ ~
 ~ ~ . . . . ~ ~
 ~ ~ ~ . . . . .
```

# DESCRIPTION

**empire** is a classic full-scale war simulation strategy game. Two emperors compete for world domination on a randomly generated map, producing armies, fighters, ships, and other units to explore, conquer, and hold territory.

The game plays on a grid map with cities, land, and sea. Units are produced in captured cities and commanded individually. Fog of war means only areas near your units are visible.

# CAVEATS

Complex controls and steep learning curve. Games can take a long time to complete. Terminal must be at least 80x24.

# HISTORY

**Empire** was originally created by **Walter Bright** in the **1970s** and is considered one of the first strategy war games. The Unix version was rewritten by **Chuck Simmons** and is maintained by **Eric S. Raymond**.

# SEE ALSO

[curseofwar](/man/curseofwar)(6), [trek](/man/trek)(6)
