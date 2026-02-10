# TAGLINE

lists or extracts embedded files from a PDF file

# TLDR

**List** all attachments in PDF

```pdfdetach -list input.pdf```

**Save** attachment by number

```pdfdetach -save 1 input.pdf```

Save attachment by **name**

```pdfdetach -savefile filename input.pdf```

Save **all** attachments

```pdfdetach -saveall input.pdf```

Save with **custom output** name

```pdfdetach -save 1 -o output.txt input.pdf```

Extract from **password-protected** PDF

```pdfdetach -save 1 -upw password input.pdf```

List with specific **encoding**

```pdfdetach -list -enc UTF-8 input.pdf```

# SYNOPSIS

**pdfdetach** [_options_] _PDF-file_

# DESCRIPTION

**pdfdetach** lists or extracts embedded files (attachments) from a PDF file. It is part of the poppler-utils package.

# PARAMETERS

**-list**
> List all embedded files in the PDF

**-save NUMBER**
> Save embedded file by its index number

**-savefile FILENAME**
> Save embedded file by its filename

**-saveall**
> Save all embedded files using their original names

**-o PATH**
> Set output file name or directory for saved files

**-enc ENCODING**
> Specify text encoding for filenames (default: UTF-8)

**-opw PASSWORD**
> Owner password for encrypted PDF

**-upw PASSWORD**
> User password for encrypted PDF

**-v**
> Display version information

**-h, --help**
> Display usage information

# CAVEATS

Exit codes: 0 (success), 1 (PDF opening error), 2 (output file error), 3 (permissions issue), 99 (other errors). Attachment numbers start at 1.

# HISTORY

**pdfdetach** is part of **poppler-utils**, a set of command-line utilities based on the Poppler PDF rendering library.

# SEE ALSO

[pdfattach](/man/pdfattach)(1), [pdfinfo](/man/pdfinfo)(1), [pdfimages](/man/pdfimages)(1)
