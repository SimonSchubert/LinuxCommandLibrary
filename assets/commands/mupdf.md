# TLDR

**Open PDF file**

```mupdf [document.pdf]```

**Open at specific page**

```mupdf [document.pdf] [page_number]```

**Open XPS file**

```mupdf [document.xps]```

**Open EPUB file**

```mupdf [book.epub]```

# SYNOPSIS

**mupdf** [_options_] _file_ [_page_]

# KEY BINDINGS

**q**
> Quit.

**+/-** or **z/Z**
> Zoom in/out.

**w**
> Fit width.

**H**
> Fit height.

**PgDn/Space**
> Next page.

**PgUp/Backspace**
> Previous page.

**g**
> Go to page (enter number).

**/**
> Search forward.

**?**
> Search backward.

**n/N**
> Next/previous search result.

**r**
> Reload document.

**i**
> Invert colors.

**f**
> Toggle fullscreen.

**h/j/k/l**
> Scroll view.

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
