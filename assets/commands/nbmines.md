# TAGLINE

Terminal minesweeper game from the nbsdgames collection

# TLDR

**Start a default game**

```nbmines```

**Set custom board size**

```nbmines -c [10] -r [10]```

**Set the number of mines**

```nbmines -m [15]```

**Play in easy mode**

```nbmines -e```

# SYNOPSIS

**nbmines** [_options_]

# PARAMETERS

**-c** _COLS_
> Number of columns.

**-r** _ROWS_
> Number of rows.

**-m** _MINES_
> Number of mines.

**-e**
> Easy mode.

**--help**
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

The game uses an ncurses interface with keyboard and mouse support. Use arrow keys or hjkl to move, ENTER to reveal a cell, and SPACE to flag/unflag a cell. Press q to quit.

# CAVEATS

Requires a terminal with ncurses support. Part of the nbsdgames collection. Board dimensions are limited by terminal size.

# HISTORY

nbmines is part of the **nbsdgames** package, a collection of 18 text-based games created by abakh, inspired by classic games. Minesweeper itself was popularized by its inclusion in Microsoft Windows 3.1 in **1992**.

# SEE ALSO

[nbfifteen](/man/nbfifteen)(1), [nbsos](/man/nbsos)(1), [gnome-mines](/man/gnome-mines)(1)

