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

**soffice** launches LibreOffice. It handles documents.

Full office suite. Writer, Calc, Impress.

Headless mode for scripting. No GUI needed.

Format conversion. Many formats supported.

Batch processing. Convert multiple files.

# CAVEATS

Heavy application. Conversion may be slow. Format fidelity varies.

# HISTORY

**soffice** is the main launcher for **LibreOffice**, the free office suite forked from OpenOffice.org.

# SEE ALSO

[libreoffice](/man/libreoffice)(1), [lowriter](/man/lowriter)(1), [unoconv](/man/unoconv)(1)
