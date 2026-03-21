# TAGLINE

Collection of classic logic games

# TLDR

**Launch the puzzle collection** launcher

```puzzle```

**Play a specific puzzle** by name

```puzzle [fifteen]```

**Play a puzzle with a custom game ID** (preset size/difficulty)

```puzzle [solo] --generate [3x3]```

# SYNOPSIS

**puzzle** [_name_]

# DESCRIPTION

**puzzle** refers to various puzzle game collections, most commonly Simon Tatham's Portable Puzzle Collection. Each puzzle in the collection is a standalone executable. The collection includes classic puzzles like Sudoku, Minesweeper variants, sliding puzzles, and logic games. On many systems, the individual binaries are prefixed with **sgt-** (e.g., **sgt-solo** for Sudoku).

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
# Play the fifteen sliding tile puzzle
puzzle fifteen

# Play Sudoku (9x9 by default)
puzzle solo

# Play Minesweeper
puzzle mines

# On Debian/Ubuntu with sgt- prefix
sgt-solo
sgt-mines
```

# CAVEATS

Specific binary names vary by distribution and package. On Debian/Ubuntu, puzzles are installed as individual binaries with an **sgt-** prefix (e.g., **sgt-solo**). On Arch Linux, the package is **puzzles** and binaries have no prefix. On macOS, the collection can be installed via Homebrew as **puzzles**.

# HISTORY

Simon Tatham's Portable Puzzle Collection was created by **Simon Tatham** (author of PuTTY), providing cross-platform puzzle games.

# SEE ALSO

[gnome-sudoku](/man/gnome-sudoku)(1), [gnome-mines](/man/gnome-mines)(1)
