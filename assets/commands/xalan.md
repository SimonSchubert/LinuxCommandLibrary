# TAGLINE

Apache XSLT processor for XML transformation

# TLDR

**Transform XML with XSLT**

```java org.apache.xalan.xslt.Process -IN [input.xml] -XSL [style.xsl] -OUT [output.html]```

**Transform to stdout**

```java org.apache.xalan.xslt.Process -IN [input.xml] -XSL [style.xsl]```

**Set stylesheet parameter**

```java org.apache.xalan.xslt.Process -IN [input.xml] -XSL [style.xsl] -PARAM [name] [value]```

**Output as XML**

```java org.apache.xalan.xslt.Process -IN [input.xml] -XSL [style.xsl] -XML```

**Check environment**

```java org.apache.xalan.xslt.EnvironmentCheck```

**Use XSLTC compiler**

```java org.apache.xalan.xslt.Process -XSLTC -IN [input.xml] -XSL [style.xsl]```

# SYNOPSIS

**java org.apache.xalan.xslt.Process** [_options_]

# PARAMETERS

**-IN** _file_
> Input XML document URL.

**-XSL** _file_
> XSLT stylesheet URL.

**-OUT** _file_
> Output file name.

**-PARAM** _name_ _value_
> Set stylesheet parameter.

**-XML**
> Output as XML with declaration.

**-HTML**
> Output as HTML.

**-TEXT**
> Output as plain text.

**-XSLTC**
> Use XSLTC compiled transformation.

**-V**
> Display version.

**-EDUMP** _file_
> Dump stack trace on error.

# DESCRIPTION

**Xalan** is an XSLT processor for transforming XML documents. It implements XSLT 1.0 and XPath 1.0, transforming XML into HTML, text, or other XML formats based on stylesheet rules.

The processor is written in Java and requires the JVM with Xalan JARs in the classpath. It supports the JAXP transformation API and can be used as a library or command-line tool.

XSLTC mode compiles stylesheets to Java bytecode for faster repeated transformations. This is useful for server applications processing many documents with the same stylesheet.

# CAVEATS

Requires Java runtime and proper classpath setup. XSLT 1.0 only; for XSLT 2.0+ use Saxon. Large documents may require JVM memory tuning.

# HISTORY

**Xalan** was developed by the Apache Software Foundation as part of the Apache XML project. Named after a type of musical instrument, it became one of the most widely used open-source XSLT processors, particularly in Java environments.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [saxon](/man/saxon)(1), [xmllint](/man/xmllint)(1)
