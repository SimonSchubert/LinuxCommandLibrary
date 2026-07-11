# TAGLINE

strip LaTeX commands from documents

# TLDR

**Remove LaTeX commands from a file**

```detex [document.tex]```

**Process and output to file**

```detex [document.tex] > [output.txt]```

**Process a single file** without following \\input and \\include

```detex -n [document.tex]```

**Force LaTeX mode** regardless of content

```detex -l [document.tex]```

**Replace math with placeholder words** to keep sentences readable

```detex -r [document.tex]```

**Output a word list** (one word per line, e.g. for counting)

```detex -w [document.tex] | wc -l```

# SYNOPSIS

**detex** [**-clnstw**] [**-e** _environment-list_] [_file_...]

# PARAMETERS

**-c**
> In LaTeX mode, echo the arguments of \\cite, \\ref, and \\pageref macros.

**-e** _environment-list_
> Comma-separated list of environments to ignore (replaces the defaults: array, eqnarray, equation, longtable, picture, tabular, verbatim).

**-l**
> Force LaTeX mode processing.

**-n**
> Do not follow \\input and \\include commands (single file processing).

**-r**
> Replace math with the placeholder words "noun" and "verbs" to keep sentences readable.

**-s**
> Replace control sequences with a space (old behavior; may break accented words).

**-t**
> Force plain TeX mode.

**-w**
> Output one word per line.

# DESCRIPTION

**detex** strips LaTeX and TeX commands from documents, leaving plain text. This is useful for spell checking, word counting, text analysis, and extracting readable content from LaTeX source files.

The tool handles standard LaTeX constructs: commands, environments, comments, and special characters. Math mode content is removed (use **-r** to substitute readable placeholders). By default detex follows \\input and \\include directives to process multi-file documents, using the TEXINPUTS environment variable to locate them; **-n** disables this.

Output is the document text without markup, suitable for piping to spell checkers, word processors, or text analysis tools.

# CAVEATS

Complex or non-standard LaTeX may not process correctly. Some packages define commands that detex doesn't recognize. Math removal may affect context in technical documents. The tool doesn't handle bibliographies or index entries specially.

# HISTORY

detex was originally written by **Daniel Trinkle** of the Computer Science Department at Purdue University. It has been a standard tool in TeX distributions since the **1980s** and is maintained today as **OpenDetex**. Despite its age, it remains useful for basic LaTeX-to-text conversion.

# SEE ALSO

[latex](/man/latex)(1), [aspell](/man/aspell)(1), [pandoc](/man/pandoc)(1), [tex](/man/tex)(1)

# RESOURCES

```[Source code](https://github.com/pkubowicz/opendetex)```

<!-- verified: 2026-07-11 -->
