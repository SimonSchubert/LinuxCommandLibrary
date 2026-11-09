# TAGLINE

terminal 15-puzzle game

# TLDR

**Play 15 puzzle game**

```nbfifteen```

**Play without replay prompt**

```nbfifteen -n```

**Play with a 5x5 board**

```nbfifteen -s 5```

# SYNOPSIS

**nbfifteen** [_options_]

# PARAMETERS

**-s** _SIZE_
> Set board dimension (3 to 7). Default is 4 (standard 15-puzzle).

**-n**
> Don't ask for replay after solving the puzzle.

**-h**
> Display help information.

# PREVIEW

```
+-------+
|1 2 3 4|
|5 6 7 8|
|9 a b c|
|d e f  |
+-------+
```

# DESCRIPTION

**nbfifteen** is a terminal 15-puzzle game from the **nbsdgames** collection. Slide the tiles until they are in order. Tiles above 9 are shown as letters (a, b, c and so on).

Controls: arrow keys or hjkl to move the cursor, ENTER to slide, q to quit, F1 and F2 for help on controls and gameplay. Mouse input is also supported.

# CAVEATS

Requires a terminal with ncurses support. Part of the nbsdgames collection.

# HISTORY

nbfifteen implements the classic **15-puzzle** invented by Noyes Palmer Chapman around 1874.

# SEE ALSO

[nbmines](/man/nbmines)(1), [nbsos](/man/nbsos)(1), [puzzle](/man/puzzle)(1), [nbsdgames](/man/nbsdgames)(1)

# RESOURCES

```[Source code](https://github.com/abakh/nbsdgames)```

<!-- verified: 2026-11-09 -->
