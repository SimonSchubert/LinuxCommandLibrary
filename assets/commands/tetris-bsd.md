# TAGLINE

BSD Tetris game for terminals

# TLDR

**Start a game** of tetris

```tetris-bsd```

**Start at a specific level**

```tetris-bsd -l [level]```

**Enable preview** of the next shape

```tetris-bsd -p```

**Use custom control keys** (left, rotate, right, drop, pause, quit)

```tetris-bsd -k "[jkl pq]"```

**Start with seed** for reproducible game

```tetris-bsd -s [seed]```

# SYNOPSIS

**tetris-bsd** [**-ps**] [**-k** _keys_] [**-l** _level_] [**-s** _seed_]

# PARAMETERS

**-l** _level_
> Set the starting level (2-9). Higher levels make blocks fall faster.

**-k** _keys_
> Customize control keys. Provide six characters for: left, rotate, right, drop, pause, quit.

**-p**
> Enable preview of the next shape that will appear.

**-s** _seed_
> Set the random seed for reproducible block sequences.

# DESCRIPTION

**tetris-bsd** is a terminal-based Tetris implementation from the BSD games collection. The game displays falling tetrominoes that must be arranged to form complete horizontal rows. Completed rows disappear, and the game ends when blocks stack to the top.

Default controls use vi-style keys: **j** (left), **k** (rotate), **l** (right), **space** (drop), **p** (pause), **q** (quit). The falling speed is directly proportional to the level number.

Scoring awards one point per block placed and one point per space dropped. The final score is multiplied by the current level. High scores are saved in **/var/games/bsdgames/tetris-bsd.scores**.

# CAVEATS

The game must be played on a CRT-compatible terminal. The vi-style default controls may be unfamiliar to users expecting arrow keys. The speed increases as the game progresses regardless of initial level selection.

# HISTORY

The original Tetris was created by **Alexey Pajitnov** in **1984** in the Soviet Union. This BSD implementation was adapted from a **1989** International Obfuscated C Code Contest winner by **Chris Torek** and **Darren F. Provine**. Preview mode was added by **Hubert Feyrer** in **1999**. The game is part of the **bsdgames** package included in many Unix-like distributions.

# SEE ALSO

[tetris](/man/tetris)(6), [bcd](/man/bcd)(6), [snake](/man/snake)(6), [worm](/man/worm)(6)
