# TLDR

Start a game at **Level 1**

```pacman4console```

Start a game on a **certain level** (there are nine official levels)

```pacman4console --level=5```

Start the **level editor**, saving to a specified file

```pacman4consoleedit path/to/level_file```

Play a **custom level**

```pacman4console --level=path/to/level_file```

# SYNOPSIS

**pacman4console** [_options_]

# PARAMETERS

**--level** _level_
> Start on specified level number (1-9) or custom level file path

# DESCRIPTION

**pacman4console** is a text-based console game inspired by the original Pacman arcade game. It runs in the terminal using ASCII characters to render the maze, ghosts, and player character.

The game includes nine official levels and supports custom levels through the pacman4consoleedit level editor.

# CAVEATS

Requires a terminal that supports the ncurses library. Terminal size must be sufficient to display the game maze properly.

# HISTORY

Created as a terminal-based recreation of the classic Pacman game, designed to run on console and embedded systems.

# SEE ALSO

[sl](/man/sl)(1), [moon-buggy](/man/moon-buggy)(1)
