# TAGLINE

ASCII art fire animation

# TLDR

**Display ASCII fire** animation in the terminal

```aafire```

**Run with curses driver** (force terminal output)

```aafire -driver curses```

**Run with slang driver** for terminal display

```aafire -driver slang```

**Display with specific dimensions**

```aafire -width [80] -height [25]```

# SYNOPSIS

**aafire** [_aalib-options_]

# PARAMETERS

**-driver** _name_
> Select output driver (curses, slang, X11, etc.)

**-width** _n_
> Set display width in characters

**-height** _n_
> Set display height in characters

**-bold**
> Enable bold font for brighter output

**-dim**
> Use dim characters for darker appearance

**-reverse**
> Use reverse video mode

**-normal**
> Use normal rendering mode

**-extended**
> Use extended ASCII character set

**-eight**
> Use eight-bit ASCII characters

**-help**
> Display available options and drivers

# DESCRIPTION

**aafire** displays an animated fire simulation rendered entirely in ASCII art characters. It is a demonstration program for the aalib library, which converts graphical output into text-based representations.

The animation renders flames that flicker and dance in real-time using only standard text characters, creating a visually interesting effect directly in the terminal or in an X11 window. The program demonstrates aalib's ability to represent complex visual information using nothing but ASCII characters and their brightness levels.

By default, aalib may attempt to use a graphical driver. To ensure output stays in the terminal, use the **curses** or **slang** driver explicitly.

# CAVEATS

The default driver may attempt to open an X11 window rather than display in the terminal. Use **-driver curses** or **-driver slang** to force terminal output. Performance depends on terminal emulator capabilities and may vary across different systems.

# HISTORY

**aafire** is part of the aalib (ASCII Art Library) created by **Jan Hubicka** in the late **1990s**. The library was developed to enable ASCII art rendering for various applications and became popular for its creative approach to displaying graphics in text-only environments. It gained wider recognition through projects like MPlayer which used aalib to play video as ASCII art.

# SEE ALSO

[bb](/man/bb)(1), [aview](/man/aview)(1), [asciiview](/man/asciiview)(1), [cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1)
