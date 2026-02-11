# TAGLINE

Display fullscreen text messages

# TLDR

Display a **message** fullscreen

```sm "Hello World!"```

Display with **inverted colors**

```sm -i "Hello World!"```

Custom **foreground color**

```sm -f blue "Hello World!"```

Custom **background color**

```sm -b "#008888" "Hello World!"```

**Rotate** display (90 degree increments)

```sm -r 3 "Hello World!"```

Display from **pipe** input

```echo "Hello World!" | sm -```

**Kiosk mode** (non-interactive)

```sm -k "Message"```

# SYNOPSIS

**sm** [_OPTIONS_] [_text_|-]

# PARAMETERS

**-f, --foreground** _color_
> Set text color (name or hex code like #RRGGBB)

**-b, --background** _color_
> Set background color

**-i, --invert**
> Swap foreground and background colors

**-r, --rotate** _n_
> Rotate display (n * 90 degrees counterclockwise)

**-k, --kiosk**
> Non-interactive mode (ignores input except Ctrl-Q)

**-n, --font** _fontspec_
> Specify font family

**-a, --align** _alignment_
> Text alignment: 0=center, 1=left, 2=right

**-m, --markup**
> Enable Pango markup XML formatting

**-**
> Read text from standard input

**-h, --help**
> Display help

**-V, --version**
> Display version

# DESCRIPTION

**sm** (screen-message) displays text as large as possible on the screen, automatically scaling to fill the available space. It creates a fullscreen window with the message, useful for presentations, signage, or displaying information at events.

In interactive mode, users can edit the displayed text by typing. Press **Escape** to clear text, **Ctrl-I** to invert colors, and **Ctrl-Q** or double-Escape to quit. When reading from stdin with **-**, the display updates at form-feed characters (\f).

# CAVEATS

Requires a graphical display (X11 or Wayland). Text size adjusts automatically; very long messages result in smaller fonts. Interactive editing is disabled in kiosk mode. Font availability depends on system installation.

# HISTORY

**sm** (screen-message) was created by **Joachim Breitner** (nomeata) as a simple display utility. It has been used at Debian conferences and other events for photo displays and signage. The tool is available for Linux, Windows, and as a web application. Released under GPL-2.0 license.

# SEE ALSO

[figlet](/man/figlet)(6), [toilet](/man/toilet)(1), [banner](/man/banner)(1)
