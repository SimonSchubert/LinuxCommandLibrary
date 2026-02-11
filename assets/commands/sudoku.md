# TAGLINE

Terminal-based ncurses Sudoku game

# TLDR

**Start a new Sudoku game**

```nudoku```

**Start with a specific difficulty**

```nudoku -d [hard]```

**Display help**

```nudoku -h```

# SYNOPSIS

**nudoku** [_options_]

# PARAMETERS

**-d** _DIFFICULTY_
> Set difficulty level (easy, normal, hard)

**-c**
> Use black and white mode (no colors)

**-h**
> Display help information

**-v**
> Display version information

# IN-GAME CONTROLS

**h j k l** or **Arrow keys**
> Move cursor (vi-style or arrows)

**1-9**
> Enter a number in current cell

**0** or **Backspace**
> Clear current cell

**H**
> Get a hint (fill one cell)

**N**
> Start a new game

**C**
> Let computer solve the puzzle

**Q**
> Quit the game

**?**
> Show help

# DESCRIPTION

**nudoku** is a terminal-based Sudoku game built with the ncurses library. It provides an interactive interface for playing the classic number puzzle directly in the terminal.

The game generates random Sudoku puzzles at various difficulty levels. Players fill a 9x9 grid so that each row, column, and 3x3 box contains all digits from 1 to 9. Pre-filled cells cannot be modified.

The interface uses vi-style movement keys (h, j, k, l) for navigation, making it familiar to vim users. Arrow keys also work for those who prefer them. The game can solve puzzles automatically with the **C** command.

# CAVEATS

nudoku may not be installed by default on all distributions. The package name varies—it may be **nudoku** or **gnome-sudoku** for the graphical version. Terminal must support ncurses for proper display. Some terminals may not render colors correctly; use **-c** for black and white mode.

# HISTORY

nudoku was created by **Michael Vetter** (jubalh) as a simple, lightweight terminal Sudoku game. The name combines "ncurses" and "sudoku". The project is open-source under the GPL v3 license. Sudoku itself originated in Japan in the 1980s, evolving from earlier number puzzles, and gained worldwide popularity in the 2000s.

# SEE ALSO

[gnome-sudoku](/man/gnome-sudoku)(6), [nethack](/man/nethack)(6), [rogue](/man/rogue)(6)
