# TAGLINE

manipulates PDF pages using LaTeX and pdfpages

# TLDR

**Combine PDFs**

```pdfjam [file1.pdf] [file2.pdf] -o [output.pdf]```

**Select pages**

```pdfjam [input.pdf] [1,3,5-7] -o [output.pdf]```

**Rotate pages**

```pdfjam --angle [90] [input.pdf] -o [output.pdf]```

**Two pages per sheet**

```pdfjam --nup 2x1 [input.pdf] -o [output.pdf]```

**Scale pages**

```pdfjam --scale [0.8] [input.pdf] -o [output.pdf]```

**Set paper size**

```pdfjam --paper [a4paper] [input.pdf] -o [output.pdf]```

**Landscape orientation**

```pdfjam --landscape [input.pdf] -o [output.pdf]```

# SYNOPSIS

**pdfjam** [_options_] _files_ [_page-ranges_] [_--outfile file_]

# PARAMETERS

**-o**, **--outfile** _FILE_
> Output filename.

**--nup** _COLxROW_
> Pages per sheet.

**--angle** _DEGREES_
> Rotation angle.

**--scale** _FACTOR_
> Scale factor.

**--paper** _SIZE_
> Paper size.

**--landscape**
> Landscape orientation.

**--frame** _true|false_
> Frame around pages.

**--delta** _X Y_
> Offset adjustment.

**--offset** _X Y_
> Page offset.

**--suffix** _STRING_
> Output filename suffix.

# DESCRIPTION

**pdfjam** manipulates PDF pages using LaTeX and pdfpages. It combines, rearranges, and transforms PDF documents.

Page selection uses ranges like 1-5 or lists like 1,3,5. Negative numbers count from the end.

N-up printing places multiple pages on one sheet. Common layouts are 2x1, 2x2, and 3x3.

Rotation handles landscape documents or corrects orientation. Any angle is supported.

Scaling adjusts page size. Combined with paper size, this enables fitting to different formats.

Output defaults to modified input name. Suffix option adds to original filename.

# CAVEATS

Requires TeX Live or similar LaTeX distribution. Complex PDFs may not process correctly. Some PDF features may be lost.

# HISTORY

**pdfjam** was created by **David Firth** as a shell wrapper around the LaTeX pdfpages package. It provides convenient command-line access to PDF manipulation.

# SEE ALSO

[pdfunite](/man/pdfunite)(1), [pdftk](/man/pdftk)(1), [pdfpages](/man/pdfpages)(1)
