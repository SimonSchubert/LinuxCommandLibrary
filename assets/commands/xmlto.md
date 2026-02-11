# TAGLINE

Convert XML to various output formats

# TLDR

**Convert to HTML**

```xmlto html [document.xml]```

**Convert to PDF**

```xmlto pdf [document.xml]```

**Convert to man page**

```xmlto man [document.xml]```

**Output directory**

```xmlto -o [output/] html [document.xml]```

**With stylesheet**

```xmlto -x [custom.xsl] html [document.xml]```

# SYNOPSIS

**xmlto** [_-o dir_] [_-x stylesheet_] [_options_] _format_ _file_

# PARAMETERS

**-o** _DIR_
> Output directory.

**-x** _XSL_
> Custom stylesheet.

**-v**
> Verbose.

**--skip-validation**
> Skip DTD validation.

_format_
> Output format.

# DESCRIPTION

**xmlto** is a frontend tool for converting XML documents to various output formats using XSL stylesheets. It supports generating HTML, PDF, man pages, plain text, and other formats from XML source files, with particular strength in processing DocBook documentation.

The tool acts as a wrapper around XSLT processors and formatting backends, handling the details of stylesheet selection and tool invocation. Custom stylesheets can be provided with the **-x** option to override the default conversion behavior and tailor the output to specific requirements.

xmlto is commonly used in software documentation workflows where source documentation is maintained in DocBook XML format and needs to be published in multiple output formats for different audiences.

# CAVEATS

Requires stylesheets. DocBook focused. Backend tools needed.

# HISTORY

**xmlto** was created for converting XML documents, particularly DocBook, to various output formats.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [docbook2html](/man/docbook2html)(1), [pandoc](/man/pandoc)(1)
