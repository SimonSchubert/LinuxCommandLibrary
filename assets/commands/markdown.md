# TLDR

**Convert Markdown to HTML**

```markdown [file.md]```

**Convert from stdin**

```echo "# Hello" | markdown```

**Output to file**

```markdown [file.md] > [file.html]```

# SYNOPSIS

**markdown** [_options_] [_file_]

# PARAMETERS

**--html4tags**
> Use XHTML-style empty tags.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**markdown** converts Markdown-formatted text to HTML. It implements the original Markdown specification created by John Gruber.

Markdown allows writing in plain text with simple formatting that converts to structured HTML.

# MARKDOWN SYNTAX

```markdown
# Heading 1
## Heading 2

**bold** and *italic*

- List item
- Another item

[Link](http://example.com)

`code`

```
code block
```
```

# IMPLEMENTATIONS

```
markdown      - Original Perl
python-markdown - Python
marked        - JavaScript
pandoc        - Haskell (multi-format)
```

# CAVEATS

Many implementations with slight differences. No single standard (CommonMark aims to standardize). Original Markdown is Perl script.

# HISTORY

Markdown was created by **John Gruber** with contributions from **Aaron Swartz** in **2004**. It became the de facto standard for README files and documentation.

# SEE ALSO

[pandoc](/man/pandoc)(1), [marked](/man/marked)(1), [cmark](/man/cmark)(1), [grip](/man/grip)(1)
