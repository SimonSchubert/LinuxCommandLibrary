# TLDR

**Put 2 pages per sheet**

```pdfnup [input.pdf]```

**Put 4 pages per sheet**

```pdfnup --nup 2x2 [input.pdf]```

**Specify output file**

```pdfnup -o [output.pdf] [input.pdf]```

**Landscape orientation**

```pdfnup --landscape [input.pdf]```

# SYNOPSIS

**pdfnup** [_options_] _file_...

# PARAMETERS

**--nup** _cols_x_rows_
> Pages per sheet layout.

**-o** _file_
> Output file name.

**--landscape**
> Landscape orientation.

**--paper** _size_
> Paper size.

**--frame** _true_|_false_
> Draw frames around pages.

**--delta** _x_ _y_
> Space between pages.

# DESCRIPTION

**pdfnup** arranges multiple PDF pages onto single sheets (n-up printing). Useful for handouts, saving paper, or creating review copies.

Part of the pdfjam suite using pdfpages LaTeX package.

# EXAMPLES

```bash
# 2 pages per sheet (default)
pdfnup document.pdf

# 4-up on A4
pdfnup --nup 2x2 --paper a4paper slides.pdf

# 6-up with frames
pdfnup --nup 3x2 --frame true handout.pdf
```

# CAVEATS

Requires LaTeX with pdfpages. Output file is input-nup.pdf by default. Complex layouts may need manual adjustment.

# HISTORY

pdfnup is part of **pdfjam** by **David Firth**, providing n-up functionality through the **pdfpages** LaTeX package.

# SEE ALSO

[pdfjam](/man/pdfjam)(1), [pdfbook](/man/pdfbook)(1), [psnup](/man/psnup)(1)
