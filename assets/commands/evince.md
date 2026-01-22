# TLDR

**Open** a PDF file

```evince [path/to/file.pdf]```

Open **multiple** documents

```evince [file1.pdf] [file2.pdf]```

Open in **fullscreen** mode

```evince [-f|--fullscreen] [path/to/file.pdf]```

Open in **presentation** mode

```evince [-s|--presentation] [path/to/file.pdf]```

Open a specific **page** number

```evince [-i|--page-index] [5] [path/to/file.pdf]```

# SYNOPSIS

**evince** [_options_] [_files_]

# DESCRIPTION

**evince** is the GNOME document viewer supporting PDF, PostScript, DjVu, TIFF, and other formats. It provides annotation support, form filling, and presentation mode.

Integrates with GNOME desktop services for printing and file management.

# PARAMETERS

**-f, --fullscreen**
> Open in fullscreen mode

**-s, --presentation**
> Open in presentation mode

**-i, --page-index** _page_
> Open at specific page

**-l, --page-label** _label_
> Open at page with label

**-w, --preview**
> Run in preview mode

# CAVEATS

GNOME desktop application. Some features require poppler library. Large documents may consume significant memory.

# SEE ALSO

[okular](/man/okular)(1), [zathura](/man/zathura)(1), [xdg-open](/man/xdg-open)(1)
