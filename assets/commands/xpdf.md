# TLDR

**Open PDF file**

```xpdf [document.pdf]```

**Open at specific page**

```xpdf [document.pdf] [5]```

**Set initial zoom**

```xpdf -z [150] [document.pdf]```

**Full screen mode**

```xpdf -fullscreen [document.pdf]```

**Open with password**

```xpdf -opw [owner_password] [document.pdf]```

**Remote control mode**

```xpdf -remote [name] [document.pdf]```

# SYNOPSIS

**xpdf** [_-z zoom_] [_-fullscreen_] [_-opw password_] [_options_] _file.pdf_ [_page_]

# PARAMETERS

**-z** _ZOOM_
> Initial zoom (percent, page, width).

**-fullscreen**
> Full screen mode.

**-opw** _PASSWORD_
> Owner password.

**-upw** _PASSWORD_
> User password.

**-remote** _NAME_
> Start in remote mode.

**-g** _GEOMETRY_
> Window geometry.

**-papercolor** _COLOR_
> Paper background color.

**-mattecolor** _COLOR_
> Matte color.

**-cfg** _FILE_
> Config file.

**-v**
> Show version.

**-h**
> Show help.

# KEY BINDINGS

**n**, **Space**, **PgDn**
> Next page.

**p**, **Backspace**, **PgUp**
> Previous page.

**+**, **-**
> Zoom in/out.

**z**
> Zoom to page.

**w**
> Zoom to width.

**/**
> Search forward.

**?**
> Search backward.

**q**
> Quit.

# DESCRIPTION

**xpdf** is a lightweight PDF viewer for X11. It renders PDF documents with minimal resource usage.

The viewer provides basic PDF functionality: navigation, zoom, search, and printing. It handles most standard PDF features.

Remote mode enables control from scripts. Commands sent to the named instance open files, navigate, and control display.

Configuration through ~/.xpdfrc customizes appearance and behavior. Font paths, colors, and key bindings are adjustable.

The xpdf package includes command-line tools: pdftotext, pdftops, pdfinfo, and pdfimages. These are widely used independent of the viewer.

# CAVEATS

Fewer features than Evince or Okular. Some modern PDF features may not render. X11 only. Development slower than alternatives.

# HISTORY

**xpdf** was created by **Derek Noonburg** starting in **1995**. It was one of the first open-source PDF viewers and spawned the Poppler library used by many modern viewers.

# SEE ALSO

[evince](/man/evince)(1), [okular](/man/okular)(1), [mupdf](/man/mupdf)(1), [zathura](/man/zathura)(1)
