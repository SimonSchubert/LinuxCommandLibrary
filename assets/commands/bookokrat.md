# TAGLINE

Terminal EPUB and PDF reader

# TLDR

**Open** an EPUB file

```bookokrat [path/to/book.epub]```

**Open** a PDF file

```bookokrat [path/to/book.pdf]```

# SYNOPSIS

**bookokrat** [_options_] _file_

# DESCRIPTION

**bookokrat** is a terminal-based ebook reader that supports **EPUB** and **PDF** formats. It renders book content directly in the terminal with text reflow, providing a distraction-free reading experience without a graphical environment.

The reader supports navigation by chapters, page scrolling, and bookmarking your reading position. It handles text extraction and layout within the constraints of a terminal interface.

# CAVEATS

Complex layouts, images, and rich formatting in PDFs may not render well in a text-only environment. Best suited for text-heavy books. EPUB support is generally better than PDF due to the reflowable nature of the format.

# SEE ALSO

[zathura](/man/zathura)(1), [mupdf](/man/mupdf)(1), [epr](/man/epr)(1)
