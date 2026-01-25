# TLDR

**Remove LaTeX commands from a file**

```detex [document.tex]```

**Process and output to file**

```detex [document.tex] > [output.txt]```

**Follow \\input and \\include references**

```detex -e [document.tex]```

**Process in LaTeX mode** (default)

```detex -l [document.tex]```

**Retain math mode content**

```detex -m [document.tex]```

**Show environment names to ignore**

```detex -n [document.tex]```

# SYNOPSIS

**detex** [_options_] [_file_...]

# PARAMETERS

**-e**
> Expand \\input and \\include directives.

**-l**
> Force LaTeX mode processing.

**-m**
> Retain dollar signs and math content.

**-n**
> Show names of unknown environments.

**-s**
> Replace math with space instead of removing.

**-t**
> Force plain TeX mode.

**-w**
> Output one word per line.

# DESCRIPTION

**detex** strips LaTeX and TeX commands from documents, leaving plain text. This is useful for spell checking, word counting, text analysis, and extracting readable content from LaTeX source files.

The tool handles standard LaTeX constructs: commands, environments, comments, and special characters. Math mode content is typically removed unless **-m** is specified. With **-e**, it follows \\input directives to process multi-file documents.

Output is the document text without markup, suitable for piping to spell checkers, word processors, or text analysis tools.

# EXAMPLE

```latex
% Input
\documentclass{article}
\begin{document}
Hello \textbf{world}! Here is $x^2$ math.
\end{document}
```

```text
# Output
Hello world! Here is  math.
```

# CAVEATS

Complex or non-standard LaTeX may not process correctly. Some packages define commands that detex doesn't recognize. Math removal may affect context in technical documents. The tool doesn't handle bibliographies or index entries specially.

# HISTORY

detex was originally written by **Daniel Langley** and later maintained by various contributors. It has been a standard tool in TeX distributions since the **1980s**, providing an essential bridge between LaTeX documents and plain text tools. Despite its age, it remains useful for basic LaTeX-to-text conversion.

# SEE ALSO

[latex](/man/latex)(1), [aspell](/man/aspell)(1), [pandoc](/man/pandoc)(1), [tex](/man/tex)(1)
