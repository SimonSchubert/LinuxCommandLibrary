# TAGLINE

terminal pipe-connecting puzzle game

# TLDR

**Start a game**

```nbpipes```

# SYNOPSIS

**nbpipes**

# PREVIEW

```
 .  |  .  .  .  .
 .  +--+  .  .  .
 .  .  |  .  .  .
 .  .  +--+  .  .
 S--+  .  +--+  .
```

# DESCRIPTION

**nbpipes** is a terminal-based pipe puzzle game from the **nbsdgames** collection, inspired by the classic **Pipe Mania** arcade game. The player must place pipe segments on a grid to keep an ever-flowing sewage pipeline intact and prevent leaks.

A countdown timer runs before the flow begins, giving the player time to pre-place pipes. Once the flow starts, the player must stay ahead of it. Replacing an already-placed pipe costs 3 points. Toggling fast flow mode with **f** doubles scoring but reduces reaction time. The game ends when the flow reaches a dead end or the score drops below -1000.

Controls: arrow keys, hjkl, or WASD to move the cursor. ENTER to place a pipe. **p** to pause, **f** to toggle fast flow, **g** to skip the countdown and start the flow, **q** to quit. Mouse input is also supported.

# CAVEATS

Requires a terminal with ncurses support. Part of the nbsdgames collection. No command-line options are available.

# HISTORY

**nbpipes** is part of **nbsdgames**, a package of 18 text-based terminal games created by **abakh**. It implements the classic **Pipe Mania** game, originally released in **1989** by The Assembly Line.

# SEE ALSO

[nbmines](/man/nbmines)(1), [nbfifteen](/man/nbfifteen)(1), [nbsos](/man/nbsos)(1)

