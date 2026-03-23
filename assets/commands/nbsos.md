# TAGLINE

terminal SOS game

# TLDR

**Play SOS game**

```nbsos```

**Play against computer** with specific AI difficulty

```nbsos -p [5]```

**Play two humans** (both players human)

```nbsos -1 h -2 h```

**Set board dimensions**

```nbsos -l [10] -w [10]```

# SYNOPSIS

**nbsos** [_options_]

# PARAMETERS

**-1** _type_
> Set player 1 type: h (human) or c (computer).

**-2** _type_
> Set player 2 type: h (human) or c (computer).

**-p** _depth_
> Set AI difficulty level (1-127).

**-l** _number_
> Set board length (0-1000).

**-w** _number_
> Set board width (0-1000).

**-n**
> Disable replay prompts at game end.

**-h**
> Display help information.

# PREVIEW

```
 S  O  S  .  .
 .  .  S  .  .
 .  .  O  .  .
 .  .  S  .  .
```

# DESCRIPTION

**nbsos** is a terminal-based SOS board game from the **nbsdgames** collection. Players take turns placing the letters S or O on a grid. Forming a straight connected S-O-S sequence scores a point; the player with the highest score wins.

Controls: arrow keys or hjkl to move cursor, S/O to place a letter, q to quit. Mouse input is also supported.

# CAVEATS

Requires a terminal with curses support. Board dimensions are adjustable but very large boards may not display well. Part of the nbsdgames collection.

# HISTORY

**nbsos** is part of **nbsdgames**, a package of 18 text-based terminal games created by **abakh**. It implements the classic SOS paper-and-pencil game.

# SEE ALSO

[nbmines](/man/nbmines)(1), [nbfifteen](/man/nbfifteen)(1), [nbmemoblocks](/man/nbmemoblocks)(1)

