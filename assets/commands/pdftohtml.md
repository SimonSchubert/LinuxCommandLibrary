# TLDR

**Convert** a PDF file to an HTML file

```pdftohtml [path/to/file.pdf] [path/to/output_file.html]```

**Ignore images** in the PDF file

```pdftohtml -i [path/to/file.pdf] [path/to/output_file.html]```

Generate a **single HTML file** that includes all PDF pages

```pdftohtml -s [path/to/file.pdf] [path/to/output_file.html]```

Convert a PDF file to an **XML file**

```pdftohtml -xml [path/to/file.pdf] [path/to/output_file.xml]```

# SYNOPSIS

**pdftohtml** [_options_] _pdf_file_ [_output_file_]

# PARAMETERS

**-i**
> Ignore images

**-s**
> Generate single HTML file for all pages

**-xml**
> Output as XML instead of HTML

**-c**
> Generate complex output (more accurate layout)

**-hidden**
> Force extraction of hidden text

**-f _n_**
> First page to convert

**-l _n_**
> Last page to convert

**-zoom _factor_**
> Zoom factor (default: 1.5)

**-noframes**
> Generate no frames (single page output)

**-enc _encoding_**
> Output encoding (default: UTF-8)

# DESCRIPTION

**pdftohtml** converts PDF files to HTML, XML, or PNG format. Part of the **poppler-utils** package, it attempts to preserve the visual layout of PDF pages in the resulting HTML output.

By default, it generates one HTML file per page plus a frameset index. The **-s** option creates a single file containing all pages. Images are extracted as separate PNG files unless **-i** is specified.

The XML output mode provides structured data about text positioning and formatting, useful for further processing or text extraction.

# CAVEATS

Complex PDF layouts may not convert accurately. Scanned PDFs (images) require OCR and won't produce text output. Font embedding and unusual characters may cause display issues. Large PDFs generate many output files without **-s** option.

# SEE ALSO

[pdftotext](/man/pdftotext)(1), [pdftoppm](/man/pdftoppm)(1), [pdfinfo](/man/pdfinfo)(1), [pandoc](/man/pandoc)(1)
