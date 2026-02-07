# TAGLINE

DocBook to HTML converter

# TLDR

**Convert DocBook to HTML**

```docbook2html [document.xml]```

**Convert to single HTML file**

```docbook2html --nochunks [document.xml]```

**Specify output directory**

```docbook2html -o [output_dir] [document.xml]```

**Convert with custom stylesheet**

```docbook2html --stylesheet [custom.xsl] [document.xml]```

**Use XSLT processor directly**

```xsltproc /usr/share/xml/docbook/stylesheet/docbook-xsl/html/docbook.xsl [document.xml]```

# SYNOPSIS

**docbook2html** [_options_] _xmlfile_

# PARAMETERS

**-o**, **--output** _dir_
> Output directory for generated files.

**--nochunks**
> Generate single HTML file instead of multiple.

**--stylesheet** _xsl_
> Custom XSLT stylesheet.

**-V** _param=value_
> Set XSLT parameter.

**--skip-validation**
> Skip DTD validation.

**--help**
> Display help.

# DESCRIPTION

**docbook2html** converts DocBook XML documents to HTML format. DocBook is a semantic markup language for technical documentation that separates content from presentation.

The tool uses XSLT stylesheets to transform DocBook elements into HTML. By default, it creates chunked output (multiple HTML files) with navigation; **--nochunks** produces a single file.

Modern implementations typically use **xsltproc** with DocBook XSL stylesheets directly, providing more control over transformation parameters. The docbook2html wrapper simplifies common conversions.

# XSLTPROC USAGE

```bash
# Chunked HTML
xsltproc \
  --output output_dir/ \
  /usr/share/xml/docbook/stylesheet/docbook-xsl/html/chunk.xsl \
  document.xml

# Single HTML
xsltproc \
  /usr/share/xml/docbook/stylesheet/docbook-xsl/html/docbook.xsl \
  document.xml > output.html
```

# CAVEATS

Requires DocBook XSL stylesheets installed. DTD validation requires network access or local catalogs. Large documents may be slow to process. Output styling depends on CSS; default HTML may look plain.

# HISTORY

DocBook originated at **HaL Computer Systems** and **O'Reilly** in the early **1990s** as an SGML application for computer documentation. It transitioned to XML in the late 1990s. The docbook-utils package, including docbook2html, was created to simplify conversions. **Norman Walsh** has been the primary maintainer of DocBook XSL stylesheets since **1999**.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [docbook2pdf](/man/docbook2pdf)(1), [pandoc](/man/pandoc)(1), [xmllint](/man/xmllint)(1)
