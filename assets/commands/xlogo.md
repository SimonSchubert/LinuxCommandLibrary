# TLDR

**Display X logo**

```xlogo```

**Display with anti-aliased rendering**

```xlogo -render```

**Display with shaped (non-rectangular) window**

```xlogo -shape```

**Display with custom colors**

```xlogo -fg [blue] -bg [white]```

**Display with specific geometry**

```xlogo -geometry [200x200+100+100]```

**Display on remote display**

```xlogo -display [hostname:0]```

# SYNOPSIS

**xlogo** [_options_]

# PARAMETERS

**-render**
> Use RENDER extension for anti-aliased edges.

**-shape**
> Use non-rectangular window shape.

**-fg** _color_
> Foreground color (logo color).

**-bg** _color_
> Background color.

**-geometry** _geom_
> Window size and position.

**-display** _name_
> X display to use.

# DESCRIPTION

**xlogo** displays the X Window System logo in a window. It's a minimal X11 application used primarily for testing X server connectivity and verifying that display forwarding is working.

The program serves as a "hello world" equivalent for X11, making it useful for quickly testing if X is running and accessible. If xlogo fails to open, it indicates problems with the X server, DISPLAY variable, or network configuration.

With -render, the logo uses anti-aliased edges for smoother appearance. The -shape option creates a window that matches the logo outline rather than a rectangular window.

# CAVEATS

Minimal functionality by design. Requires running X server and correct DISPLAY setting. Legacy application; modern testing might use other methods.

# HISTORY

**xlogo** has been part of the X Window System since its early days, providing a simple visual test of X server functionality. Despite its simplicity, it remains useful for basic X11 connectivity testing and demonstrating X11 concepts.

# SEE ALSO

[xeyes](/man/xeyes)(1), [xclock](/man/xclock)(1), [xterm](/man/xterm)(1), [xdpyinfo](/man/xdpyinfo)(1)
