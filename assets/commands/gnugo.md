# TAGLINE

play the game of Go against the computer

# TLDR

**Start a game with ASCII display**

```gnugo --mode gtp```

**Play with a specific board size**

```gnugo --boardsize [9]```

**Set AI difficulty level**

```gnugo --level [10]```

**Play interactively in ASCII mode**

```gnugo --mode ascii```

# SYNOPSIS

**gnugo** [_options_]

# PARAMETERS

**--mode** _MODE_
> Interface mode: ascii, gtp, or gmp.

**--boardsize** _N_
> Board size (default: 19). Common sizes: 9, 13, 19.

**--level** _N_
> AI thinking level (0-10, default: 10).

**--handicap** _N_
> Number of handicap stones.

**--color** _COLOR_
> Choose color: black or white.

**--komi** _N_
> Set komi (compensation points, default: 5.5).

**-l** _FILE_
> Load SGF game file.

**-o** _FILE_
> Save game to SGF file.

# PREVIEW

```
    A B C D E F G
 7  . . . . . . .
 6  . . X . . . .
 5  . X O X . . .
 4  . . X O . . .
 3  . . . . . . .
```

# DESCRIPTION

**gnugo** is a program that plays the board game Go against the user. It supports multiple board sizes, adjustable AI strength, and can communicate through the Go Text Protocol (GTP) for integration with graphical frontends.

In ASCII mode, moves are entered as coordinates (e.g., "C4"). The AI analyzes board positions using pattern matching and reading ahead. Use **pass** to pass your turn and **quit** to exit.

# CAVEATS

Requires no special terminal support in ASCII mode. The AI is moderately strong but not competitive with modern Go engines like KataGo. GTP mode is intended for use with graphical frontends.

# HISTORY

**GNU Go** has been developed by the **Free Software Foundation** since **1989**. It was one of the strongest open-source Go programs before the advent of neural network-based engines.

# SEE ALSO

[gomoku](/man/gomoku)(6), [gnuchess](/man/gnuchess)(6)
