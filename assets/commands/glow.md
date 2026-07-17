# TAGLINE

terminal markdown renderer

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

**Fetch and render a GitHub README**

```glow github.com/charmbracelet/glow```

**Read from stdin**

```cat [file.md] | glow -```

**Edit the config file**

```glow config```

# SYNOPSIS

**glow** [_options_] [_source_]

**glow** **config**

# PARAMETERS

_SOURCE_
> Markdown file, directory, GitHub/GitLab repo, or HTTP(S) URL to render. Reads stdin when given as `-`.

**-p**, **--pager**
> Display output in the configured pager (defaults to `less -r`).

**-w** _WIDTH_, **--width** _WIDTH_
> Word wrap width. Defaults to the terminal width.

**-s** _STYLE_, **--style** _STYLE_
> Style name (`auto`, `dark`, `light`) or a path to a custom JSON style file.

**-a**, **--all**
> Show system files and hidden directories (TUI mode only).

**-l**, **--local**
> Show local files only, disabling network sources (TUI mode only).

**--config** _FILE_
> Use an alternate configuration file.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**glow** renders markdown in the terminal with syntax highlighting and formatting. It displays markdown documents beautifully without leaving the command line.

The tool supports various styles and can browse markdown files interactively, including fetching README files straight from GitHub or GitLab repositories or arbitrary HTTP(S) URLs. It handles GitHub Flavored Markdown including tables and code blocks. Running **glow** with no arguments launches a TUI file browser.

# CONFIGURATION

**~/.config/glow/glow.yml**
> Configuration file for default style, width, and pager settings.

# CAVEATS

Terminal must support colors. Some features need true color support. Images not rendered.

# HISTORY

glow was created by **Charm** as part of their suite of terminal tools, bringing beautiful markdown rendering to the command line.

# SEE ALSO

[mdcat](/man/mdcat)(1), [bat](/man/bat)(1)

# RESOURCES

```[Source code](https://github.com/charmbracelet/glow)```

<!-- verified: 2026-07-17 -->
