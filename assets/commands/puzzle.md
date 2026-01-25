# TLDR

**Launch puzzle collection**

```puzzle```

**Play specific puzzle**

```puzzle [fifteen]```

**List available puzzles**

```puzzle --list```

# SYNOPSIS

**puzzle** [_name_]

# DESCRIPTION

**puzzle** refers to various puzzle game collections, most commonly Simon Tatham's Portable Puzzle Collection. It includes classic puzzles like Sudoku, Minesweeper variants, and logic puzzles.

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
# Play fifteen puzzle
puzzle fifteen

# Play Sudoku
puzzle solo

# Minesweeper
puzzle mines
```

# CAVEATS

Specific commands vary by puzzle collection installed. May be sgt-puzzles, gnome-games, or other packages.

# HISTORY

Simon Tatham's Portable Puzzle Collection was created by **Simon Tatham** (author of PuTTY), providing cross-platform puzzle games.

# SEE ALSO

[gnome-sudoku](/man/gnome-sudoku)(1), [gnome-mines](/man/gnome-mines)(1)
