# TAGLINE

Animated pipes terminal screensaver

# TLDR

**Run pipes animation**

```pipes.sh```

**Set pipe count**

```pipes.sh -p [5]```

**Set frame rate** (default: 75)

```pipes.sh -f [75]```

**Set pipe colors** (0-7, multiple allowed)

```pipes.sh -c 1 2 3```

**Set pipe type** (0=heavy, 1=arc, 2=light, 3=double, 4=ASCII)

```pipes.sh -t [0]```

**No bold colors**

```pipes.sh -B```

**Reset screen**

```pipes.sh -r [2000]```

# SYNOPSIS

**pipes.sh** [_options_...]

# PARAMETERS

**-p** _N_
> Number of pipes (default: 1).

**-f** _FPS_
> Frame rate (default: 75).

**-c** _COLOR_
> Colors of pipes as space-separated values 0-7 (default: 1 2 3 4 5 6 7 0).

**-t** _TYPE_
> Pipe type: 0=heavy, 1=arc, 2=light, 3=double, 4=ASCII box, 5=slashes, 6=dots, 7=circles, 8=railway, 9=knobby.

**-s** _N_
> Probability of straight fitting, 5-15 (default: 13).

**-r** _LIMIT_
> Reset drawing after LIMIT characters (default: 2000).

**-R**
> Randomize starting position and direction.

**-B**
> Disable bold effect.

**-C**
> Disable color.

**-K**
> No change of colors and types when hitting screen edges.

**-v**
> Print version number.

**-h**
> Show help.

# DESCRIPTION

**pipes.sh** displays animated pipes growing across the terminal as a screensaver-style animation. Pipes start from screen edges, extend in random directions, and turn at random intervals, creating increasingly complex patterns.

Multiple pipes can run simultaneously, each in a different color. Various character sets provide different visual styles, from simple ASCII box-drawing to Unicode block characters. Color modes range from monochrome to full rainbow cycling.

The frame rate flag controls animation smoothness and CPU usage. A periodic reset clears the screen to prevent visual clutter from accumulated pipe trails.

# CAVEATS

CPU usage increases with pipe count. Terminal must support ANSI colors. Best in large terminals.

# HISTORY

**pipes.sh** is a bash implementation of the classic "pipes" screensaver effect. It has become a popular terminal entertainment and desktop decoration script.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1), [asciiquarium](/man/asciiquarium)(1)
