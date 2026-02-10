# TAGLINE

generates keyboard modifier mappings

# TLDR

**Generate modmap**

```mk_modmap```

**Output to file**

```mk_modmap > [modmap.txt]```

**With specific display**

```mk_modmap -display [host:0]```

# SYNOPSIS

**mk_modmap** [_options_]

# PARAMETERS

**-display** _DISPLAY_
> X display to query.

**--help**
> Display help information.

# DESCRIPTION

**mk_modmap** generates keyboard modifier mappings. It outputs xmodmap format for X11.

The tool reads current keyboard configuration and creates a modmap file for backup or transfer.

# CAVEATS

X11 specific. Output for xmodmap. Keyboard configuration only.

# HISTORY

mk_modmap is an **X11** utility for extracting keyboard modifier mappings to xmodmap format.

# SEE ALSO

[xmodmap](/man/xmodmap)(1), [xev](/man/xev)(1), [setxkbmap](/man/setxkbmap)(1)

