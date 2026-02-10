# TAGLINE

muPDF command-line tool

# TLDR

**Convert PDF to images**

```mutool draw -o [page%d.png] [input.pdf]```

**Extract text from PDF**

```mutool draw -F txt [input.pdf]```

**Show PDF info**

```mutool info [input.pdf]```

**Merge PDFs**

```mutool merge -o [output.pdf] [file1.pdf] [file2.pdf]```

**Extract pages**

```mutool merge -o [output.pdf] [input.pdf] [1-5]```

**Clean PDF**

```mutool clean [input.pdf] [output.pdf]```

# SYNOPSIS

**mutool** _command_ [_options_] _files_

# PARAMETERS

_COMMAND_
> Operation to perform.

**draw**
> Render document to image/text.

**info**
> Show document information.

**merge**
> Merge/extract pages.

**clean**
> Rewrite PDF file.

**-o** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**mutool** is the MuPDF command-line tool. It manipulates PDF and other document formats.

The tool renders, converts, and processes documents. Lightweight and fast.

# CAVEATS

Part of MuPDF. Some features require specific builds. Limited editing capabilities.

# HISTORY

mutool is part of **MuPDF**, a lightweight PDF renderer created by Artifex Software.

# SEE ALSO

[pdftk](/man/pdftk)(1), [gs](/man/gs)(1), [qpdf](/man/qpdf)(1)

