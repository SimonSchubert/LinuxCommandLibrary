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

**presenterm** runs terminal presentations from Markdown. TUI presenter.

The tool renders slides in terminal. Supports syntax highlighting.

presenterm presents Markdown.

# CAVEATS

Terminal-based only. Markdown format required.

# HISTORY

presenterm was created for **terminal-based** Markdown presentations.

# SEE ALSO

[mdp](/man/mdp)(1), [slides](/man/slides)(1)

