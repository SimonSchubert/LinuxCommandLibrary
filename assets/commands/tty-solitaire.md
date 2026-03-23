# TAGLINE

terminal-based Klondike solitaire card game

# TLDR

**Start a game**

```ttysolitaire```

**Set number of passes through the deck**

```ttysolitaire -p [3]```

**Use a specific card back color**

```ttysolitaire -b [blue]```

# SYNOPSIS

**ttysolitaire** [_options_]

# PARAMETERS

**-p** _NUM_
> Number of passes through the deck (default: unlimited).

**-b** _COLOR_
> Card back color: red, green, blue, cyan, magenta, yellow, white, black.

**-h**
> Display help.

**-v**
> Display version.

# PREVIEW

```
 [Kh] [  ] [  ] [  ]
 [Ac] [2d] [3c]
 [##] [##] [##] [##]
```

# DESCRIPTION

**ttysolitaire** is an ncurses-based Klondike solitaire card game for the terminal. The classic solitaire game with seven tableau columns, four foundation piles, and a stock/waste pile.

Controls: arrow keys or hjkl to move cursor, space to select/place cards, **m** to draw from stock, **q** to quit. Cards are built down in alternating colors on the tableau and up by suit on the foundations.

# CAVEATS

Requires a terminal with ncurses and color support. Minimum terminal size is 80x24.

# HISTORY

**tty-solitaire** was created by **Mats Rauhala** as a lightweight terminal solitaire implementation, providing the classic card game experience without a graphical environment.

# SEE ALSO

[canfield](/man/canfield)(6), [mille](/man/mille)(6), [cribbage](/man/cribbage)(6)
