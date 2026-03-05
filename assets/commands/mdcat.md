# TAGLINE

Cat for Markdown with terminal rendering

# TLDR

**Render a Markdown file**

```mdcat [path/to/file.md]```

**Render Markdown from stdin**

```echo "# Hello" | mdcat```

**Paginate output**

```mdcat -p [path/to/file.md]```

# SYNOPSIS

**mdcat** [_options_] [_files_...]

# PARAMETERS

**-p**, **--paginate**
> Paginate output through a pager.

**--no-colour**
> Disable syntax highlighting and colours.

# DESCRIPTION

**mdcat** renders Markdown documents directly in the terminal with syntax highlighting for code blocks (via syntect), inline images in supported terminals, clickable links, and jump marks for headings in iTerm2.

It works best with iTerm2, WezTerm, and kitty, and supports most modern terminal emulators including Windows Terminal and anything based on VTE. If no files are specified, it reads from stdin.

# CAVEATS

Inline image support depends on the terminal emulator. Some terminals may only display links to images instead.

# HISTORY

**mdcat** was created by **swsnr** and is written in **Rust**.

# SEE ALSO

[glow](/man/glow)(1), [bat](/man/bat)(1), [mandown](/man/mandown)(1), [cat](/man/cat)(1)
