# TAGLINE

A jq-like command-line tool for querying and transforming Markdown files

# TLDR

**Extract all headings** from a Markdown file

```mq '.h' [path/to/file.md]```

**Select a specific section** by heading text

```mq 'select("Section Name")' [path/to/file.md]```

**Extract code blocks** of a specific language

```mq '.code("python")' [path/to/file.md]```

**Convert Markdown to plain text**

```mq 'to_text' [path/to/file.md]```

**Output as HTML**

```mq -F html '.h1' [path/to/file.md]```

**Launch interactive REPL** mode

```mq repl [path/to/file.md]```

**Load query from a file**

```mq -f [query.mq] [path/to/file.md]```

**Aggregate multiple files** into a single array

```mq -A '.h1' [*.md]```

# SYNOPSIS

**mq** [_options_] [_query_] [_files..._]

**mq** **repl** [_file_]

**mq** **fmt** [_options_] [_file_]

# PARAMETERS

**-A**, **--aggregate**
> Combine all input files into a single array for processing.

**-f** _file_, **--from-file** _file_
> Load the query filter from a file instead of a command-line argument.

**-I** _format_, **--input-format** _format_
> Set input format: markdown, mdx, html, text, null, or raw.

**-F** _format_, **--output-format** _format_
> Set output format: markdown, html, text, json, or none.

**-U**, **--update**
> Update input files in-place with the query result.

**-o** _file_, **--output** _file_
> Write output to the specified file.

**-C**, **--color-output**
> Colorize Markdown output.

**-S** _query_, **--separator** _query_
> Query to insert between files when processing multiple inputs.

**-L** _dir_, **--directory** _dir_
> Search path for modules.

**-M** _modules_, **--module-names** _modules_
> Load specific modules (json, csv, yaml, toml, xml).

# DESCRIPTION

**mq** is a command-line tool for processing and querying Markdown files, inspired by **jq** for JSON. It lets you slice, filter, map, and transform structured Markdown content directly from the terminal with built-in selectors (`.h1`-`.h6`, `.code`, `.link`, `.image`, `..` for recursive descent), functions (`select()`, `contains()`, `to_text()`, `to_link()`), and support for custom extensions.

Useful for preparing structured prompts for language models, automating documentation updates, and analyzing content across multiple Markdown files. Extensible via custom subcommands placed in `~/.mq/bin/`.

# CAVEATS

Queries follow mq's own filter syntax similar to jq. Complex transformations may require chaining multiple filters with the pipe (`|`) operator.

# HISTORY

**mq** was created by **harehare** and is written in **Rust**.

# SEE ALSO

[jq](/man/jq)(1), [glow](/man/glow)(1)
