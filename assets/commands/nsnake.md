# TAGLINE

classic snake game that runs in the terminal using ncurses

# TLDR

**Start** a snake game

```nsnake```

**Navigate** the snake

```Arrow keys (Up/Down/Left/Right)```

**Pause/unpause** the game

```p```

**Quit** the game

```q```

Display **help** during the game

```h```

# SYNOPSIS

**nsnake** [_options_]

# PARAMETERS

**-h, --help**
> Display help information

**-v, --version**
> Display version information

# DESCRIPTION

**nsnake** is a classic snake game that runs in the terminal using ncurses. Control a snake to eat food and grow longer while avoiding collisions with walls and the snake's own body.

In-game controls include arrow keys for movement, **p** to pause, **q** to quit, and **h** for help. The game speeds up as the snake grows, increasing difficulty.

The game features configurable settings for speed, borders, and display options through in-game menus.

# CAVEATS

Requires a terminal with ncurses support. Terminal size affects playable area. Game state is not saved between sessions.

# SEE ALSO

[sl](/man/sl)(1), [cmatrix](/man/cmatrix)(1), [bastet](/man/bastet)(6)
