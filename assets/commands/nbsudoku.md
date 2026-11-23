# TAGLINE

terminal sudoku puzzle game

# TLDR

**Play sudoku**

```nbsudoku```

**Play a small 4x4 board**

```nbsudoku -s 2```

**Play a larger 16x16 board** (digits plus letters a to g)

```nbsudoku -s 4```

**Use fast puzzle generation**

```nbsudoku -f```

# SYNOPSIS

**nbsudoku** [_options_]

# PARAMETERS

**-s** _SIZE_
> Set the box size, from 2 to 7. The grid becomes (size*size) x (size*size). Default is 3 (a standard 9x9 grid); 2 gives 4x4, 4 gives 16x16. Values beyond 9 are entered as letters.

**-f**
> Fast (flawed) puzzle generation. Builds the solution from a simple pattern and shuffles it, so it runs in reasonable time but gives lower-quality boards. Automatically enabled for sizes larger than 4, or when the **SUDOKU_FASTGEN** environment variable is set.

**-h**
> Display help information.

# PREVIEW

```
 5 3 . | . 7 . | . . .
 6 . . | 1 9 5 | . . .
 . 9 8 | . . . | . 6 .
```

# DESCRIPTION

**nbsudoku** is a terminal-based Sudoku puzzle game from the **nbsdgames** collection. Fill the grid so that each row, column, and box contains all digits exactly once.

Controls: arrow keys to move the cursor, **1**-**9** (and letters on larger boards) to enter a value, Enter to cycle the value, Space to clear a tile, **?** for a hint on the current tile, **n** for a new board, **r** to restart, F1/F2 for help, PgUp/PgDn and **<**/**>** to scroll large boards, and **q** to quit. Mouse input is also supported.

# CAVEATS

Requires a terminal with ncurses support. Puzzles are not guaranteed to have a unique solution. Large board sizes (above 4) always use fast generation, and on the largest sizes letter keys used for values override some controls (**Q** quits).

# HISTORY

**nbsudoku** is part of **nbsdgames**, a collection of text-based terminal games created by **abakh**. Sudoku puzzles were popularized worldwide in **2004** after being featured in *The Times* newspaper.

# SEE ALSO

[nudoku](/man/nudoku)(1), [nbmines](/man/nbmines)(1), [nbfifteen](/man/nbfifteen)(1), [nbsdgames](/man/nbsdgames)(1)

# RESOURCES

```[Source code](https://github.com/abakh/nbsdgames)```

<!-- verified: 2026-11-23 -->
