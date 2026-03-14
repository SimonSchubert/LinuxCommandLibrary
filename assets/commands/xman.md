# TAGLINE

Graphical manual page viewer

# TLDR

**Start** xman

```xman```

Open **file**

```xman -helpfile [filename]```

Show **both** panes

```xman -bothshown```

# SYNOPSIS

**xman** [_OPTIONS_]

# PARAMETERS

**-helpfile** _FILE_
> Use specified helpfile instead of the default

**-bothshown**
> Show both directory and manual page panes simultaneously

**-notopbox**
> Start without the top menu box with the three buttons

**-geometry** _WxH+X+Y_
> Set size and location of the top menu window

**-pagesize** _WxH+X+Y_
> Set size and location of manual page windows

# DESCRIPTION

**xman** is a manual page browser for the X Window System. It provides a graphical interface to man pages with a directory listing of available pages organized by section. The initial window is intentionally small so it can be left running throughout a login session. Pressing Control-S opens a prompt for a specific manual page to display.

The **MANPATH** environment variable controls the search path for manual pages.

# HISTORY

**xman** is one of the original X11 utilities, providing a GUI alternative to the terminal-based man command.

# CAVEATS

X11 only. Interface is dated compared to modern alternatives. Limited search capabilities.

# SEE ALSO

[man](/man/man)(1), [info](/man/info)(1), [yelp](/man/yelp)(1)
