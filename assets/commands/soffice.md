# TAGLINE

LibreOffice suite launcher and converter

# TLDR

**Open LibreOffice**

```soffice```

**Open document**

```soffice [document.odt]```

**Convert to PDF**

```soffice --convert-to pdf [document.docx]```

**Headless conversion**

```soffice --headless --convert-to pdf [document.docx]```

**Start Writer**

```soffice --writer```

**Start Calc**

```soffice --calc```

**Start in safe mode**

```soffice --safe-mode```

# SYNOPSIS

**soffice** [_--headless_] [_--convert-to format_] [_options_] [_files_]

# PARAMETERS

**--headless**
> No GUI.

**--convert-to** _FMT_
> Convert format.

**--writer**
> Start Writer.

**--calc**
> Start Calc.

**--impress**
> Start Impress.

**--safe-mode**
> Safe mode start.

**--outdir** _DIR_
> Output directory.

# DESCRIPTION

**soffice** is the main launcher for LibreOffice, the open-source office productivity suite. It can open documents in Writer (word processing), Calc (spreadsheets), Impress (presentations), Draw (vector graphics), and other components based on the file type or explicit module selection.

The **--headless** flag runs LibreOffice without a graphical interface, enabling server-side document processing and scripting. Combined with **--convert-to**, it provides powerful batch document conversion between formats including PDF, DOCX, XLSX, HTML, and many others.

Headless mode is commonly used in automated pipelines to convert documents, generate PDFs from templates, or perform mail merges without user interaction. Multiple files can be processed in a single invocation, and the output directory can be specified with **--outdir**.

# CAVEATS

Heavy application. Conversion may be slow. Format fidelity varies.

# HISTORY

**soffice** is the main launcher for **LibreOffice**, the free office suite forked from OpenOffice.org.

# SEE ALSO

[libreoffice](/man/libreoffice)(1), [lowriter](/man/lowriter)(1), [unoconv](/man/unoconv)(1)
