# TLDR

Create **2-up** PDF

```pdfxup -o [path/to/output.pdf] [path/to/input.pdf]```

Create PDF with **3 columns and 2 rows**

```pdfxup -x 3 -y 2 -o [path/to/output.pdf] [path/to/input.pdf]```

Create **booklet** (foldable book format)

```pdfxup -b -o [path/to/output.pdf] [path/to/input.pdf]```

# SYNOPSIS

**pdfxup** [**-o** _output_] [**-x** _cols_] [**-y** _rows_] [**-b**|**--booklet**] _input.pdf_

# PARAMETERS

**-o, --output _file_**
> Output PDF file path

**-x, --columns _num_**
> Number of columns per page

**-y, --rows _num_**
> Number of rows per page

**-b, --booklet**
> Booklet mode for folding into a book

**-p, --paper _size_**
> Output paper size

**-l, --landscape**
> Landscape orientation

# DESCRIPTION

**pdfxup** arranges multiple PDF pages onto single sheets (n-up printing). It scales and rotates pages to fit into a grid layout, useful for creating handouts, booklets, or reducing paper usage when printing.

The booklet mode arranges pages so that when printed double-sided and folded, they form a properly ordered book. This is useful for creating small publications from PDF documents.

# CAVEATS

Requires LaTeX and pdfpages package. Complex PDFs with forms or annotations may not render correctly. Output quality depends on scaling factor. Very small n-up layouts may be difficult to read.

# HISTORY

**pdfxup** is part of the **TeX Live** distribution and uses LaTeX with the pdfpages package internally. It provides a convenient command-line interface for PDF page imposition tasks commonly needed in print preparation.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfnup](/man/pdfnup)(1), [pdfbook](/man/pdfbook)(1)
