# TAGLINE

Terminal EPUB, PDF and DJVU book reader

# TLDR

**Open** an EPUB file

```bookokrat [path/to/book.epub]```

**Open** a PDF file

```bookokrat [path/to/book.pdf]```

**Open** a DJVU file

```bookokrat [path/to/book.djvu]```

**Open** a book in **zen mode** (distraction-free reading)

```bookokrat --zen-mode [path/to/book.epub]```

# SYNOPSIS

**bookokrat** [_--zen-mode_] [_file_]

# PARAMETERS

**--zen-mode**
> Launch in zen mode with sidebar and status bar hidden for distraction-free reading.

# DESCRIPTION

**bookokrat** is a terminal-based ebook reader that supports **EPUB**, **PDF**, and **DJVU** formats. It renders book content directly in the terminal with full HTML rendering, inline images, and MathML support, providing a distraction-free reading experience without a graphical environment.

The reader features Vim-style keybindings, split-view layout with library/table of contents and reader panels, search, bookmarks, jump list history, inline annotations, and reading statistics. Press **?** inside the app to open the built-in help.

# CAVEATS

Complex layouts and rich formatting in PDFs may not render well in a text-only environment. Best suited for text-heavy books. EPUB support is generally better than PDF due to the reflowable nature of the format.

# SEE ALSO

[zathura](/man/zathura)(1), [mupdf](/man/mupdf)(1), [calibre](/man/calibre)(1)
