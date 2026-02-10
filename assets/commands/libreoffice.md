# TAGLINE

free, open-source office productivity suite including word processor

# TLDR

**Open a document**

```libreoffice [path/to/document]```

**Convert document to PDF**

```libreoffice --headless --convert-to pdf [document.docx]```

**Convert to another format**

```libreoffice --headless --convert-to [xlsx] [spreadsheet.ods]```

**Convert multiple files**

```libreoffice --headless --convert-to pdf [*.docx]```

**Specify output directory**

```libreoffice --headless --convert-to pdf --outdir [/output] [document.docx]```

**Start Writer** (word processor)

```libreoffice --writer```

**Start Calc** (spreadsheet)

```libreoffice --calc```

**Start Impress** (presentations)

```libreoffice --impress```

# SYNOPSIS

**libreoffice** [_--headless_] [_--convert-to format_] [_--outdir path_] [_--writer|--calc|--impress|--draw_] [_options_] [_files_]

# PARAMETERS

**--headless**
> Run without GUI (for conversion/scripting).

**--convert-to** _format[:filter]_
> Convert to specified format and exit.

**--outdir** _path_
> Output directory for converted files.

**--writer**
> Open LibreOffice Writer.

**--calc**
> Open LibreOffice Calc.

**--impress**
> Open LibreOffice Impress.

**--draw**
> Open LibreOffice Draw.

**--math**
> Open LibreOffice Math.

**--base**
> Open LibreOffice Base.

**--print-to-file** _file_
> Print to file instead of printer.

**--infilter** _filter_
> Force input filter.

**-n**, **--new**
> Open new empty document.

**-o**, **--view**
> Open in read-only mode.

**--safe-mode**
> Start in safe mode (disabled extensions).

**--nofirststartwizard**
> Skip first-start wizard.

**--quickstart**
> Enable quickstarter.

**--terminate_after_init**
> Exit after loading (for testing).

**--help**
> Display help.

# CONVERSION FORMATS

**pdf**
> PDF document.

**html**
> HTML web page.

**docx**
> Microsoft Word 2007+.

**doc**
> Microsoft Word 97-2003.

**xlsx**
> Microsoft Excel 2007+.

**xls**
> Microsoft Excel 97-2003.

**pptx**
> Microsoft PowerPoint 2007+.

**odt**
> OpenDocument Text.

**ods**
> OpenDocument Spreadsheet.

**csv**
> Comma-separated values.

**txt**
> Plain text.

# DESCRIPTION

**LibreOffice** is a free, open-source office productivity suite including word processor (Writer), spreadsheet (Calc), presentation software (Impress), drawing application (Draw), formula editor (Math), and database manager (Base).

The command line enables powerful automation. The **--headless** mode runs without GUI, essential for server-side document conversion. Combined with **--convert-to**, it can batch-convert documents between formats - commonly used for generating PDFs from various office documents.

Conversion supports filters for fine-tuned output. Format:filter syntax (e.g., csv:Text - txt - csv (StarCalc)) allows specifying exact export options. Available filters depend on installed components.

For scripting, LibreOffice supports macros in Basic, Python, JavaScript, and BeanShell. The UNO API provides programmatic document manipulation. Combined with headless mode, this enables document generation pipelines.

The quickstarter feature keeps LibreOffice partially loaded for faster document opening, useful on systems where it's frequently used.

# CAVEATS

Headless conversion requires the full LibreOffice installation. Some complex documents may not convert perfectly. Conversion spawns a separate process - watch memory usage with many files. Filter syntax can be complex. Some features require Java runtime.

# HISTORY

**LibreOffice** was created in **2010** as a fork of OpenOffice.org after Oracle acquired Sun Microsystems. The Document Foundation was established to guide development. It has become the leading open-source office suite, included by default in most Linux distributions and available for Windows and macOS.

# SEE ALSO

[pandoc](/man/pandoc)(1), [wkhtmltopdf](/man/wkhtmltopdf)(1), [unoconv](/man/unoconv)(1), [abiword](/man/abiword)(1)
