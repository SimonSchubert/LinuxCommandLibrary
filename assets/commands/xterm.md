# TLDR

Open terminal with a **title**

```xterm -T [Example]```

Open terminal in **fullscreen** mode

```xterm -fullscreen```

Open with **custom colors** (dark blue background, yellow text)

```xterm -bg darkblue -fg yellow```

Open with specific **geometry** (100x35 characters at position 200,20)

```xterm -geometry 100x35+200+20```

Open using a **specific font** and size

```xterm -fa '[Serif]' -fs 20```

# SYNOPSIS

**xterm** [**-toolkitoption** ...] [**-option** ...] [_shell_]

# PARAMETERS

**-T** _string_
> Set window title

**-geometry** _WxH+X+Y_
> Set window size and position

**-bg** _color_
> Background color

**-fg** _color_
> Foreground (text) color

**-fa** _font_
> TrueType font face name

**-fs** _size_
> TrueType font size in points

**-fn** _font_
> Bitmap font name

**-fullscreen**
> Start in fullscreen mode

**-rv**
> Reverse video (swap foreground/background)

**-sb**
> Enable scrollbar

**-sl** _lines_
> Number of lines to save in scrollback

**-e** _program_ [_args_]
> Run program instead of shell

**-hold**
> Keep window open after command exits

**-class** _class_
> X resource class name

# DESCRIPTION

**xterm** is the standard terminal emulator for the X Window System, providing a text terminal interface within a graphical environment. It supports VT102, VT220, and Tektronix 4014 terminal emulation with extensive customization options.

Features include multiple fonts, configurable colors, scrollback buffer, selection and paste, Tektronix graphics mode, and full internationalization support. Configuration can be done via command line, X resources, or the control menus (Ctrl+click).

# CAVEATS

Requires X11 display. Default appearance is deliberately minimal; extensive customization via ~/.Xresources is common. Some modern features (like 256 colors) require specific resource settings. Font configuration differs between bitmap and TrueType fonts.

# HISTORY

Originally written by Mark Vandevoorde at MIT as part of **Project Athena** in the mid-1980s, becoming part of the X Window System distribution. One of the oldest continuously maintained X applications. Thomas Dickey has been the primary maintainer since **1996**.

# SEE ALSO

[uxterm](/man/uxterm)(1), [konsole](/man/konsole)(1), [gnome-terminal](/man/gnome-terminal)(1)
