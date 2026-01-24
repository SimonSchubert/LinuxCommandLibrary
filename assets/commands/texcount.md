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

**texcount** counts words in LaTeX. It understands TeX syntax.

Text vs macro separation. Accurate counts.

Section breakdown. Subcounts per chapter.

Equation counting. Separate math.

Multiple file support. Include handling.

# CAVEATS

LaTeX specific. Custom macros may confuse. Perl required.

# HISTORY

**TeXcount** was created to provide accurate word counts for LaTeX documents by properly parsing TeX syntax.

# SEE ALSO

[wc](/man/wc)(1), [latex](/man/latex)(1), [detex](/man/detex)(1)
