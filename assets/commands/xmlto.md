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

**xmlto** converts XML documents. It uses XSL stylesheets.

Multiple formats. HTML, PDF, man, etc.

DocBook support. Documentation conversion.

Stylesheet customization. Modify output.

Frontend tool. Wraps other tools.

# CAVEATS

Requires stylesheets. DocBook focused. Backend tools needed.

# HISTORY

**xmlto** was created for converting XML documents, particularly DocBook, to various output formats.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [docbook2html](/man/docbook2html)(1), [pandoc](/man/pandoc)(1)
