# TAGLINE

fast-paced terminal real-time strategy game

# TLDR

**Start a game**

```curseofwar```

**Start with a specific difficulty**

```curseofwar -d [5]```

**Start with a specific number of players**

```curseofwar -q [4]```

**Start a game with a specific map seed**

```curseofwar -r [12345]```

# SYNOPSIS

**curseofwar** [_options_]

# PARAMETERS

**-d** _NUM_
> Difficulty level (1-9).

**-q** _NUM_
> Number of computer opponents.

**-r** _NUM_
> Random seed for map generation.

**-T** _NUM_
> Timeline speed.

**-i**
> Enable inequality mode.

**-h**
> Display help.

# PREVIEW

```
 ~~~~~~~~.....####
 ~~~~~...1....####
 ~~~....111...####
 ~~.....12....####
 ~......1.....####
```

# DESCRIPTION

**curseofwar** is a fast-paced action real-time strategy game for the terminal. Players build and command armies on a grid-based map, capturing territory by directing population flow toward enemy positions.

Controls: arrow keys to move cursor, space to place a flag (directing troop movement), **r** to remove flags, **p** to pause. The game features different terrain types (plains, forests, mountains, water) that affect movement and combat.

# CAVEATS

Requires a terminal with ncurses and color support. The game runs in real-time, so quick decisions are needed.

# HISTORY

**curseofwar** was created as a unique terminal RTS game, focusing on simplified controls while maintaining strategic depth through territory control and resource management.

# SEE ALSO

[nethack](/man/nethack)(6), [rogue](/man/rogue)(6)
