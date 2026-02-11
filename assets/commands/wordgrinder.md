# TAGLINE

Terminal word processor for focused writing

# TLDR

**Start WordGrinder**

```wordgrinder```

**Open document**

```wordgrinder [document.wg]```

**Import file**

```wordgrinder --import=[file.txt]```

**Export to format**

```wordgrinder --export=[output.html]```

# SYNOPSIS

**wordgrinder** [_--import file_] [_--export file_] [_document_]

# PARAMETERS

**--import** _FILE_
> Import document.

**--export** _FILE_
> Export document.

_document_
> Open document.

# KEY BINDINGS

**Ctrl+S** - Save
**Ctrl+O** - Open
**Ctrl+Q** - Quit
**Ctrl+F** - Find
**Ctrl+R** - Replace
**Ctrl+K** - Style menu
**F1** - Help

# DESCRIPTION

**wordgrinder** is a terminal-based word processor designed for focused, distraction-free writing. It emphasizes content over appearance, providing document structure through styles like headings, paragraphs, and lists rather than visual formatting controls.

Documents are saved in the native .wg format that preserves full structure, and can be exported to HTML, LaTeX, Markdown, ODT, and plain text. The full-screen editing environment keeps attention on the writing itself, with keyboard shortcuts for navigation and style changes.

# CAVEATS

Terminal-based, no WYSIWYG. Limited formatting. Specific to prose writing.

# HISTORY

**WordGrinder** was created for focused terminal writing. It provides a distraction-free word processing environment.

# SEE ALSO

[vim](/man/vim)(1), [nano](/man/nano)(1), [joe](/man/joe)(1)
