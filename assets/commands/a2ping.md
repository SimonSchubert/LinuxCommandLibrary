# TLDR

**Convert** a PostScript file to PDF

```a2ping [input.ps] [output.pdf]```

**Convert** an EPS file to PDF with tight bounding box

```a2ping --bboxfrom=compute-gs [input.eps] [output.pdf]```

Convert to **specific output format**

```a2ping --outformat=[pdf|eps|ps] [input.ps] [output]```

# SYNOPSIS

**a2ping** [_options_] _inputfile_ [_outputfile_]

# DESCRIPTION

**a2ping** is a Perl script that converts between various page description formats including PostScript (PS), Encapsulated PostScript (EPS), PDF, and related formats. It acts as a smart wrapper around Ghostscript and other tools, automatically detecting input formats and applying appropriate conversions.

The tool is particularly useful for converting EPS graphics with proper bounding box handling, making it ideal for preparing figures for LaTeX documents. It can compute accurate bounding boxes, handle font embedding, and optimize output for different use cases.

# PARAMETERS

**--outformat=**_format_
> Output format: pdf, eps, eps2, eps3, ps, ps2, ps3

**--bboxfrom=**_method_
> Bounding box source: adsc (from DSC comments), compute-gs (compute using Ghostscript)

**--resolution=**_dpi_
> Set output resolution in dots per inch

**--compress=**_method_
> Compression method: none, zip, best

**--gsextra=**_options_
> Pass extra options to Ghostscript

**--help**
> Display help information

# CAVEATS

Requires Ghostscript to be installed for most conversions. Some complex PostScript features may not convert perfectly. The tool is primarily designed for single-page documents; multi-page handling may vary.

# HISTORY

**a2ping** was written by Peter Szabo and first released in **2003**. It was developed to address common difficulties in converting EPS files to PDF with correct bounding boxes, particularly for users preparing scientific documents with LaTeX. The tool became part of TeX Live distributions.

# SEE ALSO

[gs](/man/gs)(1), [ps2pdf](/man/ps2pdf)(1), [epstopdf](/man/epstopdf)(1), [convert](/man/convert)(1)
