# TAGLINE

Minimalistic Vim-like TUI document reader

# TLDR

**Read a PDF file**

```hygg [path/to/document.pdf]```

**Read an EPUB file**

```hygg [path/to/book.epub]```

**Read a DOCX file**

```hygg [path/to/document.docx]```

# SYNOPSIS

**hygg** [_options_] _file_

# DESCRIPTION

**hygg** is a minimalistic terminal document reader with **Vim-inspired** keybindings. It supports universal document formats including **PDF**, **EPUB**, **DOCX**, and many more via **pandoc** integration. The reader provides smart text justification formatted for terminal width, powerful search with highlighting, bookmarks, and automatic progress saving.

Hygg is built with a pipeline architecture where individual components (converters, justifier) can be reused as standalone Unix CLI utilities. It runs locally and respects privacy, with optional self-hosted sync support.

# KEY BINDINGS

**j/k** — Scroll down/up
**g/G** — Go to top/bottom
**/** — Search
**n/N** — Next/previous search result
**m** — Set bookmark
**q** — Quit

# CAVEATS

Some formats require **pandoc** to be installed for conversion. Complex document layouts (tables, images) may not render perfectly in the terminal. Large documents may take a moment to convert on first open.

# HISTORY

**hygg** was created by **kruseio** and is written in **Rust**. The name evokes the Danish/Norwegian concept of "hygge" (coziness), reflecting its focus on a comfortable reading experience in the terminal.

# SEE ALSO

[less](/man/less)(1), [bat](/man/bat)(1), [glow](/man/glow)(1)
