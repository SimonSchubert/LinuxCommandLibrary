# TAGLINE

Terminal-based Tetris clone

# TLDR

**Start the game**

```tint```

**Start at specific level**

```tint -l [5]```

**Show high scores**

```tint -s```

**Display version**

```tint -v```

# SYNOPSIS

**tint** [_options_]

# PARAMETERS

**-l** _level_
> Start at specified level (1-9).

**-s**
> Show high score table.

**-n**
> Disable colors.

**-d**
> Draw dots inside blocks.

**-h**
> Display help.

**-v**
> Display version.

# CONTROLS

**j**: Move piece left.

**l**: Move piece right.

**k**: Rotate piece clockwise.

**Space**: Drop piece instantly.

**p**: Pause game.

**q**: Quit game.

# DESCRIPTION

**tint** (TINT Is Not Tetris) is a terminal-based clone of the classic Tetris game using ncurses. It aims to recreate the original gameplay as faithfully as possible while running in a text terminal.

The game features nine difficulty levels, with higher levels increasing piece drop speed. It includes a high score system that saves scores locally with player names. Statistics track the number of each tetromino type that has appeared during play.

Unlike some Tetris variants, tint does not show a preview of the next piece, maintaining closer fidelity to the original game design.

# CAVEATS

Requires ncurses library. High scores are stored locally and not shared. No next-piece preview available. Terminal must support the required display dimensions.

# HISTORY

**tint** was created as a faithful terminal-based recreation of the original Tetris game by Alexey Pajitnov. The recursive acronym name (TINT Is Not Tetris) is a nod to GNU naming conventions while acknowledging trademark considerations. It became a popular choice for Tetris on minimal Linux systems and servers.

# SEE ALSO

[tetrinet](/man/tetrinet)(1), [bastet](/man/bastet)(1), [vitetris](/man/vitetris)(1), [moon-buggy](/man/moon-buggy)(1)
