# TAGLINE

Visual effects engine for terminal text output

# TLDR

**Apply the decrypt effect to text**

```cat [your_text] | tte decrypt```

**Apply the beams effect**

```echo "hello world" | tte beams```

**View help for a specific effect**

```tte [decrypt] -h```

# SYNOPSIS

_command_ | **tte** _effect_ [_options_]

# DESCRIPTION

**terminaltexteffects** (tte) is a terminal visual effects engine that works as both a standalone application and a Python library. It features 37+ built-in effects including matrix, decrypt, rain, beams, and burn, with support for complex character movement via paths, waypoints, motion easing, and bezier curves. Effects run inline, preserving terminal state and workflow.

# HISTORY

**terminaltexteffects** was created by **ChrisBuilds** and is written in **Python**.

# SEE ALSO

[lolcat](/man/lolcat)(1), [figlet](/man/figlet)(1), [toilet](/man/toilet)(1)
