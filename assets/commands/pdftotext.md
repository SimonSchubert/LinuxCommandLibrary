# TLDR

**Extract text** from a PDF to stdout

```pdftotext [file.pdf] -```

**Extract text** to a text file

```pdftotext [file.pdf] [output.txt]```

**Extract text preserving layout**

```pdftotext -layout [file.pdf] [output.txt]```

**Extract text from specific pages**

```pdftotext -f [1] -l [5] [file.pdf] [output.txt]```

**Extract raw text** without formatting

```pdftotext -raw [file.pdf] [output.txt]```

**Extract text from a password-protected PDF**

```pdftotext -upw [password] [file.pdf] [output.txt]```

# SYNOPSIS

**pdftotext** [_options_] _PDF-file_ [_text-file_]

# PARAMETERS

**-f** _number_
> First page to convert (default: 1)

**-l** _number_
> Last page to convert (default: last page)

**-layout**
> Maintain original physical layout of the text

**-simple**
> Simple one-column page layout

**-table**
> Table mode, similar to layout but optimized for tables

**-lineprinter**
> Line printer mode with fixed-pitch font metrics

**-raw**
> Keep strings in content stream order

**-fixed** _number_
> Assume fixed-pitch font with specified character width

**-enc** _encoding_
> Output text encoding (Latin1, UTF-8, etc.)

**-nopgbrk**
> Don't insert page breaks between pages

**-opw** _password_
> Owner password for encrypted PDF

**-upw** _password_
> User password for encrypted PDF

**-q**
> Quiet mode, suppress messages and errors

**-v**
> Print version information

**-h**
> Print usage information

# DESCRIPTION

**pdftotext** converts Portable Document Format (PDF) files to plain text. It extracts the text content from PDF documents while optionally attempting to preserve the visual layout of the original document.

The program is part of the **poppler-utils** package (or **xpdf-utils** on older systems) and handles most PDF text extraction needs. It can process encrypted PDFs when provided with the appropriate password and supports various output encodings.

Common use cases include making PDF content searchable, extracting text for further processing, creating accessible versions of documents, and feeding PDF content into text analysis pipelines.

# CAVEATS

Cannot extract text from scanned documents or image-based PDFs (use OCR tools like **tesseract** for those). Layout preservation may not be perfect for complex multi-column documents. Text in embedded fonts without Unicode mappings may not extract correctly. Ligatures and special characters may not render properly in all output encodings.

# HISTORY

**pdftotext** was originally developed as part of the **Xpdf** project by **Derek Noonburg** in the late 1990s. The tool has since been incorporated into the **Poppler** library, a fork of Xpdf that has become the standard PDF rendering library on many Linux distributions. Both versions continue to be maintained, with Poppler receiving more active development and becoming the default on most modern systems.

# SEE ALSO

[pdfinfo](/man/pdfinfo)(1), [pdfimages](/man/pdfimages)(1), [pdftops](/man/pdftops)(1), [tesseract](/man/tesseract)(1), [mutool](/man/mutool)(1)
