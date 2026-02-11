# TAGLINE

Animated terminal screen clearing

# TLDR

**Clean terminal**

```wipeclean```

**With specific animation**

```wipeclean -a [1]```

**Custom speed**

```wipeclean -s [50]```

# SYNOPSIS

**wipeclean** [_-a animation_] [_-s speed_] [_options_]

# PARAMETERS

**-a** _N_
> Animation type.

**-s** _SPEED_
> Animation speed.

**--help**
> Show help.

# DESCRIPTION

**wipeclean** is a fun alternative to the clear command that clears the terminal screen with visual animations instead of simply scrolling content away. Multiple animation styles are available, each providing a different visual effect as the screen content is wiped.

The animation speed can be adjusted to control how quickly the clearing effect plays out. It is purely decorative and serves no functional advantage over the standard clear command, but adds a bit of visual flair to terminal workflows.

# CAVEATS

Just for fun. Not faster than clear. Rust implementation.

# HISTORY

**wipeclean** was created as a fun animated alternative to the clear command for terminal cleaning.

# SEE ALSO

[clear](/man/clear)(1), [reset](/man/reset)(1), [cmatrix](/man/cmatrix)(1)
