# TAGLINE

terminal sudoku puzzle game

# TLDR

**Play sudoku**

```nbsudoku```

**Play with a larger board**

```nbsudoku -s [4]```

**Use fast puzzle generation**

```nbsudoku -f```

# SYNOPSIS

**nbsudoku** [_options_]

# PARAMETERS

**-s** _SIZE_
> Set puzzle size (2-7). Default is 3 (standard 9x9 grid).

**-f**
> Fast (flawed) puzzle generation. Automatically enabled for sizes larger than 4.

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

Controls: arrow keys or hjkl to move cursor, number keys to enter digits, q to quit. Mouse input is also supported.

# CAVEATS

Requires a terminal with ncurses support. Part of the nbsdgames collection. Large board sizes (above 4) require fast generation mode.

# HISTORY

**nbsudoku** is part of **nbsdgames**, a package of 18 text-based terminal games created by **abakh**. Sudoku puzzles were popularized worldwide in **2004** after being featured in *The Times* newspaper.

# SEE ALSO

[nudoku](/man/nudoku)(1), [nbmines](/man/nbmines)(1), [nbfifteen](/man/nbfifteen)(1)

