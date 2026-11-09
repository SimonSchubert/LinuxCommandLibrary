# TAGLINE

terminal reversi (othello) game

# TLDR

**Start a game** (prompts for the player types)

```nbreversi```

**Play against the computer**

```nbreversi -1 h -2 c```

**Set AI difficulty level**

```nbreversi -p [5]```

**Play two humans**

```nbreversi -1 h -2 h```

**Play without replay prompt**

```nbreversi -n```

# SYNOPSIS

**nbreversi** [_options_]

# PARAMETERS

**-1** _type_
> Set player 1 type: h (human) or c (computer).

**-2** _type_
> Set player 2 type: h (human) or c (computer).

**-p** _depth_
> Set a fixed AI search depth (1-127). Without it, the AI strength adapts after each game.

**-n**
> Don't ask for replay after the game ends.

**-h**
> Display help information.

# PREVIEW

```
 . . . . . . . .
 . . . . . . . .
 . . . O X . . .
 . . . X O . . .
 . . . . . . . .
```

# DESCRIPTION

**nbreversi** is a terminal-based Reversi (Othello) game from the **nbsdgames** collection. Players take turns placing discs on the board. When a disc is placed so that one or more of the opponent's discs are flanked in a straight line, those discs are flipped. The player with the most discs when no more moves can be made wins.

Controls: arrow keys or hjkl to move cursor, ENTER to place a disc, q to quit, F1 and F2 for help on controls and gameplay. Mouse input is also supported.

# CAVEATS

Requires a terminal with ncurses support. Part of the nbsdgames collection.

# HISTORY

**nbreversi** is part of **nbsdgames**, a collection of text-based terminal games created by **abakh**. Reversi was invented in **1883** by Lewis Waterman and later popularized as **Othello** by Goro Hasegawa in **1971**.

# SEE ALSO

[nbcheckers](/man/nbcheckers)(1), [nbsos](/man/nbsos)(1), [nbmines](/man/nbmines)(1), [nbsdgames](/man/nbsdgames)(1)

# RESOURCES

```[Source code](https://github.com/abakh/nbsdgames)```

<!-- verified: 2026-11-09 -->
