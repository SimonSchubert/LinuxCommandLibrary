# TAGLINE

ASCII Boulder Dash clone

# TLDR

**Start a game**

```phear```

**Play a custom map**

```phear [path/to/map]```

**Open a map in the level editor**

```phear -e [path/to/map]```

# SYNOPSIS

**phear** [**-h**] [**-v**] [_mapfile_]

**phear** **-e** _mapfile_

# PREVIEW

```
 ###########
 # @ o . . #
 # . # o . #
 # . . . * #
 # . o # . #
 ###########
```

# DESCRIPTION

**cavezofphear** (phear) is an ASCII Boulder Dash clone. The player navigates through cave levels, collecting diamonds while avoiding falling stones and monsters. Find all the diamonds in a cave to advance to the next one. Diamonds score 10 points and money 100, with an extra life for every 1000 points.

# PARAMETERS

**-e**, **--edit** _mapfile_
> Run the level editor on the specified file.

**-v**, **--version**
> Display program version.

**-h**, **--help**
> Display help.

# CONTROLS

**Arrow keys** / **2-4-8-6**
> Move

**b**
> Place a bomb

**t**
> Detonate all placed bombs

**k**
> Commit suicide if stuck

**s**
> Toggle sound

**w**
> Highlight your current position

# CAVEATS

Requires ncurses support. The command name is **phear**, not cavezofphear.

# HISTORY

**CAVEZ of PHEAR** was originally written by **Tom Rune Flo**, whose last release was 0.5.1 in **2011**, and is now maintained by **Dmitry Marakasov**. It is inspired by **Boulder Dash**, a classic computer game created by **Peter Liepa** and **Chris Gray** in **1984**.

# SEE ALSO

[robots](/man/robots)(6), [greed](/man/greed)(6)

# RESOURCES

```[Source code](https://github.com/AMDmi3/cavezofphear)```

<!-- verified: 2026-11-09 -->
