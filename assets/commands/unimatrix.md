# TAGLINE

Terminal Matrix falling code animation

# TLDR

**Start Matrix rain**

```unimatrix```

**Custom speed**

```unimatrix -s [90]```

**Color**

```unimatrix -c [green]```

**Asynchronous scroll**

```unimatrix -a```

**Bold characters**

```unimatrix -b```

**Specific character set**

```unimatrix -u "[abc123]"```

# SYNOPSIS

**unimatrix** [_-s speed_] [_-c color_] [_-a_] [_-b_] [_options_]

# PARAMETERS

**-s** _SPEED_
> Scroll speed.

**-c** _COLOR_
> Color (green, red, etc).

**-a**
> Asynchronous.

**-b**
> Bold text.

**-u** _CHARS_
> Character set.

**-l** _LETTERS_
> Letter set.

# DESCRIPTION

**unimatrix** is a Python script that simulates the iconic falling character rain effect from the Matrix films directly in the terminal. It displays columns of characters scrolling downward at varying speeds, creating the distinctive green-on-black cascading effect.

The animation is highly customizable, with options to control scroll speed, color, character boldness, and the character set used for the falling streams. It supports a wide range of Unicode characters including Latin, Greek, Cyrillic, and CJK scripts, allowing for varied visual effects beyond the traditional katakana characters.

unimatrix can be used as a screensaver, terminal decoration, or simply for entertainment. It supports asynchronous scrolling where each column moves independently, creating a more organic visual effect similar to the films.

# CAVEATS

Python required. Terminal only. Performance varies.

# HISTORY

**unimatrix** was created as a Python recreation of the Matrix falling code animation with Unicode support.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [pipes.sh](/man/pipes.sh)(1), [asciiquarium](/man/asciiquarium)(1)
