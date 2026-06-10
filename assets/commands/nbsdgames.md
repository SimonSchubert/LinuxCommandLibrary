# TAGLINE

Interactive menu for the New BSD Games collection

# TLDR

**Open the game selection menu**

```nbsdgames```

**Launch a specific game directly**

```nbmines```

```nbsudoku```

```nbreversi```

# SYNOPSIS

**nbsdgames**

# PREVIEW

```
 New BSD Games
 1 Jewels  2 Sudoku
 3 Mines   4 Reversi
 > Select a game:
```

# DESCRIPTION

**nbsdgames** launches an ncurses menu for the New BSD Games package, a collection of lightweight terminal games for Unix, DOS, and Plan 9. Running the command without arguments presents a numbered list of available games; selecting an entry starts that game.

Individual games can also be invoked directly by name. The collection includes puzzle and board games such as **nbmines**, **nbsudoku**, **nbreversi**, **nbbattleship**, **nbcheckers**, **nbfifteen**, **nbpipes**, and others. Many games accept command-line options to adjust board size, difficulty, or dimensions.

Requires **ncurses** (on Debian-based systems: **libncurses5-dev** for building, **libncurses** at runtime). Games are written in portable C and packaged for most major Linux distributions, BSD systems, Alpine, and Homebrew.

# PARAMETERS

Individual games in the package accept their own options. Common patterns include **-c** and **-r** for columns and rows, **-m** for mine count, and **--help** for per-game usage. See each game's manual entry for details.

# CAVEATS

Requires a terminal with ncurses support. Some distribution packages may ship older versions with fewer games than the upstream release. On Windows, games can run with PDCurses; Plan 9 and DOS ports also exist.

# HISTORY

The New BSD Games collection was created by abakh as a modern companion to classic BSD games, adding original and improved text-mode implementations. Version 6.0.2 was released in **June 2026** with 21 games. Individual games in the package are documented separately in this library.

# SEE ALSO

[nbmines](/man/nbmines)(1), [nbsudoku](/man/nbsudoku)(1), [nbreversi](/man/nbreversi)(1), [nbbattleship](/man/nbbattleship)(1), [bsdgames](/man/bsdgames)(6)

# RESOURCES

```[Source code](https://github.com/abakh/nbsdgames)```

<!-- verified: 2026-06-11 -->