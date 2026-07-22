# TAGLINE

converts PDF files to Scalable Vector Graphics format

# TLDR

**Convert PDF page to SVG**

```pdf2svg [input.pdf] [output.svg]```

**Convert specific page**

```pdf2svg [input.pdf] [output.svg] [2]```

**Convert all pages**

```pdf2svg [input.pdf] [output_%d.svg] all```

# SYNOPSIS

**pdf2svg** _input.pdf_ _output.svg_ [_page_|all]

# PARAMETERS

**input.pdf**
> Input PDF file.

**output.svg**
> Output SVG file.

**page**
> Page number (1-indexed).

**all**
> Convert all pages.

# DESCRIPTION

**pdf2svg** converts PDF files to Scalable Vector Graphics (SVG) format. It preserves vector graphics, text, and formatting, making the output suitable for web use and editing.

The tool uses **Poppler** for PDF parsing and **Cairo** for SVG rendering. To convert every page in a single run, use **all** as the page argument and include the **%d** placeholder in the output filename — pdf2svg substitutes the page number at write time (e.g. `pdf2svg book.pdf page_%d.svg all` produces `page_1.svg`, `page_2.svg`, …).

# CAVEATS

One page per SVG file (no multi-page SVG output). Complex PDFs may produce very large SVGs. Fonts are typically converted to outline paths, which preserves rendering fidelity but loses selectable text.

# HISTORY

pdf2svg was created by **David Barton** using Poppler for PDF parsing and Cairo for SVG rendering.

# INSTALL

```apt: sudo apt install pdf2svg```

```dnf: sudo dnf install pdf2svg```

```pacman: sudo pacman -S pdf2svg```

```zypper: sudo zypper install pdf2svg```

```brew: brew install pdf2svg```

```nix: nix profile install nixpkgs#pdf2svg```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[inkscape](/man/inkscape)(1), [pdftohtml](/man/pdftohtml)(1), [rsvg-convert](/man/rsvg-convert)(1)
