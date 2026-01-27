# TLDR

**Open help browser**

```yelp```

**Open specific help document**

```yelp [help:gnome-terminal]```

**Open man page**

```yelp [man:ls]```

**Open info page**

```yelp [info:bash]```

**Open local file**

```yelp [file:///usr/share/doc/package/manual.html]```

**Open Mallard documentation**

```yelp [ghelp:gedit]```

# SYNOPSIS

**yelp** [_options_] [_uri_]

# PARAMETERS

**--help**
> Display help options.

**--version**
> Display version.

# URI SCHEMES

**help:**: GNOME help documentation.

**ghelp:**: Legacy GNOME help (DocBook).

**man:**: System manual pages.

**info:**: GNU info pages.

**file://**: Local HTML files.

# DESCRIPTION

**yelp** is the GNOME help browser, providing a unified interface for viewing various documentation formats. It supports Mallard, DocBook, man pages, info pages, and HTML documentation.

The application integrates with GNOME applications; pressing F1 in most GNOME apps launches yelp with the relevant help. It features interactive search, bookmarks, and navigation history.

Yelp uses XSLT to render XML documentation as HTML. The freedesktop.org help system specification ensures consistent help access across GNOME applications.

# CAVEATS

GNOME-centric; other desktops may have different help systems. Some documentation requires specific packages installed. Search indexes may need rebuilding after updates.

# HISTORY

**yelp** was created as the standard help browser for GNOME. The name was suggested by Daniel Lundin. It has evolved alongside GNOME, supporting the transition from DocBook to Mallard as the primary documentation format.

# SEE ALSO

[man](/man/man)(1), [info](/man/info)(1), [devhelp](/man/devhelp)(1)
