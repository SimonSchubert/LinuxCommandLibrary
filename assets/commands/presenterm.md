# TAGLINE

Terminal-based Markdown slide presenter

# TLDR

**Start presentation**

```presenterm [presentation.md]```

**Present with specific theme**

```presenterm --theme [dark] [presentation.md]```

**Export to PDF**

```presenterm --export-pdf [presentation.md]```

**Live reload mode**

```presenterm --watch [presentation.md]```

# SYNOPSIS

**presenterm** [_options_] _file_

# PARAMETERS

_FILE_
> Markdown presentation file.

**--theme** _NAME_
> Presentation theme.

**--export-pdf**
> Export to PDF.

**--watch**
> Auto-reload on changes.

**-e**, **--execute**
> Enable code execution.

# DESCRIPTION

**presenterm** is a terminal-based presentation tool that renders Markdown files as slide decks directly in the terminal. Slides are separated by horizontal rules in the Markdown source, and the tool supports syntax-highlighted code blocks, images (in supported terminals), and multiple built-in themes.

Watch mode automatically reloads the presentation when the source file changes, enabling a live editing workflow. Slides can also be exported to PDF for sharing outside the terminal.

# CAVEATS

Terminal-based only. Markdown format required.

# HISTORY

presenterm was created for **terminal-based** Markdown presentations.

# SEE ALSO

[mdp](/man/mdp)(1), [slides](/man/slides)(1)

