# TAGLINE

Compile XKB keyboard descriptions

# TLDR

**Compile keymap for current display**

```xkbcomp [keymap.xkb] $DISPLAY```

**Extract current keymap to file**

```xkbcomp $DISPLAY [output.xkb]```

**Compile to binary keymap file**

```xkbcomp -xkm [keymap.xkb] -o [keymap.xkm]```

**Generate C header from keymap**

```xkbcomp -C [keymap.xkb] -o [keymap.h]```

**Compile with additional include path**

```xkbcomp -I[/usr/share/X11/xkb] [keymap.xkb] $DISPLAY```

**Verbose compilation**

```xkbcomp -v 10 [keymap.xkb] $DISPLAY```

# SYNOPSIS

**xkbcomp** [_options_] _source_ [_destination_]

# PARAMETERS

**-xkb**
> Output XKB source format.

**-xkm**
> Output compiled binary format.

**-C**
> Output C header file.

**-I** _dir_
> Add directory to include search path.

**-o** _file_
> Specify output file name.

**-v** _level_
> Set verbosity level (0-10).

**-w** _level_
> Set warning level.

**-dflts**
> Compute defaults for missing components.

# DESCRIPTION

**xkbcomp** compiles XKB (X Keyboard Extension) keyboard descriptions into binary format or uploads them directly to an X server. It's the core tool for customizing keyboard layouts beyond what setxkbmap provides.

The tool can extract the current keymap from a running X server, modify it, and upload changes. Output formats include XKB source (.xkb), compiled binary (.xkm), and C headers for embedding in applications.

XKB provides advanced keyboard features including multiple layouts, dead keys, compose sequences, modifier handling, and accessibility options that simpler tools like xmodmap cannot achieve.

# CAVEATS

Complex syntax requires understanding XKB architecture. Without $DISPLAY, only creates files without loading. Errors can leave keyboard in unusable state; keep backup layout accessible.

# HISTORY

**xkbcomp** is part of the X Keyboard Extension (XKB), introduced in X11R6 to replace the limited keyboard handling of earlier X versions. XKB provides a comprehensive framework for keyboard configuration that supports internationalization and accessibility features.

# SEE ALSO

[setxkbmap](/man/setxkbmap)(1), [xkbevd](/man/xkbevd)(1), [xmodmap](/man/xmodmap)(1), [xev](/man/xev)(1)
