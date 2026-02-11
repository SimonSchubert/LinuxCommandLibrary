# TAGLINE

Count words in LaTeX documents

# TLDR

**Count words**

```texcount [document.tex]```

**Brief output**

```texcount -brief [document.tex]```

**Include subcounts**

```texcount -sub [document.tex]```

**HTML output**

```texcount -html [document.tex]```

**Count multiple files**

```texcount -merge [file1.tex] [file2.tex]```

**Verbose output**

```texcount -v [document.tex]```

# SYNOPSIS

**texcount** [_-brief_] [_-sub_] [_-html_] [_options_] _files_

# PARAMETERS

**-brief**
> Short output.

**-sub**
> Subcounts by section.

**-html**
> HTML output.

**-merge**
> Merge file counts.

**-v**
> Verbose output.

**-inc**
> Include input files.

# DESCRIPTION

**texcount** counts words in LaTeX documents by properly parsing TeX syntax rather than counting all whitespace-separated tokens. It distinguishes between text words, header words, caption words, and mathematical formulas, providing accurate counts that exclude macro names and formatting commands.

The **-sub** option breaks down counts by section, chapter, or other structural elements, which is useful for tracking progress on individual parts of a document. Multiple files can be processed together with **-merge**, and **-inc** follows \\input and \\include directives to count included files. Output formats include plain text, HTML, and verbose mode showing how each word was classified.

# CAVEATS

LaTeX specific. Custom macros may confuse. Perl required.

# HISTORY

**TeXcount** was created to provide accurate word counts for LaTeX documents by properly parsing TeX syntax.

# SEE ALSO

[wc](/man/wc)(1), [latex](/man/latex)(1), [detex](/man/detex)(1)
