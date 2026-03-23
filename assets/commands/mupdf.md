# TAGLINE

lightweight PDF, XPS, and EPUB viewer

# TLDR

**Open PDF file**

```mupdf [document.pdf]```

**Open at specific page**

```mupdf [document.pdf] [page_number]```

**Open with custom resolution** (DPI)

```mupdf -r [150] [document.pdf]```

**Open password-protected PDF**

```mupdf -p [password] [document.pdf]```

**Open EPUB with custom layout**

```mupdf -W [600] -H [800] -S [14] [book.epub]```

# SYNOPSIS

**mupdf** [_options_] _file_ [_page_]

# PARAMETERS

**-p** _password_
> Password for encrypted PDFs.

**-r** _resolution_
> Set zoom level via DPI (default: 72).

**-A** _bits_
> Anti-aliasing quality, 0-8 (default: 8).

**-C** _RRGGBB_
> White tint color in hex (default: FFFFF0).

**-B** _RRGGBB_
> Black tint color in hex (default: 303030).

**-W** _width_
> Page width in points for EPUB layout.

**-H** _height_
> Page height in points for EPUB layout.

**-S** _size_
> Font size in points for EPUB layout.

**-U** _CSS-file_
> User stylesheet for EPUB rendering.

**-I**
> Invert display colors.

**-J**
> Disable JavaScript in PDF forms.

**-X**
> Disable EPUB document styles.

# KEY BINDINGS

**q**
> Quit.

**+/-**
> Zoom in/out.

**W**
> Fit page width.

**H**
> Fit page height.

**Z**
> Auto-fit page.

**Space/PgDn**
> Next page.

**b/PgUp**
> Previous page.

**_number_ g**
> Go to page number.

**G**
> Go to last page.

**/**
> Search forward.

**?**
> Search backward.

**n/N**
> Next/previous search result.

**r**
> Reload document.

**i**
> Toggle ICC color management.

**[/]**
> Rotate left/right.

**f**
> Toggle fullscreen.

**h/j/k/l**
> Scroll left/down/up/right.

# DESCRIPTION

**mupdf** is a lightweight PDF, XPS, and EPUB viewer. It renders documents with high quality using anti-aliased graphics.

The viewer focuses on speed and simplicity. Documents render quickly even with complex graphics. Memory usage remains low compared to full-featured readers.

Navigation uses keyboard shortcuts similar to vi. Page jumping, searching, and zooming are all keyboard-accessible. Mouse scrolling and dragging also work.

The rendering engine handles transparency, gradients, and embedded fonts correctly. It supports PDF features including annotations, forms, and JavaScript (limited).

Color inversion helps with reading in low light. The viewer remembers zoom level and page position when reopening documents.

# CAVEATS

Minimal UI - no toolbar or menus. Form filling is basic. JavaScript support limited. No annotation editing. Some PDFs may render differently than Adobe Reader.

# HISTORY

**MuPDF** was developed by **Artifex Software**, the maintainers of Ghostscript, starting around **2006**. It was designed as a lightweight, high-quality renderer. The viewer (mupdf) is the reference application for the MuPDF library, which is used in many other projects including Sumatra PDF.

# SEE ALSO

[zathura](/man/zathura)(1), [evince](/man/evince)(1), [okular](/man/okular)(1), [xpdf](/man/xpdf)(1), [mutool](/man/mutool)(1)
