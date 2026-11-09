# TAGLINE

Terminal minesweeper game from the nbsdgames collection

# TLDR

**Start a default game**

```nbmines```

**Set custom board size**

```nbmines -l [16] -w [30]```

**Set the number of mines**

```nbmines -m [15]```

# SYNOPSIS

**nbmines** [_options_]

# PARAMETERS

**-l** _LENGTH_
> Board length, the number of rows (8 to 1000, default 8).

**-w** _WIDTH_
> Board width, the number of columns (8 to 1000, default 8).

**-m** _MINES_
> Number of mines (default: one sixth of the cells).

**-h**
> Display help information.

# PREVIEW

```
 .  .  1  .  .  .  .
 .  1  2  1  .  .  .
 .  1  #  .  .  1  1
 .  1  1  1  .  1  F
```

# DESCRIPTION

**nbmines** is a terminal-based minesweeper game from the **nbsdgames** package, a collection of text-based games. The goal is to reveal all cells that do not contain mines while avoiding the mined ones.

The game uses an ncurses interface with keyboard and mouse support. Use arrow keys or hjkl to move, ENTER to reveal a cell, and SPACE to flag/unflag a cell. Press q to quit, F1 and F2 for help on controls and gameplay.

# CAVEATS

Requires a terminal with ncurses support. Part of the nbsdgames collection. Boards larger than the terminal can be scrolled with PgUp, PgDn, < and >.

# HISTORY

nbmines is part of the **nbsdgames** package, a collection of text-based games created by abakh, inspired by classic games. Minesweeper itself was popularized by its inclusion in Microsoft Windows 3.1 in **1992**.

# SEE ALSO

[nbfifteen](/man/nbfifteen)(1), [nbsos](/man/nbsos)(1), [gnome-mines](/man/gnome-mines)(1), [nbsdgames](/man/nbsdgames)(1)

# RESOURCES

```[Source code](https://github.com/abakh/nbsdgames)```

<!-- verified: 2026-11-09 -->
