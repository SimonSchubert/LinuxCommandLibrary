# TAGLINE

Hunt the Wumpus cave exploration game

# TLDR

**Start a game**

```wump```

# SYNOPSIS

**wump** [**-h**] [**-a** _arrows_] [**-b** _bats_] [**-p** _pits_] [**-r** _rooms_] [**-t** _tunnels_]

# PARAMETERS

**-a** _arrows_
> Number of arrows (default: 5).

**-b** _bats_
> Number of bat rooms (default: 2).

**-p** _pits_
> Number of pit rooms (default: 2).

**-r** _rooms_
> Number of rooms (default: 20).

**-t** _tunnels_
> Number of tunnels per room (default: 3).

# PREVIEW

```
 You are in room 12.
 I smell a Wumpus!
 Tunnels lead to
 3, 14, 15.

 Move or shoot? (m-s)
```

# DESCRIPTION

**wump** is the classic **Hunt the Wumpus** cave exploration game from the **bsdgames** collection. The player navigates a network of cave rooms connected by tunnels, hunting the fearsome Wumpus while avoiding bottomless pits and super bats.

Clues warn of nearby dangers: "I smell a Wumpus!", "I feel a draft" (pit), or "Bats nearby!" The player can move to an adjacent room or shoot a crooked arrow through up to 5 rooms. Kill the Wumpus to win, but miss and it may move.

# CAVEATS

Part of the bsdgames package. Text-based input with room numbers. Running out of arrows means the Wumpus wins.

# HISTORY

**Hunt the Wumpus** was created by **Gregory Yob** in **1973** as a reaction against grid-based games. It is one of the earliest examples of a non-grid-based computer game and has been widely ported and reimagined.

# SEE ALSO

[adventure](/man/adventure)(6), [rogue](/man/rogue)(6), [battlestar](/man/battlestar)(6)
