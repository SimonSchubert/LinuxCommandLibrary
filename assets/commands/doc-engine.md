# TAGLINE

Zero-config Markdown to PDF documentation engine using Typst

# TLDR

**Generate a PDF** from README.md with zero configuration

```doc-engine build```

**Convert a specific file** and override title and author

```doc-engine build CONTRIBUTING.md -o guide.pdf -t "Guide" -a "Team"```

**Use a different template** and accent color

```doc-engine build --template modern --accent teal```

**Check for Markdown errors** without generating PDF

```doc-engine build --dry-run```

**Install via pipx**

```pipx install doc-engine-cli```

# SYNOPSIS

**doc-engine** build [INPUT_FILE] [options]

**doc-engine** info

**doc-engine** --help | --version

# DESCRIPTION

**doc-engine** is a CLI tool that converts Markdown files into professionally styled PDF documents using Typst as the rendering backend. It auto-detects README.md, extracts metadata from Git, and produces high-quality technical or academic reports complete with cover page, table of contents, and syntax-highlighted code.

It requires no LaTeX, Pandoc, or manual configuration. The tool supports five built-in templates and custom accent colors. It can also perform source error checking with precise line/column reporting.

# PARAMETERS

**build** [_INPUT_FILE_]

> Convert the Markdown file to PDF. Defaults to auto-detecting README.md in the current directory.

**-o**, **--output** _file.pdf_

> Output file path. Default: <input>_doc.pdf

**-t**, **--title** _title_

> Document title. Defaults to first # heading or Git-derived.

**-a**, **--author** _name_

> Author name. Defaults to `git config user.name`.

**--template** _name_

> Template: academic (default), modern, minimal, technical, book.

**--accent** _color_

> Accent color (hex or named: blue, teal, rose, etc.).

**--bib** _file.bib_

> Bibliography file for IEEE-style references section.

**--dry-run**

> Validate Markdown and report errors without producing PDF.

**--open**

> Open the generated PDF after creation.

**--no-branding**

> Omit "doc-engine" attribution from footer.

# EXAMPLES

Basic zero-config usage in a project directory:

```doc-engine build```

Generate with custom options:

```doc-engine build docs/api.md -o api.pdf --template technical --accent "#7c3aed"```

# CAVEATS

Images in Markdown are rendered only as alt text (remote images not downloaded or embedded). Complex layouts may require reviewing the output PDF. Requires Python 3.10+ and the Typst Python bindings (installed automatically).

# SEE ALSO

[typst](/man/typst)(1), [pandoc](/man/pandoc)(1), [weasyprint](/man/weasyprint)(1)

# RESOURCES

```[Source code](https://github.com/leonardosalasd/doc-engine-cli)```

```[Documentation](https://github.com/leonardosalasd/doc-engine-cli#readme)```

<!-- verified: 2026-07-07 -->
