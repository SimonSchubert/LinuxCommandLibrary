# TAGLINE

ASCII/text art clock, timer, and pattern time manager

# TLDR

**Start** arttime (art + clock)

```arttime```

**Timer mode** / pattern timers

```arttime -t [25m]```

**Select** art style interactively

```arttime```

# SYNOPSIS

**arttime** [*options*]

# DESCRIPTION

**arttime** blends looping text/ASCII art with a clock, timer, and pattern-based time manager in the terminal. Aimed at delightful focus sessions rather than minimal stopwatches. Install via upstream install scripts or packages documented in the repository.

# PARAMETERS

**-t** *duration*

> Timer-related modes (see **arttime -h** for pattern syntax).

Interactive keybindings change art, toggle views, and control timers once running. Full option list: **arttime --help**.

# CAVEATS

Needs a UTF-8 capable terminal with adequate size for art. Not a scheduling daemon—process must keep running.

# INSTALL

```brew: brew install arttime```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[pomodoro](/man/pomodoro)(1), [tty-clock](/man/tty-clock)(1), [peaclock](/man/peaclock)(1)

# RESOURCES

```[Source code](https://github.com/poetaman/arttime)```

<!-- verified: 2026-07-19 -->
