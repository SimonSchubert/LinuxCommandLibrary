# TLDR

**Create booklet from PDF**

```pdfbook [input.pdf]```

**Specify output file**

```pdfbook -o [booklet.pdf] [input.pdf]```

**Create 2-up booklet for A4 paper**

```pdfbook --paper a4paper [input.pdf]```

**Signature of 16 pages**

```pdfbook --signature [16] [input.pdf]```

# SYNOPSIS

**pdfbook** [_options_] _file_...

# PARAMETERS

**-o** _file_
> Output file name.

**--paper** _size_
> Paper size (a4paper, letterpaper).

**--signature** _num_
> Pages per signature (multiple of 4).

**--2up**
> Two pages per sheet.

**--short-edge**
> Short edge binding.

# DESCRIPTION

**pdfbook** rearranges PDF pages for booklet printing. It reorders pages so that when printed double-sided and folded, they form a properly ordered booklet.

Part of the pdfjam suite, built on pdfpages LaTeX package.

# EXAMPLE

```bash
# Create A4 booklet
pdfbook --paper a4paper document.pdf

# Signature booklet (easier folding)
pdfbook --signature 8 manual.pdf -o manual-booklet.pdf
```

# CAVEATS

Requires LaTeX with pdfpages package. Page count should be multiple of 4 for best results. Output file is input-book.pdf by default.

# HISTORY

pdfbook is part of **pdfjam**, a collection of shell scripts using **pdfpages** LaTeX package, created by **David Firth**.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfnup](/man/pdfnup)(1), [pdflatex](/man/pdflatex)(1)
