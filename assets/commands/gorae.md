# TAGLINE

TUI librarian for PDFs and EPUBs

# TLDR

**Open** library browser

```gorae```

**Open** a specific library directory

```gorae --root [path/to/books]```

**Upgrade** an existing config file and exit

```gorae --migrate-config```

# SYNOPSIS

**gorae** [_options_]

# PARAMETERS

**--root** _DIR_
> Root directory to start in, overriding the configured watch_dir.

**--migrate-config**
> Upgrade an existing config file and exit.

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**gorae** is a keyboard-focused terminal knowledge base for PDF, EPUB, and Markdown documents. It combines file browsing, metadata, notes, full-text search, and an optional AI assistant in one interface.

Documents stay as ordinary files in a watched folder, so there is no import step. Metadata and the search index are stored locally. The tool can fetch metadata via DOI and arXiv detection, show first-page previews in supported terminals, and copy BibTeX entries. Library actions such as indexing are run from inside the TUI using **:** commands.

# CONFIGURATION

**~/.config/gorae/config.json**
> Main configuration, including watch_dir, editor, and pdf_viewer. Open it with **:config**.

**~/.local/share/gorae**
> Metadata, notes, and database.

# KEYBINDINGS

**j/k**
> Navigate items

**l**, **Enter**
> Enter a directory or open a document

**h**
> Go up a directory

**Tab**, **Shift+Tab**
> Switch tab (Library, Recent, Reading, To Read, Added, Unread, Read)

**Space**
> Select

**/**
> Search; supports **-t** title, **-a** author, **-y** year, **-c** full-text, and **--tag**

**t**
> Add to the to-read queue

**r**
> Cycle reading state

**e**
> Edit metadata

**D**
> Delete (confirm with **y**)

**:index**
> Build the full-text index

**:gorae**
> Open the AI chat

**:help**
> Show help

**q**
> Quit

# CAVEATS

Requires an external viewer for reading. PDF features use the Poppler tools (**pdftotext**, **pdfinfo**, **pdftocairo**). Image previews depend on terminal capabilities. AI features need Ollama or an OpenAI-compatible provider. Under active development, so the interface may change.

# HISTORY

**gorae** is written in **Go** and developed by **Han8931**.

# INSTALL

```aur: yay -S gorae```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[zathura](/man/zathura)(1), [pdftotext](/man/pdftotext)(1)

# RESOURCES

```[Source code](https://github.com/Han8931/gorae)```

```[Documentation](https://github.com/Han8931/gorae/blob/main/docs/user-guide.md)```

<!-- verified: 2026-11-09 -->
