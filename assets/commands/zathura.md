# TLDR

**Open** file

```zathura [path/to/file]```

# SYNOPSIS

**zathura** [_OPTIONS_] [_FILE_]

# PARAMETERS

**h/j/k/l or Arrow keys**
> Navigate left/up/down/right

**r**
> Rotate document

**Ctrl+r**
> Invert colors

**/**
> Search for text

**:bmark** _NAME_
> Create bookmark

**:bdelete** _NAME_
> Delete bookmark

**:blist**
> List bookmarks

**+, -**
> Zoom in/out

**a**
> Fit to width

# DESCRIPTION

**zathura** is a Vim-like modal document viewer. It supports PDF, PostScript, DjVu, and other formats through backends.

The viewer features keyboard-driven navigation, bookmarks, and an integrated command line.

# CAVEATS

Requires backend plugins (poppler for PDF, etc.). Vim-style keybindings may have learning curve.

# SEE ALSO

[evince](/man/evince)(1), [okular](/man/okular)(1), [mupdf](/man/mupdf)(1)
