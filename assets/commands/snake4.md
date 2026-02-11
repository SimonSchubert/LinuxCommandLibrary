# TAGLINE

Terminal-based classic snake game

# TLDR

**Start** the game

```snake4```

Show **high scores**

```snake4 --highscores```

Display **version**

```snake4 --version```

Display **help**

```snake4 --help```

# SYNOPSIS

**snake4** [**-hHV**] [**-M** _file_]

# PARAMETERS

**-h, --help**
> Display usage message and exit

**-H, --highscores**
> Display the high score list and exit

**-V, --version**
> Display version information and exit

**-M, --merge-highscores** _file_
> Merge a separate high score file into the default (admin only)

# CONTROLS

**Arrow keys**
> Navigate the snake (up, down, left, right)

**1-5**
> Select game level

**Space**
> Pause/unpause game

**q**
> Quit game

# DESCRIPTION

**snake4** is a terminal-based implementation of the classic snake game for Unix/X11 systems. Players control a snake that grows longer by eating food while avoiding obstacles, walls, and its own tail.

The game features multiple difficulty levels, a hostile enemy called "the evil headbanger," and power-ups. Slim-pills shorten the snake and award bonus points. Food that blinks indicates it is rotting and becomes poisonous if eaten. A site-wide high score file tracks the top 200 players.

# CAVEATS

High score file is shared system-wide, with one entry per user. Merging high scores requires administrative privileges. The game requires a terminal with arrow key support. X11 toolkit options are also accepted.

# HISTORY

**snake4** is part of the BSD games collection, providing classic Unix entertainment software. The snake game genre dates back to the **1970s** arcade games and gained widespread popularity through mobile phone implementations. snake4 brings this classic gameplay to the Unix terminal environment.

# SEE ALSO

[nsnake](/man/nsnake)(6), [bsdgames](/man/bsdgames)(6), [nethack](/man/nethack)(6)
