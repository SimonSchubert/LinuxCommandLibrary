# TLDR

**Run** the aquarium

```asciiquarium```

Run in **transparent** mode

```asciiquarium -t```

Run with **classic colors**

```asciiquarium -c```

# SYNOPSIS

**asciiquarium** [_-t_] [_-c_]

# DESCRIPTION

**asciiquarium** displays an animated ASCII art aquarium in your terminal. It features swimming fish, a castle, seaweed, and bubbles, providing a relaxing screensaver-like animation.

The program runs until interrupted and adapts to terminal size.

# PARAMETERS

**-t**
> Transparent background

**-c**
> Classic mode (fewer colors)

# CONTROLS

Press **q** or **Ctrl+C** to exit.

# CAVEATS

Requires Term::Animation Perl module. Works best with 256-color terminal support. High CPU usage on some systems.

# HISTORY

**asciiquarium** was written by Kirk Baucom as a Perl script providing terminal entertainment through animated ASCII art.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(6), [cowsay](/man/cowsay)(1)
