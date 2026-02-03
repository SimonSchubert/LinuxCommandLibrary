# TLDR

**Convert Markdown to PDF**

```markdown2pdf [input.md] -o [output.pdf]```

**Convert with custom CSS**

```markdown2pdf [input.md] --css [style.css] -o [output.pdf]```

**Convert multiple files**

```markdown2pdf [file1.md] [file2.md] -o [output.pdf]```

# SYNOPSIS

**markdown2pdf** [_options_] _files_...

# PARAMETERS

**-o** _file_
> Output PDF file.

**--css** _file_
> Custom CSS stylesheet.

**--header** _text_
> Header text.

**--footer** _text_
> Footer text.

**--toc**
> Include table of contents.

# DESCRIPTION

**markdown2pdf** converts Markdown documents to PDF. Renders Markdown with styling and creates print-ready PDF output. Supports custom CSS for formatting.

# SEE ALSO

[pandoc](/man/pandoc)(1), [md2pdf](/man/md2pdf)(1)

