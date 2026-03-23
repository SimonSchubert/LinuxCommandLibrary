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
+--+--+--+--+
| 1| 2| 3| 4|
| 5| 6| 7| 8|
| 9|10|11|12|
|13|14|15|  |
+--+--+--+--+
```

# DESCRIPTION

**nbfifteen** is a terminal 15-puzzle game. Slide tiles to arrange them in order.

The tool is a classic sliding puzzle. Uses ncurses for display.

# CAVEATS

Part of nbsdgames package. Terminal game. Arrow keys to move.

# HISTORY

nbfifteen implements the classic **15-puzzle** invented by Noyes Palmer Chapman around 1874.

# SEE ALSO

[nbmines](/man/nbmines)(1), [nbsos](/man/nbsos)(1), [puzzle](/man/puzzle)(1)

