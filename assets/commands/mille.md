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

During play, you can pick cards from the deck, play or discard cards by typing their number, toggle hand sorting, save the game with 'S', or redraw the screen with Ctrl-L.

Part of the **bsdgames** package.

# CAVEATS

Part of bsdgames. Terminal-based. The game interface uses a text-based card display with keyboard controls.

# HISTORY

mille is part of **bsdgames**, implementing the French card game Mille Bornes (1954). The original code was written by Ken Arnold.

# SEE ALSO

[canfield](/man/canfield)(6), [bsdgames](/man/bsdgames)(6)

