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
> Open manual page from file

**-bothshown**
> Show both directory and manual page panes

**-notopbox**
> Start without top menu box

**-geometry** _WxH+X+Y_
> Window geometry

# DESCRIPTION

**xman** is a graphical manual page viewer for the X Window System. It provides a browsable interface to man pages with a directory listing of available pages.

The interface includes navigation through manual sections and search functionality.

# HISTORY

**xman** is one of the original X11 utilities, providing a GUI alternative to the terminal-based man command.

# CAVEATS

X11 only. Interface is dated compared to modern alternatives. Limited search capabilities.

# SEE ALSO

[man](/man/man)(1), [info](/man/info)(1), [yelp](/man/yelp)(1)
