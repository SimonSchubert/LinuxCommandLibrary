# TAGLINE

Identify the color of a screen pixel by clicking on it

# TLDR

**Pick a color** by clicking a pixel and print its hex value

```grabc```

**Print** the picked color **as RGB components** on stderr

```grabc -rgb```

**Print** the **window id** at the mouse click instead of a color

```grabc -W```

**Read** the color of a known pixel **without clicking**, using a window id and coordinate

```grabc -w [window_id] -l +[x]+[y]```

**Print all 16 bits** of color depth instead of the default high-order 8

```grabc -a```

# SYNOPSIS

**grabc** [_options_]

# DESCRIPTION

**grabc** is a small X Window utility that reports the color of a screen pixel. When run with no arguments, the mouse pointer turns into a crosshair; clicking on any pixel prints that pixel's color as a hexadecimal string (prefixed with **#**) to standard output, while the equivalent RGB component values are written to standard error.

Because the hex value goes to stdout and the RGB value to stderr, the two can be captured independently in scripts, for example assigning the hex string to a shell variable while letting the RGB breakdown print to the terminal. This makes grabc convenient for sampling colors from any running application, wallpaper, or image to reuse in configuration files, themes, or drawing programs.

Given a window id and a pixel coordinate, grabc can also read a color non-interactively, which is useful for automation and testing.

# PARAMETERS

**-v**
> Show version information.

**-h**
> Show usage help.

**-hex**
> Print the pixel value as hexadecimal on stdout (default behavior).

**-rgb**
> Print the pixel value as RGB components on stderr.

**-W**
> Print the window id at the point of the mouse click.

**-w**  _id_
> Window id in hex; use together with **-l** to read a pixel non-interactively.

**-l**  _+x+y_
> Pixel coordinate to sample; requires a window id supplied with **-w**.

**-d**
> Show debug messages.

**-a**
> Print all 16 bits of color; the default reports only the high-order 8 bits.

# CAVEATS

grabc requires a running X11 server and links against Xlib, so it does not work on a pure Wayland session without an X compatibility layer such as XWayland. Reported values reflect what is actually drawn on screen, including any compositor effects, color profiles, or transparency blending, which can differ from a source image's nominal color.

# HISTORY

grabc was written by **Muhammad A Muquit** and first released on **March 16, 1997**. It remains a compact, single-purpose tool distributed as C source that builds against libX11.

# INSTALL

```apt: sudo apt install grabc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xprop](/man/xprop)(1), [xwininfo](/man/xwininfo)(1), [import](/man/import)(1), [convert](/man/convert)(1)

# RESOURCES

```[Source code](https://github.com/muquit/grabc)```

```[Homepage](https://www.muquit.com/muquit/software/grabc/grabc.html)```

<!-- verified: 2026-06-22 -->
