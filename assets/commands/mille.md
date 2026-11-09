# TAGLINE

card game Mille Bornes

# TLDR

**Play Mille Bornes**

```mille```

**Resume a saved game** from file

```mille [path/to/savefile]```

# SYNOPSIS

**mille** [_file_]

# PARAMETERS

_file_
> Saved game file to resume.

# PREVIEW

```
 HAND: [Go] [25] [75]
 MILES: 425 / 1000
 SAFETY: [Right of Way]
```

# DESCRIPTION

**mille** plays a two-handed game of Mille Bornes against the computer. Players race to reach 1000 miles while playing hazard cards on the opponent and using remedies and safeties.

Part of the **bsdgames** package.

# CONTROLS

**P**
> Pick a card from the deck

**D**
> Discard a card: type its number (or P for the just-picked card), then Return or Space

**U**
> Use a card: type its number, then Return or Space

**O**
> Toggle ordering the hand

**Q**
> Quit the game, with confirmation

**S**
> Save the game in a file

**R** / **Ctrl-L**
> Redraw the screen

**W**
> Toggle the score window type

# CAVEATS

Part of bsdgames. Terminal-based. The game interface uses a text-based card display with keyboard controls.

# HISTORY

mille is part of **bsdgames**, implementing the French card game Mille Bornes (1954). The original code was written by Ken Arnold.

# SEE ALSO

[canfield](/man/canfield)(6), [bsdgames](/man/bsdgames)(6)

# RESOURCES

```[Source code](https://github.com/NetBSD/src/tree/trunk/games/mille)```

```[Documentation](https://man.netbsd.org/mille.6)```

<!-- verified: 2026-11-09 -->
