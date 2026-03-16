# TAGLINE

Convert XML to PYX line-oriented format

# TLDR

**Convert an XML file to PYX format**

```xml pyx [file.xml]```

**Convert XML from stdin**

```cat [file.xml] | xml pyx```

**Strip all attributes from an XML file using PYX filtering**

```xml pyx [file.xml] | grep -v "^A" | xml depyx```

# SYNOPSIS

**xml pyx** [_xml-file_]

# PARAMETERS

_xml-file_
> Input XML file. If omitted, reads from stdin.

# DESCRIPTION

**xml pyx** converts XML documents to PYX notation, a line-oriented representation derived from the SGML ESIS format (ISO 8879). It is part of the **XMLStarlet** toolkit (also invoked as `xmlstarlet pyx`).

PYX represents each XML construct on a single line using prefix notation: `(` for opening tags, `)` for closing tags, `A` for attributes, `-` for text content, and `?` for processing instructions. This line-oriented format makes it easy to process XML with standard Unix text tools like **grep**, **sed**, and **awk** without requiring an XML parser.

The companion command **xml depyx** (or **xml p2x**) converts PYX back into XML.

# CAVEATS

PYX is a simplified representation and may not preserve all XML features such as comments or CDATA sections.

# SEE ALSO

[xml-depyx](/man/xml-depyx)(1), [xml-p2x](/man/xml-p2x)(1), [xmlstarlet](/man/xmlstarlet)(1), [xml](/man/xml)(1)
