# TAGLINE

Display animated terminal screensavers

# TLDR

**Start a random screensaver**

```gh screensaver```

**Start a specific screensaver**

```gh screensaver -s [fireworks]```

**List available screensavers**

```gh screensaver --list```

# SYNOPSIS

**gh** **screensaver** [_options_]

# PARAMETERS

**-s**, **--saver** _name_
> Screensaver to run (e.g., fireworks, starfield, marquee, pipes).

**--list**
> List available screensavers.

# DESCRIPTION

**gh screensaver** is a GitHub CLI extension that displays animated terminal screensavers. Available screensavers include fireworks, starfield, marquee, and pipes animations rendered using ANSI escape codes.

This extension must be installed first with **gh extension install cli/gh-screensaver**. Press **q** or **Ctrl+C** to exit the screensaver.

# CAVEATS

Requires the GitHub CLI (**gh**) and must be installed as an extension. Some animations may not render correctly in terminals with limited color support.

# SEE ALSO

[gh](/man/gh)(1), [cmatrix](/man/cmatrix)(1)
