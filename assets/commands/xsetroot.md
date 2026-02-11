# TAGLINE

Set X root window appearance

# TLDR

**Set solid background color**

```xsetroot -solid [blue]```

**Set gray background**

```xsetroot -gray```

**Set background from bitmap**

```xsetroot -bitmap [pattern.xbm]```

**Create plaid pattern**

```xsetroot -mod [4] [4] -fg [red] -bg [white]```

**Set cursor by name**

```xsetroot -cursor_name [left_ptr]```

**Reset to defaults**

```xsetroot -def```

**Set root window name**

```xsetroot -name "[status text]"```

# SYNOPSIS

**xsetroot** [_options_]

# PARAMETERS

**-solid** _color_
> Set background to solid color.

**-gray**, **-grey**
> Set background to gray mesh pattern.

**-bitmap** _file_
> Tile background with bitmap file.

**-mod** _x_ _y_
> Create plaid pattern (x, y: 1-16).

**-fg**, **-foreground** _color_
> Foreground color for patterns.

**-bg**, **-background** _color_
> Background color for patterns.

**-rv**, **-reverse**
> Swap foreground and background colors.

**-cursor** _font_ _mask_
> Set cursor from font glyphs.

**-cursor_name** _name_
> Set cursor by standard X cursor name.

**-xcf** _file_ _size_
> Set cursor from Xcursor file.

**-def**, **-default**
> Reset to default settings.

**-name** _string_
> Set root window name property.

**-d**, **-display** _display_
> X server to connect to.

**-help**
> Display help.

**-version**
> Display version.

# DESCRIPTION

**xsetroot** configures the appearance of the X root window (desktop background). It can set solid colors, patterns, bitmap tiles, and the root window cursor.

The tool is commonly used in window manager startup scripts to set initial background appearance. Only one background option (-solid, -gray, -bitmap, or -mod) can be used at a time.

The -name option sets the root window's WM_NAME property, which some window managers use for status display (e.g., dwm displays it in the status bar).

For more sophisticated backgrounds, consider using tools like feh or nitrogen.

# CAVEATS

Bitmap files must be in XBM format. Colors use X color names or hex values (#RRGGBB). Some compositing window managers may override root window appearance. The -name option is used by dwm for status bar text.

# HISTORY

**xsetroot** has been part of the X Window System since early releases. It provides basic root window customization following the Unix philosophy of simple, focused tools. Many users now prefer more feature-rich tools like feh for wallpapers.

# SEE ALSO

[feh](/man/feh)(1), [nitrogen](/man/nitrogen)(1), [xwallpaper](/man/xwallpaper)(1), [hsetroot](/man/hsetroot)(1)
