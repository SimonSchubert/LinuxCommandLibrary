# TAGLINE

Terminal lava lamp animation with metaballs

# TLDR

**Run the lava lamp** animation with default settings

```lavat```

**Customize metaball and rim colors**

```lavat -c [green] -k [red]```

**Enable truecolor gradient** mode

```lavat -g -c [00FF00] -k [FF0000]```

**Enable gravity** (balls heat, rise, cool, fall)

```lavat -G```

**Set speed, radius, and ball count**

```lavat -s [7] -r [6] -b [12]```

**Use custom characters** for a 3D-like look

```lavat -F [".:-=+*#%@"]```

**Run in party mode** (preset color cycling)

```lavat -p [p3]```

# SYNOPSIS

**lavat** [_options_]

# PARAMETERS

**-c** _color_
> Metaball color. Accepts a named color or hex value (e.g. _red_, _00FF00_).

**-k** _color_
> Rim color drawn around each metaball.

**-g**
> Enable gradient/truecolor rendering (requires a truecolor-capable terminal).

**-G**
> Enable gravity simulation. Metaballs heat at the bottom, rise, cool at the top, then fall.

**-s** _1-10_
> Animation speed. Default is _5_.

**-r** _1-10_
> Metaball radius. Default is _5_.

**-R** _1-5_
> Rim thickness around each metaball.

**-b** _5-20_
> Number of metaballs. Default is _10_.

**-F** _chars_
> Custom character set used to render density levels.

**-C**
> Confine metaballs inside the terminal bounds.

**-p** _p1_|_p2_|_p3_
> Enable one of three preset party (color-cycling) modes.

**-h**
> Print help and exit.

# RUNTIME KEYS

**i** / **d**
> Increase / decrease metaball radius.

**I** / **D**
> Increase / decrease rim size.

**m** / **l**
> Add / remove a metaball.

**c** / **k**
> Cycle metaball / rim color.

**+** / **-**
> Increase / decrease animation speed.

**p**
> Toggle party mode.

**q** or **Esc**
> Quit.

# DESCRIPTION

**lavat** is a terminal program that simulates a lava lamp using **metaballs** rendered with text characters. Each metaball is a soft circular density field; overlapping fields blend smoothly, producing the characteristic blob-merging effect of a lava lamp directly inside the terminal.

The program supports both standard 256-color mode and a true-color gradient mode (**-g**), plus an optional gravity model (**-G**) that periodically heats balls at the bottom of the display so they rise, cool at the top, and fall again. Colors, radius, speed, and the number of metaballs can be tuned from the command line or adjusted interactively while the animation runs.

**lavat** is primarily used as a decorative screensaver-style toy or a visual backdrop in a spare terminal window. It is not a screen-locking utility and does not require an X session — it runs in any Unix terminal supported by its underlying **Termbox2** rendering library.

# CAVEATS

Gradient mode (**-g**) needs a terminal emulator that supports **24-bit truecolor**. Very large terminal windows combined with many metaballs (**-b 20**) and a large radius can make the animation CPU-bound. Colors passed to **-c** and **-k** must be either recognized named colors or six-digit hex values without a leading _#_.

# HISTORY

**lavat** was written by **AngelJumbo** in **C** on top of the **Termbox2** terminal library and published under the **MIT license** on GitHub. It is inspired by web-based JavaScript lava-lamp demos and joins a family of terminal eye-candy tools such as **aafire**, **cmatrix**, and **asciiquarium**.

# SEE ALSO

[aafire](/man/aafire)(1), [cacafire](/man/cacafire)(1), [cmatrix](/man/cmatrix)(1), [asciiquarium](/man/asciiquarium)(1), [pipes.sh](/man/pipes.sh)(1)
