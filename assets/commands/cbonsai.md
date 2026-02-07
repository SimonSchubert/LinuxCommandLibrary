# TAGLINE

animated ASCII art bonsai tree generator

# TLDR

**Generate random bonsai tree**

```cbonsai```

**Live animation mode**

```cbonsai --live```

**Screensaver mode**

```cbonsai --screensaver```

**Infinite mode**

```cbonsai --infinite```

**Add message**

```cbonsai -m "[Your message]"```

**Enable color and birds**

```cbonsai --color --birds```

**Set animation speed**

```cbonsai -l -t [0.05]```

# SYNOPSIS

**cbonsai** [_options_]

# DESCRIPTION

**cbonsai** generates procedurally created ASCII art bonsai trees in the terminal. Each run produces a unique tree using randomized growth algorithms, and a seed value can be specified for reproducibility.

The tool supports live animation of tree growth, infinite mode for continuous generation, and a screensaver mode that combines both. Written in C using ncurses, it also supports color output, decorative birds, and custom messages displayed alongside the tree.

# PARAMETERS

**-l**, **--live**
> Animate tree growth continuously

**-i**, **--infinite**
> Keep growing new trees

**-S**, **--screensaver**
> Live + infinite, exit on keypress

**-m** _msg_, **--message** _msg_
> Display message next to tree

**-c**, **--color**
> Enable color output

**-b**, **--birds**
> Show animated birds

**-t** _time_, **--time** _time_
> Animation delay in seconds

**-s** _seed_, **--seed** _seed_
> Random seed for reproducibility

**-M** _mult_, **--multiplier** _mult_
> Growth multiplier

**-L** _life_, **--life** _life_
> Starting life value

**-p**, **--print**
> Print tree and exit (no ncurses)

# CAVEATS

Requires ncurses library. Color support depends on terminal capabilities.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1), [cowsay](/man/cowsay)(1)
