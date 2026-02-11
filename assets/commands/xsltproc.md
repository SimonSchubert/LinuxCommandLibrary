# TAGLINE

Command-line XSLT processor

# TLDR

**Transform XML** using an XSLT stylesheet

```xsltproc [stylesheet.xsl] [input.xml]```

**Save output to a file**

```xsltproc -o [output.html] [stylesheet.xsl] [input.xml]```

**Pass a string parameter** to the stylesheet

```xsltproc --stringparam [name] "[value]" [stylesheet.xsl] [input.xml]```

**Pass an XPath expression** as parameter

```xsltproc --param [name] "[xpath]" [stylesheet.xsl] [input.xml]```

**Process XInclude** elements in the input

```xsltproc --xinclude [stylesheet.xsl] [input.xml]```

**Transform HTML** input

```xsltproc --html [stylesheet.xsl] [input.html]```

**Show timing information**

```xsltproc --timing [stylesheet.xsl] [input.xml]```

**Disable network access** for external resources

```xsltproc --nonet [stylesheet.xsl] [input.xml]```

# SYNOPSIS

**xsltproc** [_options_] [_stylesheet_] [_xml-file_]

# PARAMETERS

**-o**, **--output** _file_
> Write output to file instead of stdout.

**--stringparam** _name_ _value_
> Pass a string parameter to the stylesheet.

**--param** _name_ _value_
> Pass an XPath expression result as parameter.

**--xinclude**
> Process XInclude elements before transformation.

**--html**
> Treat input as HTML instead of XML.

**--nonet**
> Disable network access (for DTDs, entities, stylesheets).

**--novalid**
> Skip DTD validation of input document.

**--noout**
> Suppress output of result.

**--timing**
> Display timing for parsing and transformation.

**--profile**
> Output profiling information for optimization.

**--maxdepth** _value_
> Maximum template stack depth (default: 3000).

**--nowrite**
> Refuse to write to any file.

**--nomkdir**
> Refuse to create directories.

**-v**, **--verbose**
> Output each step during processing.

**-V**, **--version**
> Show libxml and libxslt versions.

# DESCRIPTION

**xsltproc** is a command-line XSLT processor for transforming XML documents using XSLT stylesheets. It is part of libxslt, the XSLT C library for GNOME, but operates independently of the GNOME desktop.

If the input XML document contains a stylesheet processing instruction, xsltproc can automatically use the referenced stylesheet without command-line specification.

The tool supports XSLT 1.0 and EXSLT extensions. Output can be XML, HTML, or text depending on the stylesheet's **xsl:output** directive.

# CAVEATS

xsltproc only supports XSLT 1.0; XSLT 2.0 and 3.0 features are not available. For XSLT 2.0+, consider Saxon or other processors. Return codes indicate specific error types (4 = stylesheet parse error, 5 = stylesheet error, 6 = document error).

# HISTORY

xsltproc was developed by **Daniel Veillard** as part of the **libxslt** library for the GNOME project, with the first release around **2001**. It is built on libxml2 for XML parsing. The tool has become a standard for command-line XSLT processing on Unix-like systems and is included in most Linux distributions.

# SEE ALSO

[xmlstarlet](/man/xmlstarlet)(1), [xmllint](/man/xmllint)(1), [saxon](/man/saxon)(1), [xalan](/man/xalan)(1)
