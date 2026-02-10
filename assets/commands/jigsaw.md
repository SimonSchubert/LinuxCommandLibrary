# TAGLINE

xscreensaver module that loads an image, carves it up into jigsaw puzzle

# TLDR

**Run jigsaw screensaver on root window**

```jigsaw -root```

**Run in a window**

```jigsaw -window```

**Set puzzle speed**

```jigsaw -root -speed [1.0]```

**Set puzzle complexity**

```jigsaw -root -complexity [1.0]```

# SYNOPSIS

**jigsaw** [_options_]

# PARAMETERS

**-root**
> Draw on root window.

**-window**
> Draw in a new window.

**-speed** _float_
> Animation speed multiplier.

**-complexity** _float_
> Puzzle complexity level.

**-delay** _usecs_
> Delay between frames in microseconds.

# DESCRIPTION

**jigsaw** is an xscreensaver module that loads an image, carves it up into jigsaw puzzle pieces, shuffles them, and then animates the puzzle being solved. It creates a visual effect of a jigsaw puzzle assembling itself.

# SEE ALSO

[xscreensaver](/man/xscreensaver)(1), [xscreensaver-settings](/man/xscreensaver-settings)(1)

