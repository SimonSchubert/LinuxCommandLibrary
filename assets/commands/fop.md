# TLDR

**Convert XSL-FO to PDF**

```fop [input.fo] [output.pdf]```

**Transform XML with XSLT** to PDF

```fop -xml [input.xml] -xsl [style.xsl] -pdf [output.pdf]```

**Convert to PostScript**

```fop [input.fo] -ps [output.ps]```

**Convert to PNG**

```fop [input.fo] -png [output.png]```

**Use specific configuration**

```fop -c [fop.xconf] [input.fo] [output.pdf]```

**Validate XSL-FO only**

```fop -fo [input.fo] -v```

# SYNOPSIS

**fop** [_options_] [_input_] [_output_]

# DESCRIPTION

**fop** (Formatting Objects Processor) is an Apache project that converts XSL-FO (XSL Formatting Objects) documents to various output formats. It's commonly used for generating PDFs from XML data.

The tool supports transformation pipelines from XML through XSLT to XSL-FO to final output. It handles complex page layouts, tables, and typography.

# PARAMETERS

**-fo** _file_
> Input XSL-FO file.

**-xml** _file_
> Input XML file.

**-xsl** _file_
> XSLT stylesheet.

**-pdf** _file_
> Output to PDF.

**-ps** _file_
> Output to PostScript.

**-png** _file_
> Output to PNG.

**-awt**
> Display in AWT viewer.

**-c** _file_
> Configuration file.

**-v**
> Verbose output.

**-d**
> Debug mode.

# CAVEATS

Requires Java. Complex layouts may need tuning. Memory usage high for large documents. Font configuration can be tricky.

# HISTORY

**FOP** began as an **Apache XML** project in **1999**, becoming one of the first open source XSL-FO processors. It matured through various versions, with FOP 2.x bringing significant improvements in standards compliance and performance.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [pdflatex](/man/pdflatex)(1), [wkhtmltopdf](/man/wkhtmltopdf)(1), [pandoc](/man/pandoc)(1)
