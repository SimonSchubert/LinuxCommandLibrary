# TAGLINE

Styled terminal Markdown viewer

# TLDR

**View a Markdown file** with default theme

```mdv [path/to/file.md]```

**Pipe Markdown** from stdin

```echo "# Hello" | mdv -```

**Monitor a file** and redisplay on change

```mdv -m [path/to/file.md]```

**Render with a specific theme** (e.g. 729.8953 for a darker style)

```mdv -t [729.8953] [path/to/file.md]```

**Preview all available themes**

```mdv -t all [path/to/file.md]```

**Render without ANSI color** (plain text)

```mdv -A [path/to/file.md]```

**Fix the column width** to 80

```mdv -c [80] [path/to/file.md]```

**Render as HTML** instead of ANSI

```mdv -H [path/to/file.md]```

# SYNOPSIS

**mdv** [_options_] _MDFILE_

# PARAMETERS

**-A**
> Strip all ANSI escape codes; useful for piping to files or paging tools that don't interpret color.

**-C** _mode_
> Source code highlighting mode (_all_, _code_, _doc_, _mod_).

**-H**
> Output the rendered document as HTML.

**-L**
> Shortcut for **-u i** (inline link style).

**-M** _dir_
> Monitor _dir_ for Markdown file changes.

**-T** _theme_
> Color theme for code blocks (accepts _random_ or _all_).

**-X** _lexer_
> Default Pygments lexer name (default: _python_).

**-b** _n_
> Tab length (default: _4_).

**-c** _cols_
> Fix column width to _cols_ characters.

**-f** _from_
> Start rendering at substring _from_; supports _HEADING:N_ to limit to _N_ lines after a heading.

**-h**
> Show help.

**-i**
> Display the selected theme's metadata along with the rendering.

**-l**
> Experimental light-background mode.

**-m**
> Monitor the input file and redisplay when it changes.

**-n** _NRS_
> Enable header numbering (e.g. _-3_, _1-_, _1-5_).

**-t** _theme_
> Markdown color theme. Accepts a numeric ID (e.g. _729.8953_), _random_, or _all_.

**-u** _style_
> Link rendering style: _it_ (inline table), _h_ (hide), _i_ (inline).

**-x**
> Disable automatic lexer guessing for code blocks.

# CONFIGURATION

Defaults are read from **~/.mdv** (YAML) for CLI arguments, and **~/.mdv.py** (Python) is evaluated if present for dynamic overrides.

Environment variables:

**MDV_THEME**
> Default Markdown theme ID.

**MDV_CODE_THEME**
> Default Pygments theme for code blocks.

# DESCRIPTION

**mdv** is a Python tool that renders Markdown documents directly in a 256-color terminal. It parses headings, lists, tables, block quotes, and fenced code blocks and emits styled ANSI output with syntax highlighting driven by Pygments. A large collection of color themes is bundled and can be previewed with **-t all**.

Beyond one-shot rendering, **mdv** can watch a file or directory with **-m**/**-M** and refresh the view whenever the source changes, which is useful when editing Markdown in a second window. When called as a Python library, the same rendering is available as **mdv.main()** so it can be embedded in other programs (for example, to pretty-print CLI help text).

# CAVEATS

Requires a **256-color terminal**, and most themes assume a **dark background** — use **-l** for light backgrounds. Rendering uses unicode box characters, so a font that supports them is recommended. The project is written in Python; on recent distributions install it via **pip install mdv** or **brew install mdv**.

# HISTORY

Written by **axiros** and first released in **2015** as _terminal_markdown_viewer_. The project is published under the BSD license and continues to receive sporadic updates; version _1.7.5_ was released in **September 2023**. A lighter-weight sibling, **mdvl**, was later created by the same author for minimal environments.

# SEE ALSO

[glow](/man/glow)(1), [bat](/man/bat)(1), [pygmentize](/man/pygmentize)(1), [pandoc](/man/pandoc)(1)
