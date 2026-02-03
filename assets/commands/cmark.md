# TLDR

**Convert Markdown to HTML**

```cmark [input.md]```

**Convert to specific format**

```cmark --to [html|xml|man|latex] [input.md]```

**Read from stdin**

```cat [input.md] | cmark```

**Output to file**

```cmark [input.md] > [output.html]```

**Enable smart typography**

```cmark --smart [input.md]```

**Validate and show AST**

```cmark --validate-utf8 [input.md]```

# SYNOPSIS

**cmark** [_options_] [_file..._]

# PARAMETERS

**--to** _format_
> Output format: html, xml, man, commonmark, latex.

**--smart**
> Enable smart punctuation (curly quotes, dashes).

**--safe**
> Omit raw HTML and potentially unsafe links.

**--validate-utf8**
> Validate UTF-8 and replace invalid sequences.

**--hardbreaks**
> Render soft breaks as hard breaks.

# DESCRIPTION

**cmark** is the reference implementation of CommonMark, a standardized Markdown specification. It parses Markdown and converts it to various output formats including HTML, XML, man pages, and LaTeX.

The tool is fast and follows the CommonMark specification precisely, making it useful for consistent Markdown processing.

# SEE ALSO

[pandoc](/man/pandoc)(1), [markdown](/man/markdown)(1), [grip](/man/grip)(1)
