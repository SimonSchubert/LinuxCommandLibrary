# TAGLINE

Collection of classic logic games

# TLDR

**Play a specific puzzle** on Debian or Ubuntu

```sgt-[fifteen]```

**Play a specific puzzle** on Arch Linux

```puzzles-[fifteen]```

**Start with specific game parameters**

```sgt-[net] [7x7w]```

**Print game IDs** without opening a window

```sgt-[solo] --generate [5]```

**Generate printable puzzles** as PostScript, with solutions

```sgt-[net] --generate [12] --print [2x3] --with-solutions [7x7w] > [puzzles.ps]```

# SYNOPSIS

**sgt-**_name_ [_options_] [_game-parameters_]

**puzzles-**_name_ [_options_] [_game-parameters_]

# PARAMETERS

**--generate** _n_
> Print _n_ invented game IDs on standard output instead of showing a puzzle.

**--print** _w_**x**_h_
> Send unsolved puzzles to standard output as PostScript, _w_ across and _h_ down per page.

**--with-solutions**
> With **--print**, follow the puzzle pages with their solutions.

**--save** _file-prefix_ [**--save-suffix** _file-suffix_]
> Write saved-game files for unsolved puzzles instead of showing a puzzle.

**--delete-prefs**
> Delete the stored user preferences file for this puzzle.

**--version**
> Print version information and exit.

# DESCRIPTION

**puzzle** here refers to Simon Tatham's Portable Puzzle Collection. Each puzzle in the collection is a standalone executable, run by its own name. The collection includes classic puzzles like Sudoku, Minesweeper variants, sliding puzzles, and logic games. Distributions usually add a prefix to the binary names, such as **sgt-solo** or **puzzles-solo** for Sudoku.

# COMMON PUZZLES

```
blackbox    - Find hidden balls
bridges     - Connect islands
fifteen     - Sliding tile puzzle
galaxies    - Divide grid into galaxies
lightup     - Place lights
loopy       - Draw loops
mines       - Minesweeper
net         - Rotate tiles to connect
pattern     - Nonogram puzzle
pearl       - Draw masyu loop
singles     - Circle numbers
solo        - Sudoku
tents       - Place tents
towers      - Latin square with heights
undead      - Place monsters
unequal     - Futoshiki puzzle
```

# EXAMPLES

```bash
# Debian/Ubuntu: sgt- prefix
sgt-solo
sgt-mines

# Arch Linux: puzzles- prefix
puzzles-solo
puzzles-mines
```

# CAVEATS

Specific binary names vary by distribution and package. On Debian/Ubuntu, the package is **sgt-puzzles** and the binaries in /usr/games have an **sgt-** prefix (e.g., **sgt-solo**). On Arch Linux, the package is **puzzles** and the binaries have a **puzzles-** prefix (e.g., **puzzles-solo**). Homebrew also provides a **puzzles** formula.

# HISTORY

Simon Tatham's Portable Puzzle Collection was created by **Simon Tatham** (author of PuTTY), providing cross-platform puzzle games.

# SEE ALSO

[gnome-sudoku](/man/gnome-sudoku)(1), [gnome-mines](/man/gnome-mines)(1)

# RESOURCES

```[Homepage](https://www.chiark.greenend.org.uk/~sgtatham/puzzles/)```

```[Documentation](https://www.chiark.greenend.org.uk/~sgtatham/puzzles/doc/)```

<!-- verified: 2026-11-09 -->
