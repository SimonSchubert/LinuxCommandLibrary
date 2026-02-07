# TAGLINE

Text-based air traffic control simulation game

# TLDR

**Start** the air traffic control game

```atc```

Start with **specific airport**

```atc -g [game]```

# SYNOPSIS

**atc** [_-g game_] [_-l level_]

# DESCRIPTION

**atc** is a classic text-based air traffic control simulation game from BSD games. Players guide aircraft to safe landings while avoiding collisions, managing multiple planes simultaneously.

The game uses single-key commands to control aircraft altitude, speed, and direction.

# PARAMETERS

**-g** _game_
> Select specific airport/game

**-l** _level_
> Starting difficulty level

# CONTROLS

Commands are entered as sequences:
- Letters select aircraft
- Numbers control actions (altitude, speed, turns)
- Airport/beacon letters for navigation

# CAVEATS

Requires terminal with character-based display. Steep learning curve. Game over if planes collide.

# HISTORY

**atc** was written by Ed James for BSD Unix and has been included in bsdgames collections since the **1980s**.

# SEE ALSO

[bsdgames](/man/bsdgames)(6), [nethack](/man/nethack)(6)
