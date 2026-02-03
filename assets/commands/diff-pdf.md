# TLDR

**Compare two PDFs** visually

```diff-pdf [file1.pdf] [file2.pdf]```

**Output difference** to new PDF

```diff-pdf --output-diff=[diff.pdf] [file1.pdf] [file2.pdf]```

**Show visual comparison**

```diff-pdf --view [file1.pdf] [file2.pdf]```

**Set per-pixel fuzz** (tolerance)

```diff-pdf --per-pixel-fuzz=[0.01] [file1.pdf] [file2.pdf]```

# SYNOPSIS

**diff-pdf** [_options_] _file1.pdf_ _file2.pdf_

# PARAMETERS

**--output-diff** _file_
> Output visual difference to PDF file.

**--view**
> Open visual comparison in viewer.

**--per-pixel-fuzz** _value_
> Tolerance for pixel differences (0-1).

**--mark-differences**
> Highlight differences in output.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**diff-pdf** compares two PDF files visually, page by page. It can generate a difference PDF showing where documents differ or open an interactive viewer.

Returns exit code 0 if files are identical, 1 if different.

# SEE ALSO

[pdftk](/man/pdftk)(1), [diff](/man/diff)(1), [cpdf](/man/cpdf)(1)
