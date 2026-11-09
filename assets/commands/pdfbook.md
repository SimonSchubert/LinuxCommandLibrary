# TAGLINE

Put pages of PDF files into 2-up signatures for booklet printing

# TLDR

**Create a booklet from a PDF file**

```pdfbook [input.pdf]```

**Specify output file**

```pdfbook -o [booklet.pdf] [input.pdf]```

**Create booklet for A4 paper**

```pdfbook --paper a4paper [input.pdf]```

**Create booklet with a 16-page signature**

```pdfbook --signature [16] [input.pdf]```

**Create booklet for short-edge double-sided printing**

```pdfbook --short-edge [input.pdf]```

**Same result** with pdfjam alone, where pdfbook is not installed

```pdfjam --landscape --suffix book --signature [4] [input.pdf]```

# SYNOPSIS

**pdfbook** [**--short-edge**] [_options_] _file_...

# PARAMETERS

**-o** _file_
> Output file name. Defaults to input filename with "-book" suffix.

**--paper** _size_
> Paper size (e.g. a4paper, letterpaper, legalpaper).

**--signature** _num_
> Pages per signature (must be a multiple of 4, default 4).

**--signature*** _num_
> Pages per signature for right-edge binding.

**--short-edge**
> Format for short-edge double-sided printing. Must be the first argument. Requires the LaTeX package everyshi.

**--booklet** _bool_
> Passed to pdfjam: use booklet reordering instead of **--signature**.

# DESCRIPTION

**pdfbook** is a simple shell wrapper for **pdfjam** that arranges PDF pages into 2-up signatures suitable for printing as a booklet. Pages are reordered so that when printed double-sided and folded, they form a properly ordered booklet.

It runs pdfjam with **--landscape --suffix book** and, unless a signature is given, **--signature 4**. The default output is suitable for long-edge binding. Use **--short-edge** for short-edge binding. All other options are passed through to **pdfjam**.

# CAVEATS

No longer maintained and not included in pdfjam since version 3.02: the script now lives in the unsupported **pdfjam-extras** repository, so it may be missing on current systems. Requires LaTeX with the **pdfpages** package installed. Page count should be a multiple of 4 for best results. Output file defaults to the input filename with a "-book" suffix. The **--short-edge** option requires the **everyshi** LaTeX package.

# HISTORY

pdfbook is part of **pdfjam**, a collection of shell scripts using the **pdfpages** LaTeX package, created by **David Firth**. From pdfjam 3.02 the wrapper scripts were moved out of the package into **pdfjam-extras**. **pdfbook2** is a separate tool with additional features like margin control.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfnup](/man/pdfnup)(1), [pdflatex](/man/pdflatex)(1), [pdfbook2](/man/pdfbook2)(1)

# RESOURCES

```[Source code](https://github.com/pdfjam/pdfjam-extras)```

<!-- verified: 2026-11-09 -->
