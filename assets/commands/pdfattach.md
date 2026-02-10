# TAGLINE

adds a new embedded file to an existing PDF file

# TLDR

**Add** attachment to PDF

```pdfattach input.pdf file_to_attach output.pdf```

**Replace** existing attachment with same name

```pdfattach -replace input.pdf file_to_attach output.pdf```

Display **help**

```pdfattach --help```

Display **version**

```pdfattach -v```

# SYNOPSIS

**pdfattach** [_options_] _PDF-file_ _file-to-attach_ _output-PDF-file_

# DESCRIPTION

**pdfattach** adds a new embedded file (attachment) to an existing PDF file. The attachment is stored inside the PDF and can be extracted using pdfdetach.

# PARAMETERS

**-replace**
> Replace an existing attachment with the same name if it exists

**-h, --help**
> Display usage information

**-v**
> Display version information

# CAVEATS

The original PDF file is not modified; a new output file is created with the attachment. To update a file in place, output to a temporary file and then rename it.

# HISTORY

**pdfattach** is part of **poppler-utils**, a set of command-line utilities based on the Poppler PDF rendering library for working with PDF files.

# SEE ALSO

[pdfdetach](/man/pdfdetach)(1), [pdfinfo](/man/pdfinfo)(1), [pdfunite](/man/pdfunite)(1)
