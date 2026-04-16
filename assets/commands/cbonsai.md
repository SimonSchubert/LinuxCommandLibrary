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

**Set animation speed** (seconds per step in live mode)

```cbonsai -l -t [0.05]```

**Customize leaf characters**

```cbonsai -c "[&,*,o]"```

# SYNOPSIS

**cbonsai** [_options_]

# DESCRIPTION

**cbonsai** generates procedurally created ASCII art bonsai trees in the terminal. Each run produces a unique tree using randomized growth algorithms, and a seed value can be specified for reproducibility.

The tool supports live animation of tree growth, infinite mode for continuous tree regeneration, and a screensaver mode. Written in C using ncurses, it supports customizable leaf characters, colors, a plant base, and messages displayed alongside the tree.

# PARAMETERS

**-l**, **--live**
> Live mode: show each step of growth

**-t** _TIME_, **--time** _TIME_
> In live mode, seconds between growth steps (default 0.03)

**-i**, **--infinite**
> Infinite mode: keep growing trees

**-w** _TIME_, **--wait** _TIME_
> In infinite mode, seconds between each tree (default 4.00)

**-S**, **--screensaver**
> Screensaver mode; equivalent to -liWC, quits on any keypress

**-m** _MSG_, **--message** _MSG_
> Attach a message next to the tree

**-b** _N_, **--base** _N_
> ASCII-art plant base to use; 0 is none

**-c** _LIST_, **--leaf** _LIST_
> Comma-delimited strings randomly chosen for leaves (default &)

**-M** _MULT_, **--multiplier** _MULT_
> Branch multiplier (0-20; default 5)

**-L** _LIFE_, **--life** _LIFE_
> Starting life value (0-200; default 32)

**-s** _SEED_, **--seed** _SEED_
> Seed the random number generator

**-W** _FILE_, **--save** _FILE_
> Save progress to file (default ~/.cache/cbonsai)

**-C** _FILE_, **--load** _FILE_
> Load progress from file

**-p**, **--print**
> Print tree to terminal when finished

**-v**, **--verbose**
> Increase output verbosity

# CAVEATS

Requires ncurses library. Color support depends on terminal capabilities.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1), [cowsay](/man/cowsay)(1)
