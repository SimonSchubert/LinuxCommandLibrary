# TAGLINE

A living microscope slide in the terminal

# TLDR

**Run** the animated slide

```cells```

A **microbe** community, with captions

```cells --scene microbial --observe```

**Blood** scene on a light background, slower

```cells --scene blood --calm --theme light```

Plain **ASCII** glyphs

```cells --ascii```

**Screensaver** (any key quits)

```cells --screensaver```

**Microscope tools** (inspect, lyse, feed, stir)

```cells --interactive```

Print one **ASCII frame** and exit

```cells --snapshot --seed 42 --size 100x30 --at 12```

# SYNOPSIS

**cells** [_options_]

# PREVIEW

```
  .  o * . o
 .   M>  .
  o  . @  *
   .   o .
```

# DESCRIPTION

**cells** draws an animated microscope slide in the terminal: immune cells, red blood cells, microbes, fungi, and the occasional bacteriophage. Sizes and timing are illustrative, in the spirit of **asciiquarium** and **cbonsai**. It uses Python's curses interface and runs until you quit, unless **--screensaver**, **--duration**, or **--snapshot** says otherwise.

The command name is **cells**. The installable project name is **terminal-cells** (`pipx install terminal-cells`, the Homebrew formula **kborer/cells/terminal-cells**, or the Ubuntu package **terminal-cells** from the **bogobogosort/cells** PPA). A source checkout can be started with **./cells**. Python 3.10 or newer is required. Windows needs WSL.

Use a terminal of at least 80 by 24. A larger window, about 120 by 40, gives the organisms more room.

# PARAMETERS

**-h**, **--help**

> Show the option list and exit.

**--seed** _n_

> Repeat the same slide for this program version at the same terminal size. The default seed is random.

**--scene** _mixed_|_blood_|_microbial_

> Community preset. Default **mixed**.

**--density** _0.25..3_

> Scale populations to the terminal area. Default **1**.

**--speed** _0.125..8_

> Simulation speed. Default **1**. **--calm** uses **0.5** unless you also pass **--speed**.

**--fps** _1..60_

> Maximum frame rate. Default **30**. **--calm** uses **10** unless you also pass **--fps**.

**--calm**

> Half speed, 10 frames per second, and no micropipette. An explicit **--speed** or **--fps** overrides those two numbers.

**--theme** _slide_|_amber_|_light_|_mono_

> Color palette. Default **slide**. **light** is for a light background.

**--color** _auto_|_always_|_never_

> Color policy. **auto** turns color off when **NO_COLOR** is set to a non-empty value. Default **auto**.

**--fill**

> Tint cell bodies behind their glyphs. Needs a 256-color terminal.

**--unicode** _auto_|_always_|_never_

> Glyph policy. **auto** uses Unicode when the locale encoding is UTF. Default **auto**.

**--ascii**

> Same as **--unicode never**.

**--stats**

> Show population and lifecycle statistics.

**--observe**

> Caption events and lifecycle stages.

**--no-events**

> Disable rare visitors and microscope events.

**--screensaver**

> Exit on any key. Resizing the terminal does not exit.

**--interactive**

> Enable the tools Inspect, Lyse, Feed, and Stir. Click a cell, or aim with the arrow keys or **hjkl**, press **Tab** to select, and **Enter** to apply. The slide keeps moving.

**--duration** _seconds_

> Exit after this many wall-clock seconds. The default is to run until quit.

**--snapshot**

> Print one plain ASCII frame, with no ANSI color, and exit. Does not need a real terminal.

**--size** _COLSxROWS_

> Dimensions for **--snapshot**. Default **80x24**. The man page allows up to **500x200**.

**--at** _seconds_

> Simulation time of the snapshot, from 0 through 3600. Default **12**. This is simulation time, not wall-clock time, and it does not depend on **--speed**.

**--diagnostics**

> Print a JSON report of terminal capabilities and exit.

# CONTROLS

**q** or **Esc** quits. **Space** pauses. **+** and **-** change speed. **r** starts a new slide (a new seed). **s** toggles observations, population counts, and mitotic stages. **?** opens help and pauses the simulation; **j**, **k**, or the arrow keys scroll that help. **Ctrl-L** redraws.

In **--interactive** mode the keys **1** through **4** choose Inspect, Lyse, Feed, and Stir.

# CAVEATS

A seed reproduces the slide only for the same program version and the same terminal size. Resizing, or using the interactive tools, changes what happens after that point.

**--snapshot** always uses ASCII and never emits color sequences. **--fill** is useless on terminals without 256 colors.

The animation is not a model of real microscopy. Populations and speeds are chosen so the slide stays readable.

# SEE ALSO

[asciiquarium](/man/asciiquarium)(1), [cbonsai](/man/cbonsai)(1), [cmatrix](/man/cmatrix)(1)

# RESOURCES

```[Source code](https://github.com/kborer/cells)```

```[Documentation](https://github.com/kborer/cells/blob/main/docs/COMMANDS.md)```

<!-- verified: 2026-11-22 -->
