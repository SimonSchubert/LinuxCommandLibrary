# TAGLINE

Text-based air traffic control simulation game

# TLDR

**Start** the air traffic control game

```atc```

Start with a **specific game**

```atc -g [game]```

**List** available games

```atc -l```

Show **high scores**

```atc -s```

# SYNOPSIS

**atc** [_-u?lstp_] [_-gf game_] [_-r seed_]

# DESCRIPTION

**atc** is a classic text-based air traffic control simulation game from the BSD games collection. Players guide jets and propeller planes to their destinations via exits and airports while avoiding collisions, managing multiple aircraft simultaneously.

Jets move every update tick while prop planes move every other tick. Planes enter the airspace at 7,000 feet and must leave via exits at 9,000 feet or land at airports. The game ends if two planes get too close. Score is based on the number of planes safely handled.

# PARAMETERS

**-g** _game_, **-f** _game_
> Select a specific game/airport layout to play

**-l**
> List available game files

**-s**, **-t**
> Display high score rankings

**-r** _seed_
> Set random seed for reproducible games

**-p**
> Print the path to the game's private files directory

**-u**, **-?**
> Display usage information

# CONTROLS

Commands are entered as sequences:
- Letters select aircraft
- Numbers and letters control actions (altitude, turns, direction)
- Airport/beacon letters for navigation targets

# CAVEATS

Requires terminal with character-based display. Steep learning curve. Game over if planes collide or get too close. Part of the bsd-games package on most systems.

# HISTORY

**atc** was written by **Ed James** at UC Berkeley and has been included in BSD games collections since the **1980s**.

# SEE ALSO

[nethack-console](/man/nethack-console)(6), [adventure](/man/adventure)(6)
