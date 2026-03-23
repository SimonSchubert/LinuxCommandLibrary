# TAGLINE

Terminal number-eating puzzle game

# TLDR

**Start a new game**

```greed```

**Move using arrow keys**

```# Use arrow keys or hjkl to move```

# SYNOPSIS

**greed** [_options_]

# PARAMETERS

**-s**
> Show high score list.

**--help**
> Display help information.

# PREVIEW

```
 4 7 2 9 1 3 8 5
 5 1 8 3 6 2 7 4
 9 3 @ 7 4 8 1 6
 2 6 5 1 9 4 3 7
```

# DESCRIPTION

**greed** is a terminal-based puzzle game where players move through a grid collecting numbers. Moving in any direction consumes that many squares, and the goal is to clear as many as possible.

The player uses arrow keys or vi-style hjkl keys to move. Strategy involves planning moves to avoid getting stuck. The game ends when no valid moves remain.

# CAVEATS

Text-based interface. Requires terminal with cursor support. Game state not saved.

# HISTORY

greed was originally created by **Matt Day** and is maintained by **Eric S. Raymond**. It is a standalone terminal game, not part of the BSD games collection.

# SEE ALSO

[snake](/man/snake)(1), [worm](/man/worm)(1), [bsdgames](/man/bsdgames)(6)
