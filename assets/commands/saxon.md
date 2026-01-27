# TLDR

**Transform an XML file** with an XSLT stylesheet

```saxon -s:[source.xml] -xsl:[stylesheet.xsl] -o:[output.xml]```

**Run an XQuery** against an XML file

```saxon -s:[source.xml] -q:[query.xq] -o:[output.xml]```

**Transform with a parameter**

```saxon -s:[source.xml] -xsl:[stylesheet.xsl] param=[value]```

**Execute a standalone XQuery file**

```saxon -q:[query.xq]```

**Run a schema-aware transformation**

```saxon -sa -s:[source.xml] -xsl:[stylesheet.xsl]```

**Transform with increased memory**

```java -Xmx1024m net.sf.saxon.Transform -s:[source.xml] -xsl:[stylesheet.xsl]```

# SYNOPSIS

**saxon** [_options_] [_-s:source_] [_-xsl:stylesheet_] [_-q:query_] [_-o:output_] [_params_]

# PARAMETERS

**-s:**_file_
> Source XML document to process

**-xsl:**_file_
> XSLT stylesheet for transformation

**-q:**_file_
> XQuery file to execute

**-o:**_file_
> Output file for results

**-sa**
> Enable schema-aware processing

**-t**
> Display timing information

**-explain**
> Display compiled expression tree

**-versionmsg:off**
> Suppress version message

**-xsd:**_file_
> Schema document for validation

# DESCRIPTION

**Saxon** is an XSLT and XQuery processor for transforming XML documents. It supports XSLT 3.0, XPath 3.1, and XQuery 3.1, enabling complex document transformations and queries.

The tool processes XML input against XSLT stylesheets or XQuery expressions, producing transformed output. On many systems, wrapper scripts like **saxonb-xslt** and **saxonb-xquery** provide convenient command-line access.

Saxon is available in three editions: Saxon-HE (open-source under MPL-2.0), Saxon-PE (professional), and Saxon-EE (enterprise with schema-awareness). It runs on Java, .NET, and JavaScript platforms.

# CAVEATS

Memory for complex transformations is controlled via Java's **-Xmx** option. Schema-aware features require Saxon-EE. The command syntax varies between Saxon editions and platform wrappers.

# HISTORY

Saxon was created by **Michael Kay**, former editor of the XSLT specification at W3C. Development began in **1998**, with Kay founding **Saxonica** to maintain and commercialize the processor. Since **2023**, Saxon is hosted exclusively on the Saxonica website rather than SourceForge.

# SEE ALSO

[xsltproc](/man/xsltproc)(1), [xmllint](/man/xmllint)(1), [xq](/man/xq)(1), [java](/man/java)(1)
