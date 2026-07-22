# TAGLINE

converts Markdown documents to PDF

# TLDR

**Convert a Markdown file to PDF**

```markdown2pdf -p [input.md] -o [output.pdf]```

**Convert a Markdown string directly**

```markdown2pdf -s "# Hello" -o [output.pdf]```

**Apply a built-in theme**

```markdown2pdf -p [input.md] --theme [github] -o [output.pdf]```

**Add page numbers**

```markdown2pdf -p [input.md] --page-numbers -o [output.pdf]```

**Fetch and convert Markdown from a URL**

```markdown2pdf -u [https://example.com/readme.md] -o [output.pdf]```

**Preview the effective configuration without rendering**

```markdown2pdf -p [input.md] --dry-run```

# SYNOPSIS

**markdown2pdf** (**-p** _file_ | **-s** _string_ | **-u** _url_) [**-o** _output_] [_options_]

# PARAMETERS

**-p** _file_
> Read Markdown from the given file.

**-s** _string_
> Read Markdown from the given string.

**-u**, **--url** _url_
> Fetch Markdown from a URL (requires the fetch feature).

**-o** _file_
> Output PDF path (default: ./output.pdf).

**--theme** _name_
> Use a built-in theme such as github or academic.

**--page-numbers**
> Add page numbers to the output.

**-c** _file_
> Load settings from a TOML configuration file.

**-V** _key=value_
> Override a single configuration value.

**--dry-run**
> Show what would be rendered without writing a PDF.

**--print-effective-config**
> Print the merged configuration and exit.

**--verbose**
> Enable verbose output.

**--quiet**
> Suppress non-error output.

# DESCRIPTION

**markdown2pdf** converts Markdown documents to PDF. The prominent implementation is a pure-Rust transpiler that renders directly to PDF via printpdf, without an intermediate HTML step and without external dependencies like Pandoc or wkhtmltopdf.

Input is provided through one of the **-p** (file), **-s** (string), or **-u** (URL) flags rather than as a bare positional argument. Styling is controlled by built-in themes (**--theme**) and a TOML configuration file (**-c**), with individual values overridable via **-V**.

# CAVEATS

Multiple unrelated tools share the **markdown2pdf** name (Rust, Node.js, and Python variants); flags differ between them. This page documents the Rust implementation. Unlike HTML-based converters, it does not accept arbitrary CSS; appearance is theme- and config-driven.

# HISTORY

The Rust **markdown2pdf** crate was created by **theiskaa** and is distributed on crates.io. It can be installed with `cargo install markdown2pdf` or via a Homebrew tap.

# INSTALL

```aur: yay -S markdown2pdf```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pandoc](/man/pandoc)(1), [wkhtmltopdf](/man/wkhtmltopdf)(1)
