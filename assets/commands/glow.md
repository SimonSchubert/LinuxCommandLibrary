# TLDR

**Render markdown file**

```glow [README.md]```

**Render with pager**

```glow -p [file.md]```

**Render from stdin**

```cat [file.md] | glow```

**Set width**

```glow -w [80] [file.md]```

**Browse local files**

```glow```

# SYNOPSIS

**glow** [_options_] [_file_]

# PARAMETERS

_FILE_
> Markdown file to render.

**-p**, **--pager**
> Use pager for output.

**-w** _WIDTH_, **--width** _WIDTH_
> Word wrap width.

**-s** _STYLE_, **--style** _STYLE_
> Style name (dark, light, etc.).

**--help**
> Display help information.

# DESCRIPTION

**glow** renders markdown in the terminal with syntax highlighting and formatting. It displays markdown documents beautifully without leaving the command line.

The tool supports various styles and can browse markdown files interactively. It handles GitHub Flavored Markdown including tables and code blocks.

glow provides beautiful markdown rendering in the terminal.

# CAVEATS

Terminal must support colors. Some features need true color support. Images not rendered.

# HISTORY

glow was created by **Charm** as part of their suite of terminal tools, bringing beautiful markdown rendering to the command line.

# SEE ALSO

[mdcat](/man/mdcat)(1), [bat](/man/bat)(1)
