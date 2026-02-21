# TAGLINE

terminal-based Matrix digital rain effect

# TLDR

**Display the Matrix** with default settings

```cmatrix```

**Use bold characters** for brighter display

```cmatrix -b```

**Use a specific color** (green, red, blue, yellow, white, magenta, cyan)

```cmatrix -C [green]```

**Enable asynchronous scrolling** for a more realistic effect

```cmatrix -a```

**Adjust the scrolling speed** (0-9, higher is faster)

```cmatrix -s -u [2]```

**Display using rainbow colors**

```cmatrix -r```

# SYNOPSIS

**cmatrix** [_-abBflohnsmVx_] [_-u update_] [_-C color_]

# PARAMETERS

**-a**
> Enable asynchronous scrolling mode

**-b**
> Bold characters on

**-B**
> All bold characters (overrides -b)

**-f**
> Force the Linux $TERM type to be used

**-l**
> Linux mode (uses matrix console font)

**-o**
> Use old-style scrolling

**-h**
> Print usage and exit

**-n**
> No bold characters (overrides -b and -B)

**-s**
> Screensaver mode, exits on first keystroke

**-x**
> X window mode, exits on each keypress if run in a X terminal

**-V**
> Print version information and exit

**-u** _delay_
> Screen update delay (0-9, default 4)

**-C** _color_
> Use specified color (green, red, blue, white, yellow, cyan, magenta, black)

**-r**
> Rainbow mode

**-m**
> Lambda mode (display lambda instead of characters)

# DESCRIPTION

**cmatrix** is a terminal-based program that simulates the iconic digital rain effect from the Matrix movie series. It displays scrolling green characters falling down the screen, creating a visual effect reminiscent of the film's representation of the Matrix's code.

The program is primarily used for aesthetic purposes, as a screensaver, or simply for entertainment. It can be customized with various colors, speeds, and display modes to suit user preferences.

# CAVEATS

Requires a terminal that supports ANSI escape codes and curses library. Heavy CPU usage may occur on slower systems at high speeds. The Linux console font mode (**-l**) only works on actual Linux consoles, not terminal emulators.

# HISTORY

CMatrix was originally written by **Chris Allegretta** in **1999**, inspired by the visual effects in the 1999 film "The Matrix." It was created as a fun terminal application for Unix-like systems and has become a popular way to add visual flair to terminal sessions. The project is open source and continues to receive updates from the community.

# SEE ALSO

[sl](/man/sl)(1), [cowsay](/man/cowsay)(1), [figlet](/man/figlet)(1), [lolcat](/man/lolcat)(1)
