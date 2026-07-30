# TAGLINE

Human-like mouse movement via deep learning

# TLDR

**Install** the global CLI

```npm i -g mousecrack```

**Move** the pointer to screen coordinates

```mousecrack move [x] [y]```

**Generate** step points from one position to another

```mousecrack steps [x1] [y1] [x2] [y2]```

# SYNOPSIS

**mousecrack** **move** _x_ _y_

**mousecrack** **steps** _x1_ _y1_ _x2_ _y2_

# DESCRIPTION

**mousecrack** synthesizes organically varied, human-like mouse trajectories using a mixture density network trained as a multivariate time-series forecaster over position deltas and timing. It is available both as a Node.js SDK (**move**, **steps**) and as a small CLI intended for agents and automation.

The project is experimental (v0.x) and labeled educational. Output quality varies; it is not a guaranteed bypass of bot detection systems.

Optional agent skills/plugins are published from the same repository for Claude Code and Codex.

# COMMANDS

**move** _x_ _y_

> Drive the system pointer to absolute coordinates (_x_, _y_) along a generated path.

**steps** _x1_ _y1_ _x2_ _y2_

> Print a sequence of intermediate points (with timestamps) from (_x1_, _y1_) to (_x2_, _y2_) without necessarily actuating the pointer (SDK-oriented).

# CAVEATS

Experimental software. GUI automation may require accessibility/input permissions depending on the OS. Misuse against third-party services may violate their terms of service.

# SEE ALSO

[xdotool](/man/xdotool)(1), [ydotool](/man/ydotool)(1), [cliclick](/man/cliclick)(1)

# RESOURCES

```[Source code](https://github.com/puffinsoft/mousecrack)```

<!-- verified: 2026-07-30 -->
