# TAGLINE

terminal minesweeper game

# TLDR

**Start a default game**

```freesweep```

**Set board dimensions**

```freesweep --height [16] --width [30]```

**Set number of mines**

```freesweep --mines [99]```

# SYNOPSIS

**freesweep** [_options_]

# PARAMETERS

**-h**, **--height** _N_
> Number of rows.

**-w**, **--width** _N_
> Number of columns.

**-m**, **--mines** _N_
> Number of mines.

**-%**, **--percent** _N_
> Set mines as percentage of board squares.

**-f**, **--fast**
> Skip the interactive setup dialog.

**-i**, **--interactive**
> Force interactive setup menu.

**-a**, **--alt-charset**
> Toggle alternate character set for rendering.

**-b**, **--show-best-times**
> Show the best-times viewer.

**-s**, **--save-prefs**
> Save the current command-line preferences.

**-H**, **--help**
> Display help information.

# PREVIEW

```
 .  .  1  .  .  .
 .  1  2  1  .  .
 .  1  #  .  .  1
 .  1  1  1  .  1
```

# DESCRIPTION

**freesweep** is a curses-based minesweeper game for the terminal. The player reveals cells on a grid, using number clues to avoid hidden mines. Flagging suspected mines and clearing all safe cells wins the game.

Use arrow keys to move, space to reveal a cell, and **f** to flag a mine. Press **q** to quit.

# CAVEATS

Requires ncurses support. Board dimensions are limited by terminal size.

# HISTORY

**freesweep** was written as a free terminal minesweeper clone. Minesweeper was popularized by its inclusion in **Microsoft Windows 3.1** in **1992**.

# SEE ALSO

[nbmines](/man/nbmines)(6), [greed](/man/greed)(6)
