# TAGLINE

visual PDF comparison tool

# TLDR

**Compare two PDFs** visually

```diff-pdf [file1.pdf] [file2.pdf]```

**Output difference** to new PDF

```diff-pdf --output-diff=[diff.pdf] [file1.pdf] [file2.pdf]```

**Show visual comparison**

```diff-pdf --view [file1.pdf] [file2.pdf]```

**Mark differences** with a rectangle in the output

```diff-pdf --mark-differences --output-diff=[diff.pdf] [file1.pdf] [file2.pdf]```

**Set a per-channel color tolerance**

```diff-pdf --channel-tolerance=[10] [file1.pdf] [file2.pdf]```

# SYNOPSIS

**diff-pdf** [_options_] _file1.pdf_ _file2.pdf_

# PARAMETERS

**--output-diff** _file_
> Output the visual difference to a PDF file.

**--view**
> Open the comparison in an interactive viewer window.

**-m**, **--mark-differences**
> Additionally mark differences on left-side pages with a rectangle.

**-g**, **--grayscale**
> Render pages in grayscale so only differences appear in color.

**--channel-tolerance** _N_
> Allow up to N (0-255) difference per color channel before flagging a pixel.

**--per-page-pixel-tolerance** _N_
> Allow up to N differing pixels per page before reporting the page as different.

**--dpi** _N_
> Rasterization resolution in DPI (default: 300).

**-s**, **--skip-identical**
> In the output PDF, skip pages that are identical.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**diff-pdf** compares two PDF files visually, rendering each page and performing pixel-by-pixel comparison. Unlike text-based diff tools, it captures visual differences including formatting, fonts, images, and layout changes that wouldn't be visible in a text comparison.

The tool rasterizes each page from both PDFs and compares the resulting images. It can generate a difference PDF highlighting changes in color, or open an interactive viewer for side-by-side comparison. The --channel-tolerance and --per-page-pixel-tolerance options allow small rendering variations to be ignored.

This is particularly useful for comparing versions of documents where content may be identical but visual presentation differs, or for quality assurance workflows verifying that document generation produces consistent output. The tool returns exit code 0 if files are identical, 1 if different, making it suitable for automated testing.

# SEE ALSO

[pdftk](/man/pdftk)(1), [diff](/man/diff)(1), [cpdf](/man/cpdf)(1)

# RESOURCES

```[Source code](https://github.com/vslavik/diff-pdf)```

```[Homepage](https://vslavik.github.io/diff-pdf/)```

<!-- verified: 2026-07-11 -->
