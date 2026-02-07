# TAGLINE

CommonMark Markdown parser and renderer

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

**cmark** is the reference C implementation of CommonMark, a strongly specified and highly compatible variant of Markdown. It parses Markdown input and converts it to various output formats including HTML, XML, groff man pages, CommonMark, and LaTeX.

The parser is designed for correctness and performance, strictly following the CommonMark specification to eliminate the ambiguities present in the original Markdown description. This makes it suitable for applications that require predictable, consistent rendering across different tools.

cmark reads from files or standard input and writes to standard output, making it easy to integrate into pipelines. The **--smart** option provides typographic enhancements like curly quotes and em-dashes, while **--safe** strips potentially dangerous raw HTML from input.

# SEE ALSO

[pandoc](/man/pandoc)(1), [markdown](/man/markdown)(1), [grip](/man/grip)(1)
