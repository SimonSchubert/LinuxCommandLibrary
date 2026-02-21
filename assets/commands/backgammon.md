# TAGLINE

Text-based backgammon board game

# TLDR

**Start** backgammon game

```backgammon```

Start as **red** player (skip instructions)

```backgammon -r```

Start a **two-player** game

```backgammon -b```

**Restore** a saved game

```backgammon -s [savefile]```

# SYNOPSIS

**backgammon** [_-_] [_-nrwb_] [_-pr_] [_-pw_] [_-pb_] [_-t term_] [_-s file_]

# DESCRIPTION

**backgammon** is a classic text-based backgammon game from the BSD games collection. It provides a text-based interface for playing backgammon against the computer or another player. Players move checkers based on dice rolls, attempting to bear off all pieces before their opponent.

The companion program **teachgammon** teaches the rules and strategy of backgammon.

# PARAMETERS

**-n**
> Don't ask for rules or instructions

**-r**
> Player is red (implies -n)

**-w**
> Player is white (implies -n)

**-b**
> Two-player mode, red and white (implies -n)

**-pr**
> Print board before red's turn

**-pw**
> Print board before white's turn

**-pb**
> Print board before both players' turns

**-t** _term_
> Specify terminal type

**-s** _file_
> Restore a saved game from file

# CONTROLS

**space** / **return**
> Roll dice

**d**
> Double

**p**
> Print board

**q**
> Quit game

**s**
> Save game

Moves are expressed as source-destination (e.g., 3-5).

# CAVEATS

Text-based interface only. Part of the bsd-games package on most systems.

# HISTORY

**backgammon** was written by **Alan Char** in **1980** at UC Berkeley and has been part of BSD games distributions since then.

# SEE ALSO

[adventure](/man/adventure)(6), [nethack-console](/man/nethack-console)(6)
