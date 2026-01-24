# TLDR

**Merge PDF files**

```pdfunite [input1.pdf] [input2.pdf] [output.pdf]```

**Merge multiple PDFs**

```pdfunite [file1.pdf] [file2.pdf] [file3.pdf] [combined.pdf]```

**Merge all PDFs in directory**

```pdfunite *.pdf [merged.pdf]```

# SYNOPSIS

**pdfunite** [_options_] _input1.pdf_ _input2.pdf_ ... _output.pdf_

# PARAMETERS

**-v**
> Print version.

**-h**
> Print help.

# DESCRIPTION

**pdfunite** merges multiple PDF files into a single document. The last filename is the output; all others are inputs.

Files are combined in the order specified on the command line. Page numbering continues sequentially through all input documents.

The tool preserves PDF content including text, images, annotations, and bookmarks. Internal links within each document remain functional.

Metadata from the first input file is used for the combined document. Other inputs' metadata is not merged.

Shell wildcards expand to combine many files at once. Sorting happens alphabetically by default, which works well for numbered filenames.

For more complex operations like page selection, rotation, or reordering, use pdftk or qpdf instead.

# CAVEATS

No page selection (all pages included). No reordering. Encrypted PDFs need password. Very large merges may need significant memory.

# HISTORY

**pdfunite** is part of **poppler-utils**, derived from the **Xpdf** project. It provides simple PDF merging without requiring the heavier pdftk or commercial tools.

# SEE ALSO

[pdfseparate](/man/pdfseparate)(1), [pdftk](/man/pdftk)(1), [qpdf](/man/qpdf)(1), [pdfinfo](/man/pdfinfo)(1)
