# TAGLINE

visual PDF comparison tool

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

**diff-pdf** compares two PDF files visually, rendering each page and performing pixel-by-pixel comparison. Unlike text-based diff tools, it captures visual differences including formatting, fonts, images, and layout changes that wouldn't be visible in a text comparison.

The tool rasterizes each page from both PDFs and compares the resulting images. It can generate a difference PDF highlighting changes in red, or open an interactive viewer for side-by-side comparison. A fuzzy tolerance parameter allows small rendering variations to be ignored.

This is particularly useful for comparing versions of documents where content may be identical but visual presentation differs, or for quality assurance workflows verifying that document generation produces consistent output. The tool returns exit code 0 if files are identical, 1 if different, making it suitable for automated testing.

# SEE ALSO

[pdftk](/man/pdftk)(1), [diff](/man/diff)(1), [cpdf](/man/cpdf)(1)
