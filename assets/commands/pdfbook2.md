# TAGLINE

creates printable booklets from PDF files by rearranging pages into printer

# TLDR

Create a **booklet** named file-book.pdf with sane defaults

```pdfbook2 [path/to/file.pdf]```

Create a booklet with **paper size** set to A4

```pdfbook2 -p a4paper [path/to/file.pdf]```

Create a booklet with **inner margin** reduced to 50 pixels

```pdfbook2 -p a4paper -i 50 [path/to/file.pdf]```

Organize large file with **print signatures** for binding

```pdfbook2 -p a4paper --signature 24 [path/to/file.pdf]```

# SYNOPSIS

**pdfbook2** [_options_] _file.pdf_

# PARAMETERS

**-p**, **--paper** _size_
> Set paper size (a4paper, letterpaper, etc.)

**-s**, **--short-edge**
> Use short-edge binding (default is long-edge)

**-n**, **--no-crop**
> Do not crop pages before reassembling

**-o**, **--outer-margin** _pixels_
> Set outer margin (default: 40)

**-i**, **--inner-margin** _pixels_
> Set inner margin (default: 150)

**-t**, **--top-margin** _pixels_
> Set top margin (default: 30)

**-b**, **--bottom-margin** _pixels_
> Set bottom margin (default: 30)

**--signature** _num_
> Number of pages per signature (must be divisible by 4)

**--signature\*** _num_
> Same as --signature but allow incomplete last signature

**-h**, **--help**
> Display help message

# DESCRIPTION

**pdfbook2** creates printable booklets from PDF files by rearranging pages into printer spreads. The output is designed for double-sided printing in landscape mode with long-edge flipping, resulting in a booklet that can be folded and bound.

For larger documents, the signature option divides the booklet into smaller sections (signatures) that can be nested and bound together. Each signature must contain a number of pages divisible by 4.

# CAVEATS

Print in **landscape mode** with **long-edge flip** for correct results. Signature values must be divisible by 4. Default margins may need adjustment depending on printer capabilities. Requires pdflatex and the pdfpages LaTeX package.

# HISTORY

Written as a Python wrapper around pdfpages and pdflatex to simplify booklet creation. Replaces manual LaTeX workflows for creating print-ready booklets from existing PDF documents. Common in the self-publishing and zine-making communities.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfcrop](/man/pdfcrop)(1), [pdflatex](/man/pdflatex)(1)
