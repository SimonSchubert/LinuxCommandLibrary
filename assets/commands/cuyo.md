# TAGLINE

Tetris-like puzzle game with many surprises

# TLDR

**Start** a new game

```cuyo```

**Start in fullscreen** mode

```cuyo -f```

**Set a custom** window resolution

```cuyo -g [800x600]```

**Enable debug** mode

```cuyo -d```

**Load a custom** level description file

```cuyo [level.ld]```

**Show the help** message

```cuyo -h```

# SYNOPSIS

**cuyo** [**-d**] [**-f**] [**-g** _width_**x**_height_] [**-h**|**-?**] [**--version** _versions_] [_ld-file_]

# PARAMETERS

**-d**
> Enable debug mode.

**-f**
> Run in fullscreen mode.

**-g** _WxH_
> Set the window size (for example **-g 1024x768**).

**-h**
> Print a short help message and exit with status 0.

**-?**
> Print a short help message and exit with status 1.

**--version** _versions_
> Activate special level versions using a comma-separated list of specifiers (difficulty, player count, eco, geek modes, etc.).

_ld-file_
> Path to a level description file to load and test custom levels.

# DESCRIPTION

**cuyo** is a Puyo Puyo / Tetris style puzzle game for one or two players. Pieces fall from the top of the playfield and the player must connect matching blobs; once enough identical blobs touch, they explode. Clearing them triggers chain reactions that destroy grass or other obstacles, which is usually the level's real goal.

Each of the many built-in levels has its own rules, graphics and music, and the game ships with a level description language so players can create and load their own levels via an _ld-file_ argument. In two-player mode, one player's chain reactions drop garbage into the opponent's field.

# KEYBINDINGS

**a**, **Left Arrow**
> Move piece left.

**d**, **Right Arrow**
> Move piece right.

**w**, **Up Arrow**
> Rotate piece.

**s**, **Down Arrow**
> Drop piece faster (hard drop).

**Esc**
> Pause the game / open menu.

# CAVEATS

Requires SDL for graphics and sound. Levels vary wildly in rules, objectives and visual style, so strategies learned in one level rarely transfer directly to the next. The project has been largely unmaintained for years but remains packaged by most major distributions.

# HISTORY

**cuyo** was written by **Mark Weyer** and first released around **2001** as a free software homage to Puyo Puyo, but it quickly diverged by introducing per-level rule changes and a level description language. It is packaged in Debian and Ubuntu under the **cuyo** package.

# SEE ALSO

[tetris](/man/tetris)(6), [bastet](/man/bastet)(6)
