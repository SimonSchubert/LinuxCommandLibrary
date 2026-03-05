# TAGLINE

Command-line tool for querying and transforming Markdown files

# TLDR

**Extract headings** from a Markdown file

```mq 'headings' [path/to/file.md]```

**Filter content** by section

```mq 'select("Section Name")' [path/to/file.md]```

**Launch interactive REPL** mode

```mq --repl [path/to/file.md]```

# SYNOPSIS

**mq** [_options_] _query_ [_file_]

# PARAMETERS

**--repl**
> Launch interactive REPL mode for testing queries.

# DESCRIPTION

**mq** is a command-line tool for processing and querying Markdown files, inspired by **jq** for JSON. It lets you slice, filter, map, and transform structured Markdown content directly from the terminal with built-in filters and functions, plus support for custom extensions.

Useful for preparing structured prompts for language models, automating documentation updates, and analyzing content across multiple Markdown files.

# CAVEATS

Queries follow mq's own filter syntax. Complex transformations may require chaining multiple filters.

# HISTORY

**mq** was created by **harehare** and is written in **Rust**.

# SEE ALSO

[jq](/man/jq)(1), [glow](/man/glow)(1)
