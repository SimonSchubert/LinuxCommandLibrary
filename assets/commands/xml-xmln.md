# TAGLINE

Display XML namespace information

# TLDR

**Show namespace information**

```xml xmln [file.xml]```

# SYNOPSIS

**xml xmln** [_options_] [_file_]

# PARAMETERS

_file_
> Input XML file.

# DESCRIPTION

**xml xmln** displays namespace information in XML documents. Part of the xmlstarlet toolkit. Shows declared namespaces with their prefixes and URIs, which is useful for crafting XPath expressions that target namespaced elements.

# CAVEATS

Operates only on well-formed XML. Default namespaces (without a prefix) are reported without a prefix; use an alias when building XPath queries.

# SEE ALSO

[xml-elements](/man/xml-elements)(1), [xml-select](/man/xml-select)(1)

