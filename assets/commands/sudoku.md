# TAGLINE

Terminal-based ncurses Sudoku game (nudoku)

# TLDR

**Start a new Sudoku game**

```nudoku```

**Start with a specific difficulty**

```nudoku -d [hard]```

**Resume the last saved game**

```nudoku -r```

**Print sudokus to a PDF** (requires cairo support)

```nudoku -p [riddle.pdf] -n [8] -d [hard]```

**Write a sudoku to a PNG image** (requires cairo support)

```nudoku -i [sudoku.png] -d [easy]```

**Display help**

```nudoku -h```

# SYNOPSIS

**nudoku** [_options_]

# PARAMETERS

**-d** _DIFFICULTY_
> Set difficulty level (easy, normal, hard)

**-c**
> Do not use colors

**-r**
> Resume the last saved game

**-s** _STREAM_
> Use a user-provided sudoku stream

**-o**
> Output the sudoku stream (inverse of **-s**)

**-p** _FILE_
> Output a PDF (requires cairo support)

**-n** _NUMBER_
> Number of sudokus to put in the PDF

**-i** _FILE_
> Output a PNG image (requires cairo support)

**-S** _PAPER_
> PDF paper size, such as a4, letter, legal or WIDTHxHEIGHT[unit] (default: a4)

**-h**
> Display help information

**-v**
> Display version information

# IN-GAME CONTROLS

**h j k l** or **Arrow keys**
> Move cursor

**1-9**
> Enter a number in current cell

**x**, **Delete** or **Backspace**
> Clear current cell

**c**
> Check the solution

**H**
> Get a hint

**m**
> Toggle marks

**u**
> Undo previous action

**G**
> Save the game

**N**
> Start a new puzzle

**S**
> Solve the puzzle

**r**
> Redraw the screen

**Q** or **Esc**
> Quit the game

# DESCRIPTION

**nudoku** is a terminal-based Sudoku game built with the ncurses library. It provides an interactive interface for playing the classic number puzzle directly in the terminal, and this page documents it under the generic name sudoku.

The game generates random Sudoku puzzles at various difficulty levels. Players fill a 9x9 grid so that each row, column, and 3x3 box contains all digits from 1 to 9. Pre-filled cells cannot be modified.

The interface uses vi-style movement keys (h, j, k, l) for navigation, and arrow keys also work. Builds with cairo support can also write puzzles to PDF or PNG files.

# CAVEATS

The executable is named **nudoku**, not sudoku. PDF and PNG output is only available when built with **--enable-cairo**. Some terminals may not render colors correctly; use **-c** to disable colors.

# HISTORY

nudoku was created by **Michael Vetter** (jubalh) as a simple, lightweight terminal Sudoku game.

# SEE ALSO

[nudoku](/man/nudoku)(6), [gnome-sudoku](/man/gnome-sudoku)(6), [nethack](/man/nethack)(6), [rogue](/man/rogue)(6)

# RESOURCES

```[Homepage](http://jubalh.github.io/nudoku/)```

```[Source code](https://github.com/jubalh/nudoku)```

<!-- verified: 2026-11-09 -->
