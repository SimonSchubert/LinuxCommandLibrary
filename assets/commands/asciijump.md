# TAGLINE

ASCII art ski jumping game

# TLDR

**Start the game**

```asciijump```

**Start with a custom hill**

```asciijump -n [hillname]```

# SYNOPSIS

**asciijump** [_options_]

# PARAMETERS

**-n** _hillname_
> Use the specified hill from the hills directory.

**-h**
> Display help.

# PREVIEW

```
  \O/
   |    /
  / \  /
______/________
   90m  K-point
```

# DESCRIPTION

**asciijump** is an ncurses-based ASCII-art ski jumping game. The player controls a ski jumper, timing the takeoff and landing to achieve maximum distance. The game features multiple hills, training and competition modes (selected from the in-game menu), and multiplayer support for up to 10 players.

Controls: press space at the edge of the jump to take off and again to land safely. Timing affects both distance and style points.

# CAVEATS

Requires a terminal with ncurses support. Custom hills can be created and placed in the hills directory.

# HISTORY

**asciijump** was created by **Fabian Breitkreutz** as a terminal recreation of ski jumping competitions.

# SEE ALSO

[moon-buggy](/man/moon-buggy)(6), [ninvaders](/man/ninvaders)(6)
