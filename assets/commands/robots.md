# TAGLINE

fight off villainous robots in a grid-based chase game

# TLDR

**Start a game**

```robots```

**Start without scores display**

```robots -s```

**Start at a specific level**

```robots -j```

# SYNOPSIS

**robots** [_options_]

# PARAMETERS

**-s**
> Don't display scores on exit.

**-j**
> Jump to highest score level.

**-t**
> Play on a small terminal.

# PREVIEW

```
 . . . . . . . . .
 . + . . . . + . .
 . . . . @ . . . .
 . . + . . . . + .
 . . . . . . . . .
```

# DESCRIPTION

**robots** is a grid-based chase game from the **bsdgames** collection. The player must avoid robots that relentlessly chase them across the grid. Robots that collide with each other are destroyed, leaving scrap heaps that also destroy other robots on contact.

Movement uses hjklyubn keys. Press **t** to teleport to a random location, **w** to wait for robots to come to you, or **s** for a safe teleport (limited uses). Strategy involves luring robots into each other and into scrap piles.

# CAVEATS

Part of the bsdgames package. Terminal-based. The number of robots increases with each level.

# HISTORY

**robots** is based on the classic **1984** game **Chase**, which was inspired by the Daleks from Doctor Who. It has been part of BSD games collections since the **1980s**.

# SEE ALSO

[worm](/man/worm)(6), [greed](/man/greed)(6), [rogue](/man/rogue)(6)
