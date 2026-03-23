# TAGLINE

ncurses based sudoku game

# TLDR

**Start a new game with default difficulty**

```nudoku```

**Start a game with a specific difficulty**

```nudoku -d [easy|normal|hard]```

**Start a game in black and white mode**

```nudoku -c```

**Load a user-provided puzzle in stream format (dots for empty cells)**

```nudoku -s [..5.3..8.1...6..2.4....7...]```

**Export a puzzle to a PDF file**

```nudoku -p [output.pdf]```

**Export multiple puzzles to a PDF file**

```nudoku -p [output.pdf] -n [10]```

# SYNOPSIS

**nudoku** [_options_]

# PARAMETERS

**-d** _DIFFICULTY_
> Set difficulty: easy, normal, or hard. Default is normal.

**-c**
> No color mode (black and white). Useful for terminals without color support.

**-s** _STREAM_
> Provide a user-supplied puzzle in stream format. Use dots (.) for empty fields, digits for filled cells, all in one line (81 characters).

**-p** _FILE_
> Output a puzzle to a PDF file.

**-n** _COUNT_
> Number of puzzles to put in the PDF. Only used with **-p**.

**-i** _FILE_
> Output a single puzzle to a PNG image file.

**-h**
> Display help information.

**-v**
> Display version information.

# PREVIEW

```
 5 3 . | . 7 . | . . .
 6 . . | 1 9 5 | . . .
 . 9 8 | . . . | . 6 .
-------+-------+------
 8 . . | . 6 . | . . 3
 4 . . | 8 . 3 | . . 1
 7 . . | . 2 . | . . 6
```

# DESCRIPTION

**nudoku** is a terminal-based Sudoku game using ncurses for display. It generates puzzles at three difficulty levels and provides a keyboard-driven interface for solving them.

Arrow keys navigate the grid, and number keys fill in cells. The game can also export puzzles to PDF or PNG files for printing or sharing.

# CAVEATS

Requires ncurses. Terminal must support at least 80 columns. PDF and PNG export require the respective compile-time features to be enabled.

# HISTORY

**nudoku** was created by **Michael Jubalh** as a lightweight terminal Sudoku game. The project is hosted on GitHub and packaged for most Linux distributions.

# SEE ALSO

[moon-buggy](/man/moon-buggy)(1), [nsnake](/man/nsnake)(1), [bastet](/man/bastet)(1), [tetris-bsd](/man/tetris-bsd)(1)

