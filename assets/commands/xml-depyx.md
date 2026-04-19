# TAGLINE

Convert PYX notation back to XML

# TLDR

**Convert PYX to XML**

```xml depyx [file.pyx]```

**Convert from stdin**

```cat [file.pyx] | xml depyx```

# SYNOPSIS

**xml depyx** [_options_] [_file_]

# PARAMETERS

_file_
> Input PYX file.

# DESCRIPTION

**xml depyx** converts PYX notation back to XML. It is part of the **xmlstarlet** toolkit and reconstructs XML documents from the line-oriented PYX format (based on ESIS, ISO 8879) after text processing with line-oriented tools such as **awk**, **sed**, or **grep**.

The inverse operation is performed by **xml pyx** (alias **xml p2x**), which converts XML into PYX.

# SEE ALSO

[xml-pyx](/man/xml-pyx)(1), [xml-p2x](/man/xml-p2x)(1), [xml-format](/man/xml-format)(1), [xml-select](/man/xml-select)(1)

