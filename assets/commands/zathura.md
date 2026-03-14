# TAGLINE

Vim-like modal document viewer

# TLDR

**Open** a document

```zathura [path/to/file]```

Open a document at a specific **page**

```zathura -P [page_number] [path/to/file]```

Open and **fork** into the background

```zathura --fork [path/to/file]```

Open with a **password-protected** document

```zathura --password [password] [path/to/file]```

# SYNOPSIS

**zathura** [_OPTIONS_] [_FILE_...]

# PARAMETERS

**-P**, **--page** _NUM_
> Open document at given page number (starting from 1, negative from end).

**--fork**
> Fork into the background.

**--password** _PASSWORD_
> Provide the document password.

**-e** _XID_, **--reparent** _XID_
> Reparent to window specified by XID.

**h/j/k/l or Arrow keys**
> Navigate left/up/down/right.

**J/K or PgDn/PgUp**
> Go to next/previous page.

**r**
> Rotate document.

**Ctrl+r**
> Invert colors (recolor mode).

**/**
> Search for text.

**n/N**
> Search next/previous result.

**d**
> Toggle dual page view.

**F5**
> Switch to presentation mode.

**F11**
> Toggle fullscreen.

**:bmark** _NAME_
> Create bookmark.

**:bdelete** _NAME_
> Delete bookmark.

**:blist**
> List bookmarks.

**+, -**
> Zoom in/out.

**a**
> Fit to width.

**s**
> Fit to page.

# DESCRIPTION

**zathura** is a Vim-like modal document viewer. It supports PDF, PostScript, DjVu, and other formats through backends.

The viewer features keyboard-driven navigation, bookmarks, and an integrated command line.

# CAVEATS

Requires backend plugins (poppler or mupdf for PDF, etc.). Configuration via ~/.config/zathura/zathurarc. Vim-style keybindings may have a learning curve.

# SEE ALSO

[evince](/man/evince)(1), [okular](/man/okular)(1), [mupdf](/man/mupdf)(1)
