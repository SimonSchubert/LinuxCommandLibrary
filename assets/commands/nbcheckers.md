# TAGLINE

terminal checkers (draughts) game

# TLDR

**Play checkers against the computer**

```nbcheckers```

**Set AI difficulty level**

```nbcheckers -p [5]```

**Play two humans**

```nbcheckers -1 h -2 h```

**Play without replay prompt**

```nbcheckers -n```

# SYNOPSIS

**nbcheckers** [_options_]

# PARAMETERS

**-1** _type_
> Set player 1 type: h (human) or c (computer).

**-2** _type_
> Set player 2 type: h (human) or c (computer).

**-p** _depth_
> Set AI difficulty/search depth (1-127).

**-n**
> Don't ask for replay after the game ends.

**-h**
> Display help information.

# PREVIEW

```
 . x . x . x . x
 x . x . x . x .
 . . . . . . . .
 o . o . o . o .
 . o . o . o . o
```

# DESCRIPTION

**nbcheckers** is a terminal-based checkers (draughts) game from the **nbsdgames** collection. Players take turns moving pieces diagonally, jumping over opponent pieces to capture them. Pieces that reach the opposite end of the board become kings and can move backward.

Controls: arrow keys or hjkl to move cursor, ENTER to select and move pieces, q to quit. Mouse input is also supported.

# CAVEATS

Requires a terminal with ncurses support. Part of the nbsdgames collection.

# HISTORY

**nbcheckers** is part of **nbsdgames**, a package of 18 text-based terminal games created by **abakh**. Checkers (draughts) is one of the oldest known board games, with origins dating back to approximately **3000 BC**.

# SEE ALSO

[nbreversi](/man/nbreversi)(1), [nbsos](/man/nbsos)(1), [gnuchess](/man/gnuchess)(1)

