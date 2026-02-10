# TAGLINE

word processor component of LibreOffice

# TLDR

**Start Writer**

```lowriter```

**Open document**

```lowriter [document.odt]```

**Convert to PDF**

```lowriter --convert-to pdf [document.odt]```

**Convert to DOCX**

```lowriter --convert-to docx [document.odt]```

**Batch convert multiple files**

```lowriter --convert-to pdf --outdir [output/] [*.odt]```

**Print document**

```lowriter -p [document.odt]```

# SYNOPSIS

**lowriter** [_options_] [_files_...]

# PARAMETERS

**--convert-to** _format_
> Convert to specified format.

**--outdir** _dir_
> Output directory for conversions.

**-p**
> Print document.

**--pt** _printer_
> Print to specific printer.

**--headless**
> Run without GUI.

**--view**
> Open in read-only mode.

# DESCRIPTION

**lowriter** is the word processor component of LibreOffice. It provides full-featured document editing, formatting, and publishing capabilities compatible with Microsoft Word formats.

The command line interface enables batch conversions and scripting.

# SUPPORTED FORMATS

```
Input:  ODT, DOC, DOCX, RTF, TXT, HTML
Output: PDF, ODT, DOCX, RTF, TXT, HTML
```

# CAVEATS

GUI requires display (use --headless for servers). Conversion quality depends on format complexity. Large documents may need increased memory.

# HISTORY

LibreOffice Writer evolved from OpenOffice.org Writer, which originated from StarWriter by **Star Division** (acquired by Sun Microsystems in 1999). LibreOffice forked in **2010**.

# SEE ALSO

[libreoffice](/man/libreoffice)(1), [localc](/man/localc)(1), [loimpress](/man/loimpress)(1), [unoconv](/man/unoconv)(1)
