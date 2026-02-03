# TLDR

**Merge PDF files**

```cpdf [input1.pdf] [input2.pdf] -o [output.pdf]```

**Extract pages**

```cpdf [input.pdf] [1-10] -o [output.pdf]```

**Rotate pages**

```cpdf -rotate [90] [input.pdf] -o [output.pdf]```

**Add password protection**

```cpdf -encrypt [128bit] [owner_password] [user_password] [input.pdf] -o [output.pdf]```

**Remove password**

```cpdf -decrypt [input.pdf] owner=[password] -o [output.pdf]```

**Split into single pages**

```cpdf -split [input.pdf] -o [page%%%.pdf]```

**Scale pages**

```cpdf -scale-page "[2.0 2.0]" [input.pdf] -o [output.pdf]```

# SYNOPSIS

**cpdf** [_options_] _input.pdf_ [_pages_] **-o** _output.pdf_

# PARAMETERS

**-o** _file_
> Output file path.

**-encrypt** _level_ _owner_ _user_
> Encrypt with specified bit level and passwords.

**-decrypt**
> Decrypt a PDF.

**-rotate** _degrees_
> Rotate pages by degrees.

**-split**
> Split into individual pages.

**-scale-page** _"x y"_
> Scale pages by factors.

**-merge**
> Merge multiple PDFs.

# DESCRIPTION

**cpdf** (Coherent PDF) is a command-line tool for manipulating PDF files. It can merge, split, encrypt, decrypt, rotate, scale, and perform many other operations on PDF documents.

It's a powerful alternative to tools like pdftk for PDF manipulation.

# SEE ALSO

[pdftk](/man/pdftk)(1), [qpdf](/man/qpdf)(1), [gs](/man/gs)(1)
