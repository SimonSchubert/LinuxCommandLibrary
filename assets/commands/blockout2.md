# TAGLINE

3D falling blocks puzzle game

# TLDR

**Launch BlockOut II**

```blockout2```

# SYNOPSIS

**blockout2**

# DESCRIPTION

**BlockOut II** is a free, open-source 3D Tetris game and adaptation of the original BlockOut DOS game published by California Dreams in 1989. It uses OpenGL for rendering and features an online score database with replay functionality.

The game involves manipulating falling 3D blocks in a pit, rotating and positioning them to complete horizontal layers. Completed layers are removed, and the goal is to clear as many layers as possible before the pit fills up.

**In-game controls:**
- **Q, W, E, A, S, D** - Rotate block
- **Arrow keys** - Move block horizontally
- **Space** - Drop block
- **P** - Pause game

Replay files are stored in **~/.bl2/replay/** on Linux systems.

# CONFIGURATION

**~/.bl2/blockout.cfg**
> Game settings including pit dimensions, block set, and display options.

# CAVEATS

Requires OpenGL support. The **BL2_HOME** environment variable may need to be set to the installation directory if running from a custom location.

# HISTORY

The original BlockOut was released in **1989** by California Dreams for DOS. BlockOut II is an open-source recreation that began development in the early 2000s, with version 2.5 adding 64-bit support and unifying the OpenGL renderer across platforms.

# SEE ALSO

[tetris-bsd](/man/tetris-bsd)(6)
